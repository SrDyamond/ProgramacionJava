package matrizBidimensional;
import java.util.Scanner;
public class matrizBidimensional {
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
//		int m[][],
//		m = new int[6][4];
//		int m[][] = new int [6][4];
		int m[][] = {{25,63,8,94}, {78,5,96,12},{16,45,98,3},{78,56,42,39},{43,69,85,32},{55,33,88,77}};		
		int ifi=0, ico=0;
//		for (ifi=0;ifi<6;ifi++) {
//			for (ico=0;ico<4;ico++) {
//				System.out.print("Elemento m["+ifi+"]["+ico+"]?");
//			m[ifi][ico]=entrada.nextInt();
//			}
//		}
		for (ifi=0;ifi<6;ifi++) {
			for (ico=0;ico<4;ico++) {
				System.out.print(m[ifi][ico]+"\t");
				}
			System.out.println("\n");
		}
		entrada.close();
	}
}
		
		
	



/*

package matrizBidimensional;
import java.util.Scanner;
public class matrizBidimensional {
	public static void main (String[] args) {
		int[][] m, ifi={{0},{0}}, ico={{0},{0}};
		m = new int[6][4];
	}
}

*/