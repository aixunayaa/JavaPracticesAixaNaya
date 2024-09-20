package ejercicios;

import java.util.Scanner;

public class Eje19while {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir 15 números y escribir la suma total.
		int num,suma_total;
		 suma_total=0;

		 for (int i=1;i<=15;i++)
		 {
		 System.out.print("Introduzca número: ");
		 num=Integer.parseInt(input.next());
		 suma_total=suma_total+num;
		 }
		 System.out.println("La suma total es de: "+suma_total);

//ULTIMO EJERCICIO PAG50 
	}

}
