package uy.gub.agesic.grep.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uy.gub.agesic.grep.core.requests.TipoDocumentoRequest;
import uy.gub.agesic.grep.core.responses.TipoDocumentoResponse;
import uy.gub.agesic.grep.core.services.impl.TipoDocumentoServices;

@RestController
@RequestMapping("/tipoDocumento")
public class TipoDocumentoController  extends Controller<TipoDocumentoRequest, TipoDocumentoResponse, Long>{

	@Autowired
	private void getServices(@Autowired TipoDocumentoServices tipoDocumentoServices) {
		super.services = tipoDocumentoServices;
	}

}
