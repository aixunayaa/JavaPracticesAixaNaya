package ejercicios;

import java.util.Scanner;

public class AA_LUCAS_PARCIAL {
	private static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String codigoTermotanque;
		int capacidadCalorica;
		int menorDeficiencia = Integer.MAX_VALUE;
		String codigoMenorDeficiencia = "";

		do {
			System.out.println("Ingrese el codigo del termotanque o dejelo vacio para finalizr: ");
			codigoTermotanque = scanner.nextLine();

			if (!codigoTermotanque.isEmpty()) {
				do {
					System.out.println("Ingrese la capacidad calorica del termotanque: ");
					capacidadCalorica = scanner.nextInt();
					scanner.nextLine();
				} while (capacidadCalorica <= 0);
				
				int perdidaTotalCalorica = 0;

				int menorDeficienciaTermotanque = Integer.MAX_VALUE;
				boolean termotanqueSirve = false;
				boolean perdidaExcesiva = false;
				boolean aislacionInsuficiente = true;

				for (int i = 1; i <= 4; i++) {
					System.out.println("Ingrese la perdida calorica en la prueba " + i + ": ");
					int perdidaCalorica = scanner.nextInt();
					scanner.nextLine();

					double deficienciaTermotanque = perdidaCalorica / capacidadCalorica;

					if (deficienciaTermotanque <= 0.25) {
						aislacionInsuficiente = false;
						if (deficienciaTermotanque < 0.1) {
							termotanqueSirve = true;
						}
						if (perdidaCalorica < menorDeficienciaTermotanque) {
							menorDeficienciaTermotanque = perdidaCalorica;
						}
					} else {
						perdidaExcesiva = true;

					}
				}
				if (termotanqueSirve) {
					System.out.println("Termotanque apto");
				} else {
					if (perdidaExcesiva) {
						System.out.println("Perdida excesaiva de calorias");
					} else if (aislacionInsuficiente) {
						System.out.println("Aislacion Insuficiente");
					}
				}
				if (menorDeficienciaTermotanque < menorDeficiencia) {
					menorDeficiencia = menorDeficienciaTermotanque;
					codigoMenorDeficiencia = codigoTermotanque;
				}
			}

		} while (!codigoTermotanque.isEmpty());

		if (!codigoMenorDeficiencia.isEmpty()) {
			System.out.println("El termotanque con la menor deficiencia termica es: " + codigoMenorDeficiencia
					+ " con una perdida calorica de " + menorDeficiencia);
		} else {
			System.out.println("No se ingresaron termotanques");
		}

		scanner.close();

	}

}
