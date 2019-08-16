package com.javataller.clase02;

import java.util.Scanner;

public class DemoSwitch {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un día de la semana:");
		
		int v = scanner.nextInt();
		
		String dia;
		
		switch(v) {
			case 1:
				dia = "Lunes";
				break;
			case 2:
				dia = "Martes";
				break;
			case 3:
				dia = "Miercoles";
				break;
			case 4:
				dia = "Jueves";
				break;
			case 5:
				dia = "Viernes";
				break;
			case 6:
				dia = "Sabado";
				break;
			case 7:
				dia = "Domingo";
				break;
			default:
				dia = "Dia invalido. Debe ingresar un numero del 1 al 7";
		}
		
		System.out.println(dia);
	}
}
