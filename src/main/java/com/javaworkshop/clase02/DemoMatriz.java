package com.javaworkshop.clase02;

import java.util.Scanner;

public class DemoMatriz {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese numero de filas");

		int n = scanner.nextInt();

		System.out.println("Ingrese numero de columnas");

		int m = scanner.nextInt();
		
		int mat[][] = new int[n][m];

		int nro;

		for (int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				nro = (int) Math.random() * 1000; 
				mat[i][j] = nro; 
			}
		}
		
		System.out.println("\n\nCantidad de filas: " + n);
		System.out.println("Cantidad de columnas" + m);
		
		// leemos el array
		
	}
}
