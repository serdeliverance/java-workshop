package com.javaworkshop.clase01;

import java.util.Scanner;

public class EsMayorQue21 {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese su edad: ");
		int edad = scanner.nextInt();
		
		if(edad >= 21) {
			System.out.println("Ud. es mayor de edad");
		} else {
			System.out.println("Ud. no es mayor de edad");
		}
	}
}
