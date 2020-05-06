package metodovariasordenaciones;

public class datosPersona {
	private String nombre;
	private int edad;
	private char sexo;
	
	datosPersona(String nombre,int edad,char sexo){
		this.nombre =nombre;
		this.edad =edad;
		this.sexo =sexo;
	}
	datosPersona(){}
	String getNombre() {
		return this.nombre;
	}
	int getEdad() {
		return this.edad;
	}
	char getSexo() {
		return this.sexo;
	}
	void setNombre(String nombre) {
		this.nombre=nombre;
	}
	void setEdad(int edad) {
		this.edad=edad;
	}
	void setSexo(char sexo) {
		this.sexo=sexo;
	}
}
