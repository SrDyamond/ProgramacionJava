package sumaDosNumeros;
import java.util.Scanner;
public class sumaDosNumeros {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0; //Puedo poner los Int juntos. int numero 1 = 0, n2 = 0...;
		int s = 0;
		System.out.print("Teclea un número: ");
		numero1 = entrada.nextInt();
		System.out.print("Teclea otro número: ");
		numero2 = entrada.nextInt();
		s = numero1 + numero2;
		System.out.println("La suma de "+numero1+" y "+numero2+" es: "+s);
		System.out.printf("Suma de %d y %d es % d",numero1,numero2,s);
		entrada.close();
		
	}

}