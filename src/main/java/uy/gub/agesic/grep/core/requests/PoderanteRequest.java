package uy.gub.agesic.grep.core.requests;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import uy.gub.agesic.grep.core.utils.ErrorCodes;

@JsonInclude(value = Include.NON_NULL)
public class PoderanteRequest extends RequestBase {

	@NotNull(message = ErrorCodes.CAMPO_OBLIGATORIO_PAIS)
	private Long idPaisDocumento;
	@NotNull(message = ErrorCodes.CAMPO_OBLIGATORIO_TIPO_DOCUMENTO)
	private Long idTipoDocumento;
	@NotBlank(message = ErrorCodes.CAMPO_OBLIGATORIO_NUMERO_DOCUMENTO)
	private String numeroDocumento;

	public Long getIdPaisDocumento() {
		return idPaisDocumento;
	}

	public void setIdPaisDocumento(Long idPais) {
		this.idPaisDocumento = idPais;
	}

	public Long getIdTipoDocumento() {
		return idTipoDocumento;
	}

	public void setIdTipoDocumento(Long idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
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
		result = prime * result + ((idPaisDocumento == null) ? 0 : idPaisDocumento.hashCode());
		result = prime * result + ((idTipoDocumento == null) ? 0 : idTipoDocumento.hashCode());
		result = prime * result + ((numeroDocumento == null) ? 0 : numeroDocumento.hashCode());
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
		PoderanteRequest other = (PoderanteRequest) obj;
		if (idPaisDocumento == null) {
			if (other.idPaisDocumento != null)
				return false;
		} else if (!idPaisDocumento.equals(other.idPaisDocumento))
			return false;
		if (idTipoDocumento == null) {
			if (other.idTipoDocumento != null)
				return false;
		} else if (!idTipoDocumento.equals(other.idTipoDocumento))
			return false;
		if (numeroDocumento == null) {
			if (other.numeroDocumento != null)
				return false;
		} else if (!numeroDocumento.equals(other.numeroDocumento))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PoderanteRequest [idPais=" + idPaisDocumento + ", idTipoDocumento=" + idTipoDocumento + ", numeroDocumento="
				+ numeroDocumento + "]";
	}

}