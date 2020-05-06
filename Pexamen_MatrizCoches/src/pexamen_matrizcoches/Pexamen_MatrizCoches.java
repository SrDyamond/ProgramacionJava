package pexamen_matrizcoches;
public class Pexamen_MatrizCoches {
	static public void main (String []args) {
		int m[][] = {{8,9,6},{12,8,96},{25,36,41},{15,17,52},
				 {12,23,5},{3,2,5},{10,9,21},{41,32,14},
				 {15,6,24},{7,5,3},{47,56,12},{36,47,95}};
	int ico=0, ifi=0,tc=0,vM=0,iM=0,suma=0;
	//Visualizamos el vector 
	System.out.println();
	for (ifi=0;ifi<12;ifi++) {
		for (ico=0;ico<3;ico++) {
			System.out.print(m[ifi][ico]+"\t");
		}
		System.out.println("\n");
	}
	//sumamos todos los coches vendidos
	System.out.println("\n");
	for (ifi=0;ifi<12;ifi++) {
		for (ico=0;ico<3;ico++) {
			tc+=m[ifi][ico];
		}
	}
	System.out.println("\nEl total de coches vendidos en el año es: "+tc+"");
	System.out.println("\n");
	//coche mas vendido
	for (ico=0;ico<3;ico++) {
		suma=0;
		for (ifi=0;ifi<12;ifi++) {
			suma+= m[ifi][ico];
			if (suma>vM) {
				vM=suma;
				iM=ico;
			}
		}
	}
	System.out.print("El coche mas vendido es el "+(iM+1)+ " con un total de ventas de "+suma);
	System.out.println("\n");
	iM=0;
	vM=0;
	//el mes con mas ventas
	for (ifi=0;ifi<12;ifi++) {
		suma=0;
		for (ico=0;ico<3;ico++) {
			suma+= m[ifi][ico];
			if (suma>vM) {
				vM=suma;
				iM=ifi;
			}
		}
	}
	System.out.print("El mes con mas ventas fue :"+(iM+1)+ " Con una venta de: "+suma);
	System.out.println("\n");
	//calcula la media de las ventas en los 12 meses de las 3 marcas 
	suma=0;
	for(ico=0;ico<3;ico++) {
		suma=0;
		for (ifi=0;ifi<12;ifi++) {
			suma += m[ifi][ico];
		}
		System.out.println("La media de ventas de la marca " +(ico+1)+ " es de: " +suma/12);
	}
	}

}
