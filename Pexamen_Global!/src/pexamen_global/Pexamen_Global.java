package pexamen_global;
//frasesin espacios en blanco
import java.util.Scanner;
public class Pexamen_Global {
	public static void main (String []args) {
	Scanner sc =new Scanner(System.in);
	String frase="";
	String fraselimpa="";
	int i =0;
	char letra=' ';

	System.out.print("Teclea unha frase");
	frase=sc.nextLine();
	frase=frase.toLowerCase();
	
	for (i=0;i<frase.length();i++) {
		letra=frase.charAt(i);
		if (letra != ' ') {
		fraselimpa+=letra;
		}
	}
	System.out.println(fraselimpa);
	
	
	
	for(i=fraselimpa.length()-1;i>=0;i--)
		System.out.print(fraselimpa.charAt(i));
		
	}


}