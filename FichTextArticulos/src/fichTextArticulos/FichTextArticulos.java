package fichTextArticulos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FichTextArticulos {
	static int menu(Scanner e) {
		int op = 0;
		System.out.println("\n\tMENU\n\t====\n");
		System.out.println("1.- Altas.");
		System.out.println("2.- Listado.");
		System.out.println("3.- Listado pedidos.");
		System.out.println("4.- Fin.\n");
		do {
			System.out.print("\tTeclee opción (1-4)? ");
			op = e.nextInt();
		} while (op < 1 || op > 4);
		e.nextLine();
		return op;
	}

	static void altas(Scanner e) {
		String denominacion = null, stockAct = null, stockMin = null, stockMax = null, precio = null;
		System.out.println("\n\tALTAS\n\t=====");
		try {
			BufferedWriter fic = new BufferedWriter(
					new FileWriter("C:\\Users\\dyang\\OneDrive\\Escritorio\\articulos.txt", true));
			do {
				System.out.print("Denominación (máximo 15 caracteres) (Fin = finalizar)? ");
				denominacion = e.nextLine();
			} while (denominacion.length() > 15);
			while (!denominacion.equalsIgnoreCase("fin")) {
				System.out.print("Stock Actual? ");
				stockAct = e.next();
				do {
					System.out.print("Stock Mínimo? ");
					stockMin = e.next();
					System.out.print("Stock Máximo? ");
					stockMax = e.next();
				} while (Integer.parseInt(stockMin) > Integer.parseInt(stockMax));
				System.out.print("Precio? ");
				precio = e.next();
				e.nextLine();
				fic.write(denominacion);
				fic.newLine();
				fic.write(stockAct);
				fic.newLine();
				fic.write(stockMin);
				fic.newLine();
				fic.write(stockMax);
				fic.newLine();
				fic.write(precio);
				fic.newLine();
				do {
					System.out.print("Denominación (máximo 15 caracteres) (Fin = finalizar)? ");
					denominacion = e.nextLine();
				} while (denominacion.length() > 15);
			}
			fic.close();
		} catch (IOException ioe) {
		}
	}

	static String tabulacion(String cadena) {
		String t = "\t\t\t\t";
		if (cadena.length() > 8)
			t = "\t\t\t";
		return t;
	}

	static int cabecera(int cp) {
		System.out.println("\n\tLISTADO  Pag.: " + cp + "\n\t=======\n");
		System.out.println(
				"Denominación\t\tStock Actual\tStock Mínimo\tStock Máximo\tPrecio\n-------------------------------------------------------------------------------");
		return 0;
	}

	static void pie(int cl, double tp, double ss, Scanner e) throws IOException {
		System.out.println("\n\nTotal página......: " + tp);
		System.out.println("Suma y sigue......: " + ss);
		System.out.print("\n Pulse una tecla para continuar....");
		System.in.read();
	}

	static void listado(Scanner e) {
		String denominacion = null, stockAct = null, stockMin = null, stockMax = null, precio = null;
		int conLin = 6, conPag = 0;
		double totPag = 0, sumSig = 0;
		try {
			BufferedReader leer = new BufferedReader(
					new FileReader("C:\\\\Users\\\\dyang\\\\OneDrive\\\\Escritorio\\\\articulos.txt"));
			denominacion = leer.readLine();
			while (denominacion != null) {
				stockAct = leer.readLine();
				stockMin = leer.readLine();
				stockMax = leer.readLine();
				precio = leer.readLine();
				if (conLin >= 5) {
					if (conLin == 5) {
						sumSig += totPag;
						pie(conLin, totPag, sumSig, e);
						totPag = 0;
					}
					conPag++;
					conLin = cabecera(conPag);
				}
				System.out.println(denominacion + tabulacion(denominacion) + stockAct + "\t\t" + stockMin + "\t\t"
						+ stockMax + "\t" + precio);
				totPag += Integer.parseInt(precio) * Double.parseDouble(stockAct);
				conLin++;
				denominacion = leer.readLine();
			}
			sumSig += totPag;
			pie(conLin, totPag, sumSig, e);
			leer.close();
		} catch (IOException ioe) {
		}
	}

	static void listadoPedidos() {
		String denominacion = null, stockAct = null, stockMin = null, stockMax = null, precio = null;
		int sAct = 0, sMin = 0, sMax = 0;
		double p = 0;
		System.out.println("\n\tLISTADO PEDIDOS\n\t===============\n");
		System.out.println(
				"Denominación\t\tStock Actual\tUnid. Pedir\tPrecio Pedido\n----------------------------------------------------------------------");
		try {
			BufferedReader leer = new BufferedReader(
					new FileReader("C:\\\\Users\\\\dyang\\\\OneDrive\\\\Escritorio\\\\articulos.txt"));
			denominacion = leer.readLine();
			while (denominacion != null) {
				stockAct = leer.readLine();
				stockMin = leer.readLine();
				stockMax = leer.readLine();
				precio = leer.readLine();
				p = Double.parseDouble(precio);
				sAct = Integer.parseInt(stockAct);
				sMin = Integer.parseInt(stockMin);
				sMax = Integer.parseInt(stockMax);
				if (sAct < sMin) {
					System.out.println(denominacion + tabulacion(denominacion) + stockAct + "\t\t" + (sMax - sAct)
							+ "\t\t" + p * (sMax - sAct));
				}
				denominacion = leer.readLine();
			}
			leer.close();
		} catch (IOException ioe) {
		}
	}

	static void fin() {
		System.out.println("\n\n\n\tFINAL DEL PROGRAMA\n\t==================\n\n");
	}

	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;
		do {
			opcion = menu(entrada);
			switch (opcion) {
			case 1:
				altas(entrada);
				break;
			case 2:
				listado(entrada);
				break;
			case 3:
				listadoPedidos();
				break;
			default:
				fin();
			}
		} while (opcion != 4);
		entrada.close();
	}
}
