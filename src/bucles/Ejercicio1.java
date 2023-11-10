package bucles;

import java.util.InputMismatchException;

import java.util.Scanner;


public class Ejercicio1 {


	public static void main(String[] args) {

		// Creo las variables necesarias
		int hora, min, seg = 0, incremento;


		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese la hora, en formato 24 HORAS.");

		try {
			System.out.println("Empiece con la hora:");
			hora = sc.nextInt();
			System.out.println("Ahora minutos: ");
			min = sc.nextInt();
			System.out.println("Ahora segundos: ");
			seg = sc.nextInt();
			System.out.println("Ahora escribe cuantos segundos quieres incrementar: ");
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

		}catch(InputMismatchException e){
			System.out.println("El dato ingresado no es válido.");

		}

		
		sc.close();

	}



}