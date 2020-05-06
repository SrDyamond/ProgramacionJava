package clases;

public class Alumno {
	private int numero;
	private String nombre;
	private double nota1;
	private double nota2;
	private double nota3;
	Alumno(){}
	Alumno(int numero,String nombre,double nota1,double nota2,double nota3){
		this.numero=numero;
		this.nombre=nombre;
		this.nota1=nota1;
		this.nota2=nota2;
		this.nota3=nota3;
	}
	void visualizarDatos() {
		System.out.println("Numero......."+numero);
		System.out.println("Nombre......."+nombre);
		System.out.println("Nota 1......."+nota1);
		System.out.println("Nota 2......."+nota2);
		System.out.println("Nota 3......."+nota3);
		
	}
	double notaMedia() {
		return (nota1+nota2+nota3)/3;
	}
	String aptoNoApto() {
		String literal="No Apto";
		if (notaMedia()>=4.5)
			literal="Apto";
		return literal;
	}
}
