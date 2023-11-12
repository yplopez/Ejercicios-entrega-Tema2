package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;
/*PRUEBAS
* ENTRADA: j |VALOR OBTENIDO Y ESPERADO:Dato incorrecto. Ingrese un número: 
* ENTRADA: -7 |VALOR OBTENIDO Y ESPERADO:¡Recuerde! Es un número POSITIVO. Ingrese un número: 
* ENTRADA: 87 |VALOR OBTENIDO Y ESPERADO:No es un número capicúa.
* ENTRADA: 12321 |VALOR OBTENIDO Y ESPERADO:El número es capicúa.
*/
public class Ej10Bucle {

	public static void main(String[] args) {
		// Creo las variables
		int num, inverso = 0, auxiliar, cifras;
		//Variable para validar números positivos
		boolean esValido;
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		/*Bloque de código donde está el do-while, para validar fallos de digitación y solicitar de nuevo el número.
		 * Try-catch para detectar caracteres diferentes a números.
		 * if para validar que el número sea positivo.
		 * Bucle while con la lógica del programa en la que se obtiene el residuo del número
		 * dividido 10 para obtener el último número e ir asignandolo a la variable inverso
		 * y finalmemte comparar las cifras con el número dado para comparar y determinar si es capucúa o no.
		 */
		do {
			esValido = true;
			try {
				System.out.println("Ingrese un número: ");
				num = sc.nextInt();

				if (num > 0) {
					auxiliar = num;

					while (auxiliar > 0) {
						cifras = auxiliar % 10;
						inverso = inverso * 10 + cifras;
						auxiliar = auxiliar / 10;
					}
					if (num == inverso) {
						System.out.println("El número es capicúa.");
					} else {
						System.out.println("No es un número capicúa.");
					}
				} else {
					System.out.println("¡Recuerde! Es un número POSITIVO.");
					esValido = false;
				}
			} catch (InputMismatchException e) {
				esValido = false;
				System.out.println("Dato incorrecto.");
				sc.nextLine();
			}
		} while (!esValido);
		//Cierre del Scanner
		sc.close();
	}

}
