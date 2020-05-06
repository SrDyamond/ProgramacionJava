//Página 151 del libro.

/*
package variableChar;
import java.util.Scanner;
public class variableChar {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		char caracter=' ';
		
		System.out.print("Teclea caracter? ");
		caracter = System.in.read();
	}
}
*/

/*
package variableChar;
import java.util.Scanner;
import java.io.IOException;
public class variableChar {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int caracter= 0;
		try {
		System.out.print("Teclea caracter? ");
		caracter = System.in.read();
		}catch(IOException ioe) {}
		System.out.println("\nEl caracter tecleado es: "+caracter);
	}
}
*/

/*
package variableChar;
import java.io.IOException;
public class variableChar {
	public static void main(String[] args) {
		char caracter= ' ';
		try {
		System.out.print("Teclea caracter? ");
		caracter = (char) System.in.read();
		}catch(IOException ioe) {}
		System.out.println("\nEl caracter tecleado es: "+caracter);
	}
}
*/

/*
package variableChar;                    //Funciona igual que el enterior.
import java.io.IOException;
public class variableChar {
	public static void main(String[] args) {
		char caracter= ' ';
		System.out.print("Teclea caracter? ");
		try {
		caracter = (char) System.in.read();
		}catch(IOException ioe) {}
		System.out.println("\nEl caracter tecleado es: "+caracter);
	}
}
*/

/*
package variableChar;                    
import java.io.IOException;
public class variableChar {
	public static void main(String[] args) {
		char caracter= ' ';
		System.out.print("Teclea caracter? ");
		try {
		caracter = (char) System.in.read();
		}catch(IOException ioe) {}
		System.out.println("\nEl caracter tecleado es: "+caracter);
		if(caracter == 'W')
			System.out.println("\n\tAcertaste\n");
		else
			System.out.println("\n\tFollaste\n");
	}
}
*/

/*
package variableChar;                    
import java.io.IOException;
public class variableChar {
	public static void main(String[] args) {
		char caracter= ' ';
		System.out.print("Teclea caracter? ");
		try {
		caracter = (char) System.in.read();
		}catch(IOException ioe) {}
		System.out.println("\nEl caracter tecleado es: "+caracter);
		if (Character.toUpperCase(caracter) == 'W')
			System.out.println("\n\tAcertaste\n");
		else
			System.out.println("\n\tFollaste\n");
	}
}
*/

/*
package variableChar;                    
import java.io.IOException;
public class variableChar {
	public static void main(String[] args) {
		char caracter= ' ';
		System.out.print("Teclea caracter? ");
		try {
		caracter = (char) System.in.read();
		}catch(IOException ioe) {}
		caracter = Character.toUpperCase(caracter);     //Me lo modifica y saca la mayus.
		System.out.println("\nEl caracter tecleado es: "+caracter);
		if (Character.toUpperCase(caracter) == 'W')
			System.out.println("\n\tAcertaste\n");
		else
			System.out.println("\n\tFollaste\n");
	}
}
*/

/*
package variableChar;                    
import java.io.IOException;
public class variableChar {
	public static void main(String[] args) {
		char caracter= ' ';
		System.out.print("Teclea caracter? ");
		try {
		caracter = Character.toUpperCase((char) System.in.read());
		}catch(IOException ioe) {}
		System.out.println("\nEl caracter tecleado es: "+caracter);
		if (Character.toUpperCase(caracter) == 'W')
			System.out.println("\n\tAcertaste\n");
		else
			System.out.println("\n\tFollaste\n");
	}
}
*/

/*
package variableChar;                    
import java.io.IOException;
public class variableChar {
	public static void main(String[] args) {
		char caracter= ' ';
		System.out.print("Teclea caracter? ");
		try {
		caracter = Character.toLowerCase((char) System.in.read());
		}catch(IOException ioe) {}
		System.out.println("\nEl caracter tecleado es: "+caracter);
		if (caracter == 'w')
			System.out.println("\n\tAcertaste\n");
		else
			System.out.println("\n\tFollaste\n");
	}
}
*/

/*
package variableChar;                    
import java.io.IOException;
public class variableChar {
	public static void main(String[] args) {
		char caracter= ' ';
		System.out.print("Teclea caracter? ");
		try {
		caracter = Character.toLowerCase((char) System.in.read());
		}catch(IOException ioe) {}
		System.out.println("\nEl caracter tecleado es: "+caracter);
		if (caracter == 'w')
			System.out.println("\n\tAcertaste\n");
		else
			System.out.println("\n\tFollaste\n");
		
		if (Character.isLetter(caracter))
			System.out.println("\n\tEl caracter es una letra - "+Character.isLetter(caracter));
			else
				System.out.println("\n\tEl caracter NO es una letra - "+Character.isLetter(caracter));
	}
}
*/

package variableChar;                    
import java.io.IOException;
public class variableChar {
	public static void main(String[] args) {
		char caracter= ' ';
		System.out.print("Teclea caracter? ");
		try {
		caracter = Character.toLowerCase((char) System.in.read());
		}catch(IOException ioe) {}
		System.out.println("\nEl caracter tecleado es: "+caracter);
		if (caracter == 'w')
			System.out.println("\n\tAcertaste\n");
		else
			System.out.println("\n\tFallaste\n");
		
		if (Character.isLetter(caracter))
			System.out.println("\n\tEl caracter es una letra - "+Character.isLetter(caracter));
		else
			System.out.println("\n\tEl caracter NO es una letra - "+Character.isLetter(caracter));
		if (Character.isDigit(caracter))
			System.out.println("\n\tEl caracter es un número - "+Character.isDigit(caracter));
		else
			System.out.println("\n\tEl caracter NO es un número - "+Character.isDigit(caracter));
	}
}
