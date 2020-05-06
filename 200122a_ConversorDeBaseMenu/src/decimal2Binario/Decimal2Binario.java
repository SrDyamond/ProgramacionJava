package decimal2Binario;
import java.util.Scanner;
public class Decimal2Binario {
	
	// --- UTILIDADES GENÉRICAS ------------------------------------------------
	
	//ya no se usa
	public static String strRev(String str) {
		String out = "";
		int i = 0;
		for (i = (str.length() - 1); i >= 0; i--)
			out += str.charAt(i); 
		return out;
	}
	
	public static int myPow(int a, int b) {
		int out = a, i = 0;
		for (i = 1; i < b; i++) out *= a;
		return out;
	}
	
	// --- UTILIDADES DE FORMATO -----------------------------------------------
	
	//agrega 0s a la izquierda para ser procesados de 4 en 4 a hexadecimal
	public static String add0Hasta4d(String str) {
		String out = str;
		if (Integer.parseInt(str) != 0) {
			int i = 0;
			for (i = 4 - (str.length() % 4); i > 0 && i < 4; i--)
				out = '0' + out;
		} else out = "0000";
		return out;
	}
	
	//agrega 0s a la izquierda para ser procesados de 3 en 3 a octal
	public static String add0Hasta3d(String str) {
		String out = str;
		if (Integer.parseInt(str) != 0) {
			int i = 0;
			for (i = 3 - (str.length() % 3); i > 0 && i < 3; i--)
				out = '0' + out;
		} else out = "000";
		return out;
	}
	
	//borra 0s a la izquierda en binario
	public static String l0trim(String str) {
		String out = "";
		if (!str.equals("0")) {
			boolean left0 = true;
			char c = ' ';
			int i = 0;
			for (i = 0; i < str.length(); i++) {
				c = str.charAt(i);
				if (c != '0' && left0) left0 = false;
				if (!left0) out += c;
			}
		} else out = str;
		return out;
	}

	// --- CONVERSIONES --------------------------------------------------------
	
	public static String oct2Bin(String o) {
		String out = "";
		int i = 0;
		for (i = 0; i < o.length(); i++) {
			out += add0Hasta3d(dec2Bin(Character.toString(o.charAt(i))));
		}
		return l0trim(out);
	}
	
	public static String bin2Oct(String b) {
		String out = "";
		String fragmento = "";
		int i = 0;
		b = add0Hasta3d(b);
		for (i = 0; i < b.length(); i+=3) {
			fragmento = "" + b.charAt(i) + b.charAt(i+1) + b.charAt(i+2);
			out += bin2Dec(fragmento);
		}
		return l0trim(out); //rev porque agrega 0s a la izquierda (ex: 0x15F)
	}
	
	public static String dec2Bin(String _d) {
		String out = "";
		if (!_d.equals("0")) {
			int div = 2, aux = 0, d = Integer.parseInt(_d);
			while (d / div > 1) {
				aux = d / div;
				out = Integer.toString(d % div) + out;
				d = aux;
			}
	
			out = Integer.toString(d % div) + out;
			out = Integer.toString(d / div) + out;
		} else out = _d;
		return l0trim(out);
	}
	
	public static String bin2Dec(String b) {
		int out = 0;
		if (!b.equals("0")) {
			int i = 0, e = 1;
			out += Character.getNumericValue(b.charAt(b.length() - 1));
			for (i = (b.length() - 2); i >= 0; i--) {
				out += Character.getNumericValue(b.charAt(i)) * myPow(2, e);
				e++;
			}
		} else out = 0;
		return Integer.toString(out);
	}

	public static String hex2Bin(String h) {
		String out = "";
		if (!h.equals("0")) {
			int i = 0;
			char c = ' ';
			String dec2BinResult = "";
			for (i = 0; i < h.length(); i++) {
				c = h.charAt(i);
				switch (c) {
					case 'A':
						out += "1010";
						break;
					case 'B':
						out += "1011";
						break;
					case 'C':
						out += "1100";
						break;
					case 'D':
						out += "1101";
						break;
					case 'E':
						out += "1110";
						break;
					case 'F':
						out += "1111";
						break;
					default:
						dec2BinResult = dec2Bin(Character.toString(c));
						if (!dec2BinResult.equals("0")) 
							out += add0Hasta4d(dec2BinResult);
						break;
				}
			}
		} else out = h;
		return l0trim(out);
	}
	
	public static String bin2Hex(String b) {
		String out = "";
		if (!b.equals("0")) {
			String fragmento = "";
			int i = 0;
			b = add0Hasta4d(b);
			String bin2DecResult = "";
			for (i = 0; i < b.length(); i+=4) {
				fragmento = "" + b.charAt(i) + b.charAt(i+1) + b.charAt(i+2) + b.charAt(i+3);
				switch (fragmento) {
					case "1010":
						out += 'A';
						break;
					case "1011":
						out += 'B';
						break;
					case "1100":
						out += 'C';
						break;
					case "1101":
						out += 'D';
						break;
					case "1110":
						out += 'E';
						break;
					case "1111":
						out += 'F';
						break;
					default:
						bin2DecResult = bin2Dec(fragmento);
						if (!bin2DecResult.equals("0")) out += bin2DecResult;
						break;
				}
			}
		} else out = b;
		return out;
	}
	
	// --- INTERFAZ DE USUARIO -------------------------------------------------
	
	public static void printMenu() {
		System.out.println();
		System.out.println("#MENU");
		System.out.println(" 1 - Decimal --> Binario");
		System.out.println(" 2 - Binario --> Decimal");
		System.out.println(" 3 - Decimal --> Octal  ");
		System.out.println(" 4 - Octal   --> Decimal");
		System.out.println(" 5 - Decimal --> Hexadec");
		System.out.println(" 6 - Hexadec --> Decimal");
		System.out.println();
		System.out.println(" 0 - Salir");
		System.out.println();
	}
	
	public static int readOpt(Scanner s) {
		int out = 0;
			System.out.print("Escribe una opción: ");
			out = s.nextInt();
			s.nextLine();
		return out;
	}
	
	public static String readN(Scanner s) {
		String out = "";
		System.out.print("Escribe un número: ");
		out = s.nextLine();
		return out.toUpperCase();
	}
	
	public static void dec2BinI(Scanner s) {
		String n = "0";
		System.out.println();
		n = readN(s);
		System.out.println("> " + n + " (10) --> " + dec2Bin(n) + " (2)");
	}
	
	public static void bin2DecI(Scanner s) {
		String n = "0";
		System.out.println();
		n = readN(s);
		System.out.println("> " + n + " (2) --> " + bin2Dec(n) + " (10)");
	}
	
	public static void dec2OctI(Scanner s) {
		String n = "0";
		System.out.println();
		n = readN(s);
		System.out.println("> " + n + " (10) --> " + bin2Oct(dec2Bin(n)) + " (8)");
	}
	
	public static void oct2DecI(Scanner s) {
		String n = "0";
		System.out.println();
		n = readN(s);
		System.out.println("> " + n + " (8) --> " + bin2Dec(oct2Bin(n)) + " (10)");
	}
	
	public static void dec2HexI(Scanner s) {
		String n = "0";
		System.out.println();
		n = readN(s);
		System.out.println("> " + n + " (10) --> " + bin2Hex(dec2Bin(n)) + " (16)");
	}
	
	public static void hex2DecI(Scanner s) {
		String n = "0";
		System.out.println();
		n = readN(s);
		System.out.println("> " + n + " (16) --> " + bin2Dec(hex2Bin(n)) + " (10)");
	}

	// --- MAIN ----------------------------------------------------------------

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int opt = 0;

		do {
			printMenu();
			opt = readOpt(s);
			
			if (opt != 0) {
				switch (opt) {
					case 1:
						dec2BinI(s);
						break;
					case 2:
						bin2DecI(s);
						break;
					case 3:
						dec2OctI(s);
						break;
					case 4:
						oct2DecI(s);
						break;
					case 5:
						dec2HexI(s);
						break;
					case 6:
						hex2DecI(s);
						break;
				}
				System.out.println("\nPulsa INTRO...");
				s.nextLine();
			}
		} while (opt != 0);
		
		s.close();
	}

}
 