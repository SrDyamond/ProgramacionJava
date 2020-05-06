package examen_Parte1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Examen_Parte1 {
	static final String ruta = "C:\\Users\\dyang\\OneDrive\\Escritorio\\Ficheros\\";
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

//////////////////////////////////CREARFICHEROALTAS\\\\\\\\\\\\\\\\\\\\\\\\\\\
	static void altas(Scanner e) {
		String nombre = "",edad="",sexo="";
		e.nextLine();
		try {
			BufferedWriter esc = new BufferedWriter(new FileWriter(ruta + "Examen_personas.txt", true));
			System.out.println("Introduce o nome,*** para finalizar");
			nombre = e.nextLine();
			while (!nombre.equalsIgnoreCase("***")) {
				System.out.println("Edad?");
				edad = e.nextLine();
				do {
				System.out.println("Sexo?");
				sexo= e.nextLine();
				sexo.toUpperCase();
				}while(sexo=="V" || sexo=="M");
				esc.write(nombre);
				esc.newLine();
				esc.write(edad);
				esc.newLine();
				esc.write(sexo);
				esc.newLine();
				System.out.println("Introduce o nome,*** para finalizar");
				nombre = e.nextLine();
			}
			esc.close();
		} catch (IOException ioe) {
		}

	}
/////////////////////////////////Visualizar\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	static void visualizar() {
		String nombre = "",edad="",sexo="";
		System.out.println("Archivo de Personas");
		try {
			BufferedReader lec = new BufferedReader(new FileReader(ruta + "Examen_personas.txt"));
			nombre = lec.readLine();
			while (nombre != null) {
				edad=lec.readLine();
				sexo=lec.readLine();
				System.out.println(nombre+"\t\t"+edad+"\t\t"+sexo);
				nombre = lec.readLine();
			}
			System.out.println("\n");
			lec.close();
		} catch (IOException ioe) {
		}
		System.out.println("\n");
	}
	/////////////////FicherosSexos\\\\\\\\\\\\\\\\
	static void ficheroSexos(Scanner e) {
		
		String nombre = "";
		String edadString = "";
		char sexo;
		int edad;
		String sexoMujer = "Mm";
		String sexoVaron = "Vv";
		try {
			BufferedReader ficheroLeer = new BufferedReader(new FileReader(ruta + "personas.txt"));
			BufferedWriter escrMujer = new BufferedWriter(new FileWriter(ruta + "mujeres.txt"));
			BufferedWriter escrVaron = new BufferedWriter(new FileWriter(ruta + "hombres.txt"));
			nombre = ficheroLeer.readLine();
			while (nombre != null) {
				System.out.println(nombre);
				edadString = ficheroLeer.readLine();
				edad = Integer.parseInt(edadString);
				System.out.println(edad);
				sexo = (char) ficheroLeer.read();
				ficheroLeer.readLine();
				System.out.println(sexo);

				if (sexoMujer.indexOf(sexo) > -1) {
					escrMujer.write(nombre);
					escrMujer.newLine();
					escrMujer.write(Integer.toString(edad));
					escrMujer.newLine();
					escrMujer.write(sexo);
					escrMujer.newLine();

				}
				if (sexoVaron.indexOf(sexo) > -1) {
					escrVaron.write(nombre);
					escrVaron.newLine();
					escrVaron.write(Integer.toString(edad));
					escrVaron.newLine();
					escrVaron.write(sexo);
					escrVaron.newLine();

				}

				nombre = ficheroLeer.readLine();
			}
			System.out.println("\n");
			ficheroLeer.close();
			escrMujer.close();
			escrVaron.close();
		} catch (IOException ioe) {
		}
	}
	}

		
	/////////Fin\\\\\\\\\
	static void fin() {
		System.out.println("FIN DO PROGRAMA");
	}

	////////////////////////// MAIN\\\\\\\\\\\\\\\\\\\\\\\
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
				ficheroSexos(entrada);
				break;
			default:
				fin();
			}
		} while (opcion != 5);
		entrada.close();
	}
}
