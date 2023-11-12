package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;
/*PRUEBAS
 * VLR. ENTRADA:7,-8 ||VLR. ESPERADO Y OBTENIDO:¡Recuerde! Son dos números enteros positivos.Introduzca dos números enteros positivos:
 * VLR. ENTRADA:JHG ||VLR. ESPERADO Y OBTENIDO: Dato inválido.Introduzca dos números enteros positivos:
 * VLR. ENTRADA:15, 60 ||VLR. ESPERADO Y OBTENIDO: El mínimo común múltiplo de 15 y 60 es: 60
 */

public class Ej5Bucle {

	public static void main(String[] args) {
		int num1, num2, mcm = 0, contador = 2, nummayor;
		boolean esValido;
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
					if (num1 > num2) {
						nummayor = num1;
					} else {
						nummayor = num2;
					}
					contador = nummayor;
					mcm = contador;
					/*Compruebo que el residuo sea distinto de 0 para continuar con la comprobación hasta obtener un número 
					*que divida exactamente a los dos números.
					*/
					while (contador % num1 != 0 || contador % num2 != 0) {
						contador++;
						mcm = contador;
					}
					System.out.println("El mínimo común múltiplo de " + num1 + " y " + num2 + " es: " + mcm);
				}else {
					esValido = false;
					System.out.println("¡Recuerde! Son dos números enteros positivos.");
				}			
				//excepción para detectar que el dato sea numérico
			} catch (InputMismatchException e) {
				esValido = false;
				System.out.println("Dato inválido.");
				sc.nextLine();

			}

		} while (!esValido);
		//Cierro el Scanner
		sc.close();
	}

}
