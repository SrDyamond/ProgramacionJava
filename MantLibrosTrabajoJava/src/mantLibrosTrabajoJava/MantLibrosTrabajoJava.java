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
		System.out.println(" 2:Baixas");
		System.out.println(" 3:Modificacions");
		System.out.println(" 4:Listados");
		System.out.println(" 5:Fin");
		System.out.println();
		System.out.println(" Selecciona unha opcion entre 1 e 5");
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
	//comprobo que sea un titulo valido
	public static String comprobarAutorTitulo(Scanner s, String frase, int limite) {
		String salida = "";
		do {
			System.out.print(frase + " (" + limite + " char max): ");
			salida = s.nextLine();
		} while (salida.length() > limite);
		return salida;
	}
	//comprobo que sea un ISBN valido
	public static String comprobarISBN(Scanner s, String frase, int limite) {
		String salida = "";
		do {
			System.out.print(frase + " (" + limite + " char justos): ");
			salida = s.nextLine();
		} while (salida.length() != limite);
		return salida;
	}
	//comprobo a edad e a edicion co mesmo metodo xa que son ints
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
				System.out.println("#ERROR# Non e un Integer #ERROR#");
			}
		} while (!esInt);
		return in;
	}
	//comprobo que sea float o formato do precio
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
				System.out.println("#ERROR Non e un float  #ERROR#");
			}
		} while (!esDouble);
		return in;
	}
	//comprobo que sea S ou N
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
			//abrimos o archivo con permisos de lectura e escritura
			RandomAccessFile archivo = new RandomAccessFile(fullDir, "rw");
			do {

				numero = comprobarInt(s, "Introduce o numero do libro");

				posicionInicial = numero * Libro.LONGITUD;
				//seek usado para mover o cursor a posicion que deseo,neste caso a posicion inicial
				archivo.seek(posicionInicial);
				libro.leerDeArchivo(archivo);
				
				if (libro.getNumero() != 0 && posicionInicial < archivo.length()) {
					//comprobamos si a posicion inicial ten xa un libro
					System.out.println("# ERROR: Este numero de libro xa existe.");
					continue;
				} else {
					//comprobo todas as restriccions con metodos
					isbn = comprobarISBN(s, "ISBN", 13);
					titulo = comprobarAutorTitulo(s, "Titulo", 25);
					autor = comprobarAutorTitulo(s, "Autor", 25);
					edicion = comprobarInt(s, "Edicion");
					precio = comprobarFloat(s, "Precio");
					//instancio Libro 
					Libro l = new Libro(numero, isbn, titulo, autor, edicion, precio);

					System.out.println("Vaise gardar o libro:");
					System.out.println(" " + visualizarLibro(l));
					do {
						confirmar = comprobarSiNo(s, "Quere gardar este libro?");
					} while (confirmar != 'S' && confirmar != 'N');

					if (confirmar == 'S') {
						
						if (posicionInicial > archivo.length())
							// Si a posicion a  gardar e mayor que a ultima do archivo posicionome o final
							archivo.seek(archivo.length());

						while (posicionInicial > archivo.length()) {
							//escribo campos vacios hasta chegar o numero que me dou o usuario
							(new Libro()).escribirArchivo(archivo);
						}

						//situamonos na posicion 
						archivo.seek(posicionInicial);

						//gardamos o libro
						l.escribirArchivo(archivo);
						System.out.println("Libro gardador");
					}
				}
				//usamos o metodo comprobar sino
				do {
					continuar = comprobarSiNo(s, "Quere seguir añadindo libros?");
				} while (continuar != 'S' && continuar != 'N');

			} while (continuar == 'S');
			archivo.close();
		} catch (IOException ioe) {
			System.out.println("# ERROR: Fallo o acceder o archivo de texto.");
		}
	}

	/////////////////////// BAJAS\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	public static void bajas(Scanner s, String fullDir) {
		Libro libro = new Libro();

		char confirmar = 'S';
		char continuar = 'S';
		int numero = 0, posicionInicial = 0;

		System.out.println("\n-----BAIXAS-----");

		try {
			RandomAccessFile archivo = new RandomAccessFile(fullDir, "rw");
			do {
				numero = comprobarInt(s, "Introduce o numero do libro");
				posicionInicial = numero * Libro.LONGITUD;
				archivo.seek(posicionInicial);
				libro.leerDeArchivo(archivo);

				//comprobamos si a posicion inicial ten xa un libro
				if (libro.getNumero() != 0 && posicionInicial < archivo.length()) {
					System.out.println("Vaise borrar o siguiente libro:");
					System.out.println(" " + visualizarLibro(libro));
					do {
						confirmar = comprobarSiNo(s, "Quere borrar este libro?");
					} while (confirmar != 'S' && confirmar != 'N');

					if (confirmar == 'S') {
						// situome na posicion donde vou borrar
						archivo.seek(posicionInicial);

						// gardamos campos vacios na linea 
						(new Libro()).escribirArchivo(archivo);
						System.out.println("# Libro borrado");
					}
				} else {
					System.out.println("# ERROR: Este numero de libro xa esta vacio no archivo de texto.");
					continue;
				}

				do {
					continuar = comprobarSiNo(s, "Quere borrar mais libros?");
				} while (continuar != 'S' && continuar != 'N');

			} while (continuar == 'S');
			archivo.close();
		} catch (IOException ioe) {
			System.out.println("# ERROR: Fallo o acceder o archivo de texto.");
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

				numero = comprobarInt(s, "Introduce o numero do libro");

				posicionInicial = numero * Libro.LONGITUD;
				archivo.seek(posicionInicial);
				libro.leerDeArchivo(archivo);

				//comprobamos si a posicion inicial ten xa un libro
				if (libro.getNumero() != 0 && posicionInicial < archivo.length()) {

					System.out.println("# Vaise editar o seguinte libro:");
					System.out.println("# " + visualizarLibro(libro));
					do {
						confirmarEditar = comprobarSiNo(s, "Quere editar este libro?");
					} while (confirmarEditar != 'S' && confirmarEditar != 'N');

					if (confirmarEditar == 'S') {
						isbn = comprobarISBN(s, "ISBN", 13);
						titulo = comprobarAutorTitulo(s, "Titulo", 25);
						autor = comprobarAutorTitulo(s, "Autor", 25);
						edicion = comprobarInt(s, "Edicion");
						precio = comprobarFloat(s, "Precio");

						Libro l = new Libro(numero, isbn, titulo, autor, edicion, precio);

						System.out.println("# Vaise gardar o seguinte libro:");
						System.out.println("# " + visualizarLibro(l));
						do {
							confirmar = comprobarSiNo(s, "Desea gardar estes cambios?");
						} while (confirmar != 'S' && confirmar != 'N');

						if (confirmar == 'S') {
							// situome na posicion 
							archivo.seek(posicionInicial);

							// guardamolo na posicion
							l.escribirArchivo(archivo);
							System.out.println("# Libro gardado");
						}
					}
				} else {
					System.out.println("# ERROR: Este numero de libro xa esta vacio no archivo de texto.");
					continue;
				}

				do {
					continuar = comprobarSiNo(s, "Quere continuar modificando libros?");
				} while (continuar != 'S' && continuar != 'N');
			} while (continuar == 'S');
			archivo.close();
		} catch (IOException ioe) {
			System.out.println("# ERROR: Fallo o acceder o archivo de texto.");
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