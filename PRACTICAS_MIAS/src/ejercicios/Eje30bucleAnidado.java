package ejercicios;

public class Eje30bucleAnidado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Realiza detenidamente una traza al siguiente programa y muestra cual seria la salida por pantalla:
		//PROGRAMA ej_1
		//VARIABLES
	//	suma, i, j: ENTERO
	//	COMIENZO
	//	PARA i <- 1 HASTA 4
	//	PARA j <- 3 HASTA 0 INC -1
	//	suma <- i*10+j
	//	escribir (suma)
	//	FIN PARA
	//	FIN PARA
	//	FIN
		
		int suma;
		 for (int i=0;i<4;i++){
		 for (int j=3;j>0;j--){
		 suma=i*10+j;
		 System.out.println(suma);
		 }
		 }

	}

}
