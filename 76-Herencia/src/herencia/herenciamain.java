package herencia;

import java.util.Scanner;

import herencia.Persona;
import herencia.Alumno;
import herencia.Profesor;

public class herenciamain {
///////////////////////MENU/////////////
	static int menu(Scanner e) {
		int op = 0;
		System.out.println("1.Datos Alumnos");
		System.out.println("2.Datos Profesores");
		System.out.println("3.Visualizar datos Alumnos");
		System.out.println("4.Visualizar datos Profesores");
		System.out.println("5.Fin");
		do {
			System.out.println("Teclea a opcion.(Fin para finalizar");
			op = e.nextInt();
		} while (op < 1 || op > 5);
		return op;
	}

////////////////////AltasAlumnos///////////
	static void altasAlumnos(Scanner e) {
		String dni = "", nombre = "", apellido1 = "", apellido2 = "", cursoMatr = " ";
		int edad = ' ', numeroAlu = ' ';
		System.out.println("Novo alumno?Prema *** para finalizar");
		dni = e.nextLine();
		while (!dni.equalsIgnoreCase("***")) {
			dni = " ";
			System.out.println("Inserte o DNI do alumno");
			dni = e.nextLine();
			Alumno.setDni(dni);
			
			System.out.println("Inserte o Nome do alumno");
			nombre = e.nextLine();
			System.out.println("Inserte o Primerio Apelido");
			apellido1 = e.nextLine();
			System.out.println("Inserte o Segundo Apelido");
			apellido2 = e.nextLine();
			System.out.println("Inserte a Edad");
			edad = e.nextInt();
			System.out.println("Inserte o Curso no que esta matriculado o alumno");
			cursoMatr = e.nextLine();
			System.out.println("Inserte o numero do Alumno");
			numeroAlu = e.nextInt();
			System.out.println("Novo alumno?Prema *** para finalizar");
			dni = e.nextLine();
			
		}

	}

	///////////// Fin/////////////
	static void fin() {

	}

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;

		do {
			opcion = menu(entrada);
			switch (opcion) {
			case 1:
				altasAlumnos(entrada);
			default:
				fin();
			}
		} while (opcion != 8);
		entrada.close();
	}

}