package busquedaDicotomica;
import java.util.Scanner;
public class busquedaDicotomica {
	public static void main(String[] args) {
		Scanner numero = new Scanner (System.in);
//		int v[] = new int [12];
		int	i1=0, i2=0, nb=0 , aux=0, im=0;
		int v[] = {15,34,4,45,37,37,65,45,20,25,14,1};
		boolean encontrado = false;
/***********************************************************************************/		
/*********************************Método burbuja************************************/	
/***********************************************************************************/
		
//			for(i1=0;i1<12;i1++){
//				System.out.print((i1+1)+"º número? ");
//				v[i1] = numero.nextInt();
//		}
		for(i1=0;i1<11;i1++) {
			for(i2=i1+1;i2<12;i2++){
				if(v[i1]>v[i2]) {
					aux = v[i1];
					v[i1] = v[i2];
					v[i2] = aux;
				}
			}
		}
		System.out.print("\n");
		for(i1=0;i1<12;i1++)
			System.out.print(v[i1]+"\t");
			
/***********************************************************************************/
/****************************Búsqueda Dicotómica************************************/	
/***********************************************************************************/	
	i1 = 0;
	i2 = 11;
	System.out.print("\n\nNúmero a buscar? ");
	nb = numero.nextInt();
	do {
		im = (i1 + i2)/2;
		if(v[im]==nb) {
			encontrado = true;
		}
		else {
			if (nb < v[im])
				i2 = im - 1;
			else
				i1 = im + 1;
					
		}
	}while(i1<=i2 && !encontrado);
	if (encontrado)
		System.out.println("\nEl número "+nb+" SI está en la lista.");
	else
		System.out.println("\nEl número "+nb+" NO está en la lista.");
	numero.close();
	}
}
	
	
	
/*	
	int iz=0, im=0, id=11, sw=0, nb=0;
	nb = numero.nextInt();
	im = (iz + id) / 2;
	if v[im] 
	     sw = 1;
	else
	if nb < v[im] 
				id = im - 1;
		else
			iz = im + 1;
	
	if iz <= id && sw=0
			im = (iz + id)/2;
	else
	if sw != 0
			System.out.println("\nNo existe");
		else
			System.out.print("\nEncontrado");
	
	numero.close();
	*/


