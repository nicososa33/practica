package uy.gub.agesic.grep.core.responses;

public class TipoRelacionResponse extends ResponseBase {

	private String tipoRelacion;

	public String getTipoRelacion() {
		return tipoRelacion;
	}

	public void setTipoRelacion(String tipoRelacion) {
		this.tipoRelacion = tipoRelacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((tipoRelacion == null) ? 0 : tipoRelacion.hashCode());
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
		TipoRelacionResponse other = (TipoRelacionResponse) obj;
		if (tipoRelacion == null) {
			if (other.tipoRelacion != null)
				return false;
		} else if (!tipoRelacion.equals(other.tipoRelacion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TipoRelacionResponse [id=" + getId() + ", tipoRelacion=" + tipoRelacion + "]";
	}

}
