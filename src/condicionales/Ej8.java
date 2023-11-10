package condicionales;

import java.util.Scanner;

/*PRUEBAS
 * VLR. ENTRADA: 1000, 8 | RES. ESPERADO: 1750 | RES. OBTENIDO: VALOR ABSOLUTO 1750
 * VLR. ENTRADA: 50, 2 | RES. ESPERADO: 125 | RES. OBTENIDO: VALOR ABSOLUTO 125
 */

public class Ej8 {

	public static void main(String[] args) {
		// Creo las constantes
		final double VLR_KM = 2.5;
		final int DTO = 30;

		// Creo las variables
		double distancia;
		int dias;
		double total;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		//Pido los datos y los capturo
		System.out.println("Ingrese la distancia que va a recorrer en Km: ");
		distancia = sc.nextDouble();
		System.out.println("Ingrese los días de estancia: ");
		dias = sc.nextInt();

		//Hago la fórmula para determinar valor a pagar
		total = distancia * VLR_KM;
		//Creo las condiciones e instrucciones para desarrollar el programa
		if (distancia >= 800 && dias >= 7) {
			//Fórmula para hacer descuento si cumple con la condición
			total = total - (total * 30) / 100;
		}
		//Imprimo el valor a pagar aplicando las instrucciones dadas
		System.out.println("El valor a pagar es: " + total);
		//cierro el scanner
		sc.close();

	}

}
