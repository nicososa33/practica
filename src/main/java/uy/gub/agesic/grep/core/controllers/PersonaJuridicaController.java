package uy.gub.agesic.grep.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uy.gub.agesic.grep.core.requests.PersonaJuridicaRequest;
import uy.gub.agesic.grep.core.responses.PersonaJuridicaResponse;
import uy.gub.agesic.grep.core.services.impl.PersonaJuridicaServices;

@RestController
@RequestMapping("/personaJuridica")
public class PersonaJuridicaController extends PoderanteController<PersonaJuridicaRequest, PersonaJuridicaResponse, Long>{


	@Autowired
	private void getServices(@Autowired PersonaJuridicaServices services) {
		super.services = services;
	}

}
