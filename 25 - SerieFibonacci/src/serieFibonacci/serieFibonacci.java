/*
package serieFibonacci;
import java.io.IOException;
import java.util.Scanner;
public class serieFibonacci {
	public static void main (String[] args) {
		Scanner e = new Scanner (System.in);
		int limite = 0;
		char otro = ' ';
		do {
			int n1=0,n2=1,num=1;
			System.out.print("\nTeclea límite? ");
			limite = e.nextInt();
			System.out.println("\n\n");
			System.out.print(n1+"\t");
			do {
				System.out.print(num +"\t");
				num = n1 + n2;
				n1 = n2;
				n2 = num;
			} while(n2<=limite);
			System.out.println("\n\n");
			do {
				System.out.print("\tOtra serie (s/n);? ");
				try {
					otro = Character.toLowerCase((char) System.in.read()); // lee el codigo,lo paso a caracter, lo convierto en minúsculas y lo guardo en otro.
							while (System.in.read()!='\n');
				}catch(IOException ioe) {}
			}while(otro!='s'&& otro!='n');
		}while(otro == 's');
		System.out.println("\n\n\tFIN DEL PROGRAMA");
		e.close();
	}	
}
*/

/*//Bucle infinito OR
package serieFibonacci;
import java.io.IOException;
import java.util.Scanner;
public class serieFibonacci {
	public static void main (String[] args) {
		Scanner e = new Scanner (System.in);
		int limite = 0;
		char otro = ' ';
		do {
			int n1=0,n2=1,num=1;
			System.out.print("\nTeclea límite? ");
			limite = e.nextInt();
			System.out.println("\n\n");
			System.out.print(n1+"\t");
			do {
				System.out.print(num +"\t");
				num = n1 + n2;
				n1 = n2;
				n2 = num;
			} while(n2<=limite);
			System.out.println("\n\n");
			do {
				System.out.print("\tOtra serie (s/n);? ");
				try {
					otro = Character.toLowerCase((char) System.in.read()); // lee el codigo,lo paso a caracter, lo convierto en minúsculas y lo guardo en otro.
							while (System.in.read()!='\n');
				}catch(IOException ioe) {}
			}while(otro!='s'|| otro!='n');
		}while(otro == 's');
		System.out.println("\n\n\tFIN DEL PROGRAMA");
		e.close();
	}	
}
*/

package serieFibonacci;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Scanner;
public class serieFibonacci {
	public static void main (String[] args) {
		Scanner e = new Scanner (System.in);
		int limite = 0;
		char otro = ' ';
		do {
			int n1=0,n2=1,num=1;
			try {
			System.out.print("\nTeclea límite? ");
			limite = e.nextInt();
			}catch(InputMismatchException ime) {
				limite=10;
				e.nextLine();
			}	
			System.out.println("\n\n");
			System.out.print(n1+"\t");
			do {
				System.out.print(num +"\t");
				num = n1 + n2;
				n1 = n2;
				n2 = num;
			} while(n2<=limite);
			System.out.println("\n\n");
			do {
				System.out.print("\tOtra serie (s/n);? ");
				try {
					otro = Character.toLowerCase((char) System.in.read()); // lee el codigo,lo paso a caracter, lo convierto en minúsculas y lo guardo en otro.
							while (System.in.read()!='\n');
				}catch(IOException ioe) {}
			}while(otro!='s'&& otro!='n');
		}while(otro == 's');
		System.out.println("\n\n\tFIN DEL PROGRAMA");
		e.close();
	}	
}
