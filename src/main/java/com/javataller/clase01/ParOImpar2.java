package com.javataller.clase01;

import java.util.Scanner;

public class ParOImpar2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese un valor");
		int v = scanner.nextInt();

		int resto = v % 2;

		String mssg = resto == 0 ? "es Par" : "es Impar";

		System.out.println(v + " " + mssg);
	}
}
