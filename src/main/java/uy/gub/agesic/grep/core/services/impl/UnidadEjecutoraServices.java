package uy.gub.agesic.grep.core.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uy.gub.agesic.grep.core.dataaccess.ITramiteDataAccess;
import uy.gub.agesic.grep.core.dataaccess.IUnidadEjecutoraDataAccess;
import uy.gub.agesic.grep.core.dataaccess.model.Tramite;
import uy.gub.agesic.grep.core.dataaccess.model.UnidadEjecutora;
import uy.gub.agesic.grep.core.exceptions.BusinessException;
import uy.gub.agesic.grep.core.exceptions.IntegrityException;
import uy.gub.agesic.grep.core.exceptions.LevelError;
import uy.gub.agesic.grep.core.exceptions.NotFoundException;
import uy.gub.agesic.grep.core.requests.UnidadEjecutoraRequest;
import uy.gub.agesic.grep.core.responses.UnidadEjecutoraResponse;
import uy.gub.agesic.grep.core.services.CrudServices;
import uy.gub.agesic.grep.core.utils.ErrorCodes;

@Service
public class UnidadEjecutoraServices extends CrudServices<UnidadEjecutoraRequest, UnidadEjecutoraResponse, Long> {

	@Autowired
	private IUnidadEjecutoraDataAccess unidadEjecutoraDataAccess;
	@Autowired
	private ITramiteDataAccess tramiteDataAccess;

	private Logger logger = LoggerFactory.getLogger(UnidadEjecutoraServices.class);

	@Override
	public UnidadEjecutoraResponse get(Long codigo) throws BusinessException {
		UnidadEjecutora unidadEjecutora = unidadEjecutoraDataAccess.findById(codigo)
				.orElseThrow(() -> new NotFoundException(LevelError.ALERT_USER_INFO, ErrorCodes.NOT_FOUND, logger));
		return iMapper.toResponse(unidadEjecutora);
	}

	@Override
	public List<UnidadEjecutoraResponse> list() throws BusinessException {
		return unidadEjecutoraDataAccess.findAll().stream() 
				.map(unidadEjecutora -> iMapper.toResponse(unidadEjecutora))
				.collect(Collectors.toList());
	}

	@Override
	public UnidadEjecutoraResponse create(UnidadEjecutoraRequest unidadEjecutoraRequest) throws BusinessException {
		UnidadEjecutora unidadEjecutora = iMapper.fromRequest(unidadEjecutoraRequest);
		unidadEjecutoraDataAccess.saveAndFlush(unidadEjecutora);
		return iMapper.toResponse(unidadEjecutora);
	}

	@Override
	public void update(UnidadEjecutoraRequest unidadEjecutoraRequest, Long id) throws BusinessException {
		if (id == null) {
			throw new NotFoundException(LevelError.ALERT_USER_INFO, ErrorCodes.NOT_FOUND, logger);
		}		
		UnidadEjecutora unidadEjecutora = iMapper.fromRequest(unidadEjecutoraRequest);
		unidadEjecutora.setId(id);
		unidadEjecutoraDataAccess.saveAndFlush(unidadEjecutora);
	}

	@Override
	public void delete(Long id) throws BusinessException {
		List<Tramite> tramite = tramiteDataAccess.findAll();
		List<Tramite> coincidentes = tramite.stream().filter(t -> t.getUnidadEjecutora().getId().equals(id)).collect(Collectors.toList());
		if (!coincidentes.isEmpty()) {
			throw new IntegrityException(LevelError.ALERT_USER_ERROR, ErrorCodes.HAY_UN_TRAMITE_ASOCIADO + " (" + coincidentes.get(0).getId() + ")", logger);
		}
		if (!unidadEjecutoraDataAccess.findById(id).isPresent()){
			throw new NotFoundException(LevelError.ALERT_USER_INFO, ErrorCodes.NOT_FOUND, logger);
		};
		unidadEjecutoraDataAccess.deleteById(id);
		unidadEjecutoraDataAccess.flush();
	}
	
}
