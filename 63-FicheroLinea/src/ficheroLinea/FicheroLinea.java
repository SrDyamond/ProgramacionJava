package ficheroLinea;

import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
public class FicheroLinea {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String linea = ""; 
	//	String texto = "";
		System.out.println("Teclea a linea a gardar no archivo");
		try {
			FileWriter esc = new FileWriter("C:\\Users\\dyang\\eclipse-workspace\\ArchivosDatos\\texto1.txt");
			linea = entrada.nextLine();
			while (!linea.equals("*")) {
				linea += '\n';// salta una linea
				esc.write(linea);
				linea = entrada.nextLine();
			}
			esc.close();
			System.out.println("Fin de grabación");
			System.out.println("Contenido del fichero");
		//	FileReader in = new FileReader("C:\\Users\\dyang\\eclipse-workspace\\ArchivosDatos\\texto1.txt");
			BufferedReader lec = new BufferedReader(new FileReader("C:\\Users\\dyang\\eclipse-workspace\\ArchivosDatos\\texto1.txt"));
			linea = lec.readLine();
			while (linea != null) {
		//		texto += linea;
		//		texto +='\n';
				System.out.println(linea);
				linea = lec.readLine();

			}
			lec.close();

		} catch (IOException ioe) {
		}
	//	System.out.println(texto);
		entrada.close();
	}
}
