package claseLibro;

import java.util.Scanner;

public class ClaseLibro {
	static int menu(Scanner e) {
		int op=0;
		System.out.println("1-Altas array");
		System.out.println("2-Visualizar array");
		System.out.println("3-Ordenar");
		System.out.println("4-Fin");
		do {
			System.out.println("Teclea a opcion.(Fin para finalizar");
			op=e.nextInt();
		}while(op<1 || op>4);
		return op;
	}
	
	static void menuAux(Scanner e,Libro arrLibro[]) {
		int op=0;
		do {
		System.out.println("1-Ordenar por Titulo");
		System.out.println("2-Ordenar por Autor");
		System.out.println("3-Ordenar por Precio");
		System.out.println("4-Volver al menu anterior");
		System.out.println("Teclea a opcion.(Fin para finalizar");
			op=e.nextInt();
		switch (op) {
		case 1:
			titulo(arrLibro);
			break;
		case 2:
			autor(arrLibro);
			break;
		case 3:
			precio(arrLibro);
			break;
		}
			
		}while(op!=4);
		
	}
	
	public static Libro[] titulo(Libro arrLibro[]) {
		Libro aux = null;
		int i = 0, e = 0;
		for (i = 0; i < arrLibro.length - 1; i++) {
			for (e = i + 1; e < arrLibro.length; e++) {
				if (
					(arrLibro[i].getTitulo().compareTo(arrLibro[e].getTitulo()) > 0)) 
				{
					aux = arrLibro[i];
					arrLibro[i] = arrLibro[e];
					arrLibro[e] = aux;
				}
			}
		}
		return arrLibro;
	}
	
	public static Libro[] autor(Libro arrLibro[]) {
		Libro aux = null;
		int i = 0, e = 0;
		for (i = 0; i < arrLibro.length - 1; i++) {
			for (e = i + 1; e < arrLibro.length; e++) {
				if (
					(arrLibro[i].getAutor().compareTo(arrLibro[e].getAutor()) > 0)) 
				{
					aux = arrLibro[i];
					arrLibro[i] = arrLibro[e];
					arrLibro[e] = aux;
				}
			}
		}
		return arrLibro;
	}
	public static Libro[] precio(Libro arrLibro[]) {
		Libro aux = null;
		int i = 0, e = 0;
		for (i = 0; i < arrLibro.length - 1; i++) {
			for (e = i + 1; e < arrLibro.length; e++) {
				if (arrLibro[i].getPrecio() > arrLibro[e].getPrecio()) {
					aux = arrLibro[i];
					arrLibro[i] = arrLibro[e];
					arrLibro[e] = aux;
				}
			}
		}
		return arrLibro;
	}
	
	/////////////////////////////LLENARARRAY\\\\\\\\\\\\\\\\\\\\\\
	public static Libro[] llenarArray() {
		Libro arrLibro[] = new Libro[20];
		
		arrLibro[0] = new Libro("0-261-10320-2","Sin titulo","John Ronald Reuel Tolkien","Fantástica",(float)21.99);
		arrLibro[1] = new Libro("84-0133-720-8","El nombre del viento","Patrick Rothfuss","Novela",(float)22.9);
		arrLibro[2] = new Libro("84-01-42282-5","Fahrenheit 451","Ray Bradbury","Novela",(float)6);
		arrLibro[3] = new Libro("84-01-49136-3","Fundación","Isaac Asimov","Novela",(float)9.95);
		arrLibro[4] = new Libro("84-01-49654-3","Los límites de la Fundación","Isaac Asimov","Novela",(float)11.95);
		arrLibro[5] = new Libro("84-08-08925-4","El Símbolo Perdido","Dan Brown","Novela",(float)21.9);
		arrLibro[6] = new Libro("08-1137-542-X","Análisis estructurado moderno","Edward Fraguez","Ensayo",(float)28);
		arrLibro[7] = new Libro("84-16288-95-3","El honor de Dios","Lidia Falcó O'Neil","Narrativa",(float)26);
		arrLibro[8] = new Libro("84-204-0494-3","Cuando ya no importe","Juan Carlos Onetti","Novela",(float)16);
		arrLibro[9] = new Libro("84-206-3311-9","El Aleph","Jorge Luís Borges","Relato Corto",(float)9);
		arrLibro[10] = new Libro("84-207-2634-6","El sí de las niñas","Leando Fernández Mortatín","Teatro",(float)6);
		arrLibro[11] = new Libro("84-226-6412-7","Negreros","Alberto Vázquez Figueroa","Novela",(float)9.75);
		arrLibro[12] = new Libro("84-233-1157-0","El tiempo","Ana María Matute","Novela",(float)6);
		arrLibro[13] = new Libro("84-2334-161-0","La reina en el palacio de la corrientes de aire","Stieg Larsson","Novela",(float)22.5);
		arrLibro[14] = new Libro("84-239-9486-4","Ficciones","Jorge Luís Borges","Relato Corto",(float)6.5);
		arrLibro[15] = new Libro("84-246-8013-5","Bollos preñados","Karlos Arguiñano","Ensayo",(float)9.95);
		arrLibro[16] = new Libro("84-310-3074-0","Tokio Blues","Haruki Murakami","Novela",(float)21.5);
		arrLibro[17] = new Libro("84-339-2158-3","El antropólogo inocente","Nigel Barley","Ensayo",(float)18);
		arrLibro[18] = new Libro("84-350-3467-4","La muerte en Venecia","Thomas Mann","Novela",(float)12);
		arrLibro[19] = new Libro("84-376-0092-8","La vida es sueño","Pedro Calderón de la Barca","Teatro",(float)6.9);
		return arrLibro;
	}
	///////////////////////////VISUALIZACIO\\\\\\\\\\\\\\\\\\\\\\\
	static void visualizarArray(Libro arrLibro[]) {
		int i=0;
		for (i=0;i<20;i++) {
			System.out.println(arrLibro[i].infoTabulada());
		}
	}
	//////////////////////////////FIN\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	static void fin() {
		System.out.println("FIN DEL PROGRAMA");
	}
	///////////////////////////////MAIN\\\\\\\\\\\\\\\\\\\\\\\\\\\
	public static void main (String []args) {
		Scanner entrada=new Scanner(System.in);
		int opcion=0;
		Libro arrLibro[]=new Libro[20];
		do {
			opcion=menu(entrada);
			switch (opcion) {
			case 1:
				arrLibro=llenarArray();
				break;
			case 2:
				visualizarArray(arrLibro);
				break;
			case 3:
				menuAux(entrada,arrLibro);
				break;
			default:
				fin();
				
			}
		}while (opcion!=4);
		entrada.close();
	}
}
