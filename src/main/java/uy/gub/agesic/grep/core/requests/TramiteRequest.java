package uy.gub.agesic.grep.core.requests;

import uy.gub.agesic.grep.core.utils.ErrorCodes;

import javax.validation.constraints.NotBlank;


import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@JsonInclude(value = Include.NON_NULL)
public class TramiteRequest extends RequestBase {

	@NotBlank(message = ErrorCodes.CAMPO_OBLIGATORIO_CODIGO)
	private String codigo;

	@NotNull
	private Long idUnidadEjecutora;

	@NotBlank(message = ErrorCodes.CAMPO_OBLIGATORIO_DESCRIPCION)
	private String descripcion;

	private Integer diasAvisoNotificacion;
	private Integer diasMaximoPermisos;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Long getIdUnidadEjecutora() {
		return idUnidadEjecutora;
	}

	public void setIdUnidadEjecutora(Long unidadEjecutoraId) {
		this.idUnidadEjecutora = unidadEjecutoraId;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getDiasAvisoNotificacion() {
		return diasAvisoNotificacion;
	}

	public void setDiasAvisoNotificacion(Integer diasAvisoNotificacion) {
		this.diasAvisoNotificacion = diasAvisoNotificacion;
	}

	public Integer getDiasMaximoPermisos() {
		return diasMaximoPermisos;
	}

	public void setDiasMaximoPermisos(Integer diasMaximoPermisos) {
		this.diasMaximoPermisos = diasMaximoPermisos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((diasAvisoNotificacion == null) ? 0 : diasAvisoNotificacion.hashCode());
		result = prime * result + ((diasMaximoPermisos == null) ? 0 : diasMaximoPermisos.hashCode());
		result = prime * result + ((idUnidadEjecutora == null) ? 0 : idUnidadEjecutora.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TramiteRequest other = (TramiteRequest) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (diasAvisoNotificacion == null) {
			if (other.diasAvisoNotificacion != null)
				return false;
		} else if (!diasAvisoNotificacion.equals(other.diasAvisoNotificacion))
			return false;
		if (diasMaximoPermisos == null) {
			if (other.diasMaximoPermisos != null)
				return false;
		} else if (!diasMaximoPermisos.equals(other.diasMaximoPermisos))
			return false;
		if (idUnidadEjecutora == null) {
			if (other.idUnidadEjecutora != null)
				return false;
		} else if (!idUnidadEjecutora.equals(other.idUnidadEjecutora))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TramiteRequest [codigo=" + codigo + ", unidadEjecutoraId=" + idUnidadEjecutora + ", descripcion="
				+ descripcion + ", diasAvisoNotificacion=" + diasAvisoNotificacion + ", diasMaximoPermisos="
				+ diasMaximoPermisos + "]";
	}

}
