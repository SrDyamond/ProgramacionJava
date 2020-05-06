package contar_vocales_array;

import java.util.Scanner;

public class Contar_Vocales_Array {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String frase =null;
		int posicion = 0,posicionvoc=0;
		int countV[]= {0,0,0,0,0};
		char vocales[] = {'a','e','i','o','u'};
		char letra=' ';
		
		System.out.print("Inserta a frase");
		frase=sc.nextLine();
		
		for (posicion=0;posicion<frase.length();posicion++) {
			letra=Character.toLowerCase(frase.charAt(posicion));
			for (posicionvoc=0;posicionvoc<5;posicionvoc++)
			if (letra==vocales[posicionvoc])
				countV[posicionvoc]++;
		}
			
			
		for (posicionvoc=0;posicionvoc<5;posicionvoc++)
		System.out.println("Total de "+vocales[posicionvoc]+ " = " +countV[posicionvoc]);
	
		
		sc.close();
	}

	
}
