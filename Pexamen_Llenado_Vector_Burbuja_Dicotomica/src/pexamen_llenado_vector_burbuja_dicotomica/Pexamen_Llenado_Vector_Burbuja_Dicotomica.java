package pexamen_llenado_vector_burbuja_dicotomica;
import java.util.Scanner;
public class Pexamen_Llenado_Vector_Burbuja_Dicotomica {
	public static void main (String []args) {
		Scanner sc=new Scanner(System.in);
		int v[]=new int [5],i=0,e=0,aux=0,nb=0,im=0,iz=0,id=0;
		boolean encontrado=false;
		
		//llenado vector
		for(i=0;i<5;i++) {
			System.out.print("Inserte o valor do vector da posicion "+(i+1));
			v[i]=sc.nextInt();
		}
		
		for(i=0;i<5;i++)
			System.out.print(v[i]+"\t");
		
		//ordenacion metodo burbuja
		for(i=0;i<4;i++) {
			for(e=(i+1);e<5;e++) {
				if(v[i] > v[e]) {
					aux=v[i];
					v[i]=v[e];
					v[e]=aux;
				}
				}
			}
		//visualizamos o array ordenado
		System.out.println();
		for(i=0;i<5;i++)
			System.out.print(v[i]+"\t");
		//busqueda dicotomica-no lleva for-darle valor a iz + id
		System.out.println();
		System.out.println("Teclea o numero a buscar");
		nb=sc.nextInt();
		iz=0;
		id=5;
		do {
		im=(iz+id)/2;
			if(nb==v[im]) {
				encontrado=true;
			}
				if (nb<v[im])
					id=im-1;
				else
					iz=im+1;
		
		}while(iz<=id && !encontrado);
			
			
		if(encontrado)
			System.out.print("O numero existe no vector");
		else
			System.out.print("O numero non existe no vector");
		
		sc.close();
	}

}
