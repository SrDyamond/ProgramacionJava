package pexamen_llenadovectorburbujadicotomica;
import java.util.Scanner;
public class Pexamen_LlenadoVectorBurbujaDicotomica {
	static public void main (String []args) {
		Scanner entrada= new Scanner(System.in);
		int v[]= new int [5];
		int i=0,e=0,aux=0,iz=0,id=0,im=0,nb=0;
		boolean encontrado;
		encontrado = false;
		
		//LLenado del vector
		for (i=0;i<5;i++) {
			System.out.println("Teclea os valores");
			v[i]=entrada.nextInt();
		}
		System.out.println("\n");
		System.out.println("\n");
		
		
		//Visualizamos el vector
		System.out.println("Vector Original:");
		System.out.print("[");
		for (i=0;i<5;i++) {
			if (i==4)
				System.out.print(+v[i]);
			else
				System.out.print(+v[i]+",");
		}
		System.out.print("]");
		System.out.println("\n");
		
		
		//Ordenamos o vector co metodo da burbuja
		for(i=0;i<(4);i++) {
			for (e=(i+1);e<5;e++) {
				if (v[i]>v[e]) {
					aux=v[i];
					v[i]=v[e];
					v[e]=aux;
				}
			}
		}
		
		//Visualizamos el vector ordenado
		System.out.println("Vector Ordenado:");
		System.out.print("[");
		for (i=0;i<5;i++) {
			if (i==4)
				System.out.print(+v[i]);
			else
				System.out.print(+v[i]+",");
		}
		System.out.print("]");
		System.out.println("\n");
		
		//Busqueda dicotomica
		
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("Teclea un valor a buscar");
		nb=entrada.nextInt();
		do {
			im=(iz+id)/2;
			for(i=0;i<5;i++) {
				if (v[im]==nb)
				encontrado=true;
				else
					if (nb < v[im])
						id=im-1;
					else
						iz=im+1;
			}
		}while (iz <= id && !encontrado);
		
		if (encontrado)
			System.out.print("El numero existe");
		else
			System.out.print("El numero no existe");
		
		System.out.println("\n");
		
		entrada.close();
	}
}
		
		
	
