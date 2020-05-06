package matrizBidimensionalBorde;

public class matrizBidimensionalBorde {
	public static void main (String[] args) {
		int m[][] = {{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9}};
		int ifi=0, ico=0;
		for (ifi=0;ifi<8;ifi++) {
			for (ico=0;ico<8;ico++) {
				if  (ico==0 || ico==7 || ifi==0 || ifi==7)
					m[ifi][ico]=1;
				else
					m[ifi][ico]=0;
			}
		}
		for (ifi=0;ifi<8;ifi++) {
			for (ico=0;ico<8;ico++) {
				System.out.print(m[ifi][ico]+"\t");
			}
			System.out.print("\n");
		}
	}

}
