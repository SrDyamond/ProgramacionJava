package contadorInstancias;

public class Clase {
	static int contador=0;//static me permite compartir el valor con todas las clases,sea el
	//objeto que sea
	Clase(){
		contador++;
	}
	int getContador() {
		return contador;
	}

}
