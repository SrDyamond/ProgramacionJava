package exam2Practica1_Clases;

public class Alumno {
	// atributos
	private String dni;
	private String nombre;
	private String apellido;
	private char sexo;
	private int edad;
	private float nota1;
	private float nota2;
	private float nota3;

	// constructores
	Alumno(String dni, String nombre, String apellido, char sexo, int edad, float nota1, float nota2, float nota3) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.edad = edad;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	// setter & getter de los atributos
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int setEdad() {
		return edad;
	}

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

	public float getNota3() {
		return nota3;
	}

	public void setNota3(float nota3) {
		this.nota3 = nota3;
	}

	// método de la clase que devuelve los atributos en forma de String
	public String pasarString() {
		return this.dni + " " + this.nombre + " " + this.apellido + " " + this.sexo + " " + this.edad + " " + this.nota1
				+ " " + this.nota2 + " " + this.nota3;
	}

	// método que devuelve la nota media
	public float notaMedia() {
		float notaAvg = 0;
		notaAvg = (nota1 + nota2 + nota3) / 3;
		return notaAvg;
	}
}
