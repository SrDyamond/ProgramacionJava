package altasFactura;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.NumberFormatException;

public class AltasFactura {
	
	// --- INTERFAZ DE USUARIO -------------------------------------------------

	public static void printMenu() {
		System.out.println();
		System.out.println("--- MENU ---");
		System.out.println(" 1 - Altas");
		System.out.println(" 2 - Factura");
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
	public static String readCodigo(Scanner s) {
		String codigo = "";
		
		do {
			System.out.print(" Código (6 char max); '*' para acabar: ");
			codigo = s.nextLine();
		} while(!codigo.equals("*") && codigo.length() > 6);
		
		return codigo;
	}
	
	public static String readDenominacion(Scanner s) {
		String denominacion = "";
		
		do {
			System.out.print(" Denominación (13 char max): ");
			denominacion = s.nextLine();
		} while(denominacion.length() > 13);
		
		return denominacion;
	}
	
	public static float readPrecioUd(Scanner s) {
		String precio_ud_str = "";
		float precio_ud = 0;
		boolean continuar = true;
		
		do {
			System.out.print(" Precio por unidad: ");
			precio_ud_str = s.nextLine();
			try {
				precio_ud = Float.parseFloat(precio_ud_str);
				continuar = false;
			} catch (NumberFormatException nfe) {}
		} while(continuar);
		
		return precio_ud;
	}
	
	public static int readUdVendidas(Scanner s) {
		String ud_vendidas_str = "";
		int ud_vendidas = 0;
		boolean continuar = true;
		
		do {
			System.out.print(" Unidades vendidas: ");
			ud_vendidas_str = s.nextLine();
			try {
				ud_vendidas = Integer.parseInt(ud_vendidas_str);
				continuar = false;
			} catch (NumberFormatException nfe) {}
		} while(continuar);
		
		return ud_vendidas;
	}
	
	public static char readTipo(Scanner s) {
		char tipo = ' ';
		do {
			System.out.print(" Tipo (A/B/C): ");
			try {
				tipo = (char) System.in.read();
				while(System.in.read()!='\n');
			} catch (IOException ioe) {}
			tipo = Character.toUpperCase(tipo);
		} while (tipo != 'A' && tipo != 'B' && tipo != 'C');
		return tipo;
	}
	
	// --- FUNCIONES GENÉRICAS -------------------------------------------------
	public static void saveAlta(String linea, String fullDir) {
		System.out.println(" ### GUARDANDO: " + linea);
		try {
			//TRUE para que no sobreescriba
			FileWriter fw = new FileWriter(fullDir, true);
			linea += '\n';
			fw.write(linea); 
			fw.close();
		} catch(IOException ioe) {}
	}
	
	public static boolean altas(Scanner s, String fullDir) {
		boolean out = false;
		
		Alta myAlta;
		String codigo = "";
		String denominacion = "";
		float precio_ud = 0;
		int ud_vendidas = 0;
		char tipo = ' ';
		
		do {
			System.out.println("\n>> Nueva alta:");
			codigo = readCodigo(s);
			
			if (!codigo.equals("*")) {
				denominacion = readDenominacion(s);
				precio_ud = readPrecioUd(s);
				ud_vendidas = readUdVendidas(s);
				tipo = readTipo(s);
				
				myAlta = new Alta(codigo, denominacion, precio_ud, ud_vendidas, tipo);
				saveAlta(myAlta.toStringForFile(), fullDir);
			}
			
		} while(!codigo.equals("*"));

		return out;
	}
	
	public static void printFactura(String fullDir) {
		Alta myAlta;
		String linea = "";
		System.out.println("\n---FACTURA---");
		System.out.println("CODIGO\t| DENOM\t\t| PREC. UD\t| UD VENDIDAS\t| TIPO\t| PRECIO\t| PRECIO + IVA");
		System.out.println("------------------------------------------------------------------------------------------------");
		try {
			FileReader fr = new FileReader(fullDir);
			BufferedReader br = new BufferedReader(fr);
			linea = br.readLine();
			while (linea != null) {
				myAlta = new Alta(linea);
				System.out.println("" + myAlta.toStringForFactura());
				linea = br.readLine();
			}
			br.close();
			fr.close();
		} catch(IOException ioe) {}
	}

	// --- MAIN ----------------------------------------------------------------
	public static void main(String[] args) {
		String dir = "/opt/archivosJava/";
		String filename = "altas01.dat";
		Scanner s = new Scanner(System.in);
		int opt = 0;

		do {
			printMenu();
			opt = readOpt(s, 2);
			if (opt != 0) {
				switch (opt) {
					case 1:
						altas(s, dir + filename);
						break;
					case 2:
						printFactura(dir + filename);
						break;
				}
			}
		} while (opt != 0);
		
		System.out.println("Bye (;︵;)");
		
		s.close();
	}

}
