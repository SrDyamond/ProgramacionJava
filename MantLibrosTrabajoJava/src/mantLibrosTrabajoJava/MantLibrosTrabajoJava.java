package mantLibrosTrabajoJava;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;


public class MantLibrosTrabajoJava {
	public static final String dir = "C:\\Datos\\";
	public static final String filename = "libros.dat";

	/////////////// MENU\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	public static int menu(Scanner s) {
		int op=0;
		System.out.println();
		System.out.println(" ------- MENU -------");
		System.out.println(" 1:Altas");
		System.out.println(" 2:Bajas");
		System.out.println(" 3:Modificaciones");
		System.out.println(" 4:Listados");
		System.out.println(" 5:Fin");
		System.out.println();
		System.out.println(" Seleccione unha opcion entre 1 e 5");
		System.out.println();
		do {
			System.out.println("Prema a opcion elexida");
			op = s.nextInt();
			s.nextLine();
		} while (op < 1 || op > 5);
		return op;
	}

	///////////////// VISUALIZAR\\\\\\\\\\\\\\\\\\\\\
	
	public static String visualizarLibro(Libro l) {
		return l.getNumero() + " " + l.getIsbn() + " " + l.getTitulo() + " " + l.getAutor() + " " + l.getEdicion() + " "
				+ l.getPrecio();
	}

	////////////// COMPROBACIONS////////////////////
	public static String comprobarAutorTitulo(Scanner s, String frase, int limite) {
		String salida = "";
		do {
			System.out.print(frase + " (" + limite + " char max): ");
			salida = s.nextLine();
		} while (salida.length() > limite);
		return salida;
	}

	public static String comprobarISBN(Scanner s, String frase, int limite) {
		String salida = "";
		do {
			System.out.print(frase + " (" + limite + " char justos): ");
			salida = s.nextLine();
		} while (salida.length() != limite);
		return salida;
	}

	public static int comprobarInt(Scanner s, String frase) {
		String entradaString = "";
		int in = 0;
		boolean esInt = false;
		do {
			System.out.print(frase + " (int): ");
			entradaString = s.nextLine();
			try {
				in = Integer.parseInt(entradaString);
				esInt = true;
			} catch (NumberFormatException nfe) {
				System.out.println("# ERROR: No es un Integer.");
			}
		} while (!esInt);
		return in;
	}

	public static float comprobarFloat(Scanner s, String frase) {
		String entradaString = "";
		float in = 0;
		boolean esDouble = false;
		do {
			System.out.print(frase + " (float): ");
			entradaString = s.nextLine();
			try {
				in = Float.parseFloat(entradaString);
				esDouble = true;
			} catch (NumberFormatException nfe) {
				System.out.println("# ERROR: No es un Float.");
			}
		} while (!esDouble);
		return in;
	}

	public static char comprobarSiNo(Scanner s, String frase) {
		char in = ' ';
		do {
			System.out.print(frase + " (S/N): ");
			in = s.nextLine().toUpperCase().charAt(0);
		} while (in != 'S' && in != 'N');
		return in;
	}

	////////////////////// ALTAS\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	public static void altas(Scanner s, String fullDir) {
		Libro libro = new Libro();
		char confirmar = 'S';
		char continuar = 'S';
		String isbn = "";
		String titulo = "";
		String autor = "";
		int numero = 0, edicion = 0, posicionInicial = 0;
		float precio = 0;

		System.out.println("\n-----ALTAS-----");

		try {
			RandomAccessFile archivo = new RandomAccessFile(fullDir, "rw");
			do {

				numero = comprobarInt(s, "Introduce el número del libro");

				posicionInicial = numero * Libro.LONGITUD;
				archivo.seek(posicionInicial);
				libro.leerDeArchivo(archivo);

				// comprobamos si la posición dada está llena o no
				if (libro.getNumero() != 0 && posicionInicial < archivo.length()) {
					System.out.println("# ERROR: Este código ya está lleno en el archivo.");
					continue;
				} else {
					isbn = comprobarISBN(s, "Introduce el ISBN", 13);
					titulo = comprobarAutorTitulo(s, "Introduce el título", 25);
					autor = comprobarAutorTitulo(s, "Introduce el autor", 25);
					edicion = comprobarInt(s, "Introduce el número de la edición");
					precio = comprobarFloat(s, "Introduce el precio");

					Libro l = new Libro(numero, isbn, titulo, autor, edicion, precio);

					System.out.println("# Se va a guardar el siguiente libro:");
					System.out.println("# " + visualizarLibro(l));
					do {
						confirmar = comprobarSiNo(s, "Desea guardar este libro?");
					} while (confirmar != 'S' && confirmar != 'N');

					if (confirmar == 'S') {
						// Si la nueva posición a guardar es mayor a la ultima del archivo, me
						// posiciono al final
						if (posicionInicial > archivo.length())
							archivo.seek(archivo.length());

						// Escribo personas vacías hasta llegar a la posición en la que voy a guardar
						// mi nueva libro
						while (posicionInicial > archivo.length()) {
							(new Libro()).escribirArchivo(archivo);
						}

						// me situo en la posición dada (donde voy a guardar)
						archivo.seek(posicionInicial);

						// guardamos el libro en su posición correspondiente
						l.escribirArchivo(archivo);
						System.out.println("# Libro guardado");
					}
				}

				do {
					continuar = comprobarSiNo(s, "Desea continuar introduciendo altas?");
				} while (continuar != 'S' && continuar != 'N');

			} while (continuar == 'S');
			archivo.close();
		} catch (IOException ioe) {
			// ioe.printStackTrace();
			System.out.println("# ERROR: Fallo al acceder al archivo.");
		}
	}

	/////////////////////// BAJAS\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	public static void bajas(Scanner s, String fullDir) {
		Libro libro = new Libro();

		char confirmar = 'S';
		char continuar = 'S';
		int numero = 0, posicionInicial = 0;

		System.out.println("\n-----BAJAS-----");

		try {
			RandomAccessFile archivo = new RandomAccessFile(fullDir, "rw");
			do {
				numero = comprobarInt(s, "Introduce el número del libro");
				posicionInicial = numero * Libro.LONGITUD;
				archivo.seek(posicionInicial);
				libro.leerDeArchivo(archivo);

				// comprobamos si la posición dada está llena o no
				if (libro.getNumero() != 0 && posicionInicial < archivo.length()) {
					System.out.println("# Se va a borrar el siguiente libro:");
					System.out.println("# " + visualizarLibro(libro));
					do {
						confirmar = comprobarSiNo(s, "Desea borrar este libro?");
					} while (confirmar != 'S' && confirmar != 'N');

					if (confirmar == 'S') {
						// me situo en la posición dada (donde voy a borrar)
						archivo.seek(posicionInicial);

						// guardamos un libro vacío (borramos) en la posición dada
						(new Libro()).escribirArchivo(archivo);
						System.out.println("# Libro borrado");
					}
				} else {
					System.out.println("# ERROR: Este código ya está vacío en el archivo.");
					continue;
				}

				do {
					continuar = comprobarSiNo(s, "Desea continuar borrando libros?");
				} while (continuar != 'S' && continuar != 'N');

			} while (continuar == 'S');
			archivo.close();
		} catch (IOException ioe) {
			// ioe.printStackTrace();
			System.out.println("# ERROR: Fallo al acceder al archivo.");
		}
	}

	///////////////////////// MODIFICACIONES\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	public static void modificar(Scanner s, String fullDir) {
		Libro libro = new Libro();
		char confirmarEditar = 'S';
		char confirmar = 'S';
		char continuar = 'S';
		String isbn = "";
		String titulo = "";
		String autor = "";
		int numero = 0, edicion = 0, posicionInicial = 0;
		float precio = 0;

		System.out.println("\n# -----EDICION-----");

		try {
			RandomAccessFile archivo = new RandomAccessFile(fullDir, "rw");
			do {

				numero = comprobarInt(s, "Introduce el número del libro");

				posicionInicial = numero * Libro.LONGITUD;
				archivo.seek(posicionInicial);
				libro.leerDeArchivo(archivo);

				// comprobamos si la posición dada está llena o no
				if (libro.getNumero() != 0 && posicionInicial < archivo.length()) {

					System.out.println("# Se va a editar el siguiente libro:");
					System.out.println("# " + visualizarLibro(libro));
					do {
						confirmarEditar = comprobarSiNo(s, "Desea editar este libro?");
					} while (confirmarEditar != 'S' && confirmarEditar != 'N');

					if (confirmarEditar == 'S') {
						isbn = comprobarISBN(s, "Introduce el nuevo ISBN", 13);
						titulo = comprobarAutorTitulo(s, "Introduce el nuevo título", 25);
						autor = comprobarAutorTitulo(s, "Introduce el nuevo autor", 25);
						edicion = comprobarInt(s, "Introduce el nyevo número de la edición");
						precio = comprobarFloat(s, "Introduce el nuevo precio");

						Libro l = new Libro(numero, isbn, titulo, autor, edicion, precio);

						System.out.println("# Se va a guardar el siguiente libro editado:");
						System.out.println("# " + visualizarLibro(l));
						do {
							confirmar = comprobarSiNo(s, "Desea guardar estes cambios?");
						} while (confirmar != 'S' && confirmar != 'N');

						if (confirmar == 'S') {
							// me situo en la posición dada (donde voy a guardar)
							archivo.seek(posicionInicial);

							// guardamos el libro en su posición correspondiente
							l.escribirArchivo(archivo);
							System.out.println("# Libro guardado");
						}
					}
				} else {
					System.out.println("# ERROR: Este código está vacío en el archivo.");
					continue;
				}

				do {
					continuar = comprobarSiNo(s, "Desea continuar modificando libros?");
				} while (continuar != 'S' && continuar != 'N');
			} while (continuar == 'S');
			archivo.close();
		} catch (IOException ioe) {
			// ioe.printStackTrace();
			System.out.println("# ERROR: Fallo al acceder al archivo.");
		}
	}

	/////////////////////////// LISTADO\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	public static void listar(String fullDir) {

		boolean finArchivo = false;
		Libro libro = new Libro();

		System.out.println("\n -----LISTADO-----");

		try {
			RandomAccessFile archivo = new RandomAccessFile(fullDir, "r");
			finArchivo = libro.leerDeArchivo(archivo);
			while (!finArchivo) {
				if (libro.getNumero() != 0)
					System.out.println(visualizarLibro(libro));
				finArchivo = libro.leerDeArchivo(archivo);
			}
			archivo.close();
		} catch (IOException ioe) {
			System.out.println("# ERROR: Fallo en lectura.");
		}
	}

	public static void fin() {
		System.out.println("FIN DEL PROGRAMA");
	}

	// --- MAIN ----------------------------------------------------------------
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int op = 0;

		do {
			op = menu(entrada);
				switch (op) {
				case 1:
					altas(entrada, dir + filename);
					break;
				case 2:
					bajas(entrada, dir + filename);
					break;
				case 3:
					modificar(entrada, dir + filename);
					break;
				case 4:
					listar(dir + filename);
					break;
				default:
					fin();
			}
		} while (op != 5);
		entrada.close();
	}

}