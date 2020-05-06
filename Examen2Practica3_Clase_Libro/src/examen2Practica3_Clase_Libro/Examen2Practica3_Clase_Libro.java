package examen2Practica3_Clase_Libro;
import java.util.Scanner;
import java.io.IOException;
//import java.io.*;
public class Examen2Practica3_Clase_Libro {
	///////MENU
	//1Altas libros
	//2Visualizar libros
	//3Ordenar libros
		//MenuOrdenar
		//1ISBN
		//2Nombre
		//3Autor
		//4Precio
		//5Sair
	//4Fin programa
	//MENU
	public static int menu(Scanner e) {
		int op=0;
		System.out.println("=====MENU=====");
		System.out.println("1.Altas");
		System.out.println("2.Visualizar");
		System.out.println("3.Menu ordenacion");
		System.out.println("4.Fin del menu");
		do {
		System.out.println("\n");
		op=e.nextInt();
		}while (op<1 || op >4);//O MESMO RANGO QUE OPCIONS EXISTEN
		return op;
	}
	//MENUAUXILIAR
	public static int menuAux(Scanner e) {
		int op=0;
		System.out.println("=====MENU ORDENACIÓN=====");
		System.out.println("1.ISBN");
		System.out.println("2.Titulo");
		System.out.println("3.Autor");
		System.out.println("4.Precio");
		System.out.println("5.Menu anterior");
		do {
			System.out.println("Presione a tecla indicada"+"\npara o tipo de ordenacion");
			op=e.nextInt();
		}while(op<1 || op >5);//O MESMO RANGO QUE OPCIONS EXISTEN
		return op;
	}
	
	//ALTAS
	public static void altas(Scanner e,libro l[]) {
//		int i=0;
//		String isbn = "", titulo = "", autor = "", editorial = "";
//		float precio = 0;
		e.nextLine();
		System.out.println("Metodo para a alta de libros");
		l[0]=new libro("63636","Anillo","Manu","CAPA",13);
		l[1]=new libro("82342","Bonar","Pepe","CASA",45);
//		for (i = 0; i < l.length; i++) {
//			e.nextLine();
//			do {
//				System.out.println("Inserte o isbn do libro");
//				isbn = e.nextLine();
//			} while (isbn.length() > 6);
//			do {
//				System.out.println("Inserte o titulo do libro");
//				titulo = e.nextLine();
//			} while (titulo.length() > 10);
//			System.out.println("Inserte o nome d@ aut@r");
//			autor = e.nextLine();
//			System.out.println("Inserte o nome da editorial");
//			editorial = e.nextLine();
//			System.out.println("Inserte o precio");
//			precio = e.nextFloat();
//			l[i] = new libro(isbn, titulo, autor, editorial, precio);//INSTANCIAMOS O FINAL
//		}
	}
	//VISUALIZAR
	public static void visualizar(libro l[]) {
		int i=0;
		for(i=0;i<l.length;i++)
			System.out.println(l[i].toString());
	}
	//ORDENACION
	public static void ordenar(libro l[],int op) {
		int i = 0, e = 0;
		libro aux = new libro();
		for (i = 0; i < l.length - 1; i++) {
			for (e = (i + 1); e < l.length; e++){
				if (op == 1 && l[i].getIsbn().compareToIgnoreCase(l[e].getIsbn()) > 0) {
					//ORDENAMOS DE MENOR A MAYOR CON >
					aux = l[i];
					l[i] = l[e];
					l[e] = aux;
				}
				if (op == 2 && l[i].getTitulo().compareToIgnoreCase(l[e].getTitulo()) > 0) {
					aux = l[i];
					l[i] = l[e];
					l[e] = aux;
				}
				if (op == 3 && l[i].getAutor().compareToIgnoreCase(l[e].getAutor()) > 0) {
					aux = l[i];
					l[i] = l[e];
					l[e] = aux;
				}

				if (op == 4 && l[i].getPrecio() < l[e].getPrecio()) {
					//ORDENA DE MAYOR A MENOR <
					aux = l[i];
					l[i] = l[e];
					l[e] = aux;
				}
			}
		}
	}
	//FIN
	public static void fin() {
		System.out.println("FIN DEL PROGRAMA");
	}
	//MAIN
	public static void main (String []args) {
		Scanner entrada=new Scanner(System.in);
		int opcion=0,opcion2=0;
		libro l[]=new libro[2];
		do {
			opcion=menu(entrada);
			switch(opcion) {
			case 1:
				altas(entrada,l);
				break;
			case 2:
				visualizar(l);
				break;
			case 3:
				do {
				opcion2=menuAux(entrada);
				switch(opcion2) {
				case 1:
					ordenar(l,opcion2);
					break;
				case 2:
					ordenar(l,opcion2);
					break;
				case 3:
					ordenar(l,opcion2);
					break;
				case 4:
					ordenar(l,opcion2);
					break;
					}
				}while(opcion2!=5);//UNHA MAIS CA OPCION PARA USALA PARA SAIR
				default:
					fin();
			}
			
		}while(opcion!=4);//UNHA MAIS CA OPCION PARA USALA PARA SAIR
	}
}
