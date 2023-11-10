package condicionales;

import java.util.Scanner;

/*PRUEBAS
 * VLR. ENTRADA: 5, 59, 58 | RES. ESPERADO: Ahora son las: 5 h, 59 m y 59 s. | RES. OBTENIDO: Ahora son las: 5 h, 59 m y 59 s.
 * VLR. ENTRADA: 23, 59, 59 | RES. ESPERADO: Ahora son las: 0 h, 0 m y 0 s. | RES. OBTENIDO: Ahora son las: 0 h, 0 m y 0 s.
 */

public class Ej7 {

	public static void main(String[] args) {
		// Creo las variables para capturar los datos
		int hora, min, seg;
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		//Pido y capturo los datos
		System.out.println("Ingrese la hora, en formato 24 HORAS.");
		System.out.println("Empiece con la hora:");
		hora = sc.nextInt();
		System.out.println("Ahora minutos: ");
		min = sc.nextInt();
		System.out.println("Ahora segundos: ");
		seg = sc.nextInt();
		//Creo la lógica del programa para evaluar diferentes posibilidades
		if (hora >= 0 && hora <= 24 && min >= 0 && min < 60 && seg >= 0 && seg < 60) {
			System.out.println("Hora correcta.");
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
			//Imprimo la hora
			System.out.println("Ahora son las: " + hora + " horas, " + min + " minutos y " + seg + " segundos.");
			//Si usuario escribe un dato incorrecto, por aquí sale del programa
		} else {
			System.out.println("Hora incorrecta.");
		}
		//Cierre del scanner
		sc.close();

	}

}
