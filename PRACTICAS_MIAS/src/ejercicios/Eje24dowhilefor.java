package ejercicios;

import java.util.Scanner;

public class Eje24dowhilefor {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número.
		int num;
		do
		 {
		 System.out.print("Introduce número (de 0 a 10): ");
		 num =Integer.parseInt(input.next());
		 }
		while ( ! (0<=num && num<=10));
		 System.out.println("\n\nTabla del " + num);

		 for (int i=1;i<=10;i++)
		 {
		 System.out.println(num + " x " + i + " = " + num*i);

		 }


	}

}
