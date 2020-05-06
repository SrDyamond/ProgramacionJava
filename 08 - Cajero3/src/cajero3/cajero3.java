package cajero3;
import java.util.Scanner;
public class cajero3 {
	public static void main (String [] args) {
		Scanner precio = new Scanner(System.in);
		Scanner entregado = new Scanner(System.in);
		Scanner cliente = new Scanner(System.in);
		int pp=0, e=0, pt = 0, otro=0,cc=0,tc=0;
		do {
			pt=0;
			System.out.println("\nCliente número: "+(cc+1)+"\n");
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
			cc++;
			tc += pt;
			do {
				System.out.print("\tOtro cliente (1 = Sí/0 = No?)");
				otro = cliente.nextInt();
			}while(otro != 0 && otro != 1);
		
		}while(otro == 1);
			
		entregado.close();
		precio.close();
		cliente.close();
		System.out.println("\nNúmerode clientes -------->\n"+cc);
		System.out.println("\nTotal de caja ------------>\n"+tc);
		System.out.println("\nCompra media por cliente ->\n"+tc/cc);
		System.out.println("\n\n\t\tFIN DEL PROGRAMA\n");
	}
}