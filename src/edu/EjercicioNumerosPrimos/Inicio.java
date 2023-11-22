package edu.EjercicioNumerosPrimos;

import java.util.Scanner;

public class Inicio {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	int numPrimos;
	
	System.out.println("Introduzca cantidad de número primos que desea mostrar");
	numPrimos = sc.nextInt();
	
	int aux = 0;
	int i = 1;
	 while( aux<= numPrimos) {
		 if ( esPrimo (i)) {
			 System.out.println("Es primo: " +i);
			 aux ++;	 
		 }
	}
	 public boolean esPrimo(int avaridar) {
		 for(int j = avaridar-1; j>1; j --) {
			 avaridar % j!=0
		 }
	 }
}
}

