package condicionales;

import java.util.Scanner;

/*PRUEBAS
* VLR. ENTRADA: -5   | RES. ESPERADO:  NÚMERO INCORRECTO  | RES. OBTENIDO: NÚMERO INCORRECTO
* VLR. ENTRADA: 15487   | RES. ESPERADO:  NÚMERO INCORRECTO  | RES. OBTENIDO: NÚMERO INCORRECTO
* VLR. ENTRADA: 8 | RES. ESPERADO: EL NÚMERO ES VÁLIDO. ES CAPICUA.| RES. OBTENIDO:EL NÚMERO ES VÁLIDO. ES CAPICUA.
* VLR. ENTRADA: 22 | RES. ESPERADO: EL NÚMERO ES VÁLIDO. ES CAPICUA.| RES. OBTENIDO:EL NÚMERO ES VÁLIDO. ES CAPICUA.
* VLR. ENTRADA: 545 | RES. ESPERADO:EL NÚMERO ES VÁLIDO. ES CAPICUA. | RES. OBTENIDO:EL NÚMERO ES VÁLIDO. ES CAPICUA.
* VLR. ENTRADA: 9449 | RES. ESPERADO: EL NÚMERO ES VÁLIDO. ES CAPICUA. | RES. OBTENIDO:EL NÚMERO ES VÁLIDO. ES CAPICUA.
* VLR. ENTRADA: 47 | RES. ESPERADO: EL NÚMERO ES VÁLIDO. NO ES CAPICUA.| RES. OBTENIDO:EL NÚMERO ES VÁLIDO. NO ES CAPICUA.
* VLR. ENTRADA: 642 | RES. ESPERADO:EL NÚMERO ES VÁLIDO. NO ES CAPICUA. | RES. OBTENIDO:EL NÚMERO ES VÁLIDO. NO ES CAPICUA.
* VLR. ENTRADA: 1591 | RES. ESPERADO: EL NÚMERO ES VÁLIDO. NO ES CAPICUA. | RES. OBTENIDO:EL NÚMERO ES VÁLIDO. NO ES CAPICUA.
*/
public class Ej1 {

	public static void main(String[] args) {
		// Creo la variable
		int num;

		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Pido el número
		System.out.println("Ingrese un número entre 0 y 9999: ");
		// Leo el número
		num = sc.nextInt();
		// Creo las condiciones e instrucciones para comprobar el número
		if (num >= 0 && num <= 9999) {
			System.out.println("El número es válido.");
			if (num <= 9) {
				System.out.println("Es capicua.");
			} else {
				if (num >= 10 && num <= 99 && num % 10 == num / 10) {
					System.out.println("Es capicua.");
					// System.out.println(num%10); Prueba de condición
					// System.out.println(num/10); Prueba de condición
				} else {
					if (num >= 100 && num <= 999 && num / 100 == num % 10) {
						System.out.println("Es capicúa.");
						// System.out.println(num%10); Prueba de condición
						// System.out.println(num/100); Prueba de condición
					} else {
						if (num >= 1000 && num <= 9999 && num / 1000 == num % 10
								&& ((num / 100) % 10) == ((num / 10) % 10)) {
							System.out.println("Es capicúa.");
							// System.out.print(num/1000 + " "); Prueba de condición
							// System.out.println(num%10); Prueba de condición
							// System.out.println((num/100) %10 + " "); Prueba de condición
							// System.out.print((num/10) %10 + " "); Prueba de condición
						} else {
							System.out.println("No es capicúa.");
						}
					}
				}
			}
		} else {
			System.out.println("El número es incorrecto");
		}
		// Cierre del scanner
		sc.close();
	}

}
