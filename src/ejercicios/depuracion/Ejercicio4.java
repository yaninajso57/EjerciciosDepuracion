package ejercicios.depuracion;

import java.util.Scanner;

public class Ejercicio4 {
	/*
	* Programa que obliga al usuario a introducir un número menor que 100
	*/
	public static void main(String[] args) {
		 int valor;
		 Scanner in = new Scanner( System.in );
		 do {
			 System.out.print("Escribe un entero < 100: ");
			 valor = in.nextInt();
		 }while (valor >= 100);
		 	System.out.println("Ha introducido: " + valor);
		 }
}
