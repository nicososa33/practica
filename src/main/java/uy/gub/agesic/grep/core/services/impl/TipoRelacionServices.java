package uy.gub.agesic.grep.core.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uy.gub.agesic.grep.core.dataaccess.ITipoRelacionDataAccess;
import uy.gub.agesic.grep.core.dataaccess.model.TipoRelacion;
import uy.gub.agesic.grep.core.exceptions.BusinessException;
import uy.gub.agesic.grep.core.exceptions.LevelError;
import uy.gub.agesic.grep.core.exceptions.NotFoundException;
import uy.gub.agesic.grep.core.requests.TipoRelacionRequest;
import uy.gub.agesic.grep.core.responses.TipoRelacionResponse;
import uy.gub.agesic.grep.core.services.CrudServices;
import uy.gub.agesic.grep.core.utils.ErrorCodes;

@Service
public class TipoRelacionServices extends CrudServices<TipoRelacionRequest, TipoRelacionResponse, Long> {

	@Autowired
	private ITipoRelacionDataAccess tipoRelacionDataAccess;

	private Logger logger = LoggerFactory.getLogger(TipoRelacionServices.class);

	@Override
	public TipoRelacionResponse get(Long id) throws BusinessException {
		TipoRelacion tipoRelacion = tipoRelacionDataAccess.findById(id)
				.orElseThrow(() -> new NotFoundException(LevelError.ALERT_USER_INFO, ErrorCodes.NOT_FOUND, logger));
		return iMapper.toResponse(tipoRelacion);
	}

	@Override
	public List<TipoRelacionResponse> list() throws BusinessException {
		return tipoRelacionDataAccess.findAll().stream().map(p -> iMapper.toResponse(p)).collect(Collectors.toList());
	}

	@Override
	public TipoRelacionResponse create(TipoRelacionRequest tipoRelacionRequest) throws BusinessException {
		TipoRelacion tipoRelacion = iMapper.fromRequest(tipoRelacionRequest);
		tipoRelacionDataAccess.saveAndFlush(tipoRelacion);
		return iMapper.toResponse(tipoRelacion);
	}

	@Override
	public void update(TipoRelacionRequest tipoRelacionRequest, Long id) throws BusinessException {
		if (id == null) {
			throw new NotFoundException(LevelError.ALERT_USER_INFO, ErrorCodes.NOT_FOUND, logger);
		}			
		TipoRelacion tipoRelacion = iMapper.fromRequest(tipoRelacionRequest);
		tipoRelacion.setId(id);
		tipoRelacionDataAccess.saveAndFlush(tipoRelacion);
	}

	@Override
	public void delete(Long id) throws BusinessException {
		if (!tipoRelacionDataAccess.findById(id).isPresent()){
			throw new NotFoundException(LevelError.ALERT_USER_INFO, ErrorCodes.NOT_FOUND, logger);
		};		
		tipoRelacionDataAccess.deleteById(id);
		tipoRelacionDataAccess.flush();
	}
	
}
