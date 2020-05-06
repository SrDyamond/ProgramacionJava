//ifi=im ico=ic
package matrizBidimensionalCoches;
//import java.util.Scanner;
public class matrizBidimensionalCoches {
	public static void main (String[] args) {
//		Scanner e = new Scanner (System.in);
//		int m[][] = new int [12][3];
		int m[][] = {{8,9,6},{12,8,96},{25,36,41},{15,17,52},
					 {12,23,5},{3,2,5},{10,9,21},{41,32,14},
					 {15,6,24},{7,5,3},{47,56,12},{36,47,95}};
		String marca[] = {"BMW", "FORD", "SEAT"};
		String meses[] = {"Enero     ", "Febrero", "Marzo    ", "Abril   ",
				          "Mayo      ", "Junio  ", "Julio    ", "Agosto  ", 
				          "Septiembre", "Octubre", "Noviembre", "Dicembre"};
		int ifi=0, ico=0, tc=0;

/*************************************Introducción de ventas en la matriz*************************************/	
		
//		for (ifi=0;ifi<12;ifi++) {
//			for (ico=0;ico<3;ico++) {
//				System.out.print("Ventas del coche: "+(ico+1)+" en el mes: "+(ifi+1)+"?");
//				m[ifi][ico]=e.nextInt();
//			}
//		}

/*************************************Visualización de la matriz*************************************/		
		
		System.out.println("\t");
		for (ico=0;ico<3;ico++)
			System.out.print("\t"+marca[ico]);
		System.out.println();
		for (ifi=0;ifi<12;ifi++) {
			System.out.print(meses[ifi]+"\t");
			for (ico=0;ico<3;ico++) {
				System.out.print(m[ifi][ico]+"\t");
			}
			System.out.println("\n");
		}
		
/*************************************Coches vendidos en el año*************************************/		
		System.out.println("\n");
		for (ifi=0;ifi<12;ifi++) {
			for (ico=0;ico<3;ico++) {
				tc+=m[ifi][ico];
			}
		}
		System.out.println("\nEl total de coches vendidos en el año es: "+tc+"");
		
		System.out.println("\n");
		
/*************************************Coche más vendido*************************************/
		int vc=0, vM=0, iM=0; 
		for (ico=0;ico<3;ico++) {
			vc=0;
			for (ifi=0;ifi<12;ifi++) {
				vc+=m[ifi][ico];
			}
			if (vc>vM) {
				vM=vc;
				iM=ico;
			}
		}
		System.out.println("\nEl coche más vendido fue: "+(iM+1)+" con: "+vM+" ventas.");

		System.out.println("\n");
		
/*************************************Mes con más ventas*************************************/
		
		vM=0;
		for (ifi=0;ifi<12;ifi++) {
			vc=0;
			for (ico=0;ico<3;ico++) {
				vc+=m[ifi][ico];
			}
			if (vc>vM) {
				vM=vc;
				iM=ifi;
			}
		}
		System.out.println("\nEl mes con más ventas fue: "+(iM+1)+" con: "+vM+" ventas.");
		
		System.out.println("\n");
		//		e.close();	
	}
}

/*************************************Explicación variables de cadena*************************************/
//String nombres[] = new String [5];
// | Juan | Pedro | Sara | Clara | Lara |
//    0       1       2      3       4       -->Posición.
//    4       5       4      5       4       -->Caracteres.
//String nombres[] = {"Juan", "Pedro", "Sara", "Clara", "Lara"}; 
