package ejercicios;

import java.util.Scanner;

public class Eje26for {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sueldo, sueldo_max;
		 int n;
		 sueldo_max = 0; // como los sueldos son positivos, inicializamos el sueldo
		 // máximo a cero.
		 System.out.print("Número de sueldos: ");
		 n = Integer.parseInt(input.next());
		 System.out.println("--------");
		 for (int i=1;i<=n;i++)
		 {
		 System.out.print("Introduce sueldo: ");
		 sueldo=Integer.parseInt(input.next());
		 if (sueldo > sueldo_max)
		 sueldo_max = sueldo;
		 // si leemos un sueldo mayor que el máximo, este sueldo será el nuevo máximo.
		 }
		 System.out.println("\nEl sueldo máximo es: " +sueldo_max);

	}

}
