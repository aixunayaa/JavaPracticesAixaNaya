package ejercicios;

import java.util.Scanner;

public class Eje1_1 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Pedir dos números y decir si son iguales o no.
		int n1,n2;
		 System.out.print("Introduce el primer número: ");
		 n1= Integer.parseInt(input.next());
		 System.out.print("Introduce el segundo número: ");
		 n2= Integer.parseInt(input.next());;
		 if(n1==n2)
		 System.out.println("Son iguales");
		 else
		 System.out.println("No son iguales");
		
	}

}
