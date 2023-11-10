package bucles;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Creo la variable del número n
		int n, espacio;

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese un número entero positivo");

		n = sc.nextInt();

		espacio = n;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				for (int k = 0; k <= espacio; k++) {
					if (j == 1) {
						System.out.print(" ");
					}
				}

				System.out.print(" *");

			}

			espacio--;

			System.out.println();

		}

	}

}
