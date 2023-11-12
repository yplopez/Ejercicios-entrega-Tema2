package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;
/*PRUEBAS
 * ENTRADA: l |VALOR OBTENIDO Y ESPERADO:Dato inválido. Ingrese un número entero positivo: 
 * ENTRADA: -9 |VALOR OBTENIDO Y ESPERADO:¡Recuerde! Es un número positivo.Ingrese un número entero positivo: 
 * ENTRADA:  |VALOR ESPERADO Y OBTENIDO:
 * 1
   121
   12321
   1234321
 */
public class Ej7Bucle {

	public static void main(String[] args) {
		// creo la variable para el número
		int num;
		//Variable para validar números positivos
		boolean esValido;
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		/*Bloque de código donde está el do-while, para ejecutar el bucle.
		 * Try-catch para detectar caracteres diferentes a números.
		 * if para validar que el número se encuentre en el rango pedido.
		 * Bucle for anidado con 2 for a la misma altura para la lógica del programa.
		 */
		do {
			esValido = true;
			try {
				System.out.println("Ingrese un número entero positivo: ");
				num = sc.nextInt();
				if (num < 0) {
					System.out.println("¡Recuerde! Es un número positivo.");
					esValido = false;
				} else {
					for (int i = 1; i <= num; i++) {
						for (int j = 1; j <= i; j++) {
							System.out.print(j);
						}
						for (int k = i - 1; k >= 1; k--) {
							System.out.print(k);
						}
						System.out.println("");
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
