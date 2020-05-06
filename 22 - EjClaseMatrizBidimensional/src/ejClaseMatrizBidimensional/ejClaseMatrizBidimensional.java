//Columnas salteadas de 1 y 0.
//Truco, llenar verticalmente.
package ejClaseMatrizBidimensional;
public class ejClaseMatrizBidimensional {
	public static void main (String[] args) {
		int m[][] = {{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9}};
		int ifi=0, ico=0, v=0;
		for (ifi=0;ifi<8;ifi++) {
			for (ico=0;ico<8;ico++) {
				if  (ico==0 || ico==2 || ico==4 || ico==6)
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

/*
//Emilio. Valor inicializado a 1. Primero ico y luego ifi

if valor 0... valor 1

else valor = 0
system.out.print("\n")

luego, el de visualizar es igual.
*/



