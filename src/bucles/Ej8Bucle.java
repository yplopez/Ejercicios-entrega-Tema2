package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;
/*PRUEBAS
* ENTRADA: F |VALOR OBTENIDO Y ESPERADO:Dato incorrecto. Dime un número inicial:
* ENTRADA: -4 |VALOR OBTENIDO Y ESPERADO: Dime un número inicial:
* ENTRADA: Dime un número inicial: 
2
Dime un número:  (Para salir ingresa 0).
8
Dime un número:  (Para salir ingresa 0).
6
Error! el número es menor
Dime un número:  (Para salir ingresa 0).
0
Total de números introducidos: 3
Total de fallos: 1
*/

public class Ej8Bucle {

	public static void main(String[] args) {
		// Creo las variables
		int num = 0, numMayor = 0, contador = 1, contadorError = 0;
		//Variable para validar números positivos
		boolean esValido;
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		/*Bloque de código donde está el do-while, para ejecutar el bucle cuando hay fallos de digitación.
		 * Try-catch para detectar caracteres diferentes a números.
		 * if para validar que el número sea positivo.
		 * Bucle do-while para validar que número inicial sea un entero positivo.
		 * Buvle do-While para validar información ingresado, lanzar errores, para hacer conteo de números digitado
		 * y errores de números digitados.
		 */
		do {
			try {
				System.out.println("Dime un número inicial: ");

				num = sc.nextInt();
				numMayor = num;
			} catch (InputMismatchException e) {
				System.out.println("Dato incorrecto.");
				sc.nextLine();
			}
		} while (num <= 0);

		do {
			num = 1;
			try {

				if (num < 0) {
					System.out.println("¡Recuerde! Es un número POSITIVO");
				} else {
					System.out.println("Dime un número: " + " (Para salir ingresa 0).");
					num = sc.nextInt();
					if (num < 0) {

						System.out.println("¡Recuerde! Es un número POSITIVO");
					} else {
						if (num != 0) {
							contador++;
						} else {
							esValido = false;
						}

						if (num < numMayor && num != 0) {
							contadorError++;
							System.out.println("Error! el número es menor");
						}
						numMayor = num;
					}					
				}

			} catch (InputMismatchException e) {
				System.out.println("Dato incorrecto.");
				sc.nextLine();
			}
		} while (num != 0);
		System.out.println("Total de números introducidos: " + contador);
		System.out.println("Total de fallos: " + contadorError);
		//Cierre del Scanner
		sc.close();
	}

}
