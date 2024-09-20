package ejercicios;

import java.util.Scanner;

public class Eje17while {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir un número N, y mostrar todos los números del 1 al N.
		int i,num;
		 System.out.print("Introduce un número: ");
		 num=Integer.parseInt(input.next());
		 i=1;
		 // i es el contador que tomará los valores de 1 a n
		 while(i<=num){
		 System.out.println(i);
		 i++;
		 }


	}

}
