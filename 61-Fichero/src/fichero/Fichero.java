package fichero;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
public class Fichero {
	public static void main(String[] args) {
		int car = ' ';
		String texto ="";
		try {
			FileWriter esc = new FileWriter("C:\\Users\\dyang\\eclipse-workspace\\ArchivosDatos\\primero.txt", false);// false por defecto
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
			FileReader lec = new FileReader("C:\\Users\\dyang\\eclipse-workspace\\ArchivosDatos\\primero.txt");
			car = lec.read();
			while(car!=-1) {
				texto+=(char) car ;
				car = lec.read();
			}
			System.out.println("\n\nContenido del fichero...:" +texto);
			lec.close();
		} catch (IOException ioe) {}
		System.out.println("\n\nFin del proceso de lectura");
	}

}
