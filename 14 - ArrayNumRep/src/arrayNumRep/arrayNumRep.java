//Que te pida los n�meros de uno en uno. 1�, 2�...
/*
package arrayNumRep;
import java.util.Scanner;
public class arrayNumRep {
	public static void main(String[] args) {
		int v[] = new int [12], i=0, n=0;
		Scanner numero = new Scanner (System.in);
		for(i=0;i<12;i++) {
			System.out.print((i+1)+"� n�mero?");
			v[i] = numero.nextInt();
		}
		System.out.print("\nN�mero a buscar? ");
		n = numero.nextInt();
		for(i=0;i<12;i++) {
			if (v[i]==n)
				i=12;
		}
		if(i==13)
			System.out.print("\nEl n�mero: "+n+" SI se encuentra en la lista");
		else
			System.out.print("\nEl n�mero: "+n+" NO se encuentra en la lista");
		numero.close();
	}
}
*/

/*
//Creamos una variable booleana.     !existe-> existe == false
package arrayNumRep;              //  existe-> existe == true
import java.util.Scanner;
public class arrayNumRep {
	public static void main(String[] args) {
		int v[] = new int [12], i=0, n=0;
		boolean existe = false;
		Scanner numero = new Scanner (System.in);
		for(i=0;i<12;i++) {
			System.out.print((i+1)+"� n�mero?");
			v[i] = numero.nextInt();
		}
		System.out.print("\nN�mero a buscar? ");
		n = numero.nextInt();
		for(i=0;i<12;i++) {
			if (v[i]==n)
				existe = true;
		}
		if(existe)
			System.out.print("\nEl n�mero: "+n+" SI se encuentra en la lista");
		else
			System.out.print("\nEl n�mero: "+n+" NO se encuentra en la lista");
		numero.close();
	}
}
*/


package arrayNumRep;              //  existe-> existe == true
import java.util.Scanner;
public class arrayNumRep {
	public static void main(String[] args) {
		int v[] = new int [12], i=0, n=0;
		boolean existe = false;
		Scanner numero = new Scanner (System.in);
		for(i=0;i<12;i++) {
			System.out.print((i+1)+"� n�mero?");
			v[i] = numero.nextInt();
		}
		System.out.print("\nN�mero a buscar? ");
		n = numero.nextInt();
		for(i=0;i<12 && !existe;i++) {
			if (v[i]==n)
				existe = true;
			System.out.println("Valor de i "+i);
		}
		if(existe)
			System.out.print("\nEl n�mero: "+n+" SI se encuentra en la lista");
		else
			System.out.print("\nEl n�mero: "+n+" NO se encuentra en la lista");
		numero.close();
	}
}