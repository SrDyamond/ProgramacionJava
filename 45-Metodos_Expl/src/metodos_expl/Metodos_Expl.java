package metodos_expl;

public class Metodos_Expl {
	static int suma(int n1,int n2) {
		int suma=0;
		suma = n1+n2;
		n1=n1*n2;
		System.out.println("n1 del metodo = "+n1);
		return suma;
	}

	public static void main(String []args) {
		int n1=4,n2=34;
		System.out.println("suma = "+suma(n1,n2));
		System.out.println("n1 del main = "+n1);
	}

}
