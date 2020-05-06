/* 
//Introducir tres números y que estos salga siempre ordenados de menor a mayor.
package ordenarTresNumeros;
import java.util.Scanner;
public class ordenarTresNumeros {
	public static void main (String[]args) {
	Scanner entrada = new Scanner (System.in);
	int n1, n2, n3;
	System.out.print("Primer número? ");
	n1 = entrada.nextInt();
	System.out.print("Segundo número? ");
	n2 = entrada.nextInt();
	System.out.print("Tercer número? ");
	n3 = entrada.nextInt();
	if (n1 < n2) 
		if (n2 < n3) 
			System.out.println(n1+", "+n2+", "+n3);
		else 
			if (n1 < n3) 
				System.out.println(n1+", "+n3+", "+n2);
			else 
				System.out.println(n3+", "+n1+", "+n2);
	else 
		if (n2 < n3)
			if (n1 < n3)
				System.out.println(n2+", "+n1+", "+n3);
			else
				System.out.println(n2+", "+n3+", "+n1);
		else
			System.out.println(n3+", "+n2+", "+n1);
	entrada.close();
		}
	}
	
*/

/*
//El mismo que el anterior pero con aux.
package ordenarTresNumeros;
import java.util.Scanner;
public class ordenarTresNumeros {
	public static void main (String[]args) {
	Scanner entrada = new Scanner (System.in);
	int n1, n2, n3, aux;
	System.out.print("Primer número? ");
	n1 = entrada.nextInt();
	System.out.print("Segundo número? ");
	n2 = entrada.nextInt();
	System.out.print("Tercer número? ");
	n3 = entrada.nextInt();
	if (n1 > n2) {
		aux = n1;
		n1 = n2;
		n2 = aux;
	}
	if (n1 > n3){
		aux = n1;
		n1 = n3;
		n3= aux;
	}
	if (n2 > n3){
		aux = n2;
		n2 = n3;
		n3 = aux;
	}
	System.out.println(n1+", "+n2+", "+n3);
	entrada.close();
	}
}

*/