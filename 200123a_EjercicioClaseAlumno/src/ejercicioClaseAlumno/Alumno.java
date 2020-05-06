package ejercicioClaseAlumno;

public class Alumno {
	
	// ATRIBUTOS
	private String curso; //4 carcateres
	private String nombre; //15 caracteres
	private int nota1;
	private int nota2;
	private int nota3;
	
	// Constructor completo
	Alumno(String _curso, String _nombre, int _nota1, int _nota2, int _nota3) {
		this.curso = _curso;
		this.nombre = _nombre;
		this.nota1 = _nota1;
		this.nota2 = _nota2;
		this.nota3 = _nota3;
	}
	
	// Constructor vacío
	Alumno() {}
	
	// GETTERS
	public String getCurso() {
		return this.curso;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getNota1() {
		return this.nota1;
	}
	
	public int getNota2() {
		return this.nota2;
	}
	
	public int getNota3() {
		return this.nota3;
	}
	
	// SETTERS
	// controlamos los 4 caraceres
	public void setCurso(String _curso) {
			this.curso = _curso;
	}
	
	// controlamos los 15 caraceres
	public void setNombre(String _nombre) {
		this.nombre = _nombre;
	}
	
	public void setNota1(int _nota1) {
		this.nota1 = _nota1;
	}
	
	public void setNota2(int _nota2) {
		this.nota2 = _nota2;
	}
	
	public void setNota3(int _nota3) {
		this.nota3 = _nota3;
	}
	
	// --- MÉTODOS ADICIONALES -------------------------------------------------
	public int getMedia() {
		return (this.nota1 + this.nota2 + this.nota3) / 3;
	}

}
