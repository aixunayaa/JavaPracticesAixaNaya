package ejercicios;

import java.util.Scanner;

public class Eje15while {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo
		//números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina
		//cuando el usuario acierta.
		int n, num;
		// n es el número que hay que acertar
		 // num guarda los números introducidos
		 System.out.print("Introduce N: ");
		 n =Integer.parseInt(input.next());
		 System.out.print("Introduce número: ");
		 num=Integer.parseInt(input.next());

		 while(num!=n) // mientras no coincidan ambos números
		 {
		 if(num>n)
		 System.out.println("menor");
		 else
		 System.out.println("mayor");
		 System.out.print("Introduce número: ");
		 num=Integer.parseInt(input.next());
		 }
		 // al salir del mientras tenemos la certeza que num es igual a n

		 System.out.println("Acertaste!");



	}

}
