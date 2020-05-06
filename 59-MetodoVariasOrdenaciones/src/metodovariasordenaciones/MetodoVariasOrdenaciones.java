package metodovariasordenaciones;

import java.io.IOException;
import java.util.Scanner;


public class MetodoVariasOrdenaciones {
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
	static void llenarVector(Scanner e,datosPersona p[]) {
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
			p[ip]=new datosPersona(nombre,edad,sexo);
			}
	}
	void ordenar() {
		if con 3-4-5- para selecionnar o ordenamiento e facer metodo da burbuja
	}
	public static void main(String []args) {
		Scanner entrada=new Scanner(System.in);
		int opcion =0;
		datosPersona datospersona[]=new datosPersona[4];
		do {
			opcion=menu(entrada);
			switch(opcion) {
			case 1:
				llenarVector(opcion,datospersona);
				break;
			case 2:
				visualizarVector(opcion,datospersona);
				break;
			case 3:
				ordenar(opcion,datospersona);
				break;
			case 4:
				ordenar(opcion,datospersona);
				break;
			case 5:
				ordenar(opcion,datospersona);
				default:
					fin();
			}
		}while(opcion!=6);
		entrada.close();
	}
}
