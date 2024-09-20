package ejercicios;

import java.util.Scanner;

public class Eje22for {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€
		int sueldo,suma,mayor_1000;
		 suma=0;
		 mayor_1000=0;
		 for (int i=1;i<10;i++)
		 {
		 System.out.print("Escribe un sueldo: ");
		 sueldo = Integer.parseInt(input.next());
		 if(sueldo>1000)
		 mayor_1000++;
		 suma=suma+sueldo;
		 }
		 System.out.println("Mayores de 1000 hay: "+mayor_1000);
		 System.out.println("la suma es de: "+suma);
		
	}
}

