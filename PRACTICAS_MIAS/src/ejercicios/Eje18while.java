package ejercicios;

import java.util.Scanner;

public class Eje18while {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribir todos los números del 100 al 0 de 7 en 7.
		
		// inicializamos la i a 100
		 // mientras la i sea mayor o igual a 0
		 // y en cada vuelta del for la i se decrementa en 7
		 for (int i=100;i>=0;i-=7)
		 System.out.println(i);
		 // el for al llevar una sola instrucción en su cuerpo de ejecución
		 // no precisa de llaves { }
	}

}
