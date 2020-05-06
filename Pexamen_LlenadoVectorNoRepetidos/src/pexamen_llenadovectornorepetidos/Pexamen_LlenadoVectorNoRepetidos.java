package pexamen_llenadovectornorepetidos;
import java.util.Scanner;
public class Pexamen_LlenadoVectorNoRepetidos {
	static public void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i=0,e=0,nb=0,np=0;
		int v[] = new int [10];
		boolean encontrado;
		encontrado = false;
		
		//Llenamos el vector con numeros no repetidos
		for(i=0;i<10;i++) {
			System.out.print("Teclea el "+(i+1)+"º número..: ");
			v[i] = entrada.nextInt();
			for(e=0;e<i;e++) {
				if (v[e]==v[i]) {
					i--;
					
				}
			}
		}
		//Visualizamos el vector original
		System.out.println("\n");
		System.out.print("[");
		for (i=0;i<10;i++) {
			if (i==9)
				System.out.print(v[i]);
			else
			System.out.print(v[i]+ "," );
		}
		System.out.print("]");
		
		System.out.println("\n");
		System.out.println("\n");
		
		//busqueda secuencial
		do {
		encontrado=false;
		System.out.println("\nTeclea un número a buscar:");
		nb=entrada.nextInt();
		for (i=0;i<10;i++) {
			if (v[i]==nb) 
				encontrado = true;	
		}
		
		if (encontrado)
			System.out.print("\nEl numero: "+nb+ "Si existe en el vector :) ");
		else
			System.out.print("\nEl numero: "+nb+ "NO existe en el vector :( ");
		
		do {
			System.out.println("\n");
			System.out.println("\nRealizar otra busqueda? (1) = Sí; (0) = No.");
			np= entrada.nextInt();
			
		} while (np!=0 && np!=1);
		}while (np==1);
		entrada.close();
	}
}


