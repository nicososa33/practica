package uy.gub.agesic.grep.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uy.gub.agesic.grep.core.requests.UnidadEjecutoraRequest;
import uy.gub.agesic.grep.core.responses.UnidadEjecutoraResponse;
import uy.gub.agesic.grep.core.services.impl.UnidadEjecutoraServices;

@RestController
@RequestMapping("/unidadEjecutora")
public class UnidadEjecutoraController extends Controller<UnidadEjecutoraRequest,UnidadEjecutoraResponse, Long> {

	@Autowired
	private void getServices(@Autowired UnidadEjecutoraServices unidadEjecutoraServices) {
		super.services = unidadEjecutoraServices;
	}

}
