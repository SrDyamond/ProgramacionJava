package contarvocalesfrase;
import java.util.Scanner;
public class ContarVocalesFrase {
	public static void main (String [] args) {
		Scanner entrada = new Scanner(System.in);
		String frase = null;
		int posicion = 0;
		char letra = ' ';
		int conta=0,conte=0,conti=0,conto=0,contu=0;
		System.out.print("Frase? ");
		frase = entrada.nextLine();
		for(posicion=0;posicion<frase.length();posicion++) {
			letra = Character.toLowerCase(frase.charAt(posicion));
			if (letra == 'a')
				conta++;
			else
				if (letra == 'e')
					conte++;
				else
					if (letra == 'i')
						conti++;
					else
						if (letra == 'o')
							conto++;
						else
							if (letra == 'u')
								contu++;
			
		}
				System.out.println(" Total de \"a\": "+conta);
				System.out.println(" Total de \"e\": "+conte);
				System.out.println(" Total de \"i\": "+conti);
				System.out.println(" Total de \"o\": "+conto);
				System.out.println(" Total de \"u\": "+contu);
		entrada.close();
	}

}
