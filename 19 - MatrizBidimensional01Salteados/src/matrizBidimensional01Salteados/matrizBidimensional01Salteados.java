package matrizBidimensional01Salteados;
//import java.util.Scanner;
public class matrizBidimensional01Salteados {
	public static void main (String[] args) {
//		int m[][] = new int [8][8];
//		int ifi=0, ico=0;
//		Scanner entrada = new Scanner (System.in);
//		m[ifi][ico] = entrada.nextInt();
//		entrada.close();
		int m[][] = {{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9}};
		int ifi=0, ico=0, v=1;
		for (ifi=0;ifi<8;ifi++) {
			for (ico=0;ico<8;ico++) {
				m[ifi][ico] = v;
				if (v==0)
					v=1;
				else
					v=0;
		}
			if (v==0)
				v=1;
			else
				v=0;
		}
		for (ifi=0;ifi<8;ifi++) {
			for (ico=0;ico<8;ico++) {
				System.out.print(m[ifi][ico]+"\t");
			}	
			System.out.println("\n");
		}
			
	}
}
