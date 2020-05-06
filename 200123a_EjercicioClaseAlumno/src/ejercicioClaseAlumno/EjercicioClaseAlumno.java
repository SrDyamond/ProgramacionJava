package ejercicioClaseAlumno;
import java.util.Scanner;
public class EjercicioClaseAlumno {
	
	// --- INTERFAZ DE USUARIO -------------------------------------------------
	
	public static void printMenu() {
		System.out.println();
		System.out.println("--- MENU ---");
		System.out.println(" 1 - Altas");
		System.out.println(" 2 - Visualizar Array");
		System.out.println(" 3 - Ordenar por curso");
		System.out.println(" 4 - Ordenar por nombre");
		System.out.println(" 5 - Visualizar agrup. por curso");
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
	
	// --- FUNCIONES GENÉRICAS -------------------------------------------------
	
	public static Alumno[] altas(Scanner s, Alumno[] aArr) {
		System.out.println("> Definiendo el array...");
		aArr[ 0] = new Alumno("DAM1", "Carlos", 	3, 	5, 	7);
		aArr[ 1] = new Alumno("DAM1", "Alfonso", 	10, 8, 	7);
		aArr[ 2] = new Alumno("AAD1", "María", 		4, 	9, 	5);
		aArr[ 3] = new Alumno("DAM2", "Chinchilla", 3, 	2, 	1);
		aArr[ 4] = new Alumno("DAM2", "Alberto", 	6, 	6, 	5);
		aArr[ 5] = new Alumno("AYF1", "Lara", 		9, 	10, 10);
		aArr[ 6] = new Alumno("AYF2", "Clara", 		7, 	4, 	8);
		aArr[ 7] = new Alumno("DAM2", "Cucufata", 	3, 	5, 	7);
		aArr[ 8] = new Alumno("DAM1", "Adan", 		1, 	1, 	1);
		aArr[ 9] = new Alumno("AAD1", "Daniel", 	6, 	7, 	5);
		aArr[10] = new Alumno("AYF1", "Roberto", 	4, 	7, 	4);
		aArr[11] = new Alumno("AYF1", "Aida", 		8, 	9, 	5);
		aArr[12] = new Alumno("AYF2", "Socorro", 	7, 	7, 	7);
		aArr[13] = new Alumno("DAM1", "Ramón", 		6, 	5, 	5);
		aArr[14] = new Alumno("DAM1", "Marta", 		10, 8, 	9);
		aArr[15] = new Alumno("DAM2", "Cristina", 	3, 	2, 	2);
		aArr[16] = new Alumno("DAM2", "Covadonga", 	9, 	8, 	9);
		aArr[17] = new Alumno("DAM1", "Pula", 		6, 	4, 	4);
		aArr[18] = new Alumno("AYF2", "Julia",	 	2, 	7, 	7);
		aArr[19] = new Alumno("AAD2", "Carlos", 	6, 	5, 	9);
		return aArr;
	}
	
	public static void visualizarArray(Alumno[] aArr) {
		int i = 0;
		for (i = 0; i < aArr.length; i++) {
			System.out.println(
				aArr[i].getCurso() + " " + 
			    aArr[i].getNombre() + "\t" + 
				aArr[i].getNota1() + "\t" + 
			    aArr[i].getNota2() + "\t" + 
				aArr[i].getNota3() + "\t(" + 
			    aArr[i].getMedia() + ")"
			);
		}
	}
	
	public static void visualizarArrayAgrupPorCurso(Alumno[] aArr) {
		int i = 0, contAlumnos = 0, sumMedias = 0;
		String cursoAnt = aArr[0].getCurso();
		
		System.out.println();
		for (i = 0; i < aArr.length; i++) {
			if (!aArr[i].getCurso().equals(cursoAnt)) {
				System.out.println(
					"\n > Curso: " + cursoAnt + 
					", tot. alumn: " + contAlumnos + 
					" (" + (sumMedias / contAlumnos) + ")" + 
					"\n"
				);
				cursoAnt = aArr[i].getCurso();
				contAlumnos = 0;
				sumMedias = 0;
			}
			System.out.println(
				"     " + 
			    aArr[i].getNombre() + "\t" + 
				aArr[i].getNota1() + "\t" + 
			    aArr[i].getNota2() + "\t" + 
				aArr[i].getNota3() + "\t(" + 
			    aArr[i].getMedia() + ")"
			);
			contAlumnos++;
			sumMedias += aArr[i].getMedia();
		}
		System.out.println(
				"\n > Curso: " + cursoAnt + 
				", tot. alumn: " + contAlumnos + 
				" (" + (sumMedias / contAlumnos) + ")" + 
				"\n"
			);
	}
	
	// --- ORDENACIONES --------------------------------------------------------
	
	public static Alumno[] ordPorCurso(Alumno[] aArr) {
		int i = 0, e = 0;
		Alumno aAux = null;
		System.out.println("> Ordenando por curso...");
		for (i = 0; i < (aArr.length - 1); i++) {
			for (e = i; e < aArr.length; e++) {
				if (aArr[i].getCurso().compareTo(aArr[e].getCurso()) > 0) {
					aAux = aArr[i];
					aArr[i] = aArr[e];
					aArr[e] = aAux;
				}
			}
		}
		return aArr;
	}
	
	public static Alumno[] ordPorNombre(Alumno[] aArr) {
		int i = 0, e = 0;
		Alumno aAux = null;
		System.out.println("> Ordenando por nombre...");
		for (i = 0; i < (aArr.length - 1); i++) {
			for (e = i; e < aArr.length; e++) {
				if (aArr[i].getNombre().compareTo(aArr[e].getNombre()) > 0) {
					aAux = aArr[i];
					aArr[i] = aArr[e];
					aArr[e] = aAux;
				}
			}
		}
		return aArr;
	}
	
	public static Alumno[] ordPorOpt(Alumno[] aArr, int opt) {
		int i = 0, e = 0;
		Alumno aAux = null;
		System.out.println("> Ordenando array...");
		for (i = 0; i < (aArr.length - 1); i++) {
			for (e = i; e < aArr.length; e++) {
				if (opt == 3 && aArr[i].getCurso().compareTo(aArr[e].getCurso()) > 0 ||
				    opt == 4 && aArr[i].getNombre().compareTo(aArr[e].getNombre()) > 0) {
					aAux = aArr[i];
					aArr[i] = aArr[e];
					aArr[e] = aAux;
				}
			}
		}
		return aArr;
	}
	
	// --- MAIN ----------------------------------------------------------------

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int opt = 0;
		Alumno aArr[] = new Alumno[20];
		boolean ordPorCursoB = false;
		//boolean ordPorNombreB = false;

		do {
			printMenu();
			opt = readOpt(s, 5);
			
			if (opt != 0) {
				switch (opt) {
					case 1:
						aArr = altas(s, aArr);
						break;
					case 2:
						visualizarArray(aArr);
						break;
					case 3:
						//aArr = ordPorCurso(aArr);
						aArr = ordPorOpt(aArr, opt);
						ordPorCursoB = true;
						//ordPorNombreB = false;
						break;
					case 4:
						//aArr = ordPorNombre(aArr);
						aArr = ordPorOpt(aArr, opt);
						ordPorCursoB = false;
						//ordPorNombreB = true;
						break;
					case 5:
						if (ordPorCursoB) visualizarArrayAgrupPorCurso(aArr);
							else System.out.println(
									"[FAIL] Los alumnos no estan ordenados por curso."
							);
						break;
				}
				/*System.out.println("\nPulsa INTRO...");
				s.nextLine();*/
			}
		} while (opt != 0);
		
		System.out.println("Bye (;︵;)");
		
		s.close();
	}

}
