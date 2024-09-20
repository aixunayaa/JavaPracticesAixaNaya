package ejercicios;

import java.util.Scanner;

public class Eje1_7 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.
		int num;
		 System.out.print("Introduzca un número entre 0 y 99.999: ");
		 num=Integer.parseInt(input.next());
		 if(num<10)
		 System.out.println("tiene 1 cifra");
		 else{
			 if(num<100)
			 System.out.println("tiene 2 cifras");
			 else{
			 if(num<1000)
			 System.out.println("tiene 3 cifras");
			 else{
			 if(num<10000)
			 System.out.println("tiene 4 cifras");
			 else{
			 if(num<100000)
			 System.out.println("tiene 5 cifras");
			}
		   }
		  }
		 }

	}

}
