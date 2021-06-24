package uy.gub.agesic.grep.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uy.gub.agesic.grep.core.exceptions.BusinessException;
import uy.gub.agesic.grep.core.services.impl.utils.IMapper;

@Service
public abstract class CrudServices <Request, Response, ID> {

	@Autowired 
	protected IMapper iMapper;

	public abstract Response get(ID codigo) throws BusinessException;

	public abstract List<Response> list() throws BusinessException;

	public abstract Response create(Request request) throws BusinessException;

	public abstract void update(Request request, Long id) throws BusinessException;

	public abstract void delete(ID codigo) throws BusinessException;
	
}
