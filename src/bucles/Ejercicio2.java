package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creo las variables
		int num, numPrimo = 0;
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		//
		try {
			// Pido un número al usuario
			System.out.println("Ingrese un número entero positivo: ");
			// Leo el número
			num = sc.nextInt();
			
		
			// Planteamiento de lógica del programa
			for (int i = 2; i <= num; i++) {
				boolean esPrimo = true;
				for (int j = 2; j < i; j++) {
					// System.out.println(""+i+""+j) ;
					// System.out.println(i%j) ;
					// System.out.println("el residuo de " + i +" dividido " + j + " es: " + i%j ) ;
					if (i % j == 0) {
						// System.out.println("el residuo de " + i +" dividido " + j + " es: " + i%j ) ;
						esPrimo = false;
					}
				}
				if (esPrimo)
					numPrimo++;
			}
			//Imprimo la cantidad de números primos que hay antes del número ingresado
			System.out.println("Hay " + numPrimo + " números primos.");
		} catch (InputMismatchException e) {
			System.out.println("El dato es inválido");
			//Cierro el Scanner
			sc.close();
		}
	}

}
