package uy.gub.agesic.grep.core.dataaccess.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;


@Entity
@Table(name = "PersonaJuridica", 
	uniqueConstraints = {
			@UniqueConstraint(columnNames = { "fecha_baja", "correo_electronico" }),
			@UniqueConstraint(columnNames = { "fecha_baja", "tipo_documento_id", "numero_documento", "pais_documento_id" }),
			@UniqueConstraint(columnNames = { "fecha_baja", "telefono_celular" })
	})
@SQLDelete(sql = "UPDATE PersonaJuridica SET fecha_baja=NOW() WHERE id = ?")
@Where(clause = "fecha_baja is NULL")
public class PersonaJuridica extends Poderante {

	@Column(name = "razon_social", nullable = false)
	private String razonSocial;
	@Column(name = "correo_electronico", nullable = false)
	private String correoElectronico;
	@Column(name = "fecha_constitucion", nullable = true)
	private Date fechaConstitucion;
	@Column(name = "telefono_celular", nullable = true)
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
		PersonaJuridica other = (PersonaJuridica) obj;
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