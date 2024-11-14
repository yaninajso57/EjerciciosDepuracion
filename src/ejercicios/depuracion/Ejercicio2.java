package ejercicios.depuracion;

import java.util.Scanner;

public class Ejercicio2 {
	/* 
	* programa que lee un número n y muestra n asteriscos
	*/

	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n, contador = 0;
		 System.out.print("Introduce un número: ");
		 n = sc.nextInt();
		 while (contador< n){
			 System.out.println(" * ");
			 contador++;
		 }
	 }
}
