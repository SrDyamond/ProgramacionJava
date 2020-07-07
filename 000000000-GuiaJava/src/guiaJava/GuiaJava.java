package guiaJava;

public class GuiaJava {
	public static void main(String[] args) {
		int i = 0, e = 0;
		int numero = 0;
		int tamaño = 10;

		// mientras la condicion sea igual se repite
		while (numero < 5) {
			System.out.println("Número = " + numero);
			numero = numero + 1;
		}
		System.out.println("\nNúmero de salida (while) = " + numero);

		// repetir hasta condicion
		do {
			System.out.println("Número = " + numero);
			numero = numero - 1;
		} while (numero > 0);
		System.out.println("\nNúmero de salida (do_while) = " + numero);

		//bucle for
		for (i = 0; i < tamaño; i++) {
			System.out.println("Introduce o valor do array na posicion"+(i+1));
		}

	}
}
