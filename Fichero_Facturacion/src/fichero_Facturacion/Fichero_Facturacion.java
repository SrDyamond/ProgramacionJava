package fichero_Facturacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Fichero_Facturacion {

	// los metodos de clase son static
	static int menu(Scanner entrada) { // menu recibe el Scanner, no tiene que llamarse igual que en el main
		int op = 0;
		System.out.println("\n\tMENU\n\t====\n");
		System.out.println("1. Altas.");
		System.out.println("2. Facturas.");
		System.out.println("3. Fin.\n");
		do {
			System.out.print("\nTeclee opcion?: ");
			op = entrada.nextInt();
		} while (op < 1 || op > 3); // solo te vas de el si metes 1, 2, 3, 4, 5 o 6
		return op; // metodo tipo int que te devuelve la op
	}

	static final String ruta = "C:\\Users\\dyang\\OneDrive\\Escritorio\\Ficheros\\";; // final porque no se modifica
//	static final String ruta = "D:\\EKLIPSI\\archivosDatos";

	static void entradaAltas(Scanner entrada) {
		String codigo = null, denominacion = null, precio = null, unidVend = null;
		float prec = 0; // tipos que trabajan con la memoria RAM
		int unVe = 0;
		char tipo = ' ';
		entrada.nextLine();
		// trycatch mientras trabajas con el medio externo

		try {
			BufferedWriter esc = new BufferedWriter(new FileWriter(ruta + "articulos.txt", false));
			// false porque cada vez que lo ejecutes quieres que haga una nueva
			System.out.println("\n\tALTAS\n\t=====\n");
			do {
				System.out.print("Código (max 6 caracteres) (\"*\" para fin)...: ");
				codigo = entrada.nextLine();
			} while (codigo.length() > 6);

			while (!codigo.equals("*")) {
				do {
					System.out.print("Denominación (max 15 caracteres): ");
					denominacion = entrada.nextLine();
				} while (denominacion.length() > 15);

				do {
					System.out.print("Precio? ");
					precio = entrada.next(); // vale next porque no hay espacios en blanco
					try {
						prec = Float.parseFloat(precio);
					} catch (NumberFormatException nfe) { // si error de formato, ejecutas y a prec le das su valor max
						prec = Float.MAX_VALUE;
					}
				} while (prec == Float.MAX_VALUE);// si ves el num grande subrealista, vuelve a preguntar que hay error
				do {
					System.out.print("Tipo (A/B/C)? ");
					byte tipoByte = (byte) System.in.read();
					entrada.nextLine();
					tipo = Character.toUpperCase((char) tipoByte);
				} while (tipo != 'A' && tipo != 'B' && tipo != 'C');

				do {
					System.out.print("Unidades vendidas? ");
					unidVend = entrada.next();
					try {
						unVe = Integer.parseInt(unidVend);
					} catch (NumberFormatException nfe) {
						unVe = Integer.MAX_VALUE;
					}
				} while (unVe == Integer.MAX_VALUE);
				// AQUI PASAMOS DE LA RAM AL ARCHIVO
				esc.write(codigo);
				esc.newLine(); // para que sepa que cada vez que cambias de linea lees un nuevo campo
				esc.write(denominacion);
				esc.newLine();
				esc.write(precio);
				esc.newLine();
				esc.write(tipo);
				esc.newLine();
				esc.write(unidVend); // en vez de unVe, porque usamos el string
				esc.newLine();
				entrada.nextLine(); // cambias de linea

				do {
					System.out.print("Código (max 6 caracteres) (\"*\" para fin)...: ");
					codigo = entrada.nextLine();
				} while (codigo.length() > 6);
			}
			esc.close();
		} catch (IOException ioe) {
		}
	}

	static float calculoIva(float p, char t) {
		float iva = 0;
		switch (t) {
		case 'A':
			iva = (float) 0.21; // (float) para que asuma float en vez de double al ser 0.21
			break;
		case 'B':
			iva = (float) 0.10;
			break;
		default:
			iva = (float) 0.04;
		}
		return p * iva;
	}

	static String tabular(String cad) {
		String t = "\t\t";

		if (cad.length() < 8) {
			t = "\t\t\t";
		}
		return t;
	}

	static void crearFactura() {
		DecimalFormat numero = new DecimalFormat("#####.##");
		String codigo = null, denominacion = null;
		float precio = 0, impIva = 0, precioB = 0;
		char tipo = ' ';
		int uniVend = 0;// no se tienen que llamar como los anteriores

		try {
			BufferedReader lec = new BufferedReader(new FileReader(ruta + "articulos.txt"));
			System.out.println("\n\t\t\t\tFactura\n\t\t\t\t-------");
			System.out.println("Código\tDenominación\t\tPrecio Uni.\tUnid. Vend.\tTipo\tPrecio\t\tIVA\tPrecio+IVA");
			System.out.println(
					"-------------------------------------------------------------------------------------------");
			do {
				codigo = lec.readLine();
				if (codigo != null) {
					denominacion = lec.readLine();
					precio = Float.parseFloat(lec.readLine());
					tipo = lec.readLine().charAt(0);
					uniVend = Integer.parseInt(lec.readLine()); // convertimos a numero porque haremos operac aritmeti
					impIva = calculoIva(precio, tipo);
					precioB = precio * uniVend;

					System.out.print(codigo + "\t" + denominacion + tabular(denominacion));
					System.out.print(numero.format(precio) + "\t\t\t" + numero.format(uniVend) + "\t" + tipo + "\t");
					System.out.println(numero.format(precioB) + "\t\t" + numero.format(impIva) + "\t\t"
							+ numero.format(precioB + impIva));
				}
			} while (codigo != null);
			lec.close();
		} catch (IOException ioe) {
		}
	}

	static void fin() {
		System.out.print("\n\n\tFIN DEL PROGRAMA\n\t================\n");
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;

		do {
			opcion = menu(entrada);
			// opcion viene el metodo menu
			switch (opcion) {
			case 1:
				entradaAltas(entrada);
				break;
			case 2:
				crearFactura();
				break;
			case 3:
				fin();
			default:
				System.out.println("Fixeches algho moi raro eh!!");
			}
		} while (opcion != 3);
		entrada.close();
	}

}
