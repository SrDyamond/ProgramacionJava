package segundo;
import java.util.Scanner;
public class segundo {
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		System.out.print("Teclea un n�mero: ");
		numero = entrada.nextInt();
		System.out.println("El n�mero tecleado es... "+numero);
		entrada.close();
	}

}