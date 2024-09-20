package ejercicios;

import java.util.Scanner;

public class Eje1_5 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir dos números y mostrarlos ordenados de mayor a menor.
		int n1,n2;
		System.out.print("Introduce un número: ");
		 n1=Integer.parseInt(input.next());
		 System.out.print("Introduce otro número: ");
		 n2=Integer.parseInt(input.next());

		 if(n1>n2)
		 System.out.println(n1 + " y " + n2);
		 else
		 System.out.println(n2 + " y " + n1); 



	}

}
