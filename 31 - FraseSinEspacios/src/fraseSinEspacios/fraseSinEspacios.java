/*
//Introducir una frase y representar la misma pero sin espacios en blanco.
package fraseSinEspacios;
import java.util.Scanner;
public class fraseSinEspacios {
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		String frase = null;
		String frase2 = ""; //No poner null.
		int posicion = 0;
		System.out.print("Escriba frase? ");
		frase = entrada.nextLine();
		for(posicion=0;posicion < frase2.length();posicion++)
			if(frase.charAt(posicion)!=' ')
				frase2 += frase.charAt(posicion);
		
		System.out.println("\n\n"+frase2);
		entrada.close();
	}
}
//Si un método me devuelve un caracter, lo tengo que comparar como si fuese caracter, entre comillas.


//System.out.print("Today is Tuesday and it's raining");

*/

package fraseSinEspacios;
import java.util.Scanner;
public class fraseSinEspacios {
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		String frase = null;
		String frase2 = ""; //No poner null.
		char caracter = ' ';
		int posicion = 0;
		System.out.print("Escriba frase? ");
		frase = entrada.nextLine();
		for(posicion=0;posicion < frase.length();posicion++) {
			caracter = frase.charAt(posicion);
			if(caracter!=' ')
				frase2 += caracter;	
		}
		System.out.println("\n\n"+frase2);
		entrada.close();
	}
}

//Meter una frase y que nos diga cuantas vocales hay.