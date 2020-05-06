package personaMenu;
import java.io.IOException;
import java.util.Scanner;

public class PersonaMenu {

	public static void printMenu() {
		System.out.println("#MENU");
		System.out.println(" 0 - Llenar el vector (auto)");
		System.out.println(" 1 - Llenar el vector");
		System.out.println(" 2 - Visualizar el vector");
		System.out.println(" 3 - Ordenar por nombre");
		System.out.println(" 4 - Ordenar por edad");
		System.out.println(" 5 - Agrupar por sexo");
		System.out.println(" 6 - Consultar por nombre");
		System.out.println(" 7 - Salir");
		System.out.println();
	}
	
	public static int readOption(Scanner s) {
		int out = 0;
		do {
			System.out.print("Opción: ");
			out = s.nextInt();
			s.nextLine();
			System.out.println();
		} while(out < 0 || out > 7);
		return out;
	}
	
	public static Persona[] llenarVectorAuto() {
		Persona arrp[] = new Persona[4];
		arrp[0] = new Persona("Paco de todo el santo", 23, 'H');
		arrp[1] = new Persona("Manola", 12, 'M');
		arrp[2] = new Persona("Choco", 60, 'H');
		arrp[3] = new Persona("Noca", 38, 'M');
		return arrp;
	}
	
	public static Persona[] llenarVector(Scanner s, Persona[] arrp) {
		int i = 0;
		char c = ' ';
		
		System.out.println();
		for (i = 0; i < arrp.length; i++) {
			System.out.println("> Persona " + (i + 1));
			arrp[i] = new Persona();
			
			System.out.print(" Nombre: ");
			arrp[i].setNombre(s.nextLine());
			
			System.out.print(" Edad: ");
			arrp[i].setEdad(s.nextInt());
			
			do {
				System.out.print(" Sexo: ");
				try {
					c = Character.toUpperCase(((char) System.in.read()));
					while(System.in.read()!='\n'); //leer hasta pulsar enter
				} catch (IOException ioe) {
					System.out.println("error1");
				}
			} while (c != 'M' && c != 'F');
			arrp[i].setSexo(c);
			s.nextLine();
			System.out.println();
		}
		return arrp;
	}
	
	/*public static String calcularTab(Persona[] arrp) {
		String out = "\t";
		int i = 0;
		for (i = 0; i < arrp.length; i++) {
			if (arrp[i].getNombre().length() >= 8) {
				out = "\t\t";
				if (arrp[i].getNombre().length() >= 16) {
					out = "\t\t\t";  
				}
			}
		}
		return out;
	}*/
	
	public static void mostrarVector(Persona[] arrp) {
		int i = 0;
		//String tab = calcularTab(arrp);
		for (i = 0; i < arrp.length; i++) {
			System.out.print("> Persona " + (i + 1));
			System.out.print("\t" + "#Nom.:  " + arrp[i].getNombre());
			System.out.print("\t" + "#Edad:  " + arrp[i].getEdad());
			System.out.print("\t" + "#Sexo:  " + arrp[i].getSexo());
			System.out.println();
		}
	}
	
	public static Persona[] ordenarVector(Persona[] arrp, int opt) {
		int i = 0, e = 0;
		Persona aux = null;
		for (i = 0; i < (arrp.length - 1); i++) {
			for (e = i; e < arrp.length; e++) {
				if (	opt == 3 && arrp[i].getNombre().compareTo(arrp[e].getNombre()) > 0 ||
						opt == 4 &&	arrp[i].getEdad() > arrp[e].getEdad() ||
						opt == 5 &&	arrp[i].getSexo() > arrp[e].getSexo()) {
					aux = arrp[i];
					arrp[i] = arrp[e];
					arrp[e] = aux;
				}
			}
		}
		return arrp;
	}
	
	public static void consultaPorNombre(Scanner s, Persona[] arrp) {
		String nombre = "";
		int i = 0;
		boolean encontrado = false;
		System.out.print("Teclee nombre a buscar: ");
		nombre = s.nextLine();
		System.out.println();
		
		for (i = 0; i < arrp.length; i++) {
			if (arrp[i].getNombre().equals(nombre)) {
				System.out.println("> Persona " + i + " encontrada :)");
				System.out.println(" Nom.: " + arrp[i].getNombre());
				System.out.println(" Edad: " + arrp[i].getEdad());
				System.out.println(" Sexo: " + arrp[i].getSexo());
				encontrado = true;
			}
		}
		
		if (!encontrado) System.out.println("> No encontrado :(");
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int opt = 0;
		Persona arrp[] = new Persona[4]; 
		
		do {
			printMenu();
			opt = readOption(s);
			switch (opt) {
				case 0:
					arrp = llenarVectorAuto();
					break;
				case 1:
					arrp = llenarVector(s, arrp);
					break;
				case 2:
					mostrarVector(arrp);
					break;
				case 3:
					arrp = ordenarVector(arrp, opt);
					break;
				case 4:
					arrp = ordenarVector(arrp, opt);
					break;
				case 5:
					arrp = ordenarVector(arrp, opt);
					break;
				case 6:
					consultaPorNombre(s, arrp);
					break;
			}
			System.out.println();
		} while (opt != 7);
		
		s.close();
	}

}
