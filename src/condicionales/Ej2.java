package condicionales;

import java.util.Scanner;

/*PRUEBAS
 *VLR. ENTRADA: 26597217   | RES. ESPERADO: 26597217V   | RES. OBTENIDO: 26597217V
 *VLR. ENTRADA: 31884794   | RES. ESPERADO: 31884794D   | RES. OBTENIDO: 31884794D
 *VLR. ENTRADA: 08368666   | RES. ESPERADO: 08368666R   | RES. OBTENIDO: 08368666R
 */

public class Ej2 {

	public static void main(String[] args) {
		// Creo las variables para pedir el número y para hallar el resto
		int dni, resto;
		
		//Creo el Scanner para pedir por teclado el DNI
		Scanner sc = new Scanner (System.in);
		
		//Pido los número del DNI
		System.out.println("Escriba el número de su DNI: ");
		//Leo el número ingresado
		dni = sc.nextInt();
		
		//
		resto = dni%23;
		
		//Creo condicional switch case para evaluar todas las posibilidades
		switch (resto) {
		case 0: System.out.println("La letra del DNI " + dni + " es " + " T.");
		break;
		case 1: System.out.println("La letra del DNI " + dni + " es " + " R.");
		break;
		case 2: System.out.println("La letra del DNI " + dni + " es " + " W.");
		break;
		case 3: System.out.println("La letra del DNI " + dni + " es " + " A.");
		break;
		case 4: System.out.println("La letra del DNI " + dni + " es " + " G.");
		break;
		case 5: System.out.println("La letra del DNI " + dni + " e s" + " M.");
		break;
		case 6: System.out.println("La letra del DNI " + dni + " es " + " Y.");
		break;
		case 7: System.out.println("La letra del DNI " + dni + " es " + " F.");
		break;
		case 8: System.out.println("La letra del DNI " + dni + " es " + " P.");
		break;
		case 9: System.out.println("La letra del DNI " + dni + " es " + " D.");
		break;
		case 10: System.out.println("La letra del DNI " + dni + " es " + " X.");
		break;
		case 11: System.out.println("La letra del DNI " + dni + " es " + " B.");
		break;
		case 12: System.out.println("La letra del DNI " + dni + " es " + " N.");
		break;
		case 13: System.out.println("La letra del DNI " + dni + " es " + " J.");
		break;
		case 14: System.out.println("La letra del DNI " + dni + " es " + " Z.");
		break;
		case 15: System.out.println("La letra del DNI " + dni + " es " + " S.");
		break;
		case 16: System.out.println("La letra del DNI " + dni + " es " + " Q.");
		break;
		case 17: System.out.println("La letra del DNI " + dni + " es " + " V.");
		break;
		case 18: System.out.println("La letra del DNI " + dni + " es " + " H.");
		break;
		case 19: System.out.println("La letra del DNI " + dni + " es " + " L.");
		break;
		case 20: System.out.println("La letra del DNI " + dni + " es " + " C.");
		break;
		case 21: System.out.println("La letra del DNI " + dni + " es " + " K.");
		break;
		case 22: System.out.println("La letra del DNI " + dni + " es " + " E.");
		
		//Cierro el Scanner
		sc.close();
		
		}

	}

}
