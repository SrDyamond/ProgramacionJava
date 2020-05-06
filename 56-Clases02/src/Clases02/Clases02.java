package Clases02;
import java.util.Scanner;
import java.io.IOException;
public class Clases02 {
	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		String nombre =null,aux="";
		int edad=0,ip=0,ep=0;
		char sexo=' ';
		Persona persona[]=new Persona[4];
		for(ip=0;ip<4;ip++) {
		System.out.print("Nombre....?");
		nombre=entrada.nextLine();
		System.out.println("Edad....?");
		edad=entrada.nextInt();
		entrada.nextLine();
		do {
			try {
			System.out.println("Sexo....?");
			sexo=Character.toUpperCase((char)System.in.read());
			while(System.in.read() != '\n');
			}catch(IOException ioe) {}
		}while(sexo!='V' && sexo!='M');
		persona[ip]=new Persona(nombre,edad,sexo);
		}
		
		for(ip=0;ip<4;ip++)
			System.out.println("\nNombre=>"+persona[ip].getNombre()+"\nEdad=>"+persona[ip].getEdad()+"\nSexo=>"+persona[ip].getSexo());
			
		for(ip=0;ip<3;ip++)
			for(ep=(ip+1);ep<4;ep++)
				if(persona[ip].nombre=>persona[ep].nombre) {
					aux=persona[ip].nombre;
					persona[ip].nombre=persona[ep].nombre;
					persona[ep].nombre=aux;
				}
		
		entrada.close();
	}

}


