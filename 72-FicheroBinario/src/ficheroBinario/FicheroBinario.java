package ficheroBinario;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class FicheroBinario {
	static final String ruta= "C:\\Users\\dyang\\eclipse-workspace\\ArchivosDatos\\";
	public static void main(String[] args) {
		int t[] = new int[10], v[] = new int [10], i = 0;
		for (i = 0; i < 10; i++)
			t[i] = i * 5;
		try {
//			FileOutStream fichero = new FileOutStream(ruta+"numeros.data");
//			ObjectOutputStream fich = new ObjectOutputStream(fichero);
			ObjectOutputStream fichsal = new ObjectOutputStream (new FileOutputStream(ruta + "numeros.dat"));
			for (i = 0; i < 10; i++)
				fichsal.writeInt(t[i]);
			fichsal.close();
		} catch (IOException ioe) {System.out.println("Error en grabación");}
		try {
			ObjectInputStream fichent = new ObjectInputStream (new FileInputStream(ruta + "numeros.dat"));
			for (i = 0; i < 10; i++)
				v[i] = fichent.readInt();
			fichent.close();
		} catch (IOException ioe) {System.out.println("Error en lectura");}
		for (i = 9; i >= 0; i--)
			System.out.println(v[i]);
	}
}

	
