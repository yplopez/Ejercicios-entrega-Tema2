package bucles;

import java.util.InputMismatchException;

import java.util.Scanner;
/*PRUEBAS
* ENTRADA: 76543876 |VALOR OBTENIDO Y ESPERADO:El número tiene 8 dígitos.
* ENTRADA: b |VALOR OBTENIDO Y ESPERADO:Dato inválido. Ingrese un número mayor a 0:
* ENTRADA: -5 |VALOR OBTENIDO Y ESPERADO:El número debe ser positivo. Ingrese un número mayor a 0: 
*/

public class Ej9Bucle {

	public static void main(String[] args) {
		// Creo las variables
		int num, contador = 1, resultado;
		//Variable para validar números positivos
		boolean esValido;
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		/*Bloque de código donde está el do-while, para validar fallos de digitación y solicitar de nuevo el número.
		 * Try-catch para detectar caracteres diferentes a números.
		 * if para validar que el número sea positivo.
		 * Bucle while que divide el número digitado en 10 tantas veces sea necesario hasta llegar a 0 y 
		 * decir cuantos dígitos tiene.
		 */
		do {
			esValido = true;
			try {
				System.out.println("Ingrese un número mayor a 0: ");
				num = sc.nextInt();
				if (num < 0) {
					esValido = false;
					System.out.println("El número debe ser positivo.");
				} else {
					resultado = num / 10;
					while (resultado > 0) {
						resultado = resultado / 10;
						contador++;
					}
				}
			} catch (InputMismatchException e) {
				esValido = false;
				System.out.println("Dato inválido.");
				sc.nextLine();
			}
			if (esValido)
				System.out.println("El número tiene " + contador + " dígitos.");
		} while (esValido == false);
		//Cierre del Scanner
		sc.close();
	}

}
