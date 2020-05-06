package contar_vocales_switch;
import java.util.Scanner;
public class Contar_Vocales_Switch {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String frase =null;
		int posicion = 0,counta = 0,counte = 0,counti = 0,counto = 0,countu = 0,cc=0;
		char letra=' ';
		
		System.out.print("Inserta a frase");
		frase=sc.nextLine();
		for (posicion=0;posicion<frase.length();posicion++) {
			letra=Character.toLowerCase(frase.charAt(posicion));
			switch (letra) {
			case 'a' :
				counta++;
				break;
			case 'e' :
				counte++;
				break;
			case 'i' :
				counti++;
				break;
			case 'o' :
				counto++;
				break;
			case 'u' :
				countu++;
				break;
				default:
					if (letra!= ' ')
					cc++;
				
			}
			sc.close();
		}
		System.out.println("La vocal a se repite"+counta);
		System.out.println("La vocal e se repite"+counte);
		System.out.println("La vocal i se repite"+counti);
		System.out.println("La vocal o se repite"+counto);
		System.out.println("La vocal u se repite"+countu);
		System.out.println("Las cantidades de vocales son "+cc);
	}

}
