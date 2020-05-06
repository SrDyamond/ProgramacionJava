package pexamen_llenadovector_busqueda_numero_repetido;

import java.util.Scanner;

public class Pexamen_LlenadoVector_Busqueda_Numero_Repetido {
	static public void main (String []args) {
		//int v[] = new int [5];
		Scanner entrada=new Scanner(System.in);
		int v[]= {4,5,7,9,3,4};
		int i=0,nb=0,cont=0,np=0;
		boolean encontrado;
		encontrado=false;
		
		
		for (i=0;i<6;i++)
			System.out.print(v[i]);
		
		System.out.println("\n");
		do {
			encontrado=false;
			cont=0;
		System.out.println("Teclea o numero a buscar");
		nb=entrada.nextInt();
		for (i=0;i<6;i++) {
			if (nb==v[i]) {
				encontrado=true;
				cont++;
			}
		}
		if(encontrado)
			System.out.print("El numero " +nb+ " existe en el vector y se repite " +cont);
		else
			System.out.print("El numero " +nb+ " no existe en el vector");
		System.out.println("\n");
		do {
			System.out.println("Pulse 0 para finalizar el programa o 1 para una nueva busqueda");
			np=entrada.nextInt();
		}while(np==1 && np ==0);
		}while(np==1);
		
		entrada.close();
	}

}
