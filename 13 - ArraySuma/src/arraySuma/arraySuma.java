package arraySuma; //(Definiendo pasos).
import java.util.Scanner;
public class arraySuma {
	public static void main(String[] args) {
//Definición de variables.	
		int v[] = new int [12], i=0, s=0;
		Scanner numero = new Scanner (System.in);
//Llenado del vector.	
		for(i=0;i<12;i++) {
			System.out.print("Teclea valor? ");
		v[i] = numero.nextInt();
		}
//Suma de los elementos del vector.
		for(i=0;i<12;i++)
			s += v[i]; //Acumular valores.
//Visualización de la suma.
		for(i=0;i<12;i++)
			System.out.print("\n");
			System.out.print("La suma es: "+s);
			numero.close();
	}
}
