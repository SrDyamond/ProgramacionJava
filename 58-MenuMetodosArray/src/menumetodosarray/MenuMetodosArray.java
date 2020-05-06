package menumetodosarray;

import java.io.IOException;
import java.util.Scanner;
public class MenuMetodosArray {
	static int menu(Scanner e) {
		int op=0;
		System.out.println("\n\tMENU\n\t====\n");
		System.out.println("Llenar vector");
		System.out.println("Visualizar vector");
		System.out.println("Ordenación");
		System.out.println("Busqueda Dicotomica");
		System.out.println("Fin");
		do {
			System.out.print("Teclear opcion(1-5)");
			op=e.nextInt();
		}while(op<1 || op>6);
		return op;
	}
	static void llenarVector(Scanner e,Personas p[]) {
		Scanner entrada=new Scanner(System.in);
		String nombre="";
		int edad=0;
		char sexo=' ';
		int ip=0;
		for(ip=0;ip<4;ip++) {
			entrada.nextLine();
			System.out.print("Nombre....?");
			nombre=entrada.nextLine();
			System.out.println("Edad....?");
			edad=entrada.nextInt();
			
			do {
				try {
				System.out.println("Sexo....?");
				sexo=(char)Character.toUpperCase(System.in.read());
				while(System.in.read() != '\n');
				}catch(IOException ioe) {}
			}while(sexo!='V' && sexo!='M');
			p[ip]=new Personas(nombre,edad,sexo);
			}
	}
	void visualizarVector(Personas p[]) {
		for (int ip=0;ip<4;ip++)
			System.out.println("Nombre=>...."+p[ip].getNombre()+"Edad=>...."+p[ip].getEdad()+"Sexo....=>"+p[ip].getSexo());
	}
	void ordenarNombre(Personas p[]) {
		int ip=0,ipo=0;
		String aux="";
		for (ip=0;ip<3;ip++)
			for(ipo=(ip+1);ipo<4;ipo++) {
				if(p[ip].getNombre().compareToIgnoreCase(p[ipo].getNombre())>0) {
					aux=p[ip];
					p[ip]=p[ipo];
					p[ipo]=aux;
				}
			}
	}
	void ordenarEdad() { 
		
	}
	void agruparSexo() {
		
	}
	void fin() {
		System.out.println("Fin del programa");
	}
	public static void main(String []args) {
		Scanner entrada=new Scanner(System.in);
		int opcion =0;
		Personas personas[]=new Personas[4];
		do {
			opcion=menu(entrada);
			switch(opcion) {
			case 1:
				llenarVector(entrada,personas);
				break;
			case 2:
				visualizarVector(personas);
				break;
			case 3:
				ordenarNombre(personas);
				break;
			case 4:
				ordenarEdad(personas);
				break;
			case 5:
				agruparSexo(personas);
				default:
					fin();
			}
		}while(opcion!=6);
		entrada.close();
	}
	}