package cadenas_02;

public class Cadenas_02 {
	public static void main(String[] args){
		String cadena1, cadena2;
		cadena1 = "masa";
		cadena2 = "mesa";
		System.out.println("Cadena1 ----> "+cadena1);
		System.out.println("Cadena2 ----> "+cadena2);
	/*	System.out.println("Con la funci�n \"equals\" si distingue may�sculas de min�sculas\n");
		if (cadena1.equals(cadena2))
			System.out.println("Son iguales-> "+cadena1.equals(cadena2));
		else
			System.out.println("Son distintas-> "+cadena1.equals(cadena2));
		System.out.println("\n\n Con la funci�n \"equalsIgnoreCase\" no distingue may�sculas de min�sculas\n");
		if(cadena1.equalsIgnoreCase(cadena2))
			System.out.println("Son iguales");
		else
			System.out.println("Son distintas");
			*/
		System.out.println("\n\n Con la funci�n \"compareTo\" si distingue may�sculas de min�sculas");
		System.out.println("cadena1 = "+cadena1+"\tcadena2 = "+cadena2+".....Comparaci�n = "+cadena1.compareTo(cadena2));
		if(cadena1.compareTo(cadena2)==0)
			System.out.println("Son iguales--> "+cadena1.compareTo(cadena2));
		else
			System.out.println("Son distintas--> "+cadena1.compareTo(cadena2));
		System.out.println("La diferencia seg�n el c�digo ASCII entre los dos caracteres dentro de ");
		System.out.println("la cadena que son diferentes.");
		System.out.println("muestra un entero positivo si la cadena uno es mayor que la cadena2");
		System.out.println("muestra un entero negativo si la cadena uno es menor que la cadena2");
		System.out.println("muestra el valor cero si la cadena1 y la cadena2 son iguales.\n");
		System.out.println("\nEl valor devuelto por la funci�n es: "+cadena1.compareTo(cadena2));
		System.out.println("\n\n Con la funci�n \"compareToIgnoreCase\" no distingue may�sculas de min�sculas");
		System.out.println("El resto igual que la funci�n \"compareTo\".\n");
		System.out.println("\nEl valor devuelto por la funci�n es: "+cadena1.compareToIgnoreCase(cadena2));
	
		
	}
}
