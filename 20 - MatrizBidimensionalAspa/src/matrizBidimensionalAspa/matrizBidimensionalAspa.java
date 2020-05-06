package matrizBidimensionalAspa;

public class matrizBidimensionalAspa {
	public static void main (String[] args) {
		int m[][] = {{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9}};
		int ifi=0, ico=0, v=1;
		for (ifi=0;ifi<8;ifi++) {
			for (ico=0;ico<8;ico++) {
				if (ifi==ico || ifi+ico==7)
					v = 1;
				else
					v = 0;
				m[ifi][ico] = v;
			}
			System.out.println("\n");
		}
			for (ifi=0;ifi<8;ifi++) {
				for (ico=0;ico<8;ico++) {
					System.out.print(m[ifi][ico]+"\t");
				}
				System.out.println("\n");
			}
	}	
}


