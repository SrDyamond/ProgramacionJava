package herencia;

public class Persona {
	//atributos
	String dni;
	String nombre;
	String apellido1;
	String apellido2;
	int edad;
	
	//constructor
	Persona() {
		this.dni="";
		this.nombre="";
		this.apellido1="";
		this.apellido2="";
		this.edad=' ';
	}
	
	Persona (String _dni,String _nombre,String _apellido1,String _apellido2,int _edad){
		this.dni=_dni;
		this.nombre=_nombre;
		this.apellido1=_apellido1;
		this.apellido2=_apellido2;
		this.edad=_edad;
	}

	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", edad=" + edad + "]";
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

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	

}
