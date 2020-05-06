package pexamen_vector_char_reves;
import java.io.IOException;
public class Pexamen_Vector_Char_Reves {
	static public void main (String [] args) {
		char m[] = new char [6];
		int i=0;
		
		for (i=0;i<6;i++)
			do {
				System.out.print((i+1)+"ª letra? ");//sirve como un scanner'???
				try {
					m[i]=(char) System.in.read();
					while(System.in.read() != '\n');
				}catch(IOException ioe) {}
			}while (!Character.isLetter(m[i]));}
	}
