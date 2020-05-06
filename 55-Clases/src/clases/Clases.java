package clases;
import java.util.Scanner;
public class Clases {
	public static void main (String []args) {
		Scanner entrada=new Scanner(System.in);
		int numero=0;
		String nombre="";
		double nota1 =0,nota2 =0,nota3 =0;
		Alumno alumno = new Alumno();
		System.out.print("Número? ");
		numero=entrada.nextInt();
		System.out.println("Nombre? ");
		entrada.nextLine();
		nombre=entrada.nextLine();
		System.out.println("Nota 1? ");
		nota1=entrada.nextDouble();
		System.out.println("Nota 2? ");
		nota2=entrada.nextDouble();
		System.out.println("Nota 3? ");
		nota3=entrada.nextDouble();
		alumno= new Alumno (numero,nombre,nota1,nota2,nota3);
		alumno.visualizarDatos();
		System.out.println("Nota Media: "+alumno.notaMedia());
		System.out.println("Nota Media: "+alumno.aptoNoApto());
		entrada.close();
	}
}
