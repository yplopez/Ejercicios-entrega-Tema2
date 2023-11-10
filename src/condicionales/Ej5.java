package condicionales;

import java.util.Scanner;
/*
 * PRUEBAS 
 * VLR. ENTRADA: -6 | RES. ESPERADO: VALOR ABSOLUTO 6 | RES. OBTENIDO: VALOR ABSOLUTO 6
 * VLR. ENTRADA: 12 | RES. ESPERADO: VALOR ABSOLUTO 12 | RES. OBTENIDO: VALOR ABSOLUTO 12
 * */

public class Ej5 {

	public static void main(String[] args) {
		// Creo las variables
		int num, numAbs;
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		//Pido un número
		System.out.println("Ingrese un número: ");
		//Leo el número
		num = sc.nextInt();
		//Creo la fórmula para encontrar el número absoluto si ingresan un número negativo
		numAbs = num < 0 ? num * -1 : num;
		//Imprimo el mensaje
		System.out.println("El número absoluto del número ingresado es: " + numAbs);
		//Cierro el scanner
		sc.close();

	}

}
