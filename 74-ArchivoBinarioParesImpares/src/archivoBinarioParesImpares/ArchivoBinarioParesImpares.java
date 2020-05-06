package archivoBinarioParesImpares;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ArchivoBinarioParesImpares {
	static final String ruta = "C:\\Users\\dyang\\eclipse-workspace\\ArchivosDatos\\";

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
///////////////////////////LLENADO/////////////////////////////
		try {
			ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream(ruta + "ejercicio74_numeros"));
			do {
				do {
					System.out.println("Introduce un numero entre 1-100-0 para sair");
					numero = entrada.nextInt();
				} while (numero > 0 || numero >= 100 && numero != 0);
				while (numero != 0) {
					archivo.writeInt(numero);
					do {
						System.out.println("Teclea numero entre 1-100-0 para salir");
						numero = entrada.nextInt();
					} while (numero > 0 || numero >= 100 && numero != 0);
				}
			} while (numero != 0);
			archivo.close();
		} catch (IOException ioe) {
			System.out.println("Error en la grabasao");
		}
/////////////////////////ESCRITURAPARESIMPARES//////////////////
		boolean fin = false;
		try {
			ObjectInputStream archivo = new ObjectInputStream(new FileInputStream(ruta + "ejercicio73"));
			ObjectOutputStream archivopares = new ObjectOutputStream(new FileOutputStream(ruta + "ejercicio73_pares"));
			ObjectOutputStream archivoimpares = new ObjectOutputStream(new FileOutputStream(ruta + "ejercicio73_impares"));
			while (!fin) {
				try {
					numero = archivo.readInt();
					if (numero % 2 == 0)
						archivopares.writeInt(numero);
					else {
						archivoimpares.writeInt(numero);
					}
				} catch (EOFException eofe) {
					archivo.close();
					archivopares.close();
					archivoimpares.close();
					fin = true;
				}
			}

		} catch (IOException ioe) {
			System.out.println("Error en la lectura");
		}
		////////////////////////////// VISUALIZACIONPARES/////////////////
		fin = false;
		try {
			System.out.println("Archivo de pares");
			ObjectInputStream archivopares = new ObjectInputStream(new FileInputStream(ruta + "ejercicio73_pares"));
			while (!fin) {
				try {
					System.out.println(archivopares.readInt());
				} catch (EOFException eofe) {
					archivopares.close();
					fin = true;
				}
			}
		} catch (IOException ioe) {
			System.out.println("Error en la visualizacion de pares");
		}
		//////////////////////////// VISUALIZACIONIMPARES////////////7
		fin = false;
		try {
			System.out.println("Archivo de impares");
			ObjectInputStream archivoimpares = new ObjectInputStream(new FileInputStream(ruta + "ejercicio73_impares"));
			while (!fin) {
				try {
					System.out.println(archivoimpares.readInt());
				} catch (EOFException eofe) {
					archivoimpares.close();
					fin = true;
				}
			}
		} catch (IOException ioe) {
			System.out.println("Error en la visualizacion de impares");
		}
	}
}
