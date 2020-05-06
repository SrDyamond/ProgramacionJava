package ficheroNombreyEdad;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;
public class FicheroNombreyEdad {
	public static void main(String []args) {
		Scanner entrada = new Scanner(System.in);
		String nombre="",edad="";
		int media=0,cp=0;
		try {
			BufferedWriter esc =  new BufferedWriter(new FileWriter("C:\\Users\\dyang\\eclipse-workspace\\ArchivosDatos\\persona.txt",true));
			System.out.println("Nombre?...(*** para fin)");
			nombre=entrada.nextLine();
			while(!nombre.equals("***")) {
				System.out.println("Edad?");
				edad=entrada.nextLine();
				esc.write(nombre);
				esc.newLine();
				esc.write(edad);
				esc.newLine();
				System.out.println("Nombre?...(*** para fin)");
				nombre=entrada.nextLine();
				
			}
			esc.close();
			System.out.println("\tLISTADO\n\t=====");
			BufferedReader lec =  new BufferedReader(new FileReader("C:\\Users\\dyang\\eclipse-workspace\\ArchivosDatos\\persona.txt"));
			nombre=lec.readLine();
			while(nombre!=null) {
				edad=lec.readLine();
				media+=Integer.parseInt(edad);
				cp++;
				System.out.println(nombre+"\t"+edad);
				nombre=lec.readLine();
			}
			lec.close();
		}catch(IOException ioe) {}
		System.out.println("La media es "+media/cp);
		entrada.close();
	}

}
