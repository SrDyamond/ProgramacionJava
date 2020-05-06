package arrayObj;

import java.io.IOException;
import java.util.Scanner;

public class ArrayObj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Persona p[] = new Persona[4];
		char c = ' ';
		int i = 0;

		for (i = 0; i < p.length; i++) {
			System.out.println("#Persona" + (i + 1));
			p[i] = new Persona();
			
			System.out.print("Nombre: ");
			p[i].setNombre(s.nextLine());
			
			System.out.print("Edad: ");
			p[i].setEdad(s.nextInt());
			
			do {
				System.out.print("Sexo: ");
				try {
					c = Character.toUpperCase(((char) System.in.read()));
					while(System.in.read()!='\n'); //leer hasta pulsar enter
				} catch (IOException ioe) {
					System.out.println("error1");
				}
			} while (c != 'M' && c != 'F');
			p[i].setSexo(c);
			s.nextLine();
			System.out.println();
		}
		
		for (i = 0; i < p.length; i++) {
			System.out.println("#Persona" + (i + 1));
			System.out.println("Nombre:\t" + p[i].getNombre());
			System.out.println("Edad:\t" + p[i].getEdad());
			System.out.println("Sexo:\t" + p[i].getSexo());
			System.out.println();
		}
		
		s.close();
	}

}
