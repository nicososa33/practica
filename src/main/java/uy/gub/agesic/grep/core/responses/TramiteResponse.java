package uy.gub.agesic.grep.core.responses;

public class TramiteResponse extends ResponseBase {

	private String codigo;
	private UnidadEjecutoraResponse unidadEjecutora;
	private String descripcion;
	private Integer diasAvisoNotificacion;
	private Integer diasMaximoPermisos;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public UnidadEjecutoraResponse getUnidadEjecutora() {
		return unidadEjecutora;
	}

	public void setUnidadEjecutora(UnidadEjecutoraResponse unidadEjecutora) {
		this.unidadEjecutora = unidadEjecutora;
	}

	public String getDescripcion() {
		return descripcion;
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
		result = prime * result + ((unidadEjecutora == null) ? 0 : unidadEjecutora.hashCode());
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
		TramiteResponse other = (TramiteResponse) obj;
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
		if (unidadEjecutora == null) {
			if (other.unidadEjecutora != null)
				return false;
		} else if (!unidadEjecutora.equals(other.unidadEjecutora))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TramiteResponse [codigo=" + codigo + ", unidadEjecutoraResponse=" + unidadEjecutora + ", descripcion="
				+ descripcion + ", diasAvisoNotificacion=" + diasAvisoNotificacion + ", diasMaximoPermisos="
				+ diasMaximoPermisos + "]";
	}

}
