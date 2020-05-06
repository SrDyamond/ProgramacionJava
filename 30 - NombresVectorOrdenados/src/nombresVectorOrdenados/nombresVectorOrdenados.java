//Llenar vector con 7 nombres y ordenarlos por orden alfabético.  
package nombresVectorOrdenados;
import java.util.Scanner;
public class nombresVectorOrdenados {
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		String palabra[] = new String [7], palabraAux=null;
		int i=0, io=0;
		for(i=0;i<7;i++) {
			System.out.print((i+1)+"ª palabra? ");
			palabra[i]=entrada.nextLine();
		}
		System.out.println();
		for(i=0;i<7;i++)
			System.out.println(palabra[i]);
		System.out.println("\n");
		for(i=0;i<7;i++) {
			for(io=i+1;io<7;io++) {
				if(palabra[i].compareToIgnoreCase(palabra[io])>0) {
					palabraAux = palabra[i];
					palabra[i] = palabra [io];
					palabra[io] = palabraAux;
				}
			}
		}
		for(i=0;i<7;i++)
			System.out.println(palabra[i]);
		entrada.close();	
	}
}
// compared to metodo burbuja

//Introducir una frase y representar la misma pero sin espacios en blanco.