package dni;

import java.util.Scanner;

public class Dni {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		String letras= "TRWAGMYFPDXBNJZSQVHLCKE";
		int tam=0,letra=0;
	
		System.out.println("Escribe o numero do DNI,sen a letra");
		tam=sc.nextInt();
		letra=tam % 23;
		System.out.println("Su NIF es "+tam+"-"+letras.charAt(letra));
		//System.out.println("Su NIF es "+tam+"-"v[letra]);
		sc.close();
	}

}
