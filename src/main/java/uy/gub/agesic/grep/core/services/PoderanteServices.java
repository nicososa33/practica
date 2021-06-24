package uy.gub.agesic.grep.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uy.gub.agesic.grep.core.exceptions.BusinessException;
import uy.gub.agesic.grep.core.services.impl.utils.IMapper;

@Service
public abstract class PoderanteServices<Req, Resp, ID> {

	@Autowired protected IMapper iMapper;
	
	public abstract Resp findBy(Long idTipoDocumento, Long idPaisDocumento, String numeroDocumento) throws BusinessException;
	
	public abstract Resp create(Req request) throws BusinessException;
	
	public abstract void update(Req request) throws BusinessException;

	public abstract void delete(Long id) throws BusinessException;

}
