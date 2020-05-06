package arrayPersonasMascotasDuenos;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class ArrayPersonasMascotasDuenos {
	static final String ruta="C:\\Users\\dyang\\eclipse-workspace\\ArchivosDatos\\";
	static int menu(Scanner e) {
		int op = 0;
		System.out.println("\n\tMENU PRINCIPAL\n\t==============\n");
		System.out.println("1.-Altas personas.");
		System.out.println("2.-Altas mascotas.");
		System.out.println("3.-Visualizar personas.");
		System.out.println("4.-Visualizar mascotas.");
		System.out.println("5.-Crear dueños.");
		System.out.println("6.-Visualizar dueños");
		System.out.println("7.-Ordenar por nombre.");
		System.out.println("8.-Mascotas por dueño.");
		System.out.println("9.Introduce los Dueños y Mascotas en un fichero");
		System.out.println("10.Visualizar fichero");
		System.out.println("11.-Fin.\n");
		do {
			System.out.print("\tTeclee opción (1-9)? ");
			op = e.nextInt();
		}while(op<1 || op>11);
		return op;
	}
	static int menuOrdenar(Scanner e) {
		int op=0;
		System.out.println("\n\tMENU ORDENAR POR NOMBRE\n\t=======================\n");
		System.out.println("1.-De personas.");
		System.out.println("2.-De mascotas.");
		System.out.println("3.-Volver al  menú principal.\n");
		do {
			System.out.print("\tTeclee opción (1-3)? ");
			op = e.nextInt();
		}while(op<1 || op>3);
		return op;
	}
	
	static void altasPersonas(Scanner e,Personas p[]) {
		int i = 0;
		e.nextLine();
		String nombre = null,dni = null;
		System.out.println("\n\tALTAS PERSONAS\n\t==============\n");
		p[0] = new Personas("11111111P","Luis");
		p[1] = new Personas("22222222J","Sara");
		p[2] = new Personas("33333333L","María");
		p[3] = new Personas("44444444K","Carlota");
		p[4] = new Personas("12345678S","Fernando");
		p[5] = new Personas("98877665H","Clara");
		p[6] = new Personas("32211665C","Lara");
		p[7] = new Personas("23443211D","Alberto");
		p[8] = new Personas("11222211T","Ceferino");
		p[9] = new Personas("12344432R","Paula");
		
//		for(i=0;i<15;i++) {
//			System.out.print("Dni? ");
//			dni = e.nextLine();
//			System.out.print("Nombre? ");
//			nombre = e.nextLine();
//			p[i] = new Personas(dni,nombre);
//		}
	}
	static void altasMascotas(Scanner e,Mascotas m[]) {
		String nombre = null,dni = null;
		int edad = 0, i = 0;
		System.out.println("\n\tALTAS MASCOTAS\n\t==============\n");
		m[0] = new Mascotas("44444444K","Kira",5); 
		m[1] = new Mascotas("11111111P","Suca",3); 
		m[2] = new Mascotas("12344432R","Lia",7); 
		m[3] = new Mascotas("33333333L","Thor",11); 
		m[4] = new Mascotas("12345678S","Lukas",44); 
		m[5] = new Mascotas("11222211T","Sheldon",1); 
		m[6] = new Mascotas("12344432R","Pepa",4); 
		m[7] = new Mascotas("32211665C","Sugus",8); 
		m[8] = new Mascotas("44444444K","Lio",7); 
		m[9] = new Mascotas("11222211T","Joker",14); 
		m[10] = new Mascotas("11222211T","Tormenta",10); 
		m[11] = new Mascotas("23443211D","Luna",9); 
		m[12] = new Mascotas("22222222J","Pipo",2); 
		m[13] = new Mascotas("98877665H","Coco",2); 
		m[14] = new Mascotas("44444444K","Kira",5); 
//		for(i=0;i<15;i++) {
//			e.nextLine();
//			System.out.print("Dni? ");
//			dni = e.nextLine();
//			System.out.print("Nombre? ");
//			nombre = e.nextLine();
//			System.out.print("Edad? ");
//			edad = e.nextInt();
//			m[i] = new Mascotas(dni,nombre,edad);
//		}

	}
	static void visualizarPersonas(Personas p[]) {
		System.out.println("\n\tLISTADO PERSONAS\n\t================\n");
		for (int i= 0;i<10;i++)
			System.out.println(p[i].getDni()+"  "+p[i].getNombre());
		
	}
	static void visualizarMascotas(Mascotas m[]) {
		System.out.println("\n\tLISTADO MASCOTAS\n\t================\n");
		for (int i= 0;i<15;i++)
			System.out.println(m[i].getDni()+"  "+m[i].getNombre()+"   "+m[i].getEdad());
	}
	static void crearDuenos(Personas p[],Mascotas m[],Duenos d[]) {
		int ip = 0,im = 0, id = 0;
		System.out.println("\n\tCreando dueños....");
		for(ip=0;ip<10;ip++) {
			for(im=0;im<15;im++) {
				if(p[ip].getDni()==m[im].getDni())
					 d[id++] = new Duenos(p[ip].getDni(),p[ip].getNombre(),m[im].getNombre(),m[im].getEdad());
			}
		}
		System.out.println("Dueños creado.....\n");
	}
	static void visualizarDuenos(Duenos d[]) {
		System.out.println("\n\tLISTADO DUEÑOS\n\t==============\n");
		for (int i= 0;i<15;i++)
			System.out.println(d[i].getDni()+"  "+d[i].getNombreP()+"   "+d[i].getNombreM()+"   "+d[i].getEdad());
	}
	static void ordenarPorNombre(Duenos d[],int to) {
		int i1 = 0, i2 = 0;
		Duenos aux = new Duenos();
		for(i1=0;i1<14;i1++) {
			for(i2=i1+1;i2<15;i2++) {
				if (to==1 && d[i1].getNombreP().compareToIgnoreCase(d[i2].getNombreP())>0|| to==2 && d[i1].getNombreM().compareToIgnoreCase(d[i2].getNombreM())>0){
					aux = d[i1];
					d[i1]=d[i2];
					d[i2]=aux;
				}
			}
		}
	}
	static void ordenarPorDni(Duenos d[]) {
		int i1=0,i2=0;
		Duenos aux = new Duenos();
		for(i1=0;i1<14;i1++) {
			for(i2=i1+1;i2<15;i2++) {
				if(d[i1].getDni().compareToIgnoreCase(d[i2].getDni())>0) {
					aux = d[i1];
					d[i1]=d[i2];
					d[i2]=aux;	
					}
			}
		}
	}
	static void mascotasPorDueno(Duenos d[]) {
		String dniAux = null;
		int contador = 0,i = 0;
		ordenarPorDni(d);
		System.out.println("\n\tMASCOTA POR DUEÑO\n\t=================\n");
		dniAux = d[0].getDni();
		for(i=0;i<15;i++) {
			if(!dniAux.equalsIgnoreCase(d[i].getDni())) {
				System.out.println(d[i-1].getNombreP()+"\t"+contador);
				dniAux = d[i].getDni();
				contador=0;
			}
			contador++;
		}
		System.out.println(d[i-1].getNombreP()+"\t"+contador);
	}
	static void enFichero(Duenos d[]) {
		String dni="",nombrep="",nombrem="",edadN="";
		int edad=0;
		int i=0;
		try {
		BufferedWriter esc = new BufferedWriter(new FileWriter(ruta + "dueñosmascota.txt"));
		for(i=0;i<d.length;i++) {
			
			esc.write(d[i].getDni());
			esc.newLine();
			esc.write(d[i].getNombreP());
			esc.newLine();
			esc.write(d[i].getNombreM());
			esc.newLine();
			esc.write(String.valueOf(d[i].getEdad()));
			//El getEdad es int y lo pasamos a String
			//Con Integer.parseInt(el valor) pasa de String a int.
			esc.newLine();
		}
		esc.close();
		}catch(IOException ioe) {}
		
	}
	static void visualizarFich() {
		String frase = "";
		System.out.println("Archivo de Dueños y Mascotas");
		try {
			BufferedReader lec = new BufferedReader(new FileReader(ruta + "dueñosmascota.txt"));
			frase = lec.readLine();
			while (frase != null) {
				System.out.println(frase);
				frase = lec.readLine();
			}
			System.out.println("\n");
			lec.close();
		} catch (IOException ioe) {
		}
		System.out.println("\n");
	}
	static void fin() {
		System.out.println("\n\n\n\tFIN DEL PROGRAMA\n\t================\n");
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Personas persona[] = new Personas[10];
		Mascotas mascota[] = new Mascotas[15];
		Duenos dueno[] = new Duenos[15];
		int opcion = 0,o=0;
		do {
			opcion = menu(entrada);
			switch(opcion) {
			case 1:
				altasPersonas(entrada,persona);
				break;
			case 2:
				altasMascotas(entrada,mascota);
				break;
			case 3:
				visualizarPersonas(persona);
				break;
			case 4: 
				visualizarMascotas(mascota);
				break;
			case 5:
				crearDuenos(persona,mascota,dueno);
				break;
			case 6:
				visualizarDuenos(dueno);
				break;
			case 7:
				do {
					o=menuOrdenar(entrada);
					switch(o) {
					case 1:
						ordenarPorNombre(dueno,o);
						break;
					case 2:
						ordenarPorNombre(dueno,o);
						break;
					}
				}while(o!=3);
				break;
			case 8:
				mascotasPorDueno(dueno);
				break;
			case 9:
				enFichero(dueno);
				break;
			case 10:
				visualizarFich();
				break;
				default:
				fin();
			}
		}while(opcion != 11);
		entrada.close();
	}
}
