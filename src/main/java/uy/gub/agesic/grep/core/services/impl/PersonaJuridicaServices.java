package uy.gub.agesic.grep.core.services.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uy.gub.agesic.grep.core.dataaccess.IPersonaJuridicaDataAccess;
import uy.gub.agesic.grep.core.dataaccess.model.PersonaJuridica;
import uy.gub.agesic.grep.core.exceptions.AlreadyExists;
import uy.gub.agesic.grep.core.exceptions.BusinessException;
import uy.gub.agesic.grep.core.exceptions.LevelError;
import uy.gub.agesic.grep.core.exceptions.NotFoundException;
import uy.gub.agesic.grep.core.requests.PersonaJuridicaRequest;
import uy.gub.agesic.grep.core.responses.PersonaJuridicaResponse;
import uy.gub.agesic.grep.core.services.PoderanteServices;
import uy.gub.agesic.grep.core.utils.ErrorCodes;

@Service
public class PersonaJuridicaServices extends PoderanteServices<PersonaJuridicaRequest, PersonaJuridicaResponse, Long> {

	private Logger logger = LoggerFactory.getLogger(PersonaJuridicaServices.class);

	private @Autowired IPersonaJuridicaDataAccess dataAccess;

	
	public PersonaJuridica findModelBy(Long idTipoDocumento, Long idPaisDocumento, String numeroDocumento) throws BusinessException {
		List<PersonaJuridica> entity = dataAccess.findByTipoDocumentoIdAndPaisDocumentoIdAndNumeroDocumento(idTipoDocumento, idPaisDocumento, numeroDocumento);
		if (entity.isEmpty()) {
			throw new NotFoundException(LevelError.ALERT_USER_INFO, ErrorCodes.NOT_FOUND, logger);
		}
		return entity.get(0);
	}
	
	public PersonaJuridicaResponse findBy(Long idTipoDocumento, Long idPaisDocumento, String numeroDocumento) throws BusinessException {
		return iMapper.toResponse(findModelBy(idTipoDocumento, idPaisDocumento, numeroDocumento));
	}
	
	public PersonaJuridicaResponse create(PersonaJuridicaRequest request) throws BusinessException {
		List<PersonaJuridica> dbEntity = dataAccess.findByTipoDocumentoIdAndPaisDocumentoIdAndNumeroDocumento(request.getIdTipoDocumento(), request.getIdPaisDocumento(), request.getNumeroDocumento());
		if (!dbEntity.isEmpty()) {
			throw new AlreadyExists(LevelError.ALERT_USER_INFO, ErrorCodes.YA_EXISTE, logger);
		}
		request.setId(null);
		PersonaJuridica personaFisica = dataAccess.saveAndFlush(iMapper.fromRequest(request));
		return iMapper.toResponse(personaFisica);
	}
	
	public void update(PersonaJuridicaRequest request) throws BusinessException {
		PersonaJuridica personaFisicaFound = findModelBy(request.getIdTipoDocumento(), request.getIdPaisDocumento(), request.getNumeroDocumento());
		PersonaJuridica personaFisica = iMapper.fromRequest(request);
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
