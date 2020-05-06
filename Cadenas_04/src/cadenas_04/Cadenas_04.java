package cadenas_04;

public class Cadenas_04 {
	public static void main(String[] args){
		String cadena="Esta es una cadena para demostrar las funciones";
		char caracter1 = ' ', caracter2 = '\t';
		System.out.println("La cadena es -> "+cadena);
		System.out.println("los caractres son: caracter1 -> "+caracter1+ " y caracter2 -> "+caracter2);
		
		System.out.println("\n\nTodas las funciones siguientes son de la clase \"Character\".");
		System.out.println("\nLa funci�n \"isDigit()\" indica si el caracter es un d�gito");
		System.out.println("Si es un d�gito devuelve 'true' y en caso contrario 'false'.\n");
		System.out.println("Con caracter1 devuelve -> "+Character.isDigit(caracter1));
		System.out.println("Con caracter2 devuelve -> "+Character.isDigit(caracter2));
		
		System.out.println("\nLa funci�n \"isLetter()\" indica si el caracter es una letra");
		System.out.println("Si es una letra devuelve 'true' y en caso contrario 'false'.\n");
		System.out.println("Con caracter1 devuelve -> "+Character.isLetter(caracter1));
		System.out.println("Con caracter2 devuelve -> "+Character.isLetter(caracter2));	

		System.out.println("\nLa funci�n \"isLetterOrDigit()\" indica si el caracter es una letra");
		System.out.println("Si es una letra o un d�gito devuelve 'true' y en caso contrario 'false'.\n");
		System.out.println("Con caracter1 devuelve -> "+Character.isLetterOrDigit(caracter1));
		System.out.println("Con caracter2 devuelve -> "+Character.isLetterOrDigit(caracter2));
			
		System.out.println("\nLa funci�n \"isLowerCase()\" indica si el caracter es una letra min�scula");
		System.out.println("Si es una letra o una letra min�scula devuelve 'true' y en caso contrario 'false'.\n");
		System.out.println("Con caracter1 devuelve -> "+Character.isLowerCase(caracter1));
		System.out.println("Con caracter2 devuelve -> "+Character.isLowerCase(caracter2));
				
		System.out.println("\nLa funci�n \"isUpperCase()\" indica si el caracter es una letra may�scula");
		System.out.println("Si es una letra o una letra may�scula devuelve 'true' y en caso contrario 'false'.\n");
		System.out.println("Con caracter1 devuelve -> "+Character.isUpperCase(caracter1));
		System.out.println("Con caracter2 devuelve -> "+Character.isUpperCase(caracter2));
		
		System.out.println("\nLa funci�n \"isSpaceChar()\" indica si el caracter es un espacio en blanco");
		System.out.println("Si es  un espacio en blanco devuelve 'true' y en caso contrario 'false'.\n");
		System.out.println("Con caracter1 devuelve -> "+Character.isSpaceChar(caracter1));
		System.out.println("Con caracter2 devuelve -> "+Character.isSpaceChar(caracter2));		
		
		System.out.println("\nLa funci�n \"isWhiteSpace()\" indica si el caracter es un espacio en blanco sin representaci�n al imprimirse");
		System.out.println("Si es una letra o un espacio en blanco sin representaci�n al imprimirse devuelve 'true' y en caso contrario 'false'.\n");
		System.out.println("Con caracter1 devuelve -> "+Character.isWhitespace(caracter1));
		System.out.println("Con caracter2 devuelve -> "+Character.isWhitespace(caracter2));	
		
		System.out.println("\nLa funci�n \"toLowerCase()\" si la letra es may�scula la devuelve min�scula, si es min�scula la deja como est�\n");
		System.out.println("Con caracter1 devuelve -> "+Character.toLowerCase(caracter1));
		System.out.println("Con caracter2 devuelve -> "+Character.toLowerCase(caracter2));	
		
		System.out.println("\nLa funci�n \"toUpperCase()\" si la letra es min�scula la devuelve may�scula, si es may�scula la deja como est�\n");
		System.out.println("Con caracter1 devuelve -> "+Character.toUpperCase(caracter1));
		System.out.println("Con caracter2 devuelve -> "+Character.toUpperCase(caracter2));		
		
	}
}
