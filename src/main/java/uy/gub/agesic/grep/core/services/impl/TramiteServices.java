package uy.gub.agesic.grep.core.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uy.gub.agesic.grep.core.dataaccess.ITramiteDataAccess;
import uy.gub.agesic.grep.core.dataaccess.model.Tramite;
import uy.gub.agesic.grep.core.exceptions.BusinessException;
import uy.gub.agesic.grep.core.exceptions.LevelError;
import uy.gub.agesic.grep.core.exceptions.NotFoundException;
import uy.gub.agesic.grep.core.requests.TramiteRequest;
import uy.gub.agesic.grep.core.responses.TramiteResponse;
import uy.gub.agesic.grep.core.services.CrudServices;
import uy.gub.agesic.grep.core.utils.ErrorCodes;

@Service
public class TramiteServices extends CrudServices<TramiteRequest, TramiteResponse, Long> {

	@Autowired
	private ITramiteDataAccess tramiteDataAccess;
	
	private Logger logger = LoggerFactory.getLogger(TramiteServices.class);

	@Override
	public TramiteResponse get(Long id) throws BusinessException {
		Tramite tramite = tramiteDataAccess.findById(id)
				.orElseThrow(() -> new NotFoundException(LevelError.ALERT_USER_INFO, ErrorCodes.NOT_FOUND, logger));
		return iMapper.toResponse(tramite);
	}

	@Override
	public List<TramiteResponse> list() throws BusinessException {
		return tramiteDataAccess.findAll().stream().map(tramite -> iMapper.toResponse(tramite)).collect(Collectors.toList());
	}

	@Override
	public TramiteResponse create(TramiteRequest tramiteRequest) throws BusinessException {
		Tramite tramite = iMapper.fromRequest(tramiteRequest);
		tramiteDataAccess.saveAndFlush(tramite);
		return iMapper.toResponse(tramite);
	}

	@Override
	public void update(TramiteRequest tramiteRequest, Long id) throws BusinessException {
		if (id == null) {
			throw new NotFoundException(LevelError.ALERT_USER_INFO, logger, ErrorCodes.NOT_FOUND);
		}		
		Tramite tramite = iMapper.fromRequest(tramiteRequest);
		tramite.setId(id);
		tramiteDataAccess.saveAndFlush(tramite);
	}

	@Override
	public void delete(Long id) throws BusinessException {
		if (!tramiteDataAccess.findById(id).isPresent()){
			throw new NotFoundException(LevelError.ALERT_USER_INFO, logger, ErrorCodes.NOT_FOUND);
		};		
		tramiteDataAccess.deleteById(id);
		tramiteDataAccess.flush();
	}
	
}
