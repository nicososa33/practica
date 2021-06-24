package uy.gub.agesic.grep.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uy.gub.agesic.grep.core.requests.PersonaFisicaRequest;
import uy.gub.agesic.grep.core.responses.PersonaFisicaResponse;
import uy.gub.agesic.grep.core.services.impl.PersonaFisicaServices;

@RestController
@RequestMapping("/personaFisica")
public class PersonaFisicaController extends PoderanteController<PersonaFisicaRequest, PersonaFisicaResponse, Long>{

	@Autowired
	private void getServices(@Autowired PersonaFisicaServices services) {
		super.services = services;
	}

}
