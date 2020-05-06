package ejercicio1Examen;
import java.util.Scanner;
public class ejercicio1Examen {
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		int vi=0, vf=0, r=0;
		do {
			do {
				System.out.print("Valor inicial?");
				vi = entrada.nextInt();
				System.out.print("\n");
				System.out.print("Valor final?");
				vf = entrada.nextInt();			
			} while (vi > vf);
			
			System.out.print("\n\n");
			System.out.print("Razón? ");
			r = entrada.nextInt();
			System.out.print("\n");
		
			do {
				System.out.print(vi+"  ");
				vi = vi * r;
			}while (vi < vf);
		
			do {
				System.out.println("\nRealizar otra sucesión? (1) = Sí; (0) = No.");
				r = entrada.nextInt();
			} while (r!=0 && r!=1);
		}while (r==1);
		entrada.close();
	}
}
		
// vi *= r es la forma abreviada de de representar vi = vi * r. 
			
			
		
	


