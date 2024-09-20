package ejercicios;

import java.util.Scanner;

public class Eje28for {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
		int notas;
		 boolean suspensos;
		 suspensos=false; // suponemos que en principio no hay ningún suspenso
		 for (int i=0;i<5;i++)
		 {
		 System.out.print("Introduzca nota (de 0 a 10): ");
		 notas=Integer.parseInt(input.next());
		 if(notas<=5)
		 suspensos=true;
		 }
		 if(suspensos)
		 System.out.println("Hay suspensos");
		 else
		 System.out.println("No hay suspensos");

	}

}
