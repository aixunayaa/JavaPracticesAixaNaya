package ejercicios;

import java.util.Scanner;

public class Eje23for {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de
		//alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 175.
		int edad,media_edad,suma_edad,mayor_edad,mayor_175; //mayor_edad: mayores de 18 años
		 double altura,media_altura,suma_alt;
		 mayor_edad=0;
		 media_altura=0;
		 mayor_175=0;
		 suma_edad=0;
		 suma_alt=0;
		 for (int i=1;i<5;i++){
		 System.out.println("Alumno " +i);
		 System.out.print("Introduzca edad: ");
		 edad=Integer.parseInt(input.next());
		 System.out.print("Introduzca altura: ");
		 altura=Integer.parseInt(input.next());
		 if(edad>18)
		 mayor_edad++;
		 if(altura>175)
			 mayor_175++;
			 suma_edad=suma_edad+edad;
			 suma_alt=suma_alt+altura;
			 }
			 media_edad=suma_edad/5;
			 media_altura=suma_alt/5;
			 System.out.println("\n\nLa edad media es de: " +media_edad);
			 System.out.println("La altura media es de: " +media_altura);
			 System.out.println("Mayor de 18 años: " +mayor_edad);
			 System.out.println("Mayor de 175cm: " +mayor_175);



	}

}
