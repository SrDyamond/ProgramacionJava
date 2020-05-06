package decimal2Binario;
import java.util.Scanner;
public class Decimal2Binario {
	
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
	
	// -------------------------------------------------------------------------
	
	//añade 0s a la izquierda para ser procesados de 4 en 4 a hexadecimal
	public static String add0Hasta4d(String str) {
		String out = strRev(str);
		int i = 0;
		for (i = 4 - (str.length() % 4); i > 0 ; i--)
			out += "0";
		return strRev(out);
	}
	
	//borra 0s a la izquierda en binario
	public static String l0trim(String str) {
		String out = "";
		boolean left0 = true;
		char c = ' ';
		int i = 0;
		for (i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (c != '0' && left0) left0 = false;
			if (!left0) out += c;
		}
		return out;
	}

	// -------------------------------------------------------------------------
	
	public static String dec2Bin(String _d) {
		int div = 2, aux = 0, d = Integer.parseInt(_d);
		String out = "";
		while (d / div > 1) {
			aux = d / div;
			out += Integer.toString(d % div);
			d = aux;
		}
		out += Integer.toString(d % div);
		out += Integer.toString(d / div);
		return strRev(out);
	}
	
	public static String bin2Dec(String b) {
		int out = 0, i = 0, e = 1;
		out += Character.getNumericValue(b.charAt(b.length() - 1));
		for (i = (b.length() - 2); i >= 0; i--) {
			out += Character.getNumericValue(b.charAt(i)) * myPow(2, e);
			e++;
		}
		return Integer.toString(out);
	}
	
	public static String bin2Hex(String b) {
		int i = 0;
		String fragmento = "", out = "";
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
		return out;
	}
	
	public static String hex2Bin(String h) {
		int i = 0;
		String out = "";
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
		return l0trim(out);
	}
	
	// -------------------------------------------------------------------------
	
	public static String readN(Scanner s) {
		String out = "";
			System.out.print("Escribe un número: ");
			out = s.nextLine();
		return out.toUpperCase();
	}
	
	public static int readB(Scanner s) {
		int out = 0;
		do {
			System.out.print("Escribe la base (2, 10, 16), (0 salir): ");
			out = s.nextInt();
			s.nextLine();
		} while (out != 0 && out != 2 && out != 10 && out != 16);
		System.out.println();
		return out;
	}
	
	public static String[] calculaRes(String[] res, String n, int b) {
		String bin = "";
		switch (b) {
			case 2:
				bin = n;
				res[0] = bin;
				res[1] = bin2Dec(bin);
				res[2] = bin2Hex(bin);
				break;
			case 10:
				bin = dec2Bin(n); 
				res[0] = bin;
				res[1] = n;
				res[2] = bin2Hex(bin);
				break;
			case 16:
				bin = hex2Bin(n);
				res[0] = bin;
				res[1] = bin2Dec(bin);
				res[2] = n;
				break;
		}
		return res;
	}
	
	public static void printRes(String[] res, String n, int b) {
		String tab = "\t\t";
		System.out.println("#Resultados:");
		System.out.println(" > Ori: " + n + "\t(" + b + ")");
		if (res[0].length() >= 7) tab = "\t";
		System.out.println(" " + res[0] + tab + "(2)");
		System.out.println(" " + res[1] + "\t\t(10)");
		System.out.println(" " + res[2] + "\t\t(16)");
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int b = 0;
		String n = "";
		String res[] = new String[3];
		
		do {
			n = readN(s);
			b = readB(s);
			
			if (b == 2) n = l0trim(n);
			
			if (b != 0) {
				res = calculaRes(res, n, b);
				printRes(res, n, b);
			}
		} while (b != 0);
		
		s.close();
	}

}
 