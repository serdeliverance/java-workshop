package com.javataller.clase04;

import java.util.Scanner;

public class Ejercicio01Matriz {

	public static void main(String[] args) {

		int n;
		int m;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese las dimensiones de la matriz");

		System.out.print("cantidad de filas: ");
		n = scanner.nextInt();

		System.out.print("cantidad de columnas: ");
		m = scanner.nextInt();

		int matriz[][] = new int[n][m];

		int nro;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				nro = (int) (Math.random() * 1000);
				matriz[i][j] = nro;
			}
		}

		// repito por cada fila
		for (int i = 0; i < n; i++) {

			// repito por cada columna
			for (int j = 0; j < m; j++) {
				System.out.print(matriz[i][j] + "\t"); // ver que se usa print y \t para tabular... probar qué pasaría
														// si quito el \t
			}

			System.out.println(); // para agregar una separación de línea entre las filas
		}
	}
}
