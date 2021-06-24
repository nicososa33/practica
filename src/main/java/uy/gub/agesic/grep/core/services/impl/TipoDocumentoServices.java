package uy.gub.agesic.grep.core.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uy.gub.agesic.grep.core.dataaccess.ITipoDocumentoDataAccess;
import uy.gub.agesic.grep.core.dataaccess.model.TipoDocumento;
import uy.gub.agesic.grep.core.exceptions.BusinessException;
import uy.gub.agesic.grep.core.exceptions.LevelError;
import uy.gub.agesic.grep.core.exceptions.NotFoundException;
import uy.gub.agesic.grep.core.requests.TipoDocumentoRequest;
import uy.gub.agesic.grep.core.responses.TipoDocumentoResponse;
import uy.gub.agesic.grep.core.services.CrudServices;
import uy.gub.agesic.grep.core.utils.ErrorCodes;

@Service
public class TipoDocumentoServices extends CrudServices<TipoDocumentoRequest, TipoDocumentoResponse, Long> {

	@Autowired
	private ITipoDocumentoDataAccess tipoDocumentoDataAccess;

	private Logger logger = LoggerFactory.getLogger(TipoDocumentoServices.class);

	@Override
	public TipoDocumentoResponse get(Long id) throws BusinessException {
		TipoDocumento tipoDocumento = tipoDocumentoDataAccess.findById(id)
				.orElseThrow(() -> new NotFoundException(LevelError.ALERT_USER_INFO, ErrorCodes.NOT_FOUND, logger));
		return iMapper.toResponse(tipoDocumento);
	}

	@Override 
	public List<TipoDocumentoResponse> list() throws BusinessException {
		return tipoDocumentoDataAccess.findAll().stream().map(p -> iMapper.toResponse(p)).collect(Collectors.toList());
	}

	@Override 
	public TipoDocumentoResponse create(TipoDocumentoRequest tipoDocumentoRequest) throws BusinessException {
		TipoDocumento tipoDocumento = iMapper.fromRequest(tipoDocumentoRequest);
		tipoDocumentoDataAccess.saveAndFlush(tipoDocumento);
		return iMapper.toResponse(tipoDocumento);
	}

	@Override
	public void update(TipoDocumentoRequest tipoDocumentoRequest, Long id) throws BusinessException {
		if (id == null) {
			throw new NotFoundException(LevelError.ALERT_USER_INFO, ErrorCodes.NOT_FOUND, logger);
		}		
		TipoDocumento tipoRelacion = iMapper.fromRequest(tipoDocumentoRequest);
		tipoRelacion.setId(id);
		tipoDocumentoDataAccess.saveAndFlush(tipoRelacion);
	}

	@Override
	public void delete(Long id) throws BusinessException {
		if (!tipoDocumentoDataAccess.findById(id).isPresent()){
			throw new NotFoundException(LevelError.ALERT_USER_INFO, ErrorCodes.NOT_FOUND, logger);
		};		
		tipoDocumentoDataAccess.deleteById(id);
		tipoDocumentoDataAccess.flush();
	}

}
