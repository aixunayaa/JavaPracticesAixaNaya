package ejercicios;

import java.util.Scanner;

public class Eje29fortrue {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir 5 números e indicar si alguno es múltiplo de 3.
		int num;
		 boolean multiplo_3;
		 multiplo_3=false;
		 for (int i=0;i<5;i++){
		 System.out.print("Introduzca número: ");
		 num=Integer.parseInt(input.next());
		 if(num %3 == 0)
		 multiplo_3=true; // si se ejecuta esta instrucción significa que al menos hay un múltiplo
		                 //de 3.
		 }
		 if(multiplo_3 == false)
		 System.out.println("no existen múltiplos de 3");
		 else
		 System.out.println("Hay múltiplos de 3");

	}

}
