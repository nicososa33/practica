package uy.gub.agesic.grep.core.responses;

public class ApoderadoResponse extends ResponseBase {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "ApoderadoResponse [nombre=" + nombre + "]";
	}

}
