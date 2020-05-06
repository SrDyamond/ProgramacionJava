/*
package descripcionString;
import java.util.Scanner;
public class descripcionString {
	public static void main (String[] args) {
		String cadena=null;
		cadena = "Esto es una cadena";
		System.out.println("cadena = "+cadena);
	}
}
*/

//Un String no es una variable. Esto es otra manera de definir un String.
/*
package descripcionString;
import java.util.Scanner;
public class descripcionString {
	public static void main (String[] args) {
		String cadena=new String("Esto es una cadena");
		System.out.println("cadena = "+cadena);
	}
}
*/

/*
//Representación de la cadena y de cuántos caracteres se compone.
package descripcionString;
import java.util.Scanner;
public class descripcionString {
	public static void main (String[] args) {
		String cadena=new String("Esto es una cadena");
		System.out.println("cadena = "+cadena);
		System.out.println("Longitud de la cadena = "+cadena.length());
	}
}
*/

/*
//No me reconoce los espacios en blanco que escribo en la cadena.

package descripcionString;
import java.util.Scanner;
public class descripcionString {
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		String cadena=new String("Esto es una cadena");
		System.out.println("cadena = "+cadena);
		System.out.println("Longitud de la cadena = "+cadena.length());
		System.out.print("\nTeclea una cadena? ");
		cadena = entrada.next();
		System.out.println("Cadena es ahora = "+cadena);
		System.out.println("Longitud de la cadena es ahpra = "+cadena.length());
		entrada.close();
	}
}
*/

/*
//Lo mismo que lo anterior, pero ahora me reconoce los espacios en blanco.

package descripcionString;
import java.util.Scanner;
public class descripcionString {
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		String cadena=new String("Esto es una cadena");
		System.out.println("cadena = "+cadena);
		System.out.println("Longitud de la cadena = "+cadena.length());
		System.out.print("\nTeclea una cadena? ");
//		cadena = entrada.next();
		cadena = entrada.nextLine();
		System.out.println("Cadena es ahora = "+cadena);
		System.out.println("Longitud de la cadena es ahpra = "+cadena.length());
		entrada.close();
	}
}
*/


package descripcionString;
import java.util.Scanner;
public class descripcionString {
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		String cadena=new String("Esto es una cadena");
		System.out.println("cadena = "+cadena);
		System.out.println("Longitud de la cadena = "+cadena.length());
		System.out.print("\nTeclea una cadena? ");
//		cadena = entrada.next();
		cadena = entrada.nextLine();
		System.out.println("Cadena es ahora = "+cadena);
		System.out.println("Longitud de la cadena es ahpra = "+cadena.length());
		System.out.println("\n"+cadena.charAt(1));
		entrada.close();
	}
}

//Introducir una cadena y que me salga la inversa. Papá-> ápaP.