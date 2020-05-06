package PokimonImos;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.NullPointerException;
//quiero un menú capturar pokimon listar pokimons de entrenador(opcion para volcar a archivo) datos a partir de un archivo
public class pokimonImos {
	static int menu(Scanner e) {
		int op=0;
		do {
			System.out.println("MENÚ");
			System.out.println("====");
			System.out.println("1.-Capturar POKÉMON");
			System.out.println("2.-Lista de POKÉMON");
			System.out.println("3.-Importar equipo");
			System.out.println("0.-Salir");
			op=e.nextInt();
		}while(op>3 || op<0);
		e.nextLine();
		return op;
	}
	
	static void cp(Scanner e,Pokimon equipo[]) {
		String nombre="",tipo="",fecha="";
		float peso=0,altura=0;
		int ps=0,nivel=0,i=0;
		char genero=' ';
		
		System.out.println("Introduce o nombre do POKÉMON");
		nombre=e.nextLine();
		while((!nombre.equalsIgnoreCase("Se Acabo")) || (i==5)) {
			System.out.println("Introduce o peso do POKÉMON");
			peso=e.nextFloat();
			e.nextLine();
			System.out.println("Introduce a altura do POKÉMON");
			altura=e.nextFloat();
			e.nextLine();
			System.out.println("Introduce o/s tipo/s do POKÉMON");
			tipo=e.nextLine();
			System.out.println("Introduce a fecha de captura do POKÉMON");
			fecha=e.nextLine();
			System.out.println("Introduce o genero que asumes que ten o teu POKÉMON");
			try {
				genero = (char) System.in.read();
				while(System.in.read()!='\n');
			} catch (IOException ioe) {}
			System.out.println("Introduce os puntos de saude do teu poquemon");
			ps=e.nextInt();
			e.nextLine();
			System.out.println("Introduce o nivel do POKÉMON");
			nivel=e.nextInt();
			e.nextLine();
			equipo[i]=new Pokimon(nombre,peso,altura,tipo,fecha,genero,ps,nivel);
			System.out.println("Introduce o nombre do POKÉMON");
			nombre=e.nextLine();
			i++;
		}
	}
	
	static void vp(Scanner e, Pokimon equipo[]) {
		int i=0;
		char res=' ';
		
		do {
			try {
				System.out.println(equipo[i].getNombre());
				System.out.println(equipo[i].getPeso());
				System.out.println(equipo[i].getAltura());
				System.out.println(equipo[i].getTipo());
				System.out.println(equipo[i].getFecha());
				System.out.println(equipo[i].getGenero());
				System.out.println(equipo[i].getPs());
				System.out.println(equipo[i].getNivel());
				i++;
			}catch(java.lang.NullPointerException nul) {break;}
		}while(true);
		
		System.out.println("Queres gardar este equipo wapo wapo?(s/n)");
		try {
			res = (char) System.in.read();
			while(System.in.read()!='\n');
		} catch (IOException ioe) {}
		
		if (Character.toLowerCase(res)=='s')
			gardar(equipo);
	}
	
	static void gardar(Pokimon equipo[]) {
		int i=0;
		try {
			BufferedWriter esc=new BufferedWriter(new FileWriter("c:\\ArchivosDatos\\Equipin.txt"));
			do{
				try {
							esc.write(equipo[i].getNombre());
							esc.newLine();
							esc.write(Float.toString(equipo[i].getPeso()));
							esc.newLine();
							esc.write(Float.toString(equipo[i].getAltura()));
							esc.newLine();
							esc.write(equipo[i].getTipo());
							esc.newLine();
							esc.write(equipo[i].getFecha());
							esc.newLine();
							esc.write(Character.toString(equipo[i].getGenero()));
							esc.newLine();
							esc.write(Integer.toString(equipo[i].getPs()));
							esc.newLine();
							esc.write(Integer.toString(equipo[i].getNivel()));
							esc.newLine();
							i++;
				}catch(java.lang.NullPointerException nul) {break;};
			}while(true);
			esc.close();
		}catch(IOException ioe) {}
	}
	
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int i=0,op=0;
		Pokimon equipo[]=new Pokimon[5];
		do {
			op=menu(e);
			switch(op) {
				case 1:
					cp(e,equipo);
					break;
				case 2:
					vp(e,equipo);
					break;
			}
		}while(op!=0);
	}
}
