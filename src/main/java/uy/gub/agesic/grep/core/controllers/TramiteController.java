package uy.gub.agesic.grep.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uy.gub.agesic.grep.core.requests.TramiteRequest;
import uy.gub.agesic.grep.core.responses.TramiteResponse;
import uy.gub.agesic.grep.core.services.impl.TramiteServices;

@RestController
@RequestMapping("/tramite")
public class TramiteController extends Controller<TramiteRequest,TramiteResponse, Long> {

	@Autowired
	private void getServices(@Autowired TramiteServices tramiteServices) {
		super.services = tramiteServices;
	}

}
