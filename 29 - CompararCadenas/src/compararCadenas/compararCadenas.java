/*
package compararCadenas;
import java.util.Scanner;
public class compararCadenas {
	public static void main (String [] args) {
		Scanner entrada = new Scanner (System.in);
		String nombre = null;
		System.out.print("Teclee nombre? ");
		nombre = entrada.nextLine();
		if (nombre == "Emilio")
			System.out.println("Acertaste");
		else
			System.out.print("Fallaste");
		entrada.close();
	}
}
//No funciona == "Emilio".
*/

/*
//Si tecleo el nombre tal cual, acertaste. Si alterno mayúsculas, fallaste.
package compararCadenas;
import java.util.Scanner;
public class compararCadenas {
	public static void main (String [] args) {
		Scanner entrada = new Scanner (System.in);
		String nombre = null;
		System.out.print("Teclee nombre? ");
		nombre = entrada.nextLine();
		if (nombre.equals("Emilio"))
			System.out.println("Acertaste");
		else
			System.out.print("Fallaste");
		entrada.close();
	}
}
*/

/*
//Corregido Mayúsculas
package compararCadenas;
import java.util.Scanner;
public class compararCadenas {
	public static void main (String [] args) {
		Scanner entrada = new Scanner (System.in);
		String nombre = null;
		System.out.print("Teclee nombre? ");
		nombre = entrada.nextLine();
		if (nombre.equalsIgnoreCase("Emilio"))
			System.out.println("Acertaste");
		else
			System.out.print("Fallaste");
		entrada.close();
	}
}
*/

/*
//Simpre que no introduzca Emilio, acertaste.
package compararCadenas;
import java.util.Scanner;
public class compararCadenas {
	public static void main (String [] args) {
		Scanner entrada = new Scanner (System.in);
		String nombre = null;
		System.out.print("Teclee nombre? ");
		nombre = entrada.nextLine();
		if (!nombre.equalsIgnoreCase("Emilio"))
			System.out.println("Acertaste");
		else
			System.out.print("Fallaste");
		entrada.close();
	}
}
*/

/*
//Me da la diferencia de código ASCII en negativo.
package compararCadenas;
import java.util.Scanner;
public class compararCadenas {
	public static void main (String [] args) {
		Scanner entrada = new Scanner (System.in);
		String nombre = null;
		System.out.print("Teclee nombre? ");
		nombre = entrada.nextLine();
		if (!nombre.equalsIgnoreCase("Emilio"))
			System.out.println("Acertaste");
		else
			System.out.print("Fallaste");
		
		System.out.println("compareTo = "+nombre.compareTo("Emilio"));
		entrada.close();
	}
}
*/

//Corregido problema mayúsuclas. Emilio = 0 && emilio = 0.
package compararCadenas;
import java.util.Scanner;
public class compararCadenas {
	public static void main (String [] args) {
		Scanner entrada = new Scanner (System.in);
		String nombre = null;
		System.out.print("Teclee nombre? ");
		nombre = entrada.nextLine();
		if (nombre.equalsIgnoreCase("Emilio"))
			System.out.println("Acertaste");
		else
			System.out.print("Fallaste");
		
		System.out.println("compareTo = "+nombre.compareToIgnoreCase("Emilio"));
		entrada.close();
	}
}
