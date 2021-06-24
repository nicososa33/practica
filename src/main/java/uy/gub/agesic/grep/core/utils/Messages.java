package uy.gub.agesic.grep.core.utils;

public class Messages {

	public static String getMessages(String code) {
		String ret = "";
		switch (code) {
			case "error.general" : ret = "Ha ocurrido un error"; break;
	        case "error.conexion.db" : ret = "Ocurrió un error al acceder a la base de datos"; break;
	        case "error.tramite.asociado" : ret = "Hay un trámite asociado a este elemento"; break;
	        case "error.ya.existe" : ret = "El elemento ya existe"; break;
	        case "error.no.implementado" : ret = "Metodo no implementado"; break;
	        case "//error.unidad.ejecutora" : ret = "Unidad ejecutora"; break;
	        case "error.no.encontrado" : ret = "No se ha encontrado el elemento solicitado"; break;
	        case "error.no.encontrado.tipo.de.documento" : ret = "No se encontró el id de Tipo de docuemnto "; break;
	        case "error.no.encontrado.unidad.ejecutora" : ret = "No se encontró el id de Unidad ejecutora "; break;
	        case "error.no.encontrado.pais" : ret = "No se encontró el id de País "; break;
	        case "requerido.descripcion" : ret = "Se requiere el campo Descripción"; break;
	        case "requerido.codigo" : ret = "Se requiere el campo Código"; break;
	        case "requerido.idUnidadEjecutora" : ret = "Se requiere el campo Unidad Ejecutora"; break;
	        case "requerido.formatoUsuario" : ret = "Se requiere el campo Formato de usuario"; break;
	        case "requerido.tipoRelacion" : ret = "Se requiere el campo Tipo Relación"; break;
	        case "requerido.pais" : ret = "Se requiere el campo País"; break;
	        case "requerido.nombre" : ret = "Se requiere el campo Nombre"; break;
	        case "requerido.nombreYApellidos" : ret = "Se requiere el campo Nombre"; break;
	        case "requerido.idUsuario" : ret = "Se requiere el campo Id Usuario"; break;
	        case "requerido.razonSocial" : ret = "Se requiere el campo Razón social"; break;
	        case "requerido.correoElectronico" : ret = "Se requiere el campo Correo electrónico"; break;
	        case "requerido.numeroDocumento" : ret = "Se requiere el campo Número de documento"; break;
	        case "requerido.idTipoDocumento" : ret = "Se requiere el campo Tipo de documento"; break;
	        case "formatoinvalido.correoElectronico" : ret = "Formato incorrecto en el campo Correo electrónico"; break;
		default:
			break;
		}
		return ret;
	}

}
