package ejercicios;

import java.util.Scanner;

public class Eje14while {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
		int num, contador;
		// num guardará los números introducidos
		 // y contador se incrementará para llevar la cuenta de los números introducidos

		 System.out.print("Introduzca un número: ");
		 num=Integer.parseInt(input.next());
		 contador=0; // al comienzo el número de números introducidos es 0

		 while(num>0) // mientras num sea positiva
		 {
		 contador =contador+1; // contador toma el valor que tuviera en este momento más uno
		 // en definitiva: contador se incrementa en uno
		 System.out.print("Introduzca otro número: ");
		 num=Integer.parseInt(input.next());
		 }
		 System.out.println("Se han introducido: " +contador + " números");
		 // sin tener en cuenta el último número negativo.


	}

}
