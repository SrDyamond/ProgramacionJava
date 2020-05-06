package pexamen_llenado_vector_string_ordenacion;
import java.util.Scanner;
public class Pexamen_Llenado_Vector_String_Ordenacion {
	public static void main (String []args) {
		Scanner sc=new Scanner(System.in);
		String nome[] =new String [7],nomeaux =" ";
		int i=0,e=0;
		
		for (i=0;i<7;i++) {
			System.out.print("Inserta os nombres");
				nome[i]=sc.nextLine();
		}
				
		for (i=0;i<7;i++)
			System.out.println(nome[i]);
		
		System.out.println("\n");
		for(i=0;i<6;i++) {
			for (e=i+1;e<7;e++) {
				if (nome[i].compareToIgnoreCase(nome[e])>0) {
					nomeaux=nome[i];
					nome[i]=nome[e];
					nome[e]=nomeaux;
				}	
			}
		}
	
		for (i=0;i<7;i++)
			System.out.println(nome[i]);
		
		
		
		sc.close();
}

}
