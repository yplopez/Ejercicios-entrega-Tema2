package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej3Bucle {
	/*PRUEBAS
	 * VALOR ENTRADA: h  || VALOR ESPERADO Y OBTENIDO:  Valor incorrecto. Ingrese un número entero positivo
	 * VALOR ENTRADA: -9  || VALOR ESPERADO Y OBTENIDO: Ingrese un número entero positivo
	 * VALOR ENTRADA: 4  || VALOR ESPERADO Y OBTENIDO: 
	 *    *
         ***
        *****
       *******
	 */
	public static void main(String[] args) {
		// Creo la variable del número n
		int n = 0;
		// Variable para validar números negativos
		boolean error = false;
		// Crear Scanner
		Scanner sc = new Scanner(System.in);
		// Bloque de código con do while y try catch para validar datos
		do {
			error = false;
			System.out.println("Ingrese un número entero positivo");
			try {
				n = sc.nextInt();
				if (n > 0) {
					// Lógica del programa
					for (int fila = 1; fila <= n; fila++) {
						for (int espacio = 1; espacio <= n - fila; espacio++) {
							System.out.print(" ");
						}
						for (int asterisco = 1; asterisco <= 2 * fila - 1; asterisco++) {
							System.out.print("*");
						}
						System.out.println("");
					}
				} else {
					error = true;
				}
			} catch (InputMismatchException e) {
				error = true;
				System.out.println("Valor incorrecto.");
				sc.nextLine();
			}
		} while (error);
		// Cierre del Scanner
		sc.close();
	}

}
