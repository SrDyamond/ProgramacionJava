package palindromo;
import java.util.Scanner;
public class Palindromo {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase ="";
		int i = 0;
		boolean esPalindromo = f;
		char letra=' ';
		String fraselimpa=" ";
		System.out.print("Frase: ");
		frase = sc.nextLine();
		frase = frase.toLowerCase();
		int inc = 0;
		int des = fraselimpa.length()-1;
		
		for (i=0; i < frase.length();i++) {
			for(i=0;i < frase.length();i++) {
				letra = frase.charAt(i);
				if (letra != ' ')
					fraselimpa += letra;
				
				while ((inc<des) && (!esPalindromo)){
					 
					if (fraselimpa.charAt(inc)==fraselimpa.charAt(des)){				
						inc++;
						des--;
					} else 
					esPalindromo= true;
					}
				}
					
		}/*
			for (i = 0; i < fraselimpa.length()/2; i++)
				if (fraselimpa.charAt(i)!=fraselimpa.charAt(fraselimpa.length()-1)-i) {
					esPalindromo=false;
				}
					
		}
		*/
		if (esPalindromo) System.out.println("Es palindromo.");
	
		else 	
			System.out.println("NO es palindromo.");

		sc.close();
	}

}
