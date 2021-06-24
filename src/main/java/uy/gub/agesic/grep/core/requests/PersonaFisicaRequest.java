package uy.gub.agesic.grep.core.requests;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import uy.gub.agesic.grep.core.utils.ErrorCodes;

@JsonInclude(value = Include.NON_NULL)
public class PersonaFisicaRequest extends PoderanteRequest {

	@NotBlank(message = ErrorCodes.CAMPO_OBLIGATORIO_ID_USUARIO)
	private String idUsuario;
	@NotBlank(message = ErrorCodes.CAMPO_OBLIGATORIO_NOMBRE_Y_APELLIDO)
	private String nombreYApellidos;

	@Email(message = ErrorCodes.CAMPO_INVALIDO_CORREO_ELECTRONICO)
	private String correoElectronico;
	private Long idUnidadEjecutora;

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

	public Long getIdUnidadEjecutora() {
		return idUnidadEjecutora;
	}

	public void setIdUnidadEjecutora(Long idUnidadEjecutora) {
		this.idUnidadEjecutora = idUnidadEjecutora;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((correoElectronico == null) ? 0 : correoElectronico.hashCode());
		result = prime * result + ((idUnidadEjecutora == null) ? 0 : idUnidadEjecutora.hashCode());
		result = prime * result + ((idUsuario == null) ? 0 : idUsuario.hashCode());
		result = prime * result + ((nombreYApellidos == null) ? 0 : nombreYApellidos.hashCode());
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
		PersonaFisicaRequest other = (PersonaFisicaRequest) obj;
		if (correoElectronico == null) {
			if (other.correoElectronico != null)
				return false;
		} else if (!correoElectronico.equals(other.correoElectronico))
			return false;
		if (idUnidadEjecutora == null) {
			if (other.idUnidadEjecutora != null)
				return false;
		} else if (!idUnidadEjecutora.equals(other.idUnidadEjecutora))
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
		return true;
	}

	@Override
	public String toString() {
		return "PersonaFisicaRequest [idUsuario=" + idUsuario + ", nombreYApellidos=" + nombreYApellidos
				+ ", correoElectronico=" + correoElectronico + ", idUnidadEjecutora=" + idUnidadEjecutora + "]";
	}

}