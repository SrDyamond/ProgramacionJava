package ficheroContarPalabra;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
public class FicheroContarPalabra {
	public static void main (String []args) {
		int car = ' ';
		int cont=0;
		String texto ="";
		try {
			FileWriter esc = new FileWriter("C:\\Users\\dyang\\eclipse-workspace\\ArchivosDatos\\palabras.txt", false);// false por defecto
																													 // sobrescribe
			System.out.println("Teclear texto a grabar: ");
			car = (char) System.in.read();
			while (car != '*') {
				esc.write(car);
				car = (char) System.in.read();
			}
			esc.close();
		} catch (IOException ioe) {}
		System.out.println("\n\tFin del proceso de grabación");
		try {
			FileReader lec = new FileReader("C:\\Users\\dyang\\eclipse-workspace\\ArchivosDatos\\palabras.txt");
			car = lec.read();
			while(car!=-1) {
				texto+=(char) car ;
				car = lec.read();
			}
			System.out.println("\n\nContenido del fichero...:" +texto);
			lec.close();
		} catch (IOException ioe) {}
		System.out.println("\n\nFin del proceso de lectura");
		
		
		try {
			FileReader lec = new FileReader("C:\\Users\\dyang\\eclipse-workspace\\ArchivosDatos\\palabras.txt");
			car = lec.read();
			while(car!=-1) {
				if (car==' ') cont++;
				texto+=(char) car ;
				car = lec.read();
			}
			cont++;
			lec.close();
		} catch (IOException ioe) {}
		System.out.println("El numero de palabras es..."+cont);
		
	}

}