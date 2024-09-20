package ejercicios;

import java.util.Scanner;

public class Eje10 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de
		//30 días.
		int dia,mes,año;
		 // para que una fecha sea correcta se tiene que cumplir
		 // día en el rango 1..30
		 // mes en el rango 1..12
		 // año cualquiera distinto del 0
		 System.out.print("Introduzca día: ");
		 dia=Integer.parseInt(input.next());
		 System.out.print("Introduzca mes: ");
		 mes=Integer.parseInt(input.next());
		 System.out.print("Introduzca año: ");
		 año=Integer.parseInt(input.next());

		 if (dia >= 1 && dia <=30)
		 if (mes >= 1 && mes <= 12)
		 if (año > 0)
		 System.out.println ("Fecha correcta");
		 else
		 System.out.println ("Año incorrecto");
		 else
		 System.out.println("Mes incorrecto");
		 else
		 System.out.println("Día incorrecto");

		 
	}
//   SOLO TIRA LO PRIMERO QUE ESTE INCORRECTO
}
