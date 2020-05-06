package metodo_Palabra_Larga;

import java.util.Scanner;

public class Metodo_Palabra_Larga {
		
		public static void printMenu() {
			System.out.println("");
			System.out.println("--- MENU ---");
			System.out.println("");
			System.out.println("1 - Mayor número de palabras");
			System.out.println("2 - Palabra mas larga");
			System.out.println("");
			System.out.println("0 - Fin");
			System.out.println("");
		}
		
		public static int readOpt(Scanner s) {
			int out = 0;
			do {
				System.out.print("> ");
				out = s.nextInt();
				s.nextLine();
			} while (out > 2 || out < 0);
			return out;
		}
		
		public static int getNumPalabras(String frase) {
			int out = 0, i = 0;
			//char c = ' ';
			for (i = 0; i < frase.length(); i++) {
				if (frase.charAt(i) == ' ') {
					while (frase.charAt(++i) == ' ');
					out++;
				}
			}
			return out;
		}

		public static String palabraMasLarga(String frase) {
			String out = "", temp = "";
			int i = 0;
			char c = ' ';
			for (i = 0; i < frase.length(); i++) {
				c = frase.charAt(i);
				if (c != ' ') {
					temp += c;
				}
				if (c == ' ' || i == (frase.length() - 1)) {
					if (temp.length() > out.length()) out = temp;
					temp = "";
				}
			}
			return out;
		}
		
		public static void palabraLarga(String frase1, String frase2) {
			String masLarga = "";
			if (palabraMasLarga(frase1).length() > palabraMasLarga(frase2).length()) 
				masLarga = palabraMasLarga(frase1);
			else
				masLarga = palabraMasLarga(frase2);
			System.out.println("La palabra mas lara es: " + masLarga + " (" + masLarga.length() + ")");
		}
		
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			String frase1 = "", frase2 = "";
			int opt = 0;
			
			System.out.println(getNumPalabras("hola s majo"));
			System.out.println(getNumPalabras("hola s  majo"));
			System.out.println(getNumPalabras(" hola s majo"));
			System.out.println(getNumPalabras("hola s majo "));
			System.out.println(getNumPalabras(" hola  s   majo  "));
			
			System.out.print("Teclea la frase1: ");
			frase1 = s.nextLine();
			System.out.print("Teclea la frase2: ");
			frase2 = s.nextLine();
			
			do {
				printMenu();
				opt = readOpt(s);
				if (opt != 0) {
					switch (opt) {
						case 1:
							break;
						case 2:
							palabraLarga(frase1, frase2);
							break;
					}
				}
			} while(opt != 0);
			
		}
	}


