package ejercicios;

import java.util.Scanner;

public class Eje1_4 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir dos números y decir cual es el mayor o si son iguales
		int n1,n2;
		 System.out.print("Introduce un número: ");
		 n1=Integer.parseInt(input.next());
		 System.out.print("Introduce otro número: ");
		 n2=Integer.parseInt(input.next());

		 // si ambos números son iguales diría que n2 es mayor que n1
		 if(n1==n2)
			 System.out.println("Son iguales");
			 else
			 {
			 if(n1>n2)
			 System.out.println(n1 + " es mayor que " + n2);
			 else
			 System.out.println(n2 + " es mayor que " + n1);
			 }
	}

}
