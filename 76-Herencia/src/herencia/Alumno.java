package herencia;

public class Alumno extends Persona{
	//atributos//
	private int numeroAlumno;
	private String cursoMatriculado;
	
	
	Alumno() {
		this.dni="";
		this.nombre="";
		this.apellido1="";
		this.apellido2="";
		this.edad=' ';
		this.numeroAlumno=' ';
		this.cursoMatriculado="";
	}
	
	Alumno (String _dni,String _nombre,String _apellido1,String _apellido2,int _edad,int _numeroAlumno,
			String _cursoMatriculado){
		this.dni=_dni;
		this.nombre=_nombre;
		this.apellido1=_apellido1;
		this.apellido2=_apellido2;
		this.edad=_edad;
		this.numeroAlumno=_numeroAlumno;
		this.cursoMatriculado=_cursoMatriculado;
	}

	public String toString() {
		return "Alumno [numeroAlumno=" + numeroAlumno + ", cursoMatriculado=" + cursoMatriculado + ", dni=" + dni
				+ ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", edad=" + edad
				+ "]";
	}

	public int getNumeroAlumno() {
		return numeroAlumno;
	}

	public void setNumeroAlumno(int numeroAlumno) {
		this.numeroAlumno = numeroAlumno;
	}

	public String getCursoMatriculado() {
		return cursoMatriculado;
	}

	public void setCursoMatriculado(String cursoMatriculado) {
		this.cursoMatriculado = cursoMatriculado;
	}

	
	
	
}
