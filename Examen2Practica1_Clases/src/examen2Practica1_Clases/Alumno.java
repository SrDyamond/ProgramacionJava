package examen2Practica1_Clases;

public class Alumno {
	//Atributos
	private String nombre;
	private String ape1;
	private String ape2;
	private float nota1;
	private float nota2;
	private float nota3;
	//Constructores
	Alumno() {
		nombre="";
		ape1="";
		ape2="";
		nota1=0;
		nota2=0;
		nota3=0;
	}
	Alumno(String nombre,String ape1,String ape2,float nota1,float nota2,float nota3) {
		this.nombre=nombre;
		this.ape1=ape1;
		this.ape2=ape2;
		this.nota1=nota1;
		this.nota2=nota2;
		this.nota3=nota3;
	}
	
	String ToString() {
		return this.nombre+" "+this.ape1+" "+this.ape2+" "+this.nota1+" "+this.nota2+" "+this.nota3;
	}
	String ToStringApe() {
		return this.ape1+" "+this.ape2+" "+this.nombre+" "+this.nota1+" "+this.nota2+" "+this.nota3;
	}
	
	
	public float notaMedia(){
		float notam=0;
		notam=(nota1+nota2+nota3)/3;
		return notam;
	}
	////GET
	public String getNombre() {
		return nombre;	
	}
	public String getApe1() {
		return ape1;
	}
	public String getApe2() {
		return ape2;
	}
	public float nota1() {
		return nota2;
	}
	public float nota2() {
		return nota2;
	}
	public float nota3() {
		return nota3;
	}
	////SET
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setApe1(String ape1) {
		this.ape1=ape1;
	}
	public void setApe2(String ape2) {
		this.ape2=ape2;
	}
	public void setNota1(float nota1) {
		this.nota1=nota1;
	}
	public void setNota2(float nota2) {
		this.nota2=nota2;
	}
	public void setNota3(float nota3) {
		this.nota3=nota3;
	}	
}
