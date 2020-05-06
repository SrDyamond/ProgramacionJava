package amoMascota;

public class Persona {
	
	private String dni;
	private String nombre;
	
	Persona() {
		this.dni = "";
		this.nombre = "";
	}
	
	Persona(String _dni, String _nombre) {
		this.dni = _dni;
		this.nombre = _nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return this.dni + " " + this.nombre;
	}
	
}
