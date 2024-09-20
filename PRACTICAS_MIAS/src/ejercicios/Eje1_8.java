package ejercicios;

import java.util.Scanner;

public class Eje1_8 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.
		
		int num;
		 int dm, um, c, d, u;
		 // 9 9 . 9 9 9 a cada guarismo lo llamaremos:
		 //dm um c d u: dm (decenas de millar), um:(unidades de millar)
		 // c: (centenas), d: (decenas), u: (unidades)
		 System.out.print("Introduzca un número entre 0 y 99.999: ");
		 num=Integer.parseInt(input.next());
		 // unidad
		 u = num % 10;
		 num = num / 10;
		 // decenas
		 d = num % 10;
		 num = num / 10;
		 // centenas
		 c = num % 10;
		 num = num / 10;
		 // unidades de millar
		 um = num % 10;
		 num = num / 10;
		 // decenas de millar
		 dm = num;
		 // lo imprimimos al revés:
		 System.out.println (u + " " + d + " " + c + " " + um + " " + dm);
		 // otra forma de hacerlo es
		 num = 10000*u + 1000*d + 100*c + 10*um + dm;
		 System.out.println (num);


	}
//SOLO SIRVE PARA 5 CIFRAS, SI SE PONE UNO MENOR HABRIA QUE CAMBIAR EL CODIGO!!!
}
