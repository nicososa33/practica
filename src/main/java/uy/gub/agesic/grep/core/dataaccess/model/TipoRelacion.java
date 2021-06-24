package uy.gub.agesic.grep.core.dataaccess.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import uy.gub.agesic.grep.core.utils.Constants;

@Entity
@Table(name = "sga_tipo_relacion", uniqueConstraints = @UniqueConstraint(columnNames = { "fecha_baja", "tipo_relacion" }))
@SQLDelete(sql = "UPDATE sga_tipo_relacion SET fecha_baja=NOW() WHERE id = ?")
@Where(clause = "fecha_baja is NULL")
public class TipoRelacion extends Auditable {

	@Column(name = "tipo_relacion", length = Constants.MAX_DESCRIPTION_LENGTH)
	private String tipoRelacion;

	public String getTipoRelacion() {
		return tipoRelacion;
	}

	public void setTipoRelacion(String tipoRelacion) {
		this.tipoRelacion = tipoRelacion.trim();
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
		TipoRelacion other = (TipoRelacion) obj;
		if (tipoRelacion == null) {
			if (other.tipoRelacion != null)
				return false;
		} else if (!tipoRelacion.equals(other.tipoRelacion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TipoRelacion [id=" + getId() + ", tipoRelacion=" + tipoRelacion + "]";
	}

}
