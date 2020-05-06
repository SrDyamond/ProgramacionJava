package cajeroBasic;
import java.util.Scanner;
public class cajeroBasic {
	public static void main (String [] args) {
		Scanner precio = new Scanner(System.in);
		Scanner entregado = new Scanner(System.in);
		int pp=0, e=0, pt = 0;
		do {
		System.out.print("Teclea precio del producto? ");
		pp = precio.nextInt();
		if (pp != 0)
			pt += pp;
		} while(pp != 0);
		System.out.println("\nValor de la compra: "+pt+"€ ");
		do {
			System.out.print("\nCuánto entrega? ");
			e = entregado.nextInt();
			if (pt > e)
				System.out.println("\nFaltan: "+(pt-e)+"€ ");
			else
				System.out.println("\nSu Vuelta es de: "+(e-pt)+"€ ");
		}while (pt>e);
		entregado.close();
		precio.close();
		}
	}


