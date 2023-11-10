package condicionales;

import java.util.Scanner;

public class Ej3 {
	/*
	 * PRUEBAS VLR. 
	 * VLR. ENTRADA: 10, 1, 5 | 
	 * RES. ESPERADO: La cantidad de comida no es suficiente para este día. Cada animal puede comer el día de hoy 0.5 kg. | 
	 * RES. OBTENIDO: La cantidad de comida es suficiente para este día. Cada animal puede comer el día de hoy 0.5 kg.
	 * VLR. ENTRADA: 100, 2, 200 | 
	 * RES. ESPERADO: La cantidad de comida es suficiente para este día. | 
	 * RES. OBTENIDO: La cantidad de comida es suficiente para este día.
	 */

		public static void main(String[] args) {

			// Creo las variables
			int numAnimal;
			double kgComidaDia, totalComDia, cantComidaComp, comDisponible;
			// Creo el Scanner
			Scanner sc = new Scanner(System.in);

			// Pido la información necesria al usuario y la capturo
			System.out.println("Ingrese el número de animales que hay en la granja: ");
			numAnimal = sc.nextInt();
			System.out.println("Ingrese los kilos de comida que come cada animal al día: ");
			kgComidaDia = sc.nextDouble();
			System.out.println("Ingrese la cantidad de comida comprada en kilos: ");
			cantComidaComp = sc.nextDouble();

			// Hago la fórmula para calcular la cantidad de comida diaria necesaria
			totalComDia = numAnimal * kgComidaDia;
			// Fórmula para calcular cuanta comida tiene disponible cada animal ese día
			comDisponible = cantComidaComp / numAnimal;

			// Planteo las condiciones y respuestas para cada caso
			if (cantComidaComp / totalComDia >= 1 && totalComDia != 0) {
				System.out.println("La cantidad de comida es suficiente para este día.");
			} else {
				System.out.println("No hay comida suficiente para este día. Faltan " + (totalComDia - cantComidaComp)
						+ " Kilos de comida.");
				System.out.println("Cada animal puede comer el día de hoy " + comDisponible + " kg.");
			}

			// Cierre del scanner
			sc.close();

		}

	}


