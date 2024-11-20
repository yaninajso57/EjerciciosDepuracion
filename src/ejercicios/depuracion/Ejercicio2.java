package ejercicios.depuracion;

import java.util.Scanner;

public class Ejercicio2 {
	/* 
	* programa que lee un número n y muestra n asteriscos
	*/

	 public static void main(String[] args) {
		
		 int n, contador = 0;
		 n=pedirNumero();
		 while (contador< n){
			 System.out.println(" * ");
			 contador++;
		 }
	 }
		 
	public static int pedirNumero() {
			Scanner sc = new Scanner(System.in);
			System.out.print("Introduce un número: ");
			return sc.nextInt();
	}
}
