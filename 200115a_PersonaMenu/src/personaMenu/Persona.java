package personaMenu;

public class Persona {
	private String nombre;
	private int edad;
	private char sexo;
	
	Persona(String _nombre, int _edad, char _sexo) {
		this.nombre = _nombre;
		this.edad = _edad;
		this.sexo = _sexo;
	}
	
	Persona() {}
	
	String getNombre() {
		return this.nombre;
	}
	
	int getEdad() {
		return this.edad;
	}
	
	char getSexo() {
		return this.sexo;
	}
	
	void setNombre(String _nombre) {
		this.nombre = _nombre;
	}
	
	void setEdad(int _edad) {
		this.edad = _edad;
	}
	
	void setSexo(char _sexo) {
		this.sexo = _sexo;
	}
}
