package condicionales;

import java.util.Random;
import java.util.Scanner;

/*PRUEBAS
 * MAQUINA ME DA: 79+19 |VLR. ENTRADA: 98 | RES. ESPERADO: RESULTADO CORRECTO  | RES. OBTENIDO: RESULTADO CORRECTO
 * MAQUINA ME DA: 94+43 |VLR. ENTRADA: 130 | RES. ESPERADO: CALCULASTE MAL  | RES. OBTENIDO: CALCULASTE MAL
 */

public class Ej6 {

	public static void main(String[] args) {
		//Creo objeto Random
		Random random = new Random();
		
		// Creo las variables
		int num1 = random.nextInt(1, 100);
		int num2 = random.nextInt(1, 100);
		int resultado = num1 + num2;
		int resHumano;
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		//Pido un número resultado al usuario
		System.out.println("Escriba el resultado de la suma de " + num1 + " + " + num2);
		//Leo el valor ingresado por teclado
		resHumano = sc.nextInt();
		//Creo las condiciones para comprobar que el número coincida
		if (resultado == resHumano) {
			System.out.println("El resultado es correcto.");
		} else {
			System.out.println("Calculaste mal.");
		}
		//Cierro el Scanner
		sc.close();

	}

}
