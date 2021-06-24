package uy.gub.agesic.grep.core.requests;

import javax.validation.constraints.NotBlank;

import uy.gub.agesic.grep.core.utils.ErrorCodes;

public class ApoderadoRequest extends RequestBase {

	@NotBlank(message = ErrorCodes.CAMPO_OBLIGATORIO_NOMBRE)
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "ApoderadoRequest [nombre=" + nombre + "]";
	}

}
