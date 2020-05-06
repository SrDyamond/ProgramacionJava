package pexamen_cadena_inversa;
import java.util.Scanner;
public class Pexamen_Cadena_Inversa {
	static public void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		String frase=" ";
		int pos=0;
		
		System.out.print("Inserta a frase");
		frase=sc.nextLine();
		
		for(pos=frase.length()-1;pos>=0;pos--)
			System.out.print(frase.charAt(pos));
		
		sc.close();
	}

}
