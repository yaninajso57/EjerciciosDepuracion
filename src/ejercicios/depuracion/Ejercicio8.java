package ejercicios.depuracion;

public class Ejercicio8 {
	/*
	* programa que muestra una tabla de equivalencias entre 
	* grados Fahrenheit y grados celsius
	*/
	public static void main(String[] args) {
		
		 final int VALOR_INICIAL = 10; // limite inf. tabla
		 final int VALOR_FINAL = 100; // limite sup. tabla
		 final int PASO = 10 ; // incremento
		 
		 int fahrenheit;
		 double celsius;
		 
		 fahrenheit = VALOR_INICIAL;
		 System.out.printf("Fahrenheit \t Celsius \n");
		 
		 for (fahrenheit = VALOR_INICIAL; fahrenheit<= VALOR_FINAL; fahrenheit+= PASO) {
			 celsius = 5*(fahrenheit - 32)/9.0;
			 System.out.printf("%7d \t %8.3f \n", fahrenheit, celsius);
		 }
	 }

}
