package uy.gub.agesic.grep.core.services.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uy.gub.agesic.grep.core.dataaccess.IPersonaFisicaDataAccess;
import uy.gub.agesic.grep.core.dataaccess.model.PersonaFisica;
import uy.gub.agesic.grep.core.exceptions.AlreadyExists;
import uy.gub.agesic.grep.core.exceptions.BusinessException;
import uy.gub.agesic.grep.core.exceptions.LevelError;
import uy.gub.agesic.grep.core.exceptions.NotFoundException;
import uy.gub.agesic.grep.core.requests.PersonaFisicaRequest;
import uy.gub.agesic.grep.core.responses.PersonaFisicaResponse;
import uy.gub.agesic.grep.core.services.PoderanteServices;
import uy.gub.agesic.grep.core.utils.ErrorCodes;

@Service
public class PersonaFisicaServices extends PoderanteServices<PersonaFisicaRequest, PersonaFisicaResponse, Long> {

	private Logger logger = LoggerFactory.getLogger(PersonaFisicaServices.class);
	
	@Autowired private IPersonaFisicaDataAccess dataAccess;
	
	public PersonaFisica findModelBy(Long idTipoDocumento, Long idPaisDocumento, String numeroDocumento) throws BusinessException {
		List<PersonaFisica> entity = dataAccess.findByTipoDocumentoIdAndPaisDocumentoIdAndNumeroDocumento(idTipoDocumento, idPaisDocumento, numeroDocumento);
		if (entity.isEmpty()) {
			throw new NotFoundException(LevelError.ALERT_USER_INFO, ErrorCodes.NOT_FOUND, logger);
		}
		return entity.get(0);
	}
	
	public PersonaFisicaResponse findBy(Long idTipoDocumento, Long idPaisDocumento, String numeroDocumento) throws BusinessException {
		return iMapper.toResponse(findModelBy(idTipoDocumento, idPaisDocumento, numeroDocumento));
	}
	
	public PersonaFisicaResponse create(PersonaFisicaRequest request) throws BusinessException {
		List<PersonaFisica> dbEntity = dataAccess.findByTipoDocumentoIdAndPaisDocumentoIdAndNumeroDocumento(request.getIdTipoDocumento(), request.getIdPaisDocumento(), request.getNumeroDocumento());
		if (!dbEntity.isEmpty()) {
			throw new AlreadyExists(LevelError.ALERT_USER_INFO, ErrorCodes.YA_EXISTE, logger);
		}
		request.setId(null);
		PersonaFisica personaFisica = dataAccess.saveAndFlush(iMapper.fromRequest(request));
		return iMapper.toResponse(personaFisica);
	}
	
	public void update(PersonaFisicaRequest request) throws BusinessException {
		PersonaFisica personaFisicaFound = findModelBy(request.getIdTipoDocumento(), request.getIdPaisDocumento(), request.getNumeroDocumento());
		PersonaFisica personaFisica = iMapper.fromRequest(request);
		personaFisica.setId(personaFisicaFound.getId());
		dataAccess.saveAndFlush(personaFisica);
	}

	public void delete(Long id) throws BusinessException {
		if (!dataAccess.findById(id).isPresent()){
			throw new NotFoundException(LevelError.ALERT_USER_INFO, ErrorCodes.NOT_FOUND, logger);
		};		
		dataAccess.deleteById(id);
		dataAccess.flush();
	}

}
