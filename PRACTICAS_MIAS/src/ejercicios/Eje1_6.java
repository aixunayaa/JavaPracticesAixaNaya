package ejercicios;

import java.util.Scanner;

public class Eje1_6 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir tres números y mostrarlos ordenados de mayor a menor.
		int a,b,c;
		 System.out.print("Introduzca primer número: ");
		 a=Integer.parseInt(input.next());
		 System.out.print("Introduzca segundo número: ");
		 b=Integer.parseInt(input.next());
		 System.out.print("Introduzca tercer número: ");
		 c=Integer.parseInt(input.next());
		 
		 if(a>b && b>c)
		 System.out.println( a+", "+b+", "+c);
		 else{
		 if(a>c && c>b)
		 System.out.println(a+", "+c+", "+b);
		 else{
			 if(b>a && a>c)
			 System.out.println(b+", "+a+", "+c);
			 else{
			 if(b>c && c>a)
			 System.out.println(b+", "+c+", "+a);
			 else{
			 if(c>a && a>b)
			 System.out.println(c+", "+a+", "+b);
			 else{
			 if(c>b && b>a)
			 System.out.println(c+", "+b+", "+a);
		  }
		 }
		}
	   }
      }

	}

}
