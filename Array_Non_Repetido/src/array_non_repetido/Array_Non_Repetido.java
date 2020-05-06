package array_non_repetido;
import java.util.Scanner;
public class Array_Non_Repetido {
	public static void main (String []args) {
		Scanner sc=new Scanner(System.in);
		int m[][] = {{8,9,6},{12,8,96},{25,36,41},{15,17,52},
				 {12,23,5},{3,2,5},{10,9,21},{41,32,14},
				 {15,6,24},{7,5,3},{47,56,12},{36,47,95}};
		
		int meses=0,marcas=0,suma=0,Imarca=0;
		
		for(meses=0;meses<12;meses++) {
			System.out.println();
			for(marcas=0;marcas<3;marcas++) {
				System.out.print(m[meses][marcas]+"\t");
		
			}
		}

		
		//suma de las ventas totales de cada marcar
		for(marcas=0;marcas<3;marcas++) {
			suma=0;
			for (meses=0;meses<12;meses++) {
				suma += m[meses][marcas];
				Imarca=marcas;
			}
			System.out.println();
			System.out.println("La suma de la marca" +(Imarca+1)+ " es de "+suma);
		}
		sc.close();
		Imarca=0;
		suma=0;
		for(marcas=0;marcas<3;marcas++) {
			suma=0;
			for (meses=0;meses<12;meses++) {
				suma += m[meses][1];
				Imarca=marcas;
			}
			
		}
		System.out.println();
		System.out.println("La suma es de "+suma);
		
	}

}
