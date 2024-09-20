package ejercicios;

import java.util.Scanner;

public class Eje1_3 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir dos números y decir si uno es múltiplo del otro.
		int n1,n2;
		 System.out.print("Introduce un número: ");
		 n1=Integer.parseInt(input.next());
		 System.out.print("Introduce otro número: ");
		 n2=Integer.parseInt(input.next());
		 if(n1%n2==0)
			 System.out.println("Son múltiplos");
			 else
			 System.out.println("No son múltiplos");


	}

}
