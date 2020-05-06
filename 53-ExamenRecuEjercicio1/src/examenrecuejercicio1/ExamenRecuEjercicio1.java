package examenrecuejercicio1;

import java.util.Scanner;

public class ExamenRecuEjercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int palabra[] = new int[4];
		int palabraintr[] = new int[4];
		int i = 0, e = 0, cont = 0, contaciertos = 0;

		for (i = 0; i < 4; i++) {
			do {
				System.out.println("Introduce la numeros a adivinar");
				palabra[i] = sc.nextInt();
			} while (palabra[i] <= 0 || palabra[i] >= 9);
		}

		do {
			contaciertos = 0;
			for (i = 0; i < 4; i++) {
				do {
					System.out.println("Introduce la numeros correctos");
					palabraintr[i] = sc.nextInt();
				} while (palabraintr[i] <=0 || palabraintr[i] >= 9);
			}

			for (i = 0; i < 4; i++) {
				for (e = 0; e < 4; e++) {
					if (palabra[i] == palabraintr[e]) {
						if (i == e) {
							System.out.print("B");
							contaciertos++;
						} else {
							System.out.print("A");
						}
					}
				}
			}
			cont++;
		} while (cont != 3 && contaciertos != 4);
		System.out.println();
		System.out.println();
		if (cont == 3)
			System.out.println("PERDIDA ");
		System.out.println();
		if (contaciertos == 4)
			System.out.println("GANADA ");
		System.out.println();
	}
}
