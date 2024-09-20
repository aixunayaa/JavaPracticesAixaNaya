package ejercicios;

public class Eje32bucAnid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Diseña una aplicación que muestre las tablas de multiplicar del 1 al 10.
		int tabla,i;
		 for (tabla=1; tabla<=10; tabla++)
		 {
		 System.out.println ("\n\nTabla del " +tabla);
		 System.out.println ("---------------");
		 for (i=1;i<=10;i++)
		 {
			 System.out.println (tabla + " x " + i + " = " + tabla*i);
			 }
		 }
	}

}
