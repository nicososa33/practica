package uy.gub.agesic.grep.core.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import uy.gub.agesic.grep.core.exceptions.BusinessException;
import uy.gub.agesic.grep.core.services.CrudServices;

public abstract class Controller <Request, Response, ID>{

	protected CrudServices<Request, Response, ID> services;
	
	@GetMapping("{id}")
	@CrossOrigin(origins = "${cross-origin}")
	public Response get(@PathVariable("id") ID id) throws BusinessException {
		return services.get(id);
	}

	@GetMapping("")
	@CrossOrigin(origins = "${cross-origin}")
	public List<Response> list() throws BusinessException {
		return services.list();
	}

	@PostMapping("")
	@CrossOrigin(origins = "${cross-origin}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Response create(@RequestBody @Valid Request request) throws BusinessException {
		return services.create(request);
	}

	@PutMapping("{id}")
	@CrossOrigin(origins = "${cross-origin}")
	public void update(@RequestBody @Valid Request request,@PathVariable("id")  Long id) throws BusinessException {
		services.update(request, id);
	}
	
	@DeleteMapping("{id}")
	@CrossOrigin(origins = "${cross-origin}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") ID id) throws BusinessException {
		services.delete(id);
	}
}
