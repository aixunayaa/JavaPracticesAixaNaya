package ejercicios;

import java.util.Scanner;

public class Eje13while {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
			 int num;
			 System.out.print("Introduzca un número: ");
			 num=Integer.parseInt(input.next());
			 while(num!=0) // mientras num sea distinto de 0
			 {
			 if(num%2 == 0)
			 // si el resto de dividir entre dos es cero: esto indica que es par
			 System.out.println("Par");
			 else
			 // en caso contrario: impar
			 System.out.println("Impar");
			 // repetimos el proceso y volvemos a leer num
			 System.out.print("Introduzca otro número: ");
			 num=Integer.parseInt(input.next());
			 }
			 // al salir del mientras tenemos la certeza que num es 0 

	}

}
