package uy.gub.agesic.grep.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uy.gub.agesic.grep.core.requests.TipoPermisoRequest;
import uy.gub.agesic.grep.core.responses.TipoPermisoResponse;
import uy.gub.agesic.grep.core.services.impl.TipoPermisoServices;

@RestController
@RequestMapping("/tipoPermiso")
public class TipoPermisoController  extends Controller<TipoPermisoRequest, TipoPermisoResponse, Long> {

	@Autowired
	private void getServices(@Autowired TipoPermisoServices tipoDePermisoServices) {
		super.services = tipoDePermisoServices;
	}

}
