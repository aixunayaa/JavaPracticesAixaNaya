package ejercicios;

import java.util.Scanner;

public class Eje11while {
	private static Scanner input = new Scanner(System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número
		//negativo.
		int num,cuadrado;
		 // num guardará el número que leamos
		 // y cuadrado guardará el cuadrado de num
		 System.out.print("Introduzca número: ");
		 num=Integer.parseInt(input.next());
		 while(num>=0){ // repetimos el proceso mientras el número leído no sea negativo
		 cuadrado=num*num;
		 System.out.println(num+ "² es igual a "+ cuadrado);
		 System.out.print("Introduzca otro número: ");
		 num=Integer.parseInt(input.next()); // volvemos a leer num


	}
	}
}
