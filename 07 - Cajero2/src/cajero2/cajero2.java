package cajero2;
import java.util.Scanner;
public class cajero2 {
	public static void main (String [] args) {
		Scanner precio = new Scanner(System.in);
		Scanner entregado = new Scanner(System.in);
		Scanner cliente = new Scanner(System.in);
		int pp=0, e=0, pt = 0, otro=0;
		do {
			pt=0;
			System.out.println();
			do {
				System.out.print("Teclea precio del producto? ");
				pp = precio.nextInt();
				if (pp != 0)
					pt += pp;
			}while(pp != 0);
			System.out.println("\nValor de la compra: "+pt+"€ ");
			do {
				System.out.print("\nCuánto entrega? ");
				e = entregado.nextInt();
				if (pt > e)
					System.out.println("\nFaltan: "+(pt-e)+"€ ");
				else
					System.out.println("\nSu Vuelta es de: "+(e-pt)+"€ ");
			}while (pt>e);
			do {
				System.out.print("\tOtro cliente (1 = Sí/0 = No? )");
				otro = cliente.nextInt();
			}while(otro != 0 && otro != 1);
		
		}while(otro == 1);
			
		entregado.close();
		precio.close();
		cliente.close();
		System.out.println("\n\n\tFIN DEL PROGRAMA\n");
	}
}
			
	
			

	