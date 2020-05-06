package sobrecargametodos;

public class SobrecargaMetodos {
	static void operacionAritmetica(int n) {
		System.out.print("Cuadrado=" + n * n);
	}

	static void operacionAritmetica(String n) {
		int n1 = Integer.parseInt(n);
		System.out.print("Cuadrado=" + n1 * n1 * n1);
	}

	public static void main(String[] args) {
		int n1 = 5, n2 = 6, n3 = 9;
		char n = ' ';
		operacionAritmetica(n1);
		operacionAritmetica(n);

	}
}
