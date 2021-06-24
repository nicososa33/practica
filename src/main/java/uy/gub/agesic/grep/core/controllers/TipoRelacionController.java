package uy.gub.agesic.grep.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uy.gub.agesic.grep.core.requests.TipoRelacionRequest;
import uy.gub.agesic.grep.core.responses.TipoRelacionResponse;
import uy.gub.agesic.grep.core.services.impl.TipoRelacionServices;

@RestController
@RequestMapping("/tipoRelacion")
public class TipoRelacionController extends Controller<TipoRelacionRequest,TipoRelacionResponse, Long> {

	@Autowired
	private void getServices(@Autowired TipoRelacionServices services) {
		super.services = services;
	}

}
