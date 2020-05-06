package ejercicio3Examen;
import java.util.Scanner;
public class ejercicio3Examen {
	public static void main (String[] args) {
		Scanner e = new Scanner (System.in);
		int mV[][][] = new int [12][4][6];
		int im=0, id=0, ip=0;
		int vD[] = new int [4];
		int ide=0, vM=0, vDD=0;
		for (im=0;im<12;im++) {
			for (ip=0;ip<6;ip++)
				for (id=0;id<4;id++) {
					System.out.println("\n\nTeclea los valores");
					mV[im][id][ip] = e.nextInt();
				}
		}
		for (id=0;id<4;id++)
			for (im=0;im<12;im++) {
				for (ip=0;ip<6;ip++)
					vDD=vDD+mV[im][id][ip];
			
				
		
		for (ip=0;ip<6;ip++) {
			vM=0;
			for (im=0;im<12;im++) {
				for (id=0;id<4;id++) {
					vM=vM+mV[im][id][ip];
				}
			System.out.print(vM/12);
			}
		}
		System.out.print(vDD);
		
		for (ip=0;ip<6;ip++) {
			for (im=0;im<12;im++)
				vM=mV[im][vDD][ip];
			System.out.print(vM, vM/12);
			vM=0;
		}
		
		
		
	}
	}
}
