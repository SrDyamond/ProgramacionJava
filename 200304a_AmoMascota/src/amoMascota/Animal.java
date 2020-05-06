package amoMascota;

public class Animal {
	
	private String dni_amo;
	private String nombre;
	private int edad;
	
	Animal() {
		this.dni_amo = "";
		this.nombre = "";
		this.edad = 0;
	}
	
	Animal(String _dni_dueno, String _nombre, int _edad) {
		this.dni_amo = _dni_dueno;
		this.nombre = _nombre;
		this.edad = _edad;
	}

	public String getDni_dueno() {
		return dni_amo;
	}

	public void setDni_dueno(String dni_dueno) {
		this.dni_amo = dni_dueno;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return this.dni_amo + " " + this.nombre + " " + this.edad;
	}

}
