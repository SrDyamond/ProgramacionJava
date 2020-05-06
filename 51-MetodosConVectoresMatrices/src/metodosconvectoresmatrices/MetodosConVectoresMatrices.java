package metodosconvectoresmatrices;

import java.util.Scanner;

public class MetodosConVectoresMatrices {
		static int menu(Scanner e) {
			int op=0;
			System.out.println("\n\tMENU\nt====\n");
			System.out.println("Llenar vector");
			System.out.println("Visualizar vector");
			System.out.println("Fin");
			do {
				System.out.print("Teclear opcion(1-3)");
				op=e.nextInt();
			}while(op<1 || op>3);
			return op;
		}
		static int[] llenarVector(Scanner e,int v[]) {
			int i=0;
			for (i=0;i<7;i++) {
				System.out.print("Teclee "+(i+1)+"º numero");
				v[i]=e.nextInt();
			}
			return v;
		}
		static void visualizarVector(int []v) {
			int i=0;
			for (i=0;i<7;i++) {
				System.out.println(v[i]);
			}
		}
		static void fin() {
				System.out.print("FINAL DEL PROGRAMA");
		}
	public static void main(String []args) {
		Scanner entrada=new Scanner(System.in);
		int opcion =0,vector []=new int[7];
		do {
			opcion=menu(entrada);
			switch(opcion) {
			case 1:
				vector=llenarVector(entrada,vector);
				break;
			case 2:
				visualizarVector(vector);
				break;
				default:
					fin();
			}
		}while(opcion!=3);
		entrada.close();
	}
}
