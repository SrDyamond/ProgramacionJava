package palindromo_while;

import java.util.Scanner;

public class Palindromo_While {
	static public void main (String []args ) {
		        Scanner sc= new Scanner(System.in);
		        System.out.print("Introduce una frase (puede tener puntos, comas y espacios): ");
		        String s=sc.nextLine();
		        int fin = s.length()-1;
		        int ini=0;
		        boolean espalin=true;
		        
		        s=s.replace(" ", "");
		        s=s.replace(",", "");
		        s=s.replace(".", "");
		        s=s.toLowerCase();
		        System.out.print(s);
		       
		        while(ini < fin){
		            if(s.charAt(ini)!=s.charAt(fin)){
		                espalin=false;
		            }
		            ini++;
		            fin--;
		        	}
		        if(espalin)
		            System.out.print("\nEs palindromo.");
		        else
		            System.out.print("\nNo es palindromo.");
		        
		        sc.close();
		    }
		}
