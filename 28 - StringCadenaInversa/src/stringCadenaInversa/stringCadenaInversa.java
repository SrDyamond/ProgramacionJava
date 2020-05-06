package stringCadenaInversa;
import java.util.Scanner;
public class stringCadenaInversa {
	public static void main (String[] args) {
		String cadena=null;
		Scanner entrada = new Scanner (System.in);
		int i=0;
		System.out.println("Escribe una cadena ?");
		cadena = entrada.nextLine();
		System.out.println("\n");
		for (i=cadena.length()-1;i>=0;i--)
			System.out.print(cadena.charAt(i));
/*
//char letras[] = new char [cadena.length()];
*/
		entrada.close();
	}
}

