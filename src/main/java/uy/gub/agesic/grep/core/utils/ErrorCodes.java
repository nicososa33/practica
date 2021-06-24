package uy.gub.agesic.grep.core.utils;

public class ErrorCodes {

	public static final String EXCEPTION_ERROR_GENERAL = "error.general";//"Ha ocurrido un error";
	public static final String ERROR_DE_DB = "error.conexion.db";//"Ocurrió un error al acceder a la base de datos";
	public static final String HAY_UN_TRAMITE_ASOCIADO = "error.tramite.asociado";//"Hay un trámite asociado a este elemento";
	public static final String YA_EXISTE = "error.ya.existe";//"El elemento ya existe";
	public static final String METODO_NO_IMPLEMENTADO = "error.no.implementado";//"Metodo no implementado";
	//public static final String UNIDAD_EJECUTORA = "error.unidad.ejecutora";//"Unidad ejecutora";
	public static final String NOT_FOUND = "error.no.encontrado";//"No se ha encontrado el elemento solicitado";
	
	///No encontrado
	public static final String NO_ENCONTRADO_TIPO_DE_DOCUMENTO = "error.no.encontrado.tipo.de.documento";//"No se encontró el id de Tipo de docuemnto ";
	public static final String NO_ENCONTRADO_UNIDAD_EJECUTORA = "error.no.encontrado.unidad.ejecutora";//"No se encontró el id de Unidad ejecutora ";
	public static final String NO_ENCONTRADO_PAIS = "error.no.encontrado.pais";//"No se encontró el id de País ";
	
	///Requeridos
	public static final String CAMPO_OBLIGATORIO_DESCRIPCION = "requerido.descripcion";//"Se requiere el campo Descripción";
	public static final String CAMPO_OBLIGATORIO_CODIGO = "requerido.codigo";//"Se requiere el campo Código";
	public static final String CAMPO_OBLIGATORIO_UNIDAD_EJECUTORA = "requerido.idUnidadEjecutora";//"Se requiere el campo Unidad Ejecutora";
	public static final String CAMPO_OBLIGATORIO_FORMATO_USUARIO = "requerido.formatoUsuario";//"Se requiere el campo Formato de usuario";
	public static final String CAMPO_OBLIGATORIO_TIPO_RELACION = "requerido.tipoRelacion";//"Se requiere el campo Tipo Relación";
	public static final String CAMPO_OBLIGATORIO_PAIS = "requerido.pais";//"Se requiere el campo País";
	public static final String CAMPO_OBLIGATORIO_NOMBRE = "requerido.nombre";//"Se requiere el campo Nombre";
	public static final String CAMPO_OBLIGATORIO_NOMBRE_Y_APELLIDO = "requerido.nombreYApellidos";//"Se requiere el campo Nombre";
	public static final String CAMPO_OBLIGATORIO_ID_USUARIO = "requerido.idUsuario";//"Se requiere el campo Id Usuario";
	public static final String CAMPO_OBLIGATORIO_RAZON_SOCIAL = "requerido.razonSocial";//"Se requiere el campo Razón social";
	public static final String CAMPO_OBLIGATORIO_CORREO_ELECTRONICO = "requerido.correoElectronico";//"Se requiere el campo Correo electrónico";
	public static final String CAMPO_OBLIGATORIO_NUMERO_DOCUMENTO = "requerido.numeroDocumento";//"Se requiere el campo Número de documento";
	public static final String CAMPO_OBLIGATORIO_TIPO_DOCUMENTO = "requerido.idTipoDocumento";//"Se requiere el campo Tipo de documento";
	
	///Inválidos
	public static final String CAMPO_INVALIDO_CORREO_ELECTRONICO = "formatoinvalido.correoElectronico";//"Formato incorrecto en el campo Correo electrónico";

}
