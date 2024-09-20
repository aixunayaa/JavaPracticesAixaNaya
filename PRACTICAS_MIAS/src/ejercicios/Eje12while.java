package ejercicios;

import java.util.Scanner;

public class Eje12while {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca
		//un 0.
			 int num;
			 System.out.print("Introduzca un número: ");
			 num=Integer.parseInt(input.next());
			 while(num!=0) // mientras num sea distinto de 0
			 {
			 if(num>0)
			 // mayor que cero: positivo
			 System.out.println("Positivo");
			 else
			 // si no es positivo: es negativo
			 System.out.println("Negativo");
			 // repetimos el proceso y volvemos a leer num
			 System.out.print("Introduzca otro número: ");
			 num=Integer.parseInt(input.next());
			 }
			 // al salir del mientras tenemos la certeza que num es 0


	}

}
