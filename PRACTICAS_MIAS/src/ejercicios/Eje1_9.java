package ejercicios;

import java.util.Scanner;

public class Eje1_9 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
		int nota;
		 System.out.print("Introduzca una nota: ");
		 nota=Integer.parseInt(input.next());
		 // tanto los if's como los else's encierran a una sola instrucción
		 // y no es necesario utilizar llaves { }

		 if(nota>=0 && nota<5)
		 System.out.println("INSUFICIENTE");
		 else
		 if(nota==5)
		 System.out.println("SUFICIENTE");
		 else
		 if(nota==6)
		 System.out.println("BIEN");
		 else
		 if(nota==7 || nota==8)
		 System.out.println("NOTABLE");
		 else
		 if(nota==9 || nota==10 )
		 System.out.println("SOBRESALIENTE");

	}

}
