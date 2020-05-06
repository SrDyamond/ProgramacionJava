package primerArchivoBinario;

import java.io.IOException;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class PrimerArchivoBinario {
	static final String ruta = "C:\\Users\\dyang\\eclipse-workspace\\ArchivosDatos\\";

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 0, numerob = 0;
		try {
			ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream(ruta + "ejercicio73"));
			do {
				do {
					System.out.println("Introduce un numero entre 1-500-999 para sair");
					numero = entrada.nextInt();
				} while (numero < 1 || numero > 500 && numero != 999);
				while (numero != 999) {
					do {
						archivo.writeInt(numero);
						System.out.println("Teclea numero entre 1-500-999 para salir");
						numero = entrada.nextInt();
					} while (numero < 1 || numero > 500 && numero != 999);
				}
			} while (numero != 999);
			archivo.close();
		} catch (IOException ioe) {
			System.out.println("Error en la grabasao");
		}
		///////////////////////// BUSQUEDA//////////////////
		int cont = 0;
		boolean confir = false;
		try {
			ObjectInputStream archivo = new ObjectInputStream(new FileInputStream(ruta + "ejercicio73"));
			System.out.println("Introduce o numero a buscar");
			numerob = entrada.nextInt();
			while (!confir) {
				try {
					numero = archivo.read();
					if (numero == numerob)
						cont++;
				} catch (EOFException eofe) {
					archivo.close();
					confir = true;
				}
			}
		} catch (IOException ioe) {
			System.out.println("Error en la lectura ");
		}
		if (confir)
			System.out.println("El numero " + numerob + "existe y se encuentra " + cont + "veces");
		else
			System.out.println("E numero no se encuentra");
	}
}
