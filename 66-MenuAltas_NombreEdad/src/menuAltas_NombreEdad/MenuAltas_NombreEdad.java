package menuAltas_NombreEdad;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MenuAltas_NombreEdad {
	static final String ruta = "C:\\Users\\dyang\\eclipse-workspace\\ArchivosDatos\\";

	static int Menu(Scanner e) {
		int op = 0;
		System.out.println("\n\tMENU\n\t====\n");
		System.out.println("1.- Altas. ");
		System.out.println("2.- Listado.");
		System.out.println("3.- Media de edad");
		System.out.println("4.- Nombre del mayor y menor (Sin rep)");
		System.out.println("5.- Fin");
		do {
			System.out.println("Teclear opción (1-5)? ");
			op = e.nextInt();
		} while (op < 1 || op > 5);
		return op;
	}

	//////////////////////////////////////////// TABULAR\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	static String tabular(String cad) {
		String t = "\t\t";
		if (cad.length() < 8)
			t = "\t\t\t";
		return t;
	}

	//////////////////////////////////////////// ALTAS\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	static void altas(Scanner e) {
		String nombre = "", edad = "";
		e.nextLine();
		try {
			BufferedWriter esc = new BufferedWriter(new FileWriter(ruta + "programa_66.txt", true));
			System.out.println("Nombre?...('fin' para fin)");
			nombre = e.nextLine();
			while (!nombre.equalsIgnoreCase("fin")) {
				System.out.println("Edad?");
				edad = e.nextLine();
				esc.write(nombre);
				esc.newLine();
				esc.write(edad);
				esc.newLine();
				System.out.println("Nombre?...('fin' para fin)");
				nombre = e.nextLine();
			}
			esc.close();
		} catch (IOException ioe) {
		}
	}

	/////////////////////////////////////////// LISTADO\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	static void listado() {
		String nombre = "", edad = "";
		System.out.println("\tLISTADO\n\t");
		try {
			BufferedReader lec = new BufferedReader(new FileReader(ruta + "programa_66.txt"));
			nombre = lec.readLine();
			System.out.println("Nombre\t\t\tEdad");
			System.out.println("----------------------------");
			while (nombre != null) {
				edad = lec.readLine();
				System.out.println(nombre + tabular(nombre) + edad);
				// System.out.println(nombre + "\t" + edad);
				nombre = lec.readLine();
			}
			lec.close();
		} catch (IOException ioe) {
		}
	}

	////////////////////////////////////////// MEDIA\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	static void media() {
		String nombre = "", edad = "";
		int cp = 0;
		int media = 0;//
		float mEdades = 0;
		try {
			BufferedReader lec = new BufferedReader(new FileReader(ruta + "programa_66.txt"));
			nombre = lec.readLine();
			while (nombre != null) {
				edad = lec.readLine();
				media += Integer.parseInt(edad);
				cp++;
				nombre = lec.readLine();
				System.out.println("Calculando....");
			}
			mEdades = (float) media / (float) cp;
			System.out.println("La media es " + mEdades);
			lec.close();
		} catch (IOException ioe) {
		}

	}

	///////////////////////////////////////////// MAYORMENOR\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	static void mayorMenor() {
		String nombre = "", nMin = "", nMax = "", edad = "";
		int menor = Integer.MAX_VALUE, mayor = 0;// edad convertido a int
		try {
			BufferedReader lec = new BufferedReader(new FileReader(ruta + "programa_66.txt"));
			nombre = lec.readLine();
			while (nombre != null) {
				edad = lec.readLine();
				if (Integer.parseInt(edad) < menor) {
					nMin = nombre;
					menor = Integer.parseInt(edad);
				}
				if (Integer.parseInt(edad) > mayor) {
					nMax = nombre;
					mayor = Integer.parseInt(edad);
				}
				nombre = lec.readLine();
			}
			System.out.println("El mayor es " + nMax + " con " + mayor + " años");
			System.out.println("El menor es " + nMin + " con " + menor + " años");
			lec.close();
		} catch (IOException ioe) {
		}

	}

	public static void fin() {
		System.out.println("#############FIN DEL PROGRAMA############");
	}

	/////////////////////////////////////////////// MAIN\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;
		do {
			opcion = Menu(entrada);
			switch (opcion) {
			case 1:
				altas(entrada);
				break;
			case 2:
				listado();
				break;
			case 3:
				media();
				break;
			case 4:
				mayorMenor();
				break;
			default:
				fin();
			}
		} while (opcion != 5);
		entrada.close();
	}

}
