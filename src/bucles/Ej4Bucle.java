package bucles;

import java.util.InputMismatchException;

import java.util.Scanner;
/*PRUEBAS:
 * VLR. ENTRADA:1,D ||VLR. ESPERADO Y OBTENIDO: Dato inválido. Introduzca dos números enteros positivos:
 * VLR. ENTRADA:-8, 4 ||VLR. ESPERADO Y OBTENIDO: ¡Recuerde, son dos números enteros positivos! Introduzca dos números enteros positivos:
 * VLR. ENTRADA: 8, 16 ||VLR. ESPERADO Y OBTENIDO: El Máximo Común Divisor es: 8
 */

public class Ej4Bucle {

	public static void main(String[] args) {
		// Creo las variables
		int num1, num2, numMenor;
		// Creo variable para validar número positivo
		boolean esValido;
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		/*Bloque de código con do-while para hacer ciclo de solicitud de número,
		*try-catch para validar que el dato sea numérico,
		*y lógica del programa.
		*/
		do {
			try {
				esValido = true;
				System.out.println("Introduzca dos números enteros positivos:");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				//Validación de número positivo mayor que 0
				if(num1>0 && num2>0) {
					if (num1 < num2) {
						numMenor = num1;
					} else {
						numMenor = num2;
					}
					for (int i = numMenor; i >= 1; i--) {
						//obtener residuo de la división de cada número para determinar que sea común divisor
						if (num1 % i == 0 && num2 % i == 0) {
							System.out.println("El Máximo Común Divisor es: " + i);
							break;
						}
					}
				}else {
					esValido = false;
					System.out.println("¡Recuerde, son dos números enteros positivos!");
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
