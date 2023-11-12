package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej2Bucle {
	/*
	 * PRUEBAS VLR. ENTRADA: 3 | RES. ESPERADO:Hay 2 números primos. | RES.
	 * OBTENIDO: Hay 2 números primos. VLR. ENTRADA: ñ | RES. ESPERADO:El dato es
	 * inválido | RES. OBTENIDO: El dato es inválido
	 */
	public static void main(String[] args) {
		// Creo las variables
		int num, numPrimo = 0;
		boolean esError = false;
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Bloque do y try para validar ingreso de datos
		do {
			try {
				// Pido un número al usuario
				System.out.println("Ingrese un número entero positivo: ");
				// Leo el número
				num = sc.nextInt();
				// condición para validar datos ingresados
				if (num > 0) {
					// Planteamiento de lógica del programa
					for (int i = 2; i <= num; i++) {
						boolean esPrimo = true;
						for (int j = 2; j < i; j++) {
							// Condición que evalua resto cero para determinar números primos
							if (i % j == 0) {
								esPrimo = false;
							}
						}
						if (esPrimo)
							numPrimo++;
					}
					// Imprimo la cantidad de números primos que hay antes del número ingresado
					System.out.println("Hay " + numPrimo + " números primos.");
				}

			} catch (InputMismatchException e) {
				esError = true;
				System.out.println("El dato es inválido");
				sc.nextLine();
			}
		} while (esError);
		// Cierro el Scanner
		sc.close();

	}

}