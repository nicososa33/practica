package uy.gub.agesic.grep.core.requests;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import uy.gub.agesic.grep.core.utils.ErrorCodes;

@JsonInclude(value = Include.NON_NULL)
public class PersonaJuridicaRequest extends PoderanteRequest {

	@NotBlank(message = ErrorCodes.CAMPO_OBLIGATORIO_RAZON_SOCIAL)
	private String razonSocial;
	
	@Email(message = ErrorCodes.CAMPO_INVALIDO_CORREO_ELECTRONICO)
	@NotBlank(message = ErrorCodes.CAMPO_OBLIGATORIO_CORREO_ELECTRONICO)
	private String correoElectronico;
	
	private Date fechaConstitucion;
	private String telefonoCelular;

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getTelefonoCelular() {
		return telefonoCelular;
	}

	public void setTelefonoCelular(String telefonoCelular) {
		this.telefonoCelular = telefonoCelular;
	}

	public Date getFechaConstitucion() {
		return fechaConstitucion;
	}

	public void setFechaConstitucion(Date fechaConstitucion) {
		this.fechaConstitucion = fechaConstitucion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((correoElectronico == null) ? 0 : correoElectronico.hashCode());
		result = prime * result + ((fechaConstitucion == null) ? 0 : fechaConstitucion.hashCode());
		result = prime * result + ((razonSocial == null) ? 0 : razonSocial.hashCode());
		result = prime * result + ((telefonoCelular == null) ? 0 : telefonoCelular.hashCode());
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
		PersonaJuridicaRequest other = (PersonaJuridicaRequest) obj;
		if (correoElectronico == null) {
			if (other.correoElectronico != null)
				return false;
		} else if (!correoElectronico.equals(other.correoElectronico))
			return false;
		if (fechaConstitucion == null) {
			if (other.fechaConstitucion != null)
				return false;
		} else if (!fechaConstitucion.equals(other.fechaConstitucion))
			return false;
		if (razonSocial == null) {
			if (other.razonSocial != null)
				return false;
		} else if (!razonSocial.equals(other.razonSocial))
			return false;
		if (telefonoCelular == null) {
			if (other.telefonoCelular != null)
				return false;
		} else if (!telefonoCelular.equals(other.telefonoCelular))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PersonaJuridica [razonSocial=" + razonSocial + ", correoElectronico=" + correoElectronico
				+ ", fechaConstitucion=" + fechaConstitucion + ", telefonoCelular=" + telefonoCelular + "]";
	}

}