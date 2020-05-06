package metodosconvectoresordenacionbusqueda;

import java.util.Scanner;

public class MetodosConVectoresOrdenacionBusqueda {
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
		}while(op<1 || op>5);
		return op;
	}
	static int[] llenarVector(Scanner e,int v[]) {
		int i=0;
		for (i=0;i<10;i++) {
			System.out.print("Teclee "+(i+1)+"º numero");
			v[i]=e.nextInt();
		}
		return v;
	}
	static void visualizarVector(int []v) {
		int i=0;
		for (i=0;i<10;i++) {
			System.out.print(v[i]);
		}
	}
	static void fin() {
			System.out.print("FINAL DEL PROGRAMA");
	}
	static int[] ordenarVector(int v[]) {
		int i=0,e=0,aux=0;
		for (i=0;i<9;i++) {
			for(e=(i+1);e<10;e++) {
				if (v[i]<v[e]) {
					aux=v[i];
					v[i]=v[e];
					v[e]=aux;
				}
			}
		}
		for(i=0;i<10;i++) {
		System.out.print(v[i]);
		}
		return v;
	}
	static void busquedaDicotomica(Scanner e,int v[]) {
		int iz=0,id=9,im=0,nb=0;
		boolean encontrado=false;
		System.out.print("Teclea o numero a buscar");
		nb=e.nextInt();
		do {
		im = (iz + id)/2;
		if(v[im]==nb) {
			encontrado = true;
		}
		else {
			if (nb > v[im])
				iz=im+1;
			else
				id=im-1;
					
		}
	}while(iz<=id && !encontrado);
	
	if (encontrado)
		System.out.println("\nEl número "+nb+" SI está en la lista.");
	else
		System.out.println("\nEl número "+nb+" NO está en la lista.");
	}
			
public static void main(String []args) {
	Scanner entrada=new Scanner(System.in);
	int opcion =0,vector []=new int[10];
	do {
		opcion=menu(entrada);
		switch(opcion) {
		case 1:
			vector=llenarVector(entrada,vector);
			break;
		case 2:
			visualizarVector(vector);
			break;
		case 3:
			ordenarVector(vector);
			break;
		case 4:
			busquedaDicotomica(entrada,vector);
			break;
			default:
				fin();
		}
	}while(opcion!=5);
	entrada.close();
}
}

