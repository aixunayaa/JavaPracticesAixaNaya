package ejercicios;

import java.util.Scanner;

public class Eje1_2 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Pedir un número e indicar si es positivo o negativo.
		int num;
		 System.out.print("Introduce un número: ");
		 num = Integer.parseInt(input.next());

		 if( num < 0)
		 System.out.println("Negativo");
		 else
		 System.out.println("Positivo");
	}

}
