package contadorInstancias;

public class ContadorInstancias {
	public static void main (String [] args) {
		Clase uno = new Clase();
		System.out.println("Objetos declarados = "+uno.getContador());
		Clase dos =new Clase();
		System.out.println("Objetos declarados = "+dos.getContador());
		Clase tres =new Clase();
		System.out.println("Objetos declarados = "+tres.getContador());
		Clase cuatro =new Clase();
		System.out.println("Objetos declarados = "+cuatro.getContador());
	}
}
