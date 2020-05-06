/*
package tablaMultiplicar;

public class tablaMultiplicar { //No 
	public static void main(String [] args) {
		int i=0;
		for(i=0;i<11;i++) 
			System.out.println("7 * "+i+" = "+i*7);
	}
}
*/

/*
package tablaMultiplicar; //Tabla de multiplicar según número.
import java.util.Scanner;
public class tablaMultiplicar { //No 
	public static void main(String [] args) {
		Scanner numero = new Scanner (System.in);
		int i=0,n1=0;
		System.out.print("Introduzca el número del cual quiera saber la tabla demultiplicar: ");
		n1 = numero.nextInt();
		for(i=0;i<11;i++) 
			System.out.println(n1+" * "+i+" = "+i*n1);
		numero.close();
	}
}
*/

/*
package tablaMultiplicar; //Tabla de multiplicar según número y rango.
import java.util.Scanner;
public class tablaMultiplicar { //No 
	public static void main(String [] args) {
		Scanner numero = new Scanner (System.in);
		Scanner inicio = new Scanner (System.in);
		Scanner fin = new Scanner (System.in);
		int i=0,n1=0,n2=0,n3=0;
		System.out.print("Introduzca el número del cual quiera saber la tabla demultiplicar: ");
		n1 = numero.nextInt();
		do {
			System.out.print("Introduzca límite inferior: ");
			n2 = inicio.nextInt();
			System.out.print("Introduzca límite superior: ");
			n3 = fin.nextInt();
		}while (n2 > n3);
		for(i=n2;i<=n3;i++) 
			System.out.println(n1+" * "+i+" = "+i*n1);
		numero.close();
		inicio.close();
		fin.close();
	}
}
*/