package uy.gub.agesic.grep.core.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uy.gub.agesic.grep.core.dataaccess.IPaisDataAccess;
import uy.gub.agesic.grep.core.dataaccess.model.Pais;
import uy.gub.agesic.grep.core.exceptions.BusinessException;
import uy.gub.agesic.grep.core.exceptions.LevelError;
import uy.gub.agesic.grep.core.exceptions.NotFoundException;
import uy.gub.agesic.grep.core.requests.PaisRequest;
import uy.gub.agesic.grep.core.responses.PaisResponse;
import uy.gub.agesic.grep.core.services.CrudServices;
import uy.gub.agesic.grep.core.utils.ErrorCodes;

@Service
public class PaisServices extends CrudServices<PaisRequest, PaisResponse, Long> {

	@Autowired
	private IPaisDataAccess paisDataAccess;

	private Logger logger = LoggerFactory.getLogger(PaisServices.class);

	@Override
	public PaisResponse get(Long id) throws BusinessException {
		Pais pais = paisDataAccess.findById(id)
				.orElseThrow(() -> new NotFoundException(LevelError.ALERT_USER_INFO, ErrorCodes.NOT_FOUND, logger));
		return iMapper.toResponse(pais);
	}

	@Override
	public List<PaisResponse> list() throws BusinessException {
		return paisDataAccess.findAll().stream().map(pais -> iMapper.toResponse(pais)).collect(Collectors.toList());
	}
 
	@Override
	public PaisResponse create(PaisRequest paisRequest) throws BusinessException {
		Pais pais = iMapper.fromRequest(paisRequest);
		paisDataAccess.saveAndFlush(pais);
		return iMapper.toResponse(pais);
	}

	@Override
	public void update(PaisRequest paisRequest, Long id) throws BusinessException {
		if (id == null) {
			throw new NotFoundException(LevelError.ALERT_USER_INFO, ErrorCodes.NOT_FOUND, logger);
		}
		Pais pais = iMapper.fromRequest(paisRequest);
		pais.setId(id);
		paisDataAccess.saveAndFlush(pais);
	}

	@Override
	public void delete(Long id) throws BusinessException {
		if (!paisDataAccess.findById(id).isPresent()){
			throw new NotFoundException(LevelError.ALERT_USER_INFO, ErrorCodes.NOT_FOUND, logger);
		};		
		paisDataAccess.deleteById(id);
		paisDataAccess.flush();
	}

}
