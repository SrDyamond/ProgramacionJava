package examen2Practica4_Cadenas;
import java.util.Scanner;
public class Examen2Practica4_Cadenas {
	
	public static void contador(String palabra1,String palabra2) {
		int cont=0,i=0,cont1=0,cont2=0;
		char letra=' ';
		for(i=0;i<palabra1.length();i++) {
			letra=palabra1.charAt(i);
			if(letra!=' ' && letra!=palabra1.length()-1) {
				cont1++;
			}	
		}
		for(i=0;i<palabra2.length();i++) {
			letra=palabra2.charAt(i);
			if(letra!=' ' && letra!=palabra2.length()-1) {
				cont2++;
			}	
		}
		if (cont1>cont2) {
			cont=cont1;
		 System.out.println("La palabra mas grande es "+palabra1+" con "+cont1+" caracteres");
		
		}else {
			cont=cont2;
		 System.out.println("La palabra mas grande es "+palabra2+" con "+cont2+" caracteres");
		}

	}
	
	
	public static void main (String []args) {
		Scanner entrada=new Scanner(System.in);
		String palabra1="",palabra2="";
		int contador=0;
		System.out.println("Introduce a primeira palabra");
		palabra1=entrada.nextLine();
		System.out.println("Introduce a segunda palabra");
		palabra2=entrada.nextLine();
		contador(palabra1,palabra2);
		
		
		
		
	}
}
