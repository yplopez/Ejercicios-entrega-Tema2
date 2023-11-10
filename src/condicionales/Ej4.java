package condicionales;

import java.util.Scanner;

public class Ej4 {
	/*
	 * PRUEBAS 
	 * VLR. ENTRADA: -6 | RES. ESPERADO: NÚMERO INVÁLIDO | RES. OBTENIDO:NÚMERO INVÁLIDO 
	 * VLR. ENTRADA: 100 | RES. ESPERADO: NÚMERO INVÁLIDO | RES. OBTENIDO: NÚMERO INVÁLIDO 
	 * VLR. ENTRADA: 8 | RES. ESPERADO: OCHO | RES.OBTENIDO: OCHO
	 * VLR. ENTRADA: 13 | RES. ESPERADO: TRECE | RES. OBTENIDO: TRECE
	 * VLR. ENTRADA: 30 | RES. ESPERADO: TREINTA | RES. OBTENIDO: TREINTA 
	 * VLR. ENTRADA: 35 | RES. ESPERADO: TREINTA Y CINCO | RES. OBTENIDO: TREINTA Y CINCO
	 * VLR. ENTRADA: 97 | RES. ESPERADO: NOVENTA Y SIETE | RES. OBTENIDO: NOVENTA Y SIETE
	 */

	public static void main(String[] args) {
		// Creo las variable
		int num;
		int unidad;
		int decena;
		String numUnidad = "", numDecena = "";
		//Creo el scanner
		Scanner sc = new Scanner(System.in);
		//Pido un número al usuario
		System.out.println("Ingrese un número entre 1 y 99: ");
		//Leo el número ingresado
		num = sc.nextInt();
		//Creo las fórmulas para comprobar los números
		unidad = num % 10;
		decena = num / 10;
		//Creo los bloques necesarios de instrucciones para ejecutar el ejercicio
		switch (unidad) {
		case 1:
			numUnidad = "uno";
			break;
		case 2:
			numUnidad = "dos";
			break;
		case 3:
			numUnidad = "tres";
			break;
		case 4:
			numUnidad = "cuatro";
			break;
		case 5:
			numUnidad = "cinco";
			break;
		case 6:
			numUnidad = "seis";
			break;
		case 7:
			numUnidad = "siete";
			break;
		case 8:
			numUnidad = "ocho";
			break;
		case 9:
			numUnidad = "nueve";
			break;
		case 0:
			numUnidad = "cero";
			break;
		}

		switch (decena) {
		case 1:
			if (numUnidad == "cero") {
				numDecena = "diez";
				numUnidad = "";
			} else {
				numDecena = "dieci";
			}
			break;
		case 2:
			if (numUnidad == "cero") {
				numDecena = "veinte";
				numUnidad = "";
			} else {
				numDecena = "veinti";
			}
			break;
		case 3:
			if (numUnidad == "cero") {
				numDecena = "treinta";
				numUnidad = "";
			} else {
				numDecena = "treinta y ";
			}
			break;
		case 4:
			if (numUnidad == "cero") {
				numDecena = "cuantenta";
				numUnidad = "";
			} else {
				numDecena = "cuarenta y ";
			}
			break;
		case 5:
			if (numUnidad == "cero") {
				numDecena = "cincuenta";
				numUnidad = "";
			} else {
				numDecena = "cincuenta y ";
			}
			break;
		case 6:
			if (numUnidad == "cero") {
				numDecena = "sesenta";
				numUnidad = "";
			} else {
				numDecena = "sesenta y ";
			}
			break;
		case 7:
			if (numUnidad == "cero") {
				numDecena = "setenta";
				numUnidad = "";
			} else {
				numDecena = "setenta y ";
			}
			break;
		case 8:
			if (numUnidad == "cero") {
				numDecena = "ochenta";
				numUnidad = "";
			} else {
				numDecena = "ochenta y ";
			}
			break;
		case 9:
			if (numUnidad == "cero") {
				numDecena = "noventa";
				numUnidad = "";
			} else {
				numDecena = "noventa y ";
			}
			break;
		}
		switch (num) {
		case 11:
			numDecena = "once";
			numUnidad = "";
			break;
		case 12:
			numDecena = "doce";
			numUnidad = "";
			break;
		case 13:
			numDecena = "trece";
			numUnidad = "";
			break;
		case 14:
			numDecena = "catorce";
			numUnidad = "";
			break;
		case 15:
			numDecena = "quince";
			numUnidad = "";
			break;
		}
		//Creo las condiciones para evaluar si el número es válido o no
		if (num <= 0 || num > 99) {
			System.out.println("Número inválido.");
		} else {
			System.out.println("El número ingresado es: " + numDecena + numUnidad + ".");
		}
		// Cierre del Scanner
		sc.close();

	}

}
