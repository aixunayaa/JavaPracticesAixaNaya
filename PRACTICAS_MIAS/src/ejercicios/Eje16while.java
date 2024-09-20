package ejercicios;

import java.util.Scanner;

public class Eje16while {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
		int num,suma;
		 suma=0;
		 do
		 {
		 System.out.print("Introduzca un número: ");
		 num=Integer.parseInt(input.next());
		 suma=suma+num;
		 }
		 while(num!=0);

		 System.out.println("La suma de todos los números es: "+suma);
	}

}
