package examen2Practica1_Clases;
import java.util.Scanner;
public class Examen2Practica1_Clases {
	static int menu(Scanner e) {
		int op=0;
		System.out.println("MENU");
		System.out.println("1.Altas Alumnos");
		System.out.println("2.Visualizar alumnos");
		System.out.println("3.Obtener nota media alumno");
		System.out.println("4.Ordenar alumnos");
		System.out.println("5.Fin");
		do {
			System.out.println("Prema a opcion");
			op=e.nextInt();
		}while(op<1 ||op>5);
		return op;
	}
	static int menuOrdenacion(Scanner e) {
		int op=0;
		System.out.println("Prema a tecla para ordenar por...");
		System.out.println("1.Nome");
		System.out.println("2.Apelido");
		System.out.println("3.Nota media mais alta");
		System.out.println("4.Nota media mais baixa");
		System.out.println("5-Retroceder o menu anterior");
		do {
			System.out.println("Elixa o metodo a ordenar");
			op=e.nextInt();
		}while(op<1 || op >5);
		return op;
	}
	/////////ALTASALUMNOS
	public static void altasAlumno(Alumno a[],Scanner e) {
//		int i=0,nota1=0,nota2=0,nota3=0;
//		String nombre="",ape1="",ape2="";
		e.nextLine();
		a[0]=new Alumno("Dyango","Sanchez","Rodriguez",5,8,9);
		a[1]=new Alumno("Fomore","Rogue","Sorcerer",3,8,6);
		a[2]=new Alumno("Sak","Sanchez","Rodriguez",5,3,0);
		
//		for(i=0;i<a.length;i++) {
//			e.nextLine();
//			System.out.println("Alumno numero :"+(i+1));
//			System.out.println("Introduce o nome.");
//			nombre=e.nextLine();
//			System.out.println("Introduce o Primeiro Apelido");
//			ape1=e.nextLine();
//			System.out.println("Introduce o Segundo Apelido");
//			ape2=e.nextLine();
//			System.out.println("Introduce a Nota 1");
//			nota1=e.nextInt();
//			System.out.println("Introduce a Nota 2");
//			nota2=e.nextInt();
//			System.out.println("Introduce a Nota 3");
//			nota3=e.nextInt();
//			a[i]=new Alumno(nombre,ape1,ape2,nota1,nota2,nota3);
//		}
	}
	/////////VISUALIZARALUMNOS
	public static void visualizarAlumno(Alumno a[]) {
		int i=0;
		for (i=0;i<a.length;i++)
			System.out.println(a[i].ToString());
	}
	////////NOTAMEDIAALUMNOS
	public static void notaMedia(Alumno a[]) {
		int i=0;
		for (i=0;i<a.length;i++)
			System.out.println(a[i].ToString()+"\tLa nota media es :"+a[i].notaMedia());
	}
	/////////////////////ORDENACIONES
	
	public static void ordenar(Alumno a[],int to) {
		int i=0,e=0;
		Alumno aux=new Alumno();
		for (i=0;i<a.length;i++) {
			for (e=i+1;e<a.length;e++) {
			if (to==1 && a[i].getNombre().compareToIgnoreCase(a[e].getNombre())>0){
					aux=a[i];
					a[i]=a[e];
					a[e]=aux;
				}
			if (to==2 && a[i].getApe1().compareToIgnoreCase(a[e].getApe1())>0){
				aux=a[i];
				a[i]=a[e];
				a[e]=aux;
			}
			
			if (to==3 && a[i].notaMedia()<a[e].notaMedia()){
				aux=a[i];
				a[i]=a[e];
				a[e]=aux;
			}
			if (to==4 && a[i].notaMedia()>a[e].notaMedia()){
				aux=a[i];
				a[i]=a[e];
				a[e]=aux;
			}	
			}
		}
		if (to == 1) {
			for (i = 0; i < a.length; i++) {
				System.out.println(a[i].ToString());
			}
		}
		if (to == 2) {
			for (i = 0; i < a.length; i++) {
				System.out.println(a[i].ToStringApe());
			}
		}
		if (to == 3) {
			for (i = 0; i < a.length; i++) {
				System.out.println(a[i].notaMedia()+" "+a[i].ToStringApe());
			}
		}
		if (to == 4) {
			for (i = 0; i < a.length; i++) {
				System.out.println(a[i].notaMedia()+" "+a[i].ToStringApe());
			}
		}
		
		
		

	}
	//////FIN
	public static void fin() {
		System.out.println("FIN DEL PROGRAMA");
	}
	////////////MAIN
	public static void main(String []args) {
		Scanner entrada=new Scanner(System.in);
		int op=0,op2=0;
		Alumno a[]=new Alumno[3];
		do {
			op=menu(entrada);
			switch(op) {
			case 1:
				altasAlumno(a,entrada);
				break;
			case 2:
				visualizarAlumno(a);
				break;
			case 3:
				notaMedia(a);
				break;
			case 4:
				do {
					op2=menuOrdenacion(entrada);
					switch(op2) {
					case 1:
						ordenar(a,op2);
						break;
					case 2:
						ordenar(a,op2);
						break;
					case 3:
						ordenar(a,op2);
						break;
					case 4:
						ordenar(a,op2);
						break;
					
					}
				}while(op2!=5);
				break;
				default:
					fin();
			}
		}while(op!=5);
		
	}
}
