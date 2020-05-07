package sanchezRodriguezDyango_Examen2;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SanchezRodriguezDyango_Examen2 {
///////////////////////MENU\\\\\\\\\\\\\\\\\\\
	static int menu(Scanner e) {
		int op = 0;
		System.out.println("MENU");
		System.out.println("1.Altas");
		System.out.println("2.Consultas");
		System.out.println("3.Fin");
		do {
			System.out.println("Prema a opcion");
			op = e.nextInt();
		} while (op < 1 || op > 3);
		return op;
	}

///////////////////////////ALTAS\\\\\\\\\\\\\\\\\\\\\\\
	public static void altas(Scanner e, Coche c[]) {
		int i = 0;
		String matricula = "", marca = "", modelo = "", gama = "";
		char gamaC=' ';
		double precio = 0;
		e.nextLine();
//		System.out.println("Alta de Coches");
//		c[0]=new Coche("1234567","Bmw","M3","A",45.000);
//		c[1]=new Coche("3567899","Renault","5","B",11.000);
//		c[2]=new Coche("5623524","Peugeot","206","B",17.000);
//		c[3]=new Coche("8634723","Peugeot","208E","M",21.000);
		for (i = 0; i < c.length; i++) {
			// e.nextLine();
			do {
				System.out.println("Inserte a matricula");
				matricula = e.nextLine();
			} while (matricula.length() != 7);
			do {
				System.out.println("Inserte o Marca do coche");
				marca = e.nextLine();
			} while (marca.length() > 10);
			do {
				System.out.println("Inserte o modelo");
				modelo = e.nextLine();
			} while (modelo.length() > 15);
			do {
				System.out.print("Gama (a = Alta | m = Media | b = Baja)? ");
				try {
					gamaC = Character.toLowerCase((char) System.in.read());
					e.nextLine();
				} catch (IOException ioe) {
				}
			} while (!(gamaC == 'a' || gamaC == 'm' || gamaC == 'b'));

			switch (gamaC) {
				case 'a':
					gama = "Alta";
					break;
				case 'm':
					gama = "Media";
					break;
				case 'b':
					gama = "Baja";
					break;
			}
			System.out.print("Precio? ");
			do {
				try {
					precio = e.nextDouble();
				} catch (InputMismatchException ime) {
					System.out.println("Error,repita el precio");
					precio = Double.MIN_VALUE;
				}
				e.nextLine();
			} while (precio == Double.MIN_VALUE);
			
			c[i] = new Coche(matricula, marca, modelo, gama, precio);// INSTANCIAMOS O FINAL
		}
	}

///////////////////////////CONSULTA\\\\\\\\\\\\\\\\\\\\\
	public static void visualizar(Coche l[]) {
		int i = 0;
		for (i = 0; i < l.length; i++)
			System.out.println(l[i].pasarString());// visualizo co metodo toString da clase libro
	}

///////////////////////////FIN\\\\\\\\\\\\\\\\\\\\\\\\\\
	static void fin() {
		System.out.println("Fin del programa");
	}

///////////////////////////MAIN\\\\\\\\\\\\\\\\\\\\\\\\\\
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int op = 0;
		Coche c[] = new Coche[4];
		do {
			op = menu(entrada);
			switch (op) {
			case 1:
				altas(entrada, c);
				break;
			case 2:
				visualizar(c);
				break;
			default:
				fin();
			}
		} while (op != 3);
	}

}
