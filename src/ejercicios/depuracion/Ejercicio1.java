package ejercicios.depuracion;

import java.util.*;
	public class Ejercicio1{
		/*
		* Programa que lee números hasta que se lee un negativo y muestra la
		* suma de los números leídos 
		*/
		private int suma, numero;

		public Ejercicio1() {
			this.suma = 0;
			this.num = 0;
		}
		
		public static void main(String[] args) {
			int suma = 0, num;
			Scanner sc = new Scanner(System.in);
			System.out.print("Introduzca un número: ");
			num = sc.nextInt();
			while (num>= 0){
				suma = suma + num;
				System.out.print("Introduzca un número: ");
				num = sc.nextInt();
			}
			System.out.println("La suma es: " + suma );
		}
}
