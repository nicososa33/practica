package uy.gub.agesic.grep.core.responses;

public class PersonaFisicaResponse extends PoderanteResponse {

	private String idUsuario;
	private String nombreYApellidos;
	private String correoElectronico;

	private UnidadEjecutoraResponse unidadEjecutora;

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreYApellidos() {
		return nombreYApellidos;
	}

	public void setNombreYApellidos(String nombreYApellidos) {
		this.nombreYApellidos = nombreYApellidos;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public UnidadEjecutoraResponse getUnidadEjecutora() {
		return unidadEjecutora;
	}

	public void setUnidadEjecutora(UnidadEjecutoraResponse unidadEjecutora) {
		this.unidadEjecutora = unidadEjecutora;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((correoElectronico == null) ? 0 : correoElectronico.hashCode());
		result = prime * result + ((idUsuario == null) ? 0 : idUsuario.hashCode());
		result = prime * result + ((nombreYApellidos == null) ? 0 : nombreYApellidos.hashCode());
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
		PersonaFisicaResponse other = (PersonaFisicaResponse) obj;
		if (correoElectronico == null) {
			if (other.correoElectronico != null)
				return false;
		} else if (!correoElectronico.equals(other.correoElectronico))
			return false;
		if (idUsuario == null) {
			if (other.idUsuario != null)
				return false;
		} else if (!idUsuario.equals(other.idUsuario))
			return false;
		if (nombreYApellidos == null) {
			if (other.nombreYApellidos != null)
				return false;
		} else if (!nombreYApellidos.equals(other.nombreYApellidos))
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
		return "PersonaFisicaRequest [idUsuario=" + idUsuario + ", nombreYApellidos=" + nombreYApellidos
				+ ", correoElectronico=" + correoElectronico + ", unidadEjecutora=" + unidadEjecutora + "]";
	}

}