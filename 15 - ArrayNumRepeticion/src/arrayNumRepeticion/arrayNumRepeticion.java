package arrayNumRepeticion;
import java.util.Scanner;
public class arrayNumRepeticion {
	public static void main(String[] args) {
		int v[] = new int [12], i=0, n=0, c=0;
		Scanner numero = new Scanner (System.in);
		for(i=0;i<12;i++) {
			System.out.print((i+1)+"º número?");
			v[i] = numero.nextInt();
		}
		System.out.print("\nNúmero a buscar? ");
		n = numero.nextInt();
		for(i=0;i<12;i++) {
			if (v[i]==n)
			//	i=12;
				c++;         //c = c + 1;
		}
/*		if (i==13) 
			System.out.print("\nEl número: "+n+" SI se encuentra en la lista");
		else
			System.out.print("\nEl número: "+n+" NO se encuentra en la lista");
*/		
		if (c!=0) 
			System.out.print("\nEl número: "+n+" se repite "+c+" veces");
		else
			System.out.print("\nEl número: "+n+" NO se encuentra en la lista");
		numero.close();
	}
}


//No tomar como referencia.
/*
package arrayNumRep;              //  existe-> existe == true
import java.util.Scanner;
public class arrayNumRep {
	public static void main(String[] args) {
		int v[] = new int [12], i=0, n=0;
		boolean existe = false;
		Scanner numero = new Scanner (System.in);
		for(i=0;i<12;i++) {
			System.out.print((i+1)+"º número?");
			v[i] = numero.nextInt();
		}
		System.out.print("\nNúmero a buscar? ");
		n = numero.nextInt();
		for(i=0;i<12 && !existe;i++) {
			if (v[i]==n)
				existe = true;
			System.out.println("Valor de i "+i);
		}
		if(existe)
			System.out.print("\nEl número: "+n+" SI se encuentra en la lista");
		else
			System.out.print("\nEl número: "+n+" NO se encuentra en la lista");
		numero.close();
	}
}
*/