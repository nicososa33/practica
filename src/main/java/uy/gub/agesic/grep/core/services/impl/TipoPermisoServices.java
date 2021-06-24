package uy.gub.agesic.grep.core.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uy.gub.agesic.grep.core.dataaccess.ITipoPermisoDataAccess;
import uy.gub.agesic.grep.core.dataaccess.model.TipoPermiso;
import uy.gub.agesic.grep.core.exceptions.BusinessException;
import uy.gub.agesic.grep.core.exceptions.LevelError;
import uy.gub.agesic.grep.core.exceptions.NotFoundException;
import uy.gub.agesic.grep.core.requests.TipoPermisoRequest;
import uy.gub.agesic.grep.core.responses.TipoPermisoResponse;
import uy.gub.agesic.grep.core.services.CrudServices;
import uy.gub.agesic.grep.core.utils.ErrorCodes;

@Service
public class TipoPermisoServices extends CrudServices<TipoPermisoRequest, TipoPermisoResponse, Long> {

	@Autowired
	private ITipoPermisoDataAccess tipoPermisoDataAccess;

	private Logger logger = LoggerFactory.getLogger(TipoPermisoServices.class);

	@Override
	public TipoPermisoResponse get(Long id) throws BusinessException {
		TipoPermiso tipoPermiso = tipoPermisoDataAccess.findById(id)
				.orElseThrow(() -> new NotFoundException(LevelError.ALERT_USER_INFO, ErrorCodes.NOT_FOUND, logger));
		return iMapper.toResponse(tipoPermiso);
	}

	@Override
	public List<TipoPermisoResponse> list() throws BusinessException {
		return tipoPermisoDataAccess.findAll().stream().map(tipoRelacion -> iMapper.toResponse(tipoRelacion)).collect(Collectors.toList());
	}

	@Override
	public TipoPermisoResponse create(TipoPermisoRequest request) throws BusinessException {
		TipoPermiso tipo = iMapper.fromRequest(request);
		tipoPermisoDataAccess.saveAndFlush(tipo);
		return iMapper.toResponse(tipo);
	}

	@Override
	public void update(TipoPermisoRequest request, Long id) throws BusinessException {
		if (id == null) {
			throw new NotFoundException(LevelError.ALERT_USER_INFO, ErrorCodes.NOT_FOUND, logger);
		}			
		TipoPermiso tipo = iMapper.fromRequest(request);
		tipo.setId(id);	
		tipoPermisoDataAccess.saveAndFlush(tipo);
	}

	@Override
	public void delete(Long id) throws BusinessException {
		if (!tipoPermisoDataAccess.findById(id).isPresent()){
			throw new NotFoundException(LevelError.ALERT_USER_INFO, ErrorCodes.NOT_FOUND, logger);
		};		
		tipoPermisoDataAccess.deleteById(id);
		tipoPermisoDataAccess.flush();
	}
}
