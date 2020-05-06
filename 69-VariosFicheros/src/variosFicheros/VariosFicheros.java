package variosFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class VariosFicheros {
	static final String ruta = "C:\\Users\\dyang\\OneDrive\\Escritorio\\Ficheros\\";

	///////////////////////////////// MENU\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	static int menu(Scanner e) {
		int op = 0;
		System.out.println("\t\tMENU");
		System.out.println("1-Crear fichero frases");
		System.out.println("2-Crear ficheros vocales y consonantes");
		System.out.println("3-Visualizar fichero frases");
		System.out.println("4-Visualiza fichero vocales");
		System.out.println("5-Visualizar fichero consonantes");
		System.out.println("6-Fin");
		do {
			System.out.println("Teclea a opcion.(Fin para finalizar)");
			op = e.nextInt();

		} while (op < 1 || op > 6);
		return op;
	}

	////////////////////////////////// CREARFICHEROSFRASES\\\\\\\\\\\\\\\\\\\\\\\\\\\
	static void ficheroFrases(Scanner e) {
		String frase = "";
		e.nextLine();
		try {
			BufferedWriter esc = new BufferedWriter(new FileWriter(ruta + "ficheroFrases.txt", true));
			System.out.println("Introduce a frase,*** para finalizar");
			frase = e.nextLine();
			while (!frase.equalsIgnoreCase("***")) {
				esc.write(frase);
				esc.newLine();
				System.out.println("Introduce a frase,*** para finalizar");
				frase = e.nextLine();
			}
			esc.close();
		} catch (IOException ioe) {
		}

	}

	//////////////////////// CrearFicheroVocales\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	static void crearFicheroPartidos() {
		String frase = "";
		int i = 0;
		char letra = ' ';
		String vocalesOk = "aeiouAEIOU";
		String consonantesOk = "qwrtypsdfghjklzxcvbnmñQWRTYPSDFGHJKLZXCVBNMÑ";
		try {
			BufferedReader lec = new BufferedReader(new FileReader(ruta + "ficheroFrases.txt"));
			BufferedWriter escrVoc = new BufferedWriter(new FileWriter(ruta + "ficheroVocales.txt"));
			BufferedWriter escrCon = new BufferedWriter(new FileWriter(ruta + "ficheroConsonantes.txt"));
			frase = lec.readLine();
			while (frase != null) {
				for (i = 0; i < frase.length(); i++) {
					letra = frase.charAt(i);
					if (vocalesOk.indexOf(letra) > -1) {
						escrVoc.write(letra);
					} else if (consonantesOk.indexOf(letra) > -1) {
						escrCon.write(letra);
					}

				}
				frase = lec.readLine();
			}

			lec.close();
			escrVoc.close();
			escrCon.close();
		} catch (IOException ioe) {
		}
	}

///////////////////////////////VisualizarFrases\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	static void visualizarArchivoFrases() {
		String frase = "";
		System.out.println("Archivo de frases");
		try {
			BufferedReader lec = new BufferedReader(new FileReader(ruta + "ficheroFrases.txt"));
			frase = lec.readLine();
			while (frase != null) {
				System.out.println(frase);
				frase = lec.readLine();
			}
			System.out.println("\n");
			lec.close();
		} catch (IOException ioe) {
		}
		System.out.println("\n");
	}

	/////////////////////////////////////////// VisualizarArchivoVocales\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	static void visualizarArchivoVocales() {
		String frase = "";
		System.out.println("Archivo de Vocales");
		try {
			BufferedReader lec = new BufferedReader(new FileReader(ruta + "ficheroVocales.txt"));
			frase = lec.readLine();
			while (frase != null) {
				System.out.println(frase);
				frase = lec.readLine();
			}
			System.out.println("\n");
			lec.close();
		} catch (IOException ioe) {
		}
		System.out.println("\n");
	}

	/////////////////////////////////////// VisualizarArchivoConsonantes\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	static void visualizarArchivoConsonantes() {
		String frase = "";
		System.out.println("Archivo de Consonantes");
		try {
			BufferedReader lec = new BufferedReader(new FileReader(ruta + "ficheroConsonantes.txt"));
			frase = lec.readLine();
			while (frase != null) {
				System.out.println(frase);
				frase = lec.readLine();

			}
			System.out.println("\n");
			lec.close();
		} catch (IOException ioe) {
		}
		System.out.println("\n");
	}

	////////////////////////////////// FIN\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	static void fin() {
		System.out.println("Fin del programa");
	}

	////////////////////////////////// MAIN\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	static public void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;
		do {
			opcion = menu(entrada);
			switch (opcion) {
			case 1:
				ficheroFrases(entrada);
				break;
			case 2:
				crearFicheroPartidos();
				break;
			case 3:
				visualizarArchivoFrases();
				break;
			case 4:
				visualizarArchivoVocales();
				break;
			case 5:
				visualizarArchivoConsonantes();
				break;
			default:
				fin();
			}
		} while (opcion != 6);
		entrada.close();
	}

}
