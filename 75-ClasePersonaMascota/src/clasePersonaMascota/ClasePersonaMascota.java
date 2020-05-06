package clasePersonaMascota;

import java.util.Scanner;

public class ClasePersonaMascota {
	///////////////////////MENU/////////////
	static int menu (Scanner e) {
		int op=0;
		System.out.println("1.Altas dueños");
		System.out.println("2.Altas mascotas");
		System.out.println("3.Visualizar dueños");
		System.out.println("4.Visualizar mascotas");
		System.out.println("5.Crear dueños/mascotas ");
		System.out.println("6.Visualizar array dueños/mascotas");
		System.out.println("7.Ordenar ");
		System.out.println("8.Fin");
		do {
			System.out.println("Teclea a opcion.(Fin para finalizar");
			op=e.nextInt();
		}while (op<1 || op>8);
		return op;
	}
	//////////////////////ALTASDUEÑOS///////////////
	
	public static  void altasDueños(Persona p[]) {
		p[0]=new Persona("78804042Q","Dyango");
		p[1]=new Persona("26297527Q","Dovah");
		p[2]=new Persona("71065437E","Sak");
		p[3]=new Persona("87960394A","Hawk");
		p[4]=new Persona("45209146G","Fomore");
		p[5]=new Persona("01741084Q","Josan");
		p[6]=new Persona("01840174B","Gaiador");
		p[7]=new Persona("91649174J","Rachel");
		p[8]=new Persona("07417491K","Jennyes");
		p[9]=new Persona("01840740L","Carlos");
		p[10]=new Persona("75714710N","Adrian");
		p[11]=new Persona("17317471Ñ","Mato");
		p[12]=new Persona("12741942A","Fran");
		p[13]=new Persona("71074144C","Caneda");
		p[14]=new Persona("19419649Z","Rodrigo");
		
	}
	/////////////////////ALTASMASCOTAS//////////////////////
	public static void altasMascotas(Scanner e,Mascota m[]) {
//		int i=0;
//		int longitud=m.length,edad=0;
//		String dni="",nombre="";
//		e.nextLine();
//		for (i=0;i<longitud;i++) {
//			e.nextLine();
//			System.out.println("Mascota numero:" + (i + 1));
//			System.out.println("Introduce o dni do dueño da mascota");
//			dni=e.nextLine();
//			System.out.println("Introduce a edad da mascota ");
//			edad=e.nextInt();
//			System.out.println("Introduce o nombre da Mascota");
//			nombre=e.nextLine();
//			m[i] = new Mascota(dni,edad,nombre);//Instanciamos despois de leer,dni.edad e mascota
//		
//		}
		m[0]=new Mascota("78804042Q",12,"Sak");
		m[1]=new Mascota("58185819O",11,"Pepe");
		m[2]=new Mascota("28311841E",67,"Chori");
		m[3]=new Mascota("13810481Q",87,"Jose");
		m[4]=new Mascota("18418410J",35,"Pipo");
		m[5]=new Mascota("11974914P",84,"Teddy");
		m[6]=new Mascota("19641643H",93,"Oreo");
		m[7]=new Mascota("78804042Q",10,"Fununculo");
		m[8]=new Mascota("01739174A",95,"Coco");
		m[9]=new Mascota("17491747Y",42,"Merlin");
		m[10]=new Mascota("91074014U",67,"Toky");
		m[11]=new Mascota("19739163D",23,"Pumu");
		m[12]=new Mascota("10401744O",17,"Tok");
		m[13]=new Mascota("19319916I",96,"Tik");
		m[14]=new Mascota("37482472Q",5,"Tak");
	}
	////////////////VISUALIZARDUEÑOS//////////////
	public static void visualizarDueños(Persona p[]) {
		for (int i=0;i<p.length;i++)
		System.out.println(p[i].visualizar());
	}
	////////////////VISUALIZARMASCOTAS///////////
	public static void visualizarMascotas(Mascota m[]) {
		for (int i=0;i<m.length;i++)
		System.out.println(m[i].visualizar());
	}
	///////////////CREARARRAYDUEÑOSMASCOTAS/////////////
	public static void dueñosMascotas(Persona p[],Mascota m[],DueñosMascotas d []) {
//		String nombreP = "",dni="",nombreM="";
//		int edadM=0;
		int ip=0,im=0,id=0;
		System.out.println("Emparejando Dueños y mascotas");
		for (ip=0;ip<p.length;ip++) {
			for(im=1;im<m.length;im++) {
				if ( p[ip].getDni()==m[im].getDni()) {
//					dni=p[i].getDni();
//					nombreP = p[i].getNombre();
//					nombreM = m[e].getNombre();
//					edadM =m[e].getEdad();
					d[id++] = new DueñosMascotas (p[ip].getDni(),p[ip].getNombre(),m[im].getNombre(),m[im].getEdad());
				}
			}
		}
		System.out.println("\nDueños y mascotas emparejados");
	}
	
	//////////////////////VISUALIZARDUEÑOSMASCOTAS///////
	
	public static void visualizarDueñosMascotas(DueñosMascotas d[]) {
		for (int i=0;i<d.length;i++)
			System.out.println(d[i].getDni()+"  "+d[i].getNombreD()+"   "+d[i].getNombreM()+"   "+d[i].getEdadM());
	}
	
	/////////////////////FIN/////////////////////
	static void fin() {
		System.out.println("FIN DEL PROGRAMA");
	}
	////////////MAIN////////////////////
	public static void main (String []args) {
		Scanner entrada=new Scanner (System.in);
		int opcion=0;
		Persona[] p = new Persona[15];
		Mascota[] m = new Mascota[15];
		DueñosMascotas[] d=new DueñosMascotas[15];

		do {
			opcion=menu(entrada);
			switch (opcion) {
			case 1:
				altasDueños(p);
				break;
			case 2:
				altasMascotas(entrada ,m);
				break;
			case 3:
				visualizarDueños(p);
				break;
			case 4:
				visualizarMascotas(m);
				break;
			case 5:
				dueñosMascotas(p,m,d);
				break;
			case 6:
				visualizarDueñosMascotas(d);
				break;
				default:
					fin();
			}
		}while (opcion!=8);
		entrada.close();
	}
}
