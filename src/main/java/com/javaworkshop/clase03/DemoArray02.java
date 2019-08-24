package com.javaworkshop.clase03;

import java.util.Scanner;

public class DemoArray02 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String dia[] = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < dia.length; i++) {
			System.out.println(dia[i]);
		}
	}
}
