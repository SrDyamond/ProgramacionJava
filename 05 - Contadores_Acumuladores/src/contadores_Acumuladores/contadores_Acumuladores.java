/*

package contadores_Acumuladores;

public class contadores_Acumuladores {
	public static void main (String[] args) {
		int numero = 0;
		while(numero <5) {
			System.out.println("N�mero = "+numero);
			numero = numero + 1;
		}
		System.out.println("N�mero salida = "+numero);
		
	}

}

*/


/*
package contadores_Acumuladores;

public class contadores_Acumuladores {
	public static void main (String[] args) {
		int numero = 0;
		while(numero <5) {
			System.out.println("N�mero = "+numero);
			numero += 1; //Es igual a n�mero + 1 ---> numero = numero + 1 ---> numero += 1 acumulador
		}
		System.out.println("N�mero salida = "+numero);
		
	}

}

*/

/*
package contadores_Acumuladores;

public class contadores_Acumuladores {
	public static void main (String[] args) {
		int numero = 0;
		while(numero <5) {
			System.out.println("N�mero = "+numero);
			numero ++; //Es igual a n�mero + 1 ---> numero = numero + 1 ---> numero += 1 acumulador
		}
		System.out.println("N�mero salida = "+numero);
		
	}

}

*/

/*
package contadores_Acumuladores;

public class contadores_Acumuladores {
	public static void main (String[] args) {
		int numero = 0;
		while(numero <5) {
			System.out.println("N�mero = "+numero);
			++numero; //Es igual a n�mero + 1 ---> numero = numero + 1 ---> numero += 1 acumulador
		}
		System.out.println("N�mero salida = "+numero);
		
	}

}

*/

/*
package contadores_Acumuladores;

public class contadores_Acumuladores {
	public static void main (String[] args) {
		int numero = 0;
		while(numero <5) {
			System.out.println("N�mero = "+ ++numero); //De esta manera visualiza el 1.
		}
		System.out.println("N�mero salida = "+numero);
		
	}

}

*/

/*
package contadores_Acumuladores;

public class contadores_Acumuladores {
	public static void main (String[] args) {
		int numero = 0;
		while(numero <5) {
			System.out.println("N�mero = "+ numero++); //De esta manera visualiza el 0.
		}
		System.out.println("N�mero salida = "+numero);
		
	}

}

*/

/*
package contadores_Acumuladores;

public class contadores_Acumuladores {
	public static void main (String[] args) {
		int numero = 0;
		while(numero <5) {
			System.out.println("N�mero = "+ numero++); 
		}
		System.out.println("N�mero salida = "+numero);
		while(numero >0) {
			System.out.println("N�mero = "+ numero--); 
		}
		System.out.println("N�mero salida = "+numero);
		
	}

}

/*
package contadores_Acumuladores;

public class contadores_Acumuladores {
	public static void main (String[] args) {
		int numero = 0;
		while(numero <25) {
			System.out.println("N�mero = "+ numero++); 
		}
		System.out.println("N�mero salida = "+numero);
		while(numero >0) {
			System.out.println("N�mero = "+ numero); 
			numero -= 2;
		}
		System.out.println("N�mero salida = "+numero);
		
	}

}
*/

/*
package contadores_Acumuladores;
import java.util.Scanner;
public class contadores_Acumuladores {
	public static void main (String [] args) {
		Scanner e = new Scanner(System.in);
		int numero = 0, acumulador = 0, cantidad = 0; //Si no inicializo el acumulador, da error el programa
		
	do {
		System.out.println("Acumulado.......: "+acumulador);
		System.out.print("Cantidad? ");
		cantidad = e.nextInt();
		acumulador = acumulador + cantidad; //acumulador += cantidad
	}while (acumulador <=500);
		
	}
	
}

*/