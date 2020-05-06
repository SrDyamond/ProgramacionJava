package dni_comprobar;

import java.io.IOException;
import java.util.Scanner;

public class Dni_Comprobar {
	static char letraNif(int n) {
		String letras= "TRWAGMYFPDXBNJZSQVHLCKE";
		return letras.charAt(n%23);
	}
	static boolean comprobarNif(int n,char l) {
		boolean correcto=false;
		if(l==letraNif(n))
			correcto=true;
		return correcto;
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		String nif="";
		System.out.println("Escribe o numero do DNI coa letra");		
		nif=sc.next();
		if (comprobarNif(Integer.parseInt(nif.substring(0,8)),Character.toUpperCase(nif.charAt(8))))
			System.out.println("Es verdadero");
		else
			System.out.println("Es falso");
		
		sc.close();
	}
}
