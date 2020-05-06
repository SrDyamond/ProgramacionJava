package menu_titulo_autor_precio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Menu_titulo_autor_precio {
	
	public static final int nMaxOpt = 3;
	public static final String finAltas = "xxx";
	public static final String dir = "/opt/archivosJava/";
	public static final String filename = "altasLibros01.dat";
	public static final boolean overwriteFile = true;

	// --- INTERFAZ DE USUARIO -------------------------------------------------

	public static void printMenu() {
		System.out.println();
		System.out.println("--- MENU ---");
		System.out.println(" 1 - Altas (archivo)");
		System.out.println(" 2 - Crear array");
		System.out.println(" 3 - Visualizar array");
		System.out.println();
		System.out.println(" 0 - Salir");
		System.out.println();
	}
	
	public static int readOpt(Scanner s, int max) {
		int out = 0;
		do {
			System.out.print("Escribe una opción: ");
			out = s.nextInt();
			s.nextLine();
		} while (out < 0 || out > max);
		return out;
	}
	
	// --- LECTURAS Y VALIDACIONES DE FORMATO ----------------------------------
	public static String readTitulo(Scanner s) {
		String out = "";
		
		do {
			System.out.print(" Titulo (25 char max); '" + finAltas + "' para acabar: ");
			out = s.nextLine();
		} while(!out.equals(finAltas) && out.length() > 25);
		
		return out;
	}
	
	public static String readAutor(Scanner s) {
		String out = "";
		
		do {
			System.out.print(" Autor (20 char max): " );
			out = s.nextLine();
		} while(out.length() > 20);
		
		return out;
	}
	
	public static float readPrecio(Scanner s) {
		String out_str = "";
		float out = 0;
		boolean continuar = true;
		
		do {
			System.out.print(" Precio: ");
			out_str = s.nextLine();
			try {
				out = Float.parseFloat(out_str);
				continuar = false;
			} catch (NumberFormatException nfe) {}
		} while(continuar);
		
		return out;
	}
	
	// --- FUNCIONES GENÉRICAS -------------------------------------------------
	public static void saveAlta(String line, String fullDir) {
		try {
			//TRUE para que no sobreescriba
			FileWriter fw = new FileWriter(fullDir, overwriteFile);
			line += '\n';
			fw.write(line); 
			fw.close();
		} catch(IOException ioe) {}
		System.out.println(" #GUARDADO: " + line);
	}
	
	public static void altas(Scanner s, String fullDir) {
		Libro myLibro;
		String titulo = "";
		String autor = "";
		float precio = 0;
		
		do {
			System.out.println("\n>> Nuevo libro:");
			titulo = readTitulo(s);
			
			if (!titulo.equals(finAltas)) {
				autor = readAutor(s);
				precio = readPrecio(s);
				
				myLibro = new Libro(titulo, autor, precio);
				saveAlta(myLibro.toStringForFile(), fullDir);
			}
			
		} while(!titulo.equals(finAltas));
	}
	
	public static int calcularArray(String fullDir) {
		String line = "";
		int i = 0;
		try {
			FileReader fr = new FileReader(fullDir);
			BufferedReader br = new BufferedReader(fr);
			line = br.readLine();
			while (line != null) {
				line = br.readLine();
				i++;
			}
			br.close();
			fr.close();
		} catch(IOException ioe) {}
		return i;
	}
	
	public static Libro[] crearArray(String fullDir) {
		Libro myLibro;
		String line = "";
		Libro libroArr[] = new Libro[calcularArray(fullDir)];
		int i = 0;
		System.out.println("\n--- CREANDO ARRAY ---");
		try {
			FileReader fr = new FileReader(fullDir);
			BufferedReader br = new BufferedReader(fr);
			line = br.readLine();
			while (line != null) {
				myLibro = new Libro(line);
				libroArr[i] = myLibro;
				line = br.readLine();
				i++;
			}
			br.close();
			fr.close();
		} catch(IOException ioe) {}
		System.out.println(" >> Array creado");
		return libroArr;
	}
	
	public static void printArray(Libro libroArr[]) {
		int i = 0;
		System.out.println("\n--- VISUALIZANDO ARRAY ---");
		for (i = 0; i < libroArr.length; i++) 
			System.out.println(libroArr[i].toString());
	}

	// --- MAIN ----------------------------------------------------------------
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int opt = 0;
		Libro libroArr[] = new Libro[1];

		do {
			printMenu();
			opt = readOpt(s, nMaxOpt);
			if (opt != 0) {
				switch (opt) {
					case 1:
						altas(s, dir + filename);
						break;
					case 2:
						libroArr = crearArray(dir + filename);
						break;
					case 3:
						printArray(libroArr);
						break;
				}
			}
		} while (opt != 0);
		
		System.out.println("Bye (; ;)");
		
		s.close();
	}

}

