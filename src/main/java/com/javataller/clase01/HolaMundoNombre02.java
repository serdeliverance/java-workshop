package com.javataller.clase01;

import java.util.Scanner;

public class HolaMundoNombre02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese nombre edad altura: ");

		String nombre = scanner.next();

		int edad = scanner.nextInt();

		double altura = scanner.nextDouble();

		System.out.println("Nombre: " + nombre + " Edad: " + edad + " Altura: " + altura);
	}
}
