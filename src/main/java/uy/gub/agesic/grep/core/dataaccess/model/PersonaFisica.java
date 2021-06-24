package uy.gub.agesic.grep.core.dataaccess.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;


@Entity
@Table(name = "PersonaFisica", 
	uniqueConstraints = {
			@UniqueConstraint(columnNames = { "fecha_baja", "correo_electronico" }),
			@UniqueConstraint(columnNames = { "fecha_baja", "tipo_documento_id", "numero_documento", "pais_documento_id" })
	})
@SQLDelete(sql = "UPDATE PersonaFisica SET fecha_baja=NOW() WHERE id = ?")
@Where(clause = "fecha_baja is NULL")
public class PersonaFisica extends Poderante {

	@Column(name = "usuario_id", nullable = false)
	private String idUsuario;
	@Column(name = "nombre_y_apellido", nullable = false)
	private String nombreYApellidos;
	
	@Column(name = "correo_electronico", nullable = true)
	private String correoElectronico;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinColumn(name = "adm_unidad_ejecutora_codigo", nullable = true)
	private UnidadEjecutora unidadEjecutora;

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

	public UnidadEjecutora getUnidadEjecutora() {
		return unidadEjecutora;
	}

	public void setUnidadEjecutora(UnidadEjecutora unidadEjecutora) {
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
		PersonaFisica other = (PersonaFisica) obj;
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
		return "PersonaFisica [idUsuario=" + idUsuario + ", nombreYApellidos=" + nombreYApellidos
				+ ", correoElectronico=" + correoElectronico + ", unidadEjecutora=" + unidadEjecutora + "]";
	}

}