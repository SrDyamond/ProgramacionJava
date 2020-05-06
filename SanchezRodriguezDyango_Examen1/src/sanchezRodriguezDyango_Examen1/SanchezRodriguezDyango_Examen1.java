package sanchezRodriguezDyango_Examen1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SanchezRodriguezDyango_Examen1 {

	static Scanner entrada = new Scanner(System.in);
	static final String ruta = "C:\\Datos\\";
	//static final String ruta = "C:\\Users\\dyang\\OneDrive\\Escritorio\\Ficheros\\";

///////////////////////////////// MENU\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	static int menu(Scanner e) {
		int op = 0;
		System.out.println("\t\tMENU");
		System.out.println("1-Altas");
		System.out.println("2-Visualizar fichero");
		System.out.println("3-Crear fichero por sexos");
		System.out.println("4-Fin");
		do {
			System.out.println("Teclea a opcion.(Fin para finalizar)");
			op = e.nextInt();

		} while (op < 1 || op > 4);
		return op;
	}
//////////////////////////ALTAS\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	static void altas(Scanner  e) {
		String nombre = "";
		char sexo = ' ';
		byte sexoByte;
		int edad = 0;
		e.nextLine();
		System.out.println("\n\tALTAS\n\t=====\n");
		try {
			BufferedWriter esc = new BufferedWriter(new FileWriter(ruta + "personas.txt", true));

			System.out.println("Nombre? (XXX para finalizar: ");
			nombre = e.nextLine();
			while (!nombre.equalsIgnoreCase("xxx")) {

				System.out.println("Edad de la persona: ");
				edad = e.nextInt();
				e.nextLine();
				
				// controlo que poda escribir V e M solo
				do {
					System.out.println("Sexo de la persona (V | M): ");
					sexoByte = (byte) System.in.read();
					e.nextLine();
					sexo = Character.toUpperCase((char) sexoByte);
				} while ("VvMm".indexOf(sexo) < 0);

				esc.write(nombre);
				esc.newLine();
				esc.write(Integer.toString(edad));
				esc.newLine();
				esc.write(sexo);
				esc.newLine();

				System.out.println("Nombre? (XXX para finalizar: ");
				nombre = e.nextLine();
			}
			esc.close();
		} catch (IOException ioe) {
		}
	}
//////////////////////////////VISUALIZAR\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	static void visualizar() {
		String nombre = "", edadFrase = "";
		char sexo;
		int edad;
		System.out.println("Listado personas");
		try {
			//abro o archivo
			BufferedReader wrt = new BufferedReader(new FileReader(ruta + "personas.txt"));
			nombre = wrt.readLine();
			while (nombre != null) {
				edadFrase = wrt.readLine();
				edad = Integer.parseInt(edadFrase);
				sexo = (char) wrt.read();
				wrt.readLine();
				System.out.println(nombre + "\t\t" + edad + "\t\t" + sexo);

				nombre = wrt.readLine();
			}
			//cerro o archivo
			wrt.close();
		} catch (IOException ioe) {
		}
	}
/////////////////////////////////FICHSEX\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	static void fichsex() {
		String nombre = "", edadFrase = "";
		char sexo;
		int edad;
		String sexoM = "M";
		String sexoV = "V";
		try {
			//abro os archivos
			BufferedReader wrt = new BufferedReader(new FileReader(ruta + "personas.txt"));
			BufferedWriter escrM = new BufferedWriter(new FileWriter(ruta + "mujeres.txt"));
			BufferedWriter escrV = new BufferedWriter(new FileWriter(ruta + "hombres.txt"));
			nombre = wrt.readLine();
			while (nombre != null) {
				edadFrase = wrt.readLine();
				edad = Integer.parseInt(edadFrase);
				sexo = (char) wrt.read();
				wrt.readLine();

				if (sexoV.indexOf(sexo) > -1) {
					escrV.write(nombre);
					escrV.newLine();
					escrV.write(Integer.toString(edad));
					escrV.newLine();
					escrV.write(sexo);
					escrV.newLine();
					

				}
				if (sexoM.indexOf(sexo) > -1) {
					escrM.write(nombre);
					escrM.newLine();
					escrM.write(Integer.toString(edad));
					escrM.newLine();
					escrM.write(sexo);
					escrM.newLine();

				}

				nombre = wrt.readLine();
			}
			System.out.println("\n");
			//cerro os archivos
			wrt.close();
			escrM.close();
			escrV.close();
		} catch (IOException ioe) {
		}
	}
//////////////////////FIN\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	static void fin() {
		System.out.println("\t\tFIN DEL PROGRAMA");
	}

	static public void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;
		do {
			opcion = menu(entrada);
			switch (opcion) {
			case 1:
				altas(entrada);
				break;
			case 2:
				visualizar();
				break;
			case 3:
				fichsex();
				break;
			default:
				fin();
			}
		} while (opcion != 4);
		entrada.close();
	}
}
