package ejercicios.depuracion;

import java.util.Scanner;

public class Ejercicio5 {
	/*
	* Programa que lee un número entre 1 y 10 ambos incluidos
	*/
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner( System.in );
		do {
			System.out.print("Escribe un número entre 1 y 10: ");
			n = sc.nextInt();
		}while (n<1 || n >10);
		System.out.println("Ha introducido: " + n);
	}
}
