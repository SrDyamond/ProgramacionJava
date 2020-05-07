package exam2Practica1_Clases;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam2Practica1_Clases {

	static Scanner entrada = new Scanner(System.in);
	static final String LetrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
	static Alumno[] pupilos = new Alumno[3];

	public static void main(String[] args) {
		int opcion1 = 0;
		char opcion2 = 0;
		do {
			opcion1 = menu();
			switch (opcion1) {
			case 1:
				altasAlumnos();
				break;
			case 2:
				visualizarAlumnos();
				break;
			case 3:
				obtenerNotaMedia();
				break;
			case 4:
				visualizarSexo('V');
				break;
			case 5:
				visualizarSexo('M');
				break;
			case 6:
				consultaDni();
				break;
			case 7:
				do {
					opcion2 = menuOrdenacion();
					switch (opcion2) {
					case 'D':
						ordenarDni();
						visualizarAlumnos();
						break;
					case 'N':
						ordenarNombre();
						visualizarAlumnos();
						break;
					case 'A':
						ordenarApellido();
						visualizarAlumnos();
						break;
					case 'M':
						ordenarNotaMediaDescendente();
						visualizarAlumnos();
						break;
					case 'L':
						ordenarLongitudApellidoDescendente();
						visualizarAlumnos();
						break;
					}
				} while (opcion2 != 'V');

			case 8:
				fin();
			}
		} while (opcion1 != 8);
		entrada.close();
	}

	/**
	 * Imprime el menú de acciones.
	 */
	static int menu() {
		int op = 0;
		System.out.println("\n\tMENU");
		System.out.println("\t====");
		System.out.println("1 - Altas Alumnos");
		System.out.println("2 - Visualizar alumnos");
		System.out.println("3 - Obtener nota media alumno");
		System.out.println("4 - Visualizar solo hombres");
		System.out.println("5 - Visualizar solo mujeres");
		System.out.println("6 - Consulta por dni");
		System.out.println("7 - Opciones de ordenacion");
		System.out.println("8 - Fin");
		do {
			try {
				System.out.print("\tTeclee opción (1-8)? ");
				op = entrada.nextInt();
			} catch (InputMismatchException ime) {
				System.out.println("\tTeclee un número dentro del rango!");
			}
			entrada.nextLine();
		} while (op < 1 || op > 8);
		return op;
	}

	/**
	 * Imprime el menú de opciones de ordenación.
	 */
	static char menuOrdenacion() {
		char letra = ' ';
		System.out.println("\n\tOpciones ordenacion");
		System.out.println("\t===================");
		System.out.println("D - Dni");
		System.out.println("N - Nombre");
		System.out.println("A - Apellido");
		System.out.println("M - Media más alta");
		System.out.println("L - Apellido más largo");
		System.out.println("V - Volver al menu anterior");

		do {
			try {
				System.out.print("\tTeclee opción (D|N|A|M|L|V) ");
				letra = Character.toUpperCase((char) System.in.read());
			} catch (IOException e) {
			}
			entrada.nextLine();
		} while (!isValidListOption(letra));
		return letra;
	}

	static void intercambiarPosiciones(int i, int j) {
		Alumno aux = pupilos[i];
		pupilos[i] = pupilos[j];
		pupilos[j] = aux;
	}

	static void ordenarDni() {
		int i = 0;
		int j = 0;
		while (i < pupilos.length && pupilos[i] != null) {
			j = i + 1;
			while (j < pupilos.length && pupilos[j] != null) {
				if (pupilos[i].getDni().compareTo(pupilos[j].getDni()) > 0) {
					intercambiarPosiciones(i, j);
				}
				j++;
			}
			i++;
		}
	}

	static void ordenarNombre() {
		int i = 0;
		int j = 0;
		while (i < pupilos.length && pupilos[i] != null) {
			j = i + 1;
			while (j < pupilos.length && pupilos[j] != null) {
				if (pupilos[i].getNombre().compareToIgnoreCase(pupilos[j].getNombre()) > 0) {
					intercambiarPosiciones(i, j);
				}
				j++;
			}
			i++;
		}
	}

	static void ordenarApellido() {
		int i = 0;
		int j = 0;
		while (i < pupilos.length && pupilos[i] != null) {
			j = i + 1;
			while (j < pupilos.length && pupilos[j] != null) {
				if (pupilos[i].getApellido().compareToIgnoreCase(pupilos[j].getApellido()) > 0) {
					intercambiarPosiciones(i, j);
				}
				j++;
			}
			i++;
		}
	}

	static void ordenarNotaMediaDescendente() {
		int i = 0;
		int j = 0;
		while (i < pupilos.length && pupilos[i] != null) {
			j = i + 1;
			while (j < pupilos.length && pupilos[j] != null) {
				// Es 'menor que' para ordenar de forma descendente
				if (Float.compare(pupilos[i].notaMedia(), pupilos[j].notaMedia()) < 0) {
					intercambiarPosiciones(i, j);
				}
				j++;
			}
			i++;
		}
	}

	static void ordenarLongitudApellidoDescendente() {
		int i = 0;
		int j = 0;
		while (i < pupilos.length && pupilos[i] != null) {
			j = i + 1;
			while (j < pupilos.length && pupilos[j] != null) {
				// Es 'menor que' para ordenar de forma descendente
				if (Float.compare(pupilos[i].getApellido().length(), pupilos[j].getApellido().length()) < 0) {
					intercambiarPosiciones(i, j);
				}
				j++;
			}
			i++;
		}
	}

	/**
	 * Nos devuelve si la opción es válida o no.
	 */
	static boolean isValidListOption(char option) {
		return 'D' == option || 'N' == option || 'A' == option || 'M' == option || 'L' == option || 'V' == option;
	}

	/**
	 * Comprueba que NIF y la letra se corresponden.
	 */
	static boolean isValidDni(String dni) {

		boolean isValid = false;

		// Separa datos del String dni
		int nif = Integer.parseInt(dni.substring(0, 8));
		char lastDniChar = Character.toUpperCase(dni.charAt(8));

		// Carácter que debería ser para el número introducido
		char expectedChar = LetrasDNI.charAt(nif % 23);

		isValid = lastDniChar == expectedChar;
		return isValid;
	}

	/**
	 * Grabamos los datos de los alumnos (hasta que se teclee dni = 999) teniendo en cuenta que:
	 * <li>Dni tiene que ser válido (letra respecto a número), sino se vuelve a pedir.
	 * <li>El nombre no debe excederse de 15 caracteres, sino se volverá a pedir.
	 * <li>
	 */
	public static void altasAlumnos() {
		String dni = "";
		String nombre = "";
		String apellido = "";
		char sexo = ' ';
		int edad = 0;
		float nota1 = 0;
		float nota2 = 0;
		float nota3 = 0;
		int i = 0;

		System.out.println("\n\tALTAS\n\t=====\n");

		do {
			// Obtener dni
			do {
				System.out.print("DNI (teclee 999 para salir)? ");
				dni = entrada.nextLine();
			} while (!(dni.equals("999") || isValidDni(dni)));

			if (!dni.equals("999")) {
				// Obtener nombre
				do {
					System.out.print("Nombre (max 15 caract)? ");
					nombre = entrada.nextLine();
				} while (nombre.length() > 15);

				// Obtener apellido
				System.out.print("Apellido? ");
				apellido = entrada.nextLine();

				// Obtener sexo
				do {
					System.out.print("Sexo (V | M)? ");
					try {
						sexo = Character.toUpperCase((char) System.in.read());
						entrada.nextLine();
					} catch (IOException e) {
					}
				} while (!(sexo == 'V' || sexo == 'M'));

				// Obtener edad
				System.out.print("Edad? ");
				edad = entrada.nextInt();
				entrada.nextLine();

				// Obtener notas
				System.out.print("Nota 1? ");
				nota1 = entrada.nextFloat();
				entrada.nextLine();

				System.out.print("Nota 2? ");
				nota2 = entrada.nextFloat();
				entrada.nextLine();

				System.out.print("Nota 3? ");
				nota3 = entrada.nextFloat();
				entrada.nextLine();

				pupilos[i] = new Alumno(dni, nombre, apellido, sexo, edad, nota1, nota2, nota3);
			}

			i++;
		} while (!dni.equals("999") && i < pupilos.length);

	}

	/**
	 * Visualizamos la lista de alumnos.
	 */
	public static void visualizarAlumnos() {

		System.out.println("\nLISTADO DE ALUMNOS");
		for (int i = 0; i < pupilos.length; i++) {
			if (pupilos[i] != null) {
				System.out.println(pupilos[i].pasarString());
			}
		}
	}

	/**
	 * Obtiene la nota media de los alumnos.
	 */
	public static void obtenerNotaMedia() {

		System.out.println("\tLISTADO DE NOTAS MEDIAS");
		for (int i = 0; i < pupilos.length; i++) {
			if (pupilos[i] != null) {
				System.out.println(pupilos[i].getNombre() + " - Nota media: " + pupilos[i].notaMedia());
			}
		}
	}

	/**
	 * Visualizamos la lista de alumnos del sexo indicado.
	 */
	public static void visualizarSexo(char sexo) {
		if (sexo == 'M') {
			System.out.println("\tLISTADO DE MUJERES");
		} else {
			System.out.println("\tLISTADO DE HOMBRES");
		}
		int i = 0;
		while (i < pupilos.length && pupilos[i] != null) {
			if (pupilos[i].getSexo() == sexo) {
				System.out.println(pupilos[i].pasarString());
			}
			i++;
		}
	}

	/**
	 * Busca el dni dentro del array de objetos
	 */
	static void searchAndPrintDni(String dniRecibido) {
		boolean found = false;
		int i = 0;
		while (i < pupilos.length && !found && pupilos[i] != null) {
			if (dniRecibido.equals(pupilos[i].getDni())) {
				System.out.println(pupilos[i].pasarString());
				found = true;
			}
			i++;
		}
	}

	/*
	 * Consultar datos a partir de un dni
	 */
	public static void consultaDni() {
		String dni = "";
		char answer = ' ';

		do {
			// Obtener DNI
			do {
				System.out.print("DNI? ");
				dni = entrada.nextLine();
			} while (!isValidDni(dni));

			// Mostrar información asociada al DNI si existe
			searchAndPrintDni(dni);

			// Preguntar si se hace otra consulta o se termina el método
			do {
				System.out.print("Desea realizar otra consulta (S|N)? ");
				try {
					answer = Character.toUpperCase((char) System.in.read());
					entrada.nextLine();
				} catch (IOException e) {
				}
			} while (!(answer == 'S' || answer == 'N'));

		} while (answer != 'N');
	}

	/*
	 * Finaliza el programa
	 */
	static void fin() {
		System.out.println("\n\n\tFIN DEL PROGRAMA\n\t================\n");
		System.out.println("\n");
	}
}
