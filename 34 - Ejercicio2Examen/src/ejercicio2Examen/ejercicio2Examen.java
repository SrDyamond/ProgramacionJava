package ejercicio2Examen;
import java.util.Scanner;
public class ejercicio2Examen {
	public static void main (String[] args) {
		Scanner e = new Scanner (System.in);
		int v[] = new int [18], ill=0, ibus=0, nb=0;
		for(ill=0;ill<18;ill++) {
			System.out.print("Teclea el "+(ill+1)+"º número..: ");
			v[ill] = e.nextInt();
			for(nb=0;nb<ill;nb++) {
				if (v[nb]==v[ill]) {
					nb=18;
					ill--;
					
				}
			}
		}
		
		e.close();
		
	}

}
