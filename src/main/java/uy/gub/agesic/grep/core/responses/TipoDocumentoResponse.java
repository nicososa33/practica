package uy.gub.agesic.grep.core.responses;

public class TipoDocumentoResponse extends ResponseBase {

	private String codigo;
	private String descripcion;
	private String formatoUsuario;
	private String tipoPersona;

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

	public String getFormatoUsuario() {
		return formatoUsuario;
	}

	public void setFormatoUsuario(String formatoUsuario) {
		this.formatoUsuario = formatoUsuario;
	}

	public String getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((formatoUsuario == null) ? 0 : formatoUsuario.hashCode());
		result = prime * result + ((tipoPersona == null) ? 0 : tipoPersona.hashCode());
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
		TipoDocumentoResponse other = (TipoDocumentoResponse) obj;
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
		if (formatoUsuario == null) {
			if (other.formatoUsuario != null)
				return false;
		} else if (!formatoUsuario.equals(other.formatoUsuario))
			return false;
		if (tipoPersona == null) {
			if (other.tipoPersona != null)
				return false;
		} else if (!tipoPersona.equals(other.tipoPersona))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TipoDocumentoRequest [codigo=" + codigo + ", descripcion=" + descripcion + ", formatoUsuario="
				+ formatoUsuario + ", tipoPersona=" + tipoPersona + "]";
	}

}
