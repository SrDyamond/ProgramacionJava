package pexamen_contar_vocales_frase;
import java.util.Scanner;
public class Pexamen_Contar_Vocales_Frase {
	public static void main (String []args) {
		Scanner sc=new Scanner(System.in);
		String frase=" ";
		int i=0,counta=0,counte=0,counti=0,counto=0,countu=0,cc=0;
		char letra=' ';
		
		System.out.print("Inserta a frase");
		frase=sc.nextLine();
		
		
		for (i=0;i<frase.length();i++) {
			letra=Character.toLowerCase(frase.charAt(i));
			switch (letra) {
			case 'a':
				counta++;
				break;
			case 'e':
				counte++;
				break;
			case 'i':
				counti++;
				break;
			case 'o':
				counto++;
				break;
			case 'u':
				countu++;
				break;
			default:
				if (letra!= ' ')
				cc++;
			
		}
			sc.close();
		}
		
		System.out.println("El numero de A큦 es de :"+counta);
		System.out.println("El numero de E큦 es de :"+counte);
		System.out.println("El numero de I큦 es de :"+counti);
		System.out.println("El numero de O큦 es de :"+counto);
		System.out.println("El numero de U큦 es de :"+countu);
		System.out.println("El numero de Consonantes :"+cc);
		
	}

}
