package amoMascota;

import java.util.Scanner;

public class AmoMascota {
	
	public static final String finAltas = "fin";
	public static final int nMaxOpt = 8;
	
	// --- INTERFAZ DE USUARIO -------------------------------------------------

	public static void printMenu() {
		System.out.println();
		System.out.println("--- MENU ---");
		System.out.println("  1 - Altas amos (auto)");
		System.out.println("  2 - Altas amos (manual)");
		System.out.println("  3 - Altas mascotas (auto)");
		System.out.println("  4 - Altas mascotas (manual)");
		System.out.println("  5 - Visualizar amos");
		System.out.println("  6 - Visualizar mascotas");
		System.out.println("  7 - Vincular mascota con amo");
		System.out.println("  8 - Vusualizar vinculación");
		System.out.println("  9 - Ordenar");
		System.out.println(" 10 - Visualizar num masc. por amo");
		System.out.println();
		System.out.println("  0 - Salir");
		System.out.println();
	}
	
	public static void printMenuOrd() {
		System.out.println();
		System.out.println("--- MENU ---");
		System.out.println(" 1 - Altas dueños (manual)");
		System.out.println();
		System.out.println(" 0 - Salir");
		System.out.println();
	}
	
	public static int readOpt(Scanner s, int max) {
		int out = 0;
		do {
			System.out.print("Escribe una opción: ");
			out = s.nextInt();
			s.nextLine();
		} while (out < 0 || out > max);
		return out;
	}
	
	// --- ALTAS ---------------------------------------------------------------
	//public static void alta
	static void altasPersonas(Persona p[]) {
		p[0] = new Persona("11122233A", "Alfredo");
		p[1] = new Persona("11122233B", "Berto");
		p[2] = new Persona("11122233C", "Clara");
		p[3] = new Persona("11122233D", "Dyango");
		p[4] = new Persona("11122233E", "Eraldo");
		p[5] = new Persona("11122233F", "Fran");
		p[6] = new Persona("11122233G", "Gloria");
		p[7] = new Persona("11122233H", "Hugo");
		p[8] = new Persona("11122233I", "Iria");
		p[9] = new Persona("11122233J", "David");
	}
	
	static void altasMascotas(Persona p[], Animal a[]) {
		a[0] = new Animal(p[0].getDni(), "Zas", 3);
		a[1] = new Animal(p[0].getDni(), "Sora", 2);
		a[2] = new Animal(p[1].getDni(), "Lilo", 5);
		a[3] = new Animal(p[2].getDni(), "Miki", 9);
		a[4] = new Animal(p[2].getDni(), "Grace", 1);
		a[5] = new Animal(p[3].getDni(), "Pipote", 8);
		a[6] = new Animal(p[4].getDni(), "Chinchi", 1);
		a[7] = new Animal(p[5].getDni(), "Mery", 3);
		a[8] = new Animal(p[6].getDni(), "Perro", 7);
		a[9] = new Animal(p[6].getDni(), "Gato", 1);
		a[10] = new Animal(p[7].getDni(), "Pato", 2);
		a[11] = new Animal(p[7].getDni(), "Pepe", 5);
		a[12] = new Animal(p[8].getDni(), "Mimi", 4);
		a[13] = new Animal(p[9].getDni(), "Lula", 2);
		a[14] = new Animal(p[9].getDni(), "Minino", 5);
	}
	
	
	// --- VISUALIZACIONES -----------------------------------------------------
	public static void visualizarArrayObj(Object arr[]) {
		System.out.println("");
		for (int i=0; i < arr.length; i++) System.out.println(arr[i].toString());
	}
	
	public static void visualizarArrayBidimensional(String arr[][]) {
		System.out.println("");
		for (int i=0; i < arr.length; i++) {
			for (int e = 0; e < arr[i].length; e++) {
				System.out.print(arr[i][e] + " ");
			}
			System.out.println("");
		}
	}
	
	// --- VINCULACIÓN ---------------------------------------------------------
	public static void vincularMascotaAmo(Persona p[], Animal a[], String pa[][]) {
		int i = 0, e = 0;
		for (i = 0; i < a.length; i++) {
			for (e = 0; e < p.length; e++) {
				System.out.println(i + " - " + e);
				if (a[i].getDni_dueno().equals(p[e].getDni())) {
					pa[i][0] = p[e].getDni();
					pa[i][1] = p[e].getNombre();
					pa[i][2] = a[i].getNombre();
					pa[i][3] = Integer.toString(a[i].getEdad());
				}
			}
		}
	}

	// --- INTERFAZ DE USUARIO -------------------------------------------------
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int opt = 0;
		
		Persona[] p = new Persona[10];
		Animal[] a = new Animal[15];
		String[][] pa = new String[15][4];

		do {
			printMenu();
			opt = readOpt(s, nMaxOpt);
			if (opt != 0) {
				switch (opt) {
					case 1:
						//Altas amos (auto)
						altasPersonas(p);
						break;
					case 2:
						//Altas amos (manual)
						System.out.println("\nNo implementado...");
						break;
					case 3:
						//Altas mascotas (auto)
						altasMascotas(p, a);
						break;
					case 4:
						//Altas mascotas (manual)
						System.out.println("\nNo implementado...");
						break;
					case 5:
						//Visualizar amos
						visualizarArrayObj(p);
						break;
					case 6:
						//Visualizar mascotas
						visualizarArrayObj(a);
						break;
					case 7:
						//Vincular mascota con amo
						vincularMascotaAmo(p, a, pa);
						break;
					case 8:
						//Vusualizar vinculación
						visualizarArrayBidimensional(pa);
						break;
					case 9:
						//Ordenar
						System.out.println("\nNo implementado...");
						break;
					case 10:
						//Visualizar num masc. por amo
						System.out.println("\nNo implementado...");
						break;
				}
			}
		} while (opt != 0);
		
		System.out.println("Bye (;︵;)");
		
		s.close();
	}

}
