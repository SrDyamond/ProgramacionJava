//Llenar vector con cinco letras y representarlas al revés y en vertical.
//Segundo paso -> Que sólo admita letras.
//Función de carácter que me dice si es una letra o si no es una letra.
package vectorCharLetrasReves;
import java.io.IOException;
public class vectorCharLetrasReves {
	public static void main (String[] args) {
	char letra[] = new char[5];
	int i=0;
	for(i=0;i<5;i++) {
		do {
			System.out.print((i+1)+"ª letra? ");
			try {
				letra[i]=(char) System.in.read();
				while(System.in.read() != '\n');
			}catch(IOException ioe) {}
		}while (!Character.isLetter(letra[i]));}
	System.out.print("\n");
	for(i=4;i>=0;i--)
		System.out.println(letra[i]);
	}
}
