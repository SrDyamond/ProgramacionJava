//Se solicitan dos números. Si el primero es mayor que el segundo, se suman. Si el Segundo es mayor que
//el primero, se restan.
package sumaRestaNumeros;
import java.util.Scanner;
public class sumaRestaNumeros {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero1, numero2, s, r;
		System.out.print("Teclea un número: ");
		numero1 = entrada.nextInt();
		System.out.print("Teclea otro número: ");
		numero2 = entrada.nextInt();
		if (numero1 > numero2) {
			s = numero1 + numero2;
			System.out.println("El resultado es: "+ s);
		}else {
			r = (numero1 - numero2);
			System.out.println("El resultado es: "+ r);
		entrada.close();
		}
		System.out.println("\n\nFin del programa");	
	}
}
