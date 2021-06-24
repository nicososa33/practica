package uy.gub.agesic.grep.core.responses;

public class PoderanteResponse extends ResponseBase {

	private PaisResponse paisDocumento;
	private TipoDocumentoResponse tipoDocumento;
	private String numeroDocumento;

	public PaisResponse getPaisDocumento() {
		return paisDocumento;
	}

	public void setPaisDocumento(PaisResponse pais) {
		this.paisDocumento = pais;
	}

	public TipoDocumentoResponse getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumentoResponse tipoDocumento) {
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
		int result = super.hashCode();
		result = prime * result + ((numeroDocumento == null) ? 0 : numeroDocumento.hashCode());
		result = prime * result + ((paisDocumento == null) ? 0 : paisDocumento.hashCode());
		result = prime * result + ((tipoDocumento == null) ? 0 : tipoDocumento.hashCode());
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
		PoderanteResponse other = (PoderanteResponse) obj;
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
		return "PoderanteResponse [pais=" + paisDocumento + ", tipoDocumento=" + tipoDocumento + ", numeroDocumento="
				+ numeroDocumento + "]";
	}

}