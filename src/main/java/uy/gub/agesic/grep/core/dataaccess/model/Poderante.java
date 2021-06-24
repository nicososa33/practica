package uy.gub.agesic.grep.core.dataaccess.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

@MappedSuperclass
public class Poderante extends Auditable {

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinColumn(name = "pais_documento_id", nullable = false)
	private Pais paisDocumento;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinColumn(name = "tipo_documento_id", nullable = false)
	private TipoDocumento tipoDocumento;
	
	@Column(name = "numero_documento", nullable = false)
	private String numeroDocumento;

	public Pais getPaisDocumento() {
		return paisDocumento;
	}

	public void setPaisDocumento(Pais pais) {
		this.paisDocumento = pais;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroDocumento == null) ? 0 : numeroDocumento.hashCode());
		result = prime * result + ((paisDocumento == null) ? 0 : paisDocumento.hashCode());
		result = prime * result + ((tipoDocumento == null) ? 0 : tipoDocumento.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Poderante other = (Poderante) obj;
		if (numeroDocumento == null) {
			if (other.numeroDocumento != null)
				return false;
		} else if (!numeroDocumento.equals(other.numeroDocumento))
			return false;
		if (paisDocumento == null) {
			if (other.paisDocumento != null)
				return false;
		} else if (!paisDocumento.equals(other.paisDocumento))
			return false;
		if (tipoDocumento == null) {
			if (other.tipoDocumento != null)
				return false;
		} else if (!tipoDocumento.equals(other.tipoDocumento))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Poderante [pais=" + paisDocumento + ", tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento
				+ "]";
	}

}