package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej1Bucle {
	/*
	 * PRUEBAS 
	 * VLR. ENTRADA: 8,2,3,1 | RES. ESPERADO:08:02:04. | RES. OBTENIDO:08:02:04.
	 * VLR. ENTRADA: ñ | RES. ESPERADO:El dato ingresado no es válido. |RES. OBTENIDO: El dato ingresado no es válido.
	 * VLR. ENTRADA: -3 | RES.ESPERADO: Empiece con la hora: | RES. OBTENIDO: Empiece con la hora:
	 * VLR.ENTRADA: 2,ñ | RES. ESPERADO:El dato ingresado no es válido. | RES. OBTENIDO:
	 * El dato ingresado no es válido.
	 * 
	 */
	public static void main(String[] args) {
		// Creo las variables necesarias
		int hora = -1, min = -1, seg = -1, incremento = -1;
		// Creo variable para validar número errado
		boolean isValid = true;
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Inicio captura de información
		System.out.println("Ingrese la hora, en formato 24 HORAS.");
		// Bloque para capturar hora y validar valor ingresado
		do {
			System.out.println("Empiece con la hora:");
			try {
				hora = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El dato ingresado no es válido.");
				isValid = false;
				hora = -1;
				sc.nextLine();
			}
		} while (hora < 0 || hora > 23);
		// Bloque para capturar minutos y validar valor ingresado
		do {
			System.out.println("Ahora minutos: ");
			try {

				min = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El dato ingresado no es válido.");
				min = -1;
				sc.nextLine();
			}
		} while (hora < 0 || hora > 23 || min < 0 || min > 59);
		// Bloque para capturar segundos y validar valor ingresado
		do {
			System.out.println("Ahora segundos: ");
			try {
				seg = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El dato ingresado no es válido.");
				seg = -1;
				sc.nextLine();
			}
			// Instrucción para segundos a incrementar
		} while (hora < 0 || hora > 23 || min < 0 || min > 59 || seg < 0 || seg > 59);
		do {
			System.out.println("Ahora escribe cuantos segundos quieres incrementar: ");
			// Bloque con lógica de programa, analisis de casos y validación de ingreso de
			// datos
			try {
				incremento = sc.nextInt();
				for (int i = 0; i < incremento; i++) {
					seg++;
					if (seg == 60) {
						seg = 0;
						min++;
					}
					if (min == 60) {
						min = 0;
						hora++;
					}
					if (hora == 24) {
						hora = 0;
					}
				}
				// Bloque de salida de datos de acuerdo a cada caso
				if (hora < 10 && min < 10 && seg < 10) {
					System.out.println("0" + hora + ":" + "0" + min + ":" + "0" + seg + ".");
				} else if (hora < 10 && min < 10) {
					System.out.println("0" + hora + ":" + "0" + min + ":" + seg + ".");
				} else if (hora < 10 && seg < 10) {
					System.out.println("0" + hora + ":" + min + ":" + "0" + seg + ".");
				} else if (min < 10 && seg < 10) {
					System.out.println(hora + ":" + "0" + min + ":" + "0" + seg + ".");
				} else if (hora < 10) {
					System.out.println("0" + hora + ":" + min + ":" + seg + ".");
				} else if (min < 10) {
					System.out.println(hora + ":" + "0" + min + ":" + seg + ".");
				} else if (seg < 10) {
					System.out.println(hora + ":" + min + ":" + "0" + seg + ".");
				} else {

					System.out.println(hora + ":" + min + ":" + seg + ".");
				}
			} catch (InputMismatchException e) {
				System.out.println("El dato ingresado no es válido.");
				// sc.nextLine();
			}

		} while (hora < 0 || hora > 23 || min < 0 || min > 59 || seg < 0 || seg > 59 || incremento < 0);
		// Cierre de Scanner
		sc.close();
	}

}
