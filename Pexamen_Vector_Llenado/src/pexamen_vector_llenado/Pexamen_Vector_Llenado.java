package pexamen_vector_llenado;
import java.util.Scanner;
public class Pexamen_Vector_Llenado {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int i=0,e=0,tam=0,nb=0;
		do {
		System.out.print("Inserta o tamaño do vector");
		tam=sc.nextInt();
		}while(tam<1 || tam>10);
		int v[]=new int [tam];
		boolean encontrado=false;
		//llenado vector
		/*
		for(i=0;i<tam;i++) {
			System.out.print("Inserta os valores do vector");
			v[i]=sc.nextInt();
		}
		*/
		//variacion llenado sin numeros repetidos
		for(i=0;i<tam;i++) {
			System.out.print("Inserte o numero da posición" +(i+1));
			v[i]=sc.nextInt();
			for(e=0;e<i;e++) {
				if (v[e]==v[i]) {//o tamaño ten que ser o outro indice
					i--;
				}
			}
		}
		//visualizacion
		for(i=0;i<tam;i++)
			System.out.print(v[i]+"\t");
		
		//busqueda secuencial
		System.out.println();
		System.out.println("Inserta o numero a buscar");
		nb=sc.nextInt();
		
			for(i=0;i<tam;i++) {
				if (nb==v[i])
					encontrado=true;
			}
	
			
		if (encontrado)
		System.out.print("O numero esta no vector ");
		else
		System.out.print("O numero non esta no vector");
		
		sc.close();
			}	
	}


