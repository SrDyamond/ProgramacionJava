//Resta de números. Si el primero menor que el segundo, se intercambian.
package restaNumerosIntercambio;
import java.util.Scanner;
public class restaNumerosIntercambio {
	public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	int numero1, numero2, r;
	System.out.print("teclea un número: ");
	numero1 = entrada.nextInt();
	System.out.print("Teclea otro número: ");
	numero2 = entrada.nextInt();
	if (numero1 > numero2) {
		r = numero1 - numero2;
	}else {
		r = numero2 - numero1;
	}
	System.out.println("\nEl resultado es ---> "+r);
	entrada.close();
	}
}
