package uy.gub.agesic.grep.core.requests;

import javax.validation.constraints.NotBlank;

import uy.gub.agesic.grep.core.utils.ErrorCodes;

public class TipoPermisoRequest extends RequestBase {

	@NotBlank(message = ErrorCodes.CAMPO_OBLIGATORIO_CODIGO)
	private String codigo;

	@NotBlank(message = ErrorCodes.CAMPO_OBLIGATORIO_DESCRIPCION)
	private String descripcion;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
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
		TipoPermisoRequest other = (TipoPermisoRequest) obj;
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
		return true;
	}

	@Override
	public String toString() {
		return "TipoPermisos [codigo=" + codigo + ", descripcion=" + descripcion + "]";
	}

}
