package dni_metodo;

import java.util.Scanner;

public class Dni_Metodo {
	static char letranumero(int n) {
		String letras= "TRWAGMYFPDXBNJZSQVHLCKE";
		char letra =letras.charAt(n%23);
		return letra;
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int numero=0;
		char letra=' ';
		System.out.println("Escribe o numero do DNI,sen a letra");
		numero=sc.nextInt();
		letra=letranumero(numero);
		System.out.println("Su NIF es "+numero+letra);
		sc.close();
	}

}
