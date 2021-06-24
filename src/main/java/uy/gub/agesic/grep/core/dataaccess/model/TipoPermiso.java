package uy.gub.agesic.grep.core.dataaccess.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import uy.gub.agesic.grep.core.utils.Constants;

@Entity
@Table(name = "adm_permiso", uniqueConstraints = @UniqueConstraint(columnNames = { "fecha_baja", "codigo" }))
@SQLDelete(sql = "UPDATE adm_permiso SET fecha_baja=NOW() WHERE id = ?")
@Where(clause = "fecha_baja is NULL")
public class TipoPermiso extends Auditable {

	@Column(name = "codigo", nullable = false, length = Constants.MAX_CODE_LENGTH)
	private String codigo;

	@Column(name = "descripcion", nullable = false, length = Constants.MAX_DESCRIPTION_LENGTH)
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
		TipoPermiso other = (TipoPermiso) obj;
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
