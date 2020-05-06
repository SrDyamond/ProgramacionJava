package ahorcado;
import java.io.IOException;
import java.util.Scanner;
public class Ahorcado {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		String frase="";
		String fraseprep="";
		char letra =' ',letrabuscar=' ',salida=' ';
		char vPalabra[];
		char vAciertos[];
		char vFallos[];
		int i=0,e=0,j=0,k=0,contA=0,contF=0;
		boolean encontrado=false;
		
	do {
		System.out.print("Teclea a palabra");
		frase=sc.next();
		frase=frase.toLowerCase();
		int tam=frase.length();//variable ta
		vPalabra=frase.toCharArray();
		for(i=0;i<vPalabra.length;i++) {  //al ser la longitud de un array no se pone ()
			letra=frase.charAt(i);
			if (i==0 || i==vPalabra.length-1) 
				fraseprep +=letra ;
			else
				fraseprep +="_";
		}
		vAciertos=fraseprep.toCharArray();
		vFallos=fraseprep.toCharArray();
		
		
		//visualizar vectores aciertos fallos
		do {
			System.out.println("Aciertos");
		for(e=0;e<tam;e++) 
			System.out.print(vAciertos[e]);
		
		System.out.println();
		System.out.println("Fallos");
		for(j=0;j<tam;j++) 
		System.out.print(vFallos[j]);
		
		System.out.println();
			try {
				System.out.println("Teclea a letra");
				letrabuscar=(char) System.in.read();
				while(System.in.read() != '\n');
			}catch(IOException ioe) {}
			letrabuscar=Character.toLowerCase(letrabuscar);
		
		for (j = 1; j < tam-1; j++) {
			if (letrabuscar == vPalabra[i] && letrabuscar != vAciertos[e]) {
				vAciertos[e] = letrabuscar;
				encontrado = true;
				contA++;
			}
		}
		
		if (!encontrado) {
			vFallos[contF] = letrabuscar;
			contF++;
		}	
		else encontrado=false;
		}while(contA>tam-2 && contF>tam-1);
		
		if (contF<tam-1)
			System.out.println("Ganaste :)");
		else
			System.out.println("Perdiste :(");
			
		
	do {
		System.out.print("Quieres jugar otra?Escribe Si o no.");
		try {
			salida=(char) System.in.read();
			while(System.in.read() != '\n');
		}catch(IOException ioe) {}
		salida=Character.toLowerCase(salida);
	}while(salida !='s' && salida !='n');
	contA=0;
	contF=0;
	} while (salida != 's');
	
	}
	
}

	

