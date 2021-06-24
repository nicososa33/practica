package uy.gub.agesic.grep.core.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import uy.gub.agesic.grep.core.exceptions.BusinessException;
import uy.gub.agesic.grep.core.services.PoderanteServices;

public abstract class PoderanteController<Request, Response, ID> {

	@Autowired
	protected PoderanteServices<Request, Response, ID> services;	
	
	@PostMapping("")
	@CrossOrigin(origins = "${cross-origin}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Response create(@RequestBody @Valid Request request) throws BusinessException {
		return services.create(request);
	}

	@PutMapping("")
	@CrossOrigin(origins = "${cross-origin}")
	public void update(@RequestBody @Valid Request request) throws BusinessException {
		services.update(request);
	}
	
	@GetMapping("/findBy")
	@CrossOrigin(origins = "${cross-origin}")
	public Response findBy(
			@RequestParam(required = true, name = "idTipoDocumento") Long idTipoDocumento, 
			@RequestParam(required = true, name = "idPaisDocumento") Long idPaisDocumento, 
			@RequestParam(required = true, name = "numeroDocumento") String numeroDocumento) throws BusinessException {
		return this.services.findBy(idTipoDocumento, idPaisDocumento, numeroDocumento);
	}	
	
}
