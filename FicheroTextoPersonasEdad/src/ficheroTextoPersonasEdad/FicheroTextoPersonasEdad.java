package ficheroTextoPersonasEdad;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FicheroTextoPersonasEdad {
	static int menu(Scanner e) {
		int op = 0;
		System.out.println("\n\tMENU\n\t====\n");
		System.out.println("1.- Altas.");
		System.out.println("2.- Listado.");
		System.out.println("3.- Media Edad.");
		System.out.println("4.- Nombre del mayor y menor (Sin Rep.)");
		System.out.println("5.- Fin.\n");
		do {
			System.out.print("\tTeclee opción (1-5)? ");
			op = e.nextInt();
		}while(op<1 || op>5);
		e.nextLine();
		return op;
	}
	static void altas(Scanner e) {
		String nombre = null, edad = null;
		System.out.println("\n\tALTAS\n\t=====");
		try {
			BufferedWriter fic = new BufferedWriter
					(new FileWriter("C:\\Users\\dyang\\OneDrive\\Escritorio\\Ficheros\\altas.txt",true));
			System.out.print("Nombre (Fin = finalizar)? ");
			nombre = e.nextLine();
			while (!nombre.equalsIgnoreCase("fin")) {
				System.out.print("Edad? ");
				edad = e.next();		
				e.nextLine();
				fic.write(nombre);
				fic.newLine();
				fic.write(edad);
				fic.newLine();
				System.out.print("Nombre (Fin = finalizar)? ");
				nombre = e.nextLine();
			}
			fic.close();
		}catch(IOException ioe) {}
	}
	static void listado() {
		String nombre = null, edad = null;
		System.out.println("\n\tLISTADO\n\t=======\n");
		System.out.println("Nombre\t\tEdad\n--------------------");
		try {
			BufferedReader leer = new BufferedReader(new FileReader("C:\\Users\\dyang\\OneDrive\\Escritorio\\Ficheros\\altas.txt"));
			nombre = leer.readLine();
			while(nombre != null) {
				edad = leer.readLine();
				System.out.println(nombre+"\t\t"+edad);
				nombre = leer.readLine();
			}
			leer.close();
		}catch(IOException ioe) {}
	}
	static void mediaEdad() {
		String nombre = null, edad = null;
		int contAlumno = 0;
		double media = 0;
		System.out.println("\n\tMEDIA EDAD\n\t==========\n");
		try {
			BufferedReader leer = new BufferedReader(new FileReader("C:\\Users\\dyang\\OneDrive\\Escritorio\\Ficheros\\altas.txt"));
			nombre = leer.readLine();
			while(nombre != null){
				edad = leer.readLine();
				System.out.println("Nombre = "+nombre+"  Edad = "+edad);
				media += Double.parseDouble(edad);
				contAlumno++;
				nombre = leer.readLine();	
			}
			System.out.println("\n\nNúmero de alumnos = "+contAlumno+"   Media edad = "+media/contAlumno);
			leer.close();
		}catch(IOException ioe) {}
	}
	static void nombreDelMayorYMenor() {
		String nombre = null, edad = null,nombreMayor = null, nombreMenor = null;
		int mayorEd = 0,menorEd = Integer.MAX_VALUE;
		System.out.println("\n\tMAYOR Y MENOR EDAD\n\t==================\n");
		try {
			BufferedReader leer = new BufferedReader(new FileReader("C:\\Users\\dyang\\OneDrive\\Escritorio\\Ficheros\\altas.txt"));
			nombre = leer.readLine();
			while(nombre != null){
				edad = leer.readLine();
					if (Integer.parseInt(edad) > mayorEd) {
						mayorEd =  Integer.parseInt(edad);
						nombreMayor = nombre;
					}
					if (Integer.parseInt(edad) < menorEd) {
						menorEd =  Integer.parseInt(edad);
						nombreMenor = nombre;
					}
				nombre = leer.readLine();	
			}
			System.out.println("\n\nAlumno con mayor edad = "+nombreMayor+"   con la edad = "+mayorEd);
			System.out.println("\n\nAlumno con menor edad = "+nombreMenor+"   con la edad = "+menorEd);
			leer.close();
		}catch(IOException ioe) {}
	}
	static void fin() {
		System.out.println("\n\n\n\tFINAL DEL PROGRAMA\n\t==================\n\n");
	}
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;
		do {
			opcion = menu(entrada);
			switch(opcion) {
			case 1:
				altas(entrada);
				break;
			case 2:
				listado();
				break;
			case 3:
				mediaEdad();
				break;
			case 4:
				nombreDelMayorYMenor();
				break;
				default:
					fin();
			}
		}while(opcion!=5);
		entrada.close();
	}

}
