package demonstraciónswitch;
import java.util.Scanner;
public class DemonstraciónSwitch {
	public static void main (String [] args) {
		Scanner e =new Scanner(System.in);
		int valor = 0;
		System.out.print("Valor'");
		valor=e.nextInt();
		switch(valor) {
		case 1:
			System.out.println("tecleaste 1");
			break;
		case 2:
			System.out.println("tecleaste 2");
			break;
		case 3:
			System.out.println("tecleaste 3");
			break;
			default:
			System.out.println("tecleaste cualquier otro");
			
		}
		e.close();
	}
	
}
