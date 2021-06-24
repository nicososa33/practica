package uy.gub.agesic.grep.core.utils;

import uy.gub.agesic.grep.core.requests.ApoderadoRequest;
import uy.gub.agesic.grep.core.requests.PaisRequest;
import uy.gub.agesic.grep.core.requests.PersonaFisicaRequest;
import uy.gub.agesic.grep.core.requests.PersonaJuridicaRequest;
import uy.gub.agesic.grep.core.requests.TipoDocumentoRequest;
import uy.gub.agesic.grep.core.requests.TipoPermisoRequest;
import uy.gub.agesic.grep.core.requests.TipoRelacionRequest;
import uy.gub.agesic.grep.core.requests.TramiteRequest;
import uy.gub.agesic.grep.core.requests.UnidadEjecutoraRequest;
import uy.gub.agesic.grep.core.responses.ApoderadoResponse;
import uy.gub.agesic.grep.core.responses.PaisResponse;
import uy.gub.agesic.grep.core.responses.PersonaFisicaResponse;
import uy.gub.agesic.grep.core.responses.PersonaJuridicaResponse;
import uy.gub.agesic.grep.core.responses.TipoDocumentoResponse;
import uy.gub.agesic.grep.core.responses.TipoPermisoResponse;
import uy.gub.agesic.grep.core.responses.TipoRelacionResponse;
import uy.gub.agesic.grep.core.responses.TramiteResponse;
import uy.gub.agesic.grep.core.responses.UnidadEjecutoraResponse;

public class FactoryObjects {

	/**********************************************************************************************/
	/*********************************** APODERADOS  **********************************************/
	/**********************************************************************************************/
	
	public static ApoderadoRequest generarApoderadoRequest1() {
		ApoderadoRequest request = new ApoderadoRequest();
		request.setNombre("Nombre 1");
		return request;
	}
	
	public static ApoderadoRequest generarApoderadoRequest2() {
		ApoderadoRequest request = new ApoderadoRequest();
		request.setNombre("Nombre 2");
		return request;
	}
	
	public static ApoderadoResponse generarApoderadoResponse1() {
		ApoderadoResponse response = new ApoderadoResponse();
		response.setNombre("Nombre 1");
		return response;
	}
	
	public static ApoderadoResponse generarApoderadoResponse2() {
		ApoderadoResponse response = new ApoderadoResponse();
		response.setNombre("Nombre 2");
		return response;
	}	
	
	/**********************************************************************************************/
	/**********************************	   PAISES    **********************************************/
	/**********************************************************************************************/

	
	public static PaisRequest generarPaisRequestUruguay() {
		PaisRequest paisRequest = new PaisRequest();
//		paisRequest.setId(Long.valueOf(1));
		paisRequest.setCodigo("UY");
		paisRequest.setDescripcion("Uruguay");
		return paisRequest;
	}

	public static PaisRequest generarPaisRequestLaArgentina() {
		PaisRequest paisRequest = new PaisRequest();
//		paisRequest.setId(Long.valueOf(2));
		paisRequest.setCodigo("AR");
		paisRequest.setDescripcion("La Argentina");
		return paisRequest;
	}

	public static PaisResponse generarPaisResponseUruguay() {
		PaisResponse paisResponse = new PaisResponse();
		paisResponse.setId(Long.valueOf(1));
		paisResponse.setCodigo("UY");
		paisResponse.setDescripcion("Uruguay");
		return paisResponse;
	}

	public static PaisResponse generarPaisResponseLaArgentina() {
		PaisResponse paisResponse = new PaisResponse();
		paisResponse.setId(Long.valueOf(2));
		paisResponse.setCodigo("AR");
		paisResponse.setDescripcion("La Argentina");
		return paisResponse;
	}
	
	/**********************************************************************************************/
	/****************************	   TIPO DE DOCUMENTOS    **************************************/
	/**********************************************************************************************/
	
	public static TipoDocumentoRequest generarTipoDocumentoRequest1() {
		TipoDocumentoRequest documentoRequest = new TipoDocumentoRequest();
//		documentoRequest.setId(Long.valueOf(1));
		documentoRequest.setCodigo("CI");
		documentoRequest.setDescripcion("Cedula");
		documentoRequest.setFormatoUsuario("...");
		return documentoRequest;
	}
	
	public static TipoDocumentoRequest generarTipoDocumentoRequest2() {
		TipoDocumentoRequest documentoRequest = new TipoDocumentoRequest();
//		documentoRequest.setId(Long.valueOf(2));
		documentoRequest.setCodigo("DN");
		documentoRequest.setDescripcion("DNI");
		documentoRequest.setFormatoUsuario("...");
		return documentoRequest;
	}
	
	public static TipoDocumentoResponse generarTipoDocumentoResponse1() {
		TipoDocumentoResponse documentoResponse = new TipoDocumentoResponse();
		documentoResponse.setId(Long.valueOf(1));
		documentoResponse.setCodigo("CI");
		documentoResponse.setDescripcion("Cedula");
		documentoResponse.setFormatoUsuario("...");
		return documentoResponse;
	}
	
	public static TipoDocumentoResponse generarTipoDocumentoResponse2() {
		TipoDocumentoResponse documentoResponse = new TipoDocumentoResponse();
		documentoResponse.setId(Long.valueOf(2));
		documentoResponse.setCodigo("DN");
		documentoResponse.setDescripcion("DNI");
		documentoResponse.setFormatoUsuario("...");
		return documentoResponse;
	}
	
	/**********************************************************************************************/
	/****************************	   TIPO DE PERMISOS    ****************************************/
	/**********************************************************************************************/
	
	public static TipoPermisoRequest generarTipoPermisoRequest1() {
		TipoPermisoRequest tipoPermisoRequest = new TipoPermisoRequest();
//		tipoPermisoRequest.setId(Long.valueOf(1));
		tipoPermisoRequest.setCodigo("P1");
		tipoPermisoRequest.setDescripcion("Permiso1");
		return tipoPermisoRequest;
	}
	
	public static TipoPermisoRequest generarTipoPermisoRequest2() {
		TipoPermisoRequest tipoPermisoRequest = new TipoPermisoRequest();
//		tipoPermisoRequest.setId(Long.valueOf(2));
		tipoPermisoRequest.setCodigo("P2");
		tipoPermisoRequest.setDescripcion("Permiso2");
		return tipoPermisoRequest;
	}
	
	public static TipoPermisoResponse generarTipoPermisoResponse1() {
		TipoPermisoResponse tipoPermisoResponse = new TipoPermisoResponse();
		tipoPermisoResponse.setId(Long.valueOf(1));
		tipoPermisoResponse.setCodigo("P1");
		tipoPermisoResponse.setDescripcion("Permiso1");
		return tipoPermisoResponse;
	}
	
	public static TipoPermisoResponse generarTipoPermisoResponse2() {
		TipoPermisoResponse tipoPermisoResponse = new TipoPermisoResponse();
		tipoPermisoResponse.setId(Long.valueOf(2));
		tipoPermisoResponse.setCodigo("P2");
		tipoPermisoResponse.setDescripcion("Permiso2");
		return tipoPermisoResponse;
	}
	
	/**********************************************************************************************/
	/****************************	   TIPO DE RELACION    ****************************************/
	/**********************************************************************************************/
	
	public static TipoRelacionRequest generarTipoRelacionRequest1() {
		TipoRelacionRequest tipoPermisoRequest = new TipoRelacionRequest();
//		tipoPermisoRequest.setId(Long.valueOf(1));
		tipoPermisoRequest.setTipoRelacion("T1");
		return tipoPermisoRequest;
	}
	
	public static TipoRelacionRequest generarTipoRelacionRequest2() {
		TipoRelacionRequest tipoPermisoRequest = new TipoRelacionRequest();
//		tipoPermisoRequest.setId(Long.valueOf(2));
		tipoPermisoRequest.setTipoRelacion("T2");
		return tipoPermisoRequest;
	}
	
	public static TipoRelacionResponse generarTipoRelacionResponse1() {
		TipoRelacionResponse tipoRelacionResponse = new TipoRelacionResponse();
		tipoRelacionResponse.setId(Long.valueOf(1));
		tipoRelacionResponse.setTipoRelacion("T1");
		return tipoRelacionResponse;
	}
	
	public static TipoRelacionResponse generarTipoRelacionResponse2() {
		TipoRelacionResponse tipoRelacionResponse = new TipoRelacionResponse();
		tipoRelacionResponse.setId(Long.valueOf(2));
		tipoRelacionResponse.setTipoRelacion("T2");
		return tipoRelacionResponse;
	}
	
	/**********************************************************************************************/
	/*******************************	   UNIDAD EJECUTORA    ************************************/
	/**********************************************************************************************/
	
	public static UnidadEjecutoraRequest generarUnidadEjecutoraRequest1() {
		UnidadEjecutoraRequest tramiteRequest = new UnidadEjecutoraRequest();
//		tramiteRequest.setId(Long.valueOf(1));
		tramiteRequest.setCodigo("U1");
		tramiteRequest.setDescripcion("Descripcion U1");
		return tramiteRequest;
	}
	
	public static UnidadEjecutoraRequest generarUnidadEjecutoraRequest2() {
		UnidadEjecutoraRequest tramiteRequest = new UnidadEjecutoraRequest();
//		tramiteRequest.setId(Long.valueOf(2));
		tramiteRequest.setCodigo("U2");
		tramiteRequest.setDescripcion("Descripcion  U2");
		return tramiteRequest;
	}
	
	public static UnidadEjecutoraResponse generarUnidadEjecutoraResponse1() {
		UnidadEjecutoraResponse tramiteResponse = new UnidadEjecutoraResponse();
		tramiteResponse.setId(Long.valueOf(1));
		tramiteResponse.setCodigo("U1");
		tramiteResponse.setDescripcion("Descripcion  U1");
		return tramiteResponse;
	}
	
	public static UnidadEjecutoraResponse generarUnidadEjecutoraResponse2() {
		UnidadEjecutoraResponse tramiteResponse = new UnidadEjecutoraResponse();
		tramiteResponse.setId(Long.valueOf(2));
		tramiteResponse.setCodigo("U2");
		tramiteResponse.setDescripcion("Descripcion  U2");
		return tramiteResponse;
	}
	
	/**********************************************************************************************/
	/**********************************	   TRAMITES    ********************************************/
	/**********************************************************************************************/
	
	public static TramiteRequest generarTramiteRequest1() {
		TramiteRequest tramiteRequest = new TramiteRequest();
//		tramiteRequest.setId(Long.valueOf(1));
		tramiteRequest.setCodigo("T1");
		tramiteRequest.setDescripcion("Descripcion T1");
		tramiteRequest.setDiasAvisoNotificacion(1);
		tramiteRequest.setDiasMaximoPermisos(1);
		tramiteRequest.setDescripcion("Descripcion T1");
		tramiteRequest.setIdUnidadEjecutora(Long.valueOf(1));
		return tramiteRequest;
	}
	
	public static TramiteRequest generarTramiteRequest2() {
		TramiteRequest tramiteRequest = new TramiteRequest();
//		tramiteRequest.setId(Long.valueOf(2));
		tramiteRequest.setCodigo("T2");
		tramiteRequest.setDiasAvisoNotificacion(1);
		tramiteRequest.setDiasMaximoPermisos(1);
		tramiteRequest.setDescripcion("Descripcion  T2");
		tramiteRequest.setIdUnidadEjecutora(Long.valueOf(1));
		return tramiteRequest;
	}
	
	public static TramiteResponse generarTramiteResponse1() {
		TramiteResponse tramiteResponse = new TramiteResponse();
		tramiteResponse.setId(Long.valueOf(1));
		tramiteResponse.setCodigo("T1");
		tramiteResponse.setDiasAvisoNotificacion(1);
		tramiteResponse.setDiasMaximoPermisos(1);
		tramiteResponse.setDescripcion("Descripcion  T1");
		tramiteResponse.setUnidadEjecutora(FactoryObjects.generarUnidadEjecutoraResponse1());
		return tramiteResponse;
	}
	
	public static TramiteResponse generarTramiteResponse2() {
		TramiteResponse tramiteResponse = new TramiteResponse();
		tramiteResponse.setId(Long.valueOf(2));
		tramiteResponse.setCodigo("T2");
		tramiteResponse.setDiasAvisoNotificacion(1);
		tramiteResponse.setDiasMaximoPermisos(1);
		tramiteResponse.setDescripcion("Descripcion  T2");
		tramiteResponse.setUnidadEjecutora(FactoryObjects.generarUnidadEjecutoraResponse2());
		return tramiteResponse;
	}

	public static PersonaFisicaRequest generarPersonaFisicaRequest1() {
		// TODO Auto-generated method stub
		return null;
	}

	public static PersonaFisicaRequest generarPersonaFisicaRequest2() {
		// TODO Auto-generated method stub
		return null;
	}

	public static PersonaJuridicaRequest generarPersonaJuridicaRequest1() {
		// TODO Auto-generated method stub
		return null;
	}

	public static PersonaJuridicaRequest generarPersonaJuridicaRequest2() {
		// TODO Auto-generated method stub
		return null;
	}

	public static PersonaJuridicaResponse generarPersonaJuridicaResponse1() {
		// TODO Auto-generated method stub
		return null;
	}

	public static PersonaJuridicaResponse generarPersonaJuridicaResponse2() {
		// TODO Auto-generated method stub
		return null;
	}

	public static PersonaFisicaResponse generarPersonaFisicaResponse1() {
		// TODO Auto-generated method stub
		return null;
	}

	public static PersonaFisicaResponse generarPersonaFisicaResponse2() {
		// TODO Auto-generated method stub
		return null;
	}

}
