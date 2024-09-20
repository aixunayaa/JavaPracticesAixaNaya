package ejercicios;

import java.util.Scanner;

public class Eje25for {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
			 int nota,aprobados,suspensos,condicionados;
			 aprobados=0;
			 suspensos=0;
			 condicionados=0;

			 for (int i=1;i<=6;i++)
			 {
			 System.out.print("Introduzca nota entre 0 y 10: ");
			 nota=Integer.parseInt(input.next());
			 if(nota == 4)
			 condicionados++;
			 else
			 if(nota >= 5)
			 aprobados++;
			 else
			 if(nota < 4) // este if sobra, ya que es el único caso posible
			 suspensos++;


			 }
			 System.out.println("Aprobados: " +aprobados);
			 System.out.println("Suspensos: " +suspensos);
			 System.out.println("Condicionados: "+condicionados);

	}

}
