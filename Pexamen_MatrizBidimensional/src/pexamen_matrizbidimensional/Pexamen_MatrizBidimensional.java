package pexamen_matrizbidimensional;
import java.util.Scanner;
public class Pexamen_MatrizBidimensional {
	static public void main (String []args) {
		Scanner entrada=new Scanner(System.in);
		int v [][] = 		{
							{2,2,4},
							{4,6,7},
							{5,8,1},
							{1,7,4},
							{9,1,6}
							};
		int i=0,e=0,sumat=0,sumafila=0,sumacolumna=0,vM=0,iM=0;
		
		
		/*llenado array
		for (i=0;i<5;i++) {
			for (e=0;e<3;e++) {
				System.out.print("Inserte o valor da posicion" +(i+1)+","+(e+1)+ " : ");
				v[i][e]=entrada.nextInt();
			}
		}*/
		//visualizacion array
		for (i=0;i<5;i++) {
			System.out.println();
			System.out.print("[");
			for (e=0;e<3;e++) {
				System.out.print(v[i][e]);
			} 	System.out.print("]");
		}
	
		//suma total array
		for (i=0;i<5;i++) {
			for (e=0;e<3;e++) {
				sumat += v[i][e];
			} 
		}
		
		System.out.println("\nLa suma total del vector es " +sumat);
		System.out.println();
		
	//suma filas array imprimendo por pantalla
	for (i=0;i<5;i++) {
		sumafila=0;
		for (e=0;e<3;e++) {
			sumafila += v[i][e];
			if (sumafila>vM) {
				vM=sumafila;
				iM=i;
			}	
		} 
		System.out.println("La suma de la fila "+(i+1)+" es de :"+sumafila);
	}
	System.out.println("La venta mayor es de "+vM+" de la fila "+(iM+1));
	System.out.println();
	System.out.println();
	iM=0;
	vM=0;
	//suma columnas array imprimiendo por pantalla
	for (e=0;e<3;e++) {
		sumacolumna=0;
		for (i=0;i<5;i++) {
			sumacolumna += v[i][e];
			if (sumacolumna>vM) {
				vM=sumacolumna;
				iM=e;
			}
		} 
		System.out.println("La suma de la columna "+(e+1)+" es de :"+sumacolumna);
	}
	System.out.println("La venta mayor es de "+vM+" de la columna "+(iM+1));
	
	
	entrada.close();
	}
	
}
