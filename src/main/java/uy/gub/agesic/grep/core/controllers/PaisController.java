package uy.gub.agesic.grep.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uy.gub.agesic.grep.core.requests.PaisRequest;
import uy.gub.agesic.grep.core.responses.PaisResponse;
import uy.gub.agesic.grep.core.services.impl.PaisServices;

@RestController
@RequestMapping("/pais")
public class PaisController extends Controller<PaisRequest, PaisResponse, Long>{
	
	@Autowired
	private void getServices(@Autowired PaisServices paisServices) {
		super.services = paisServices;
	}

}
