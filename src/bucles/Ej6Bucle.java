package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;
/*PRUEBAS
 * ENTRADA: -8 |VALOR OBTENIDO Y ESPERADO:Número inválido. Escriba un número entre 1 y 20:
 * ENTRADA: HG |VALOR OBTENIDO Y ESPERADO:Dato inválido. Escriba un número entre 1 y 20:
 * ENTRADA: 5 |VALOR ESPERADO Y OBTENIDO:
 * 1
   22
   333
   4444
   55555
 */

public class Ej6Bucle {

	public static void main(String[] args) {
		// Creo la variable para el número
		int num;
		//Variable para validar números negativos
		boolean esValido;
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		/*Bloque de código donde está el do-while, para ejecutar el bucle.
		 * Try-catch para detectar caracteres diferentes a números.
		 * if para validar que el número se encuentre en el rango pedido.
		 * Bucle for anidado con lógica del programa.
		 */
		do {
			try {
				esValido = true;
				System.out.println("Escriba un número entre 1 y 20:");
				num = sc.nextInt();
				if (num < 0 || num > 20) {
					System.out.println("Número inválido.");
					esValido = false;
				} else {
					if (num >= 1 && num <= 20) {
						for (int fila = 1; fila <= num; fila++) {
							for (int incremento = 1; incremento <= fila; incremento++) {
								System.out.print(fila);
							}
							System.out.println();
						}
					}
				}
			} catch (InputMismatchException e) {
				esValido = false;
				System.out.println("Dato inválido.");
				sc.nextLine();
			}

		} while (!esValido);
		//Cierre del Scanner
		sc.close();

	}

}
