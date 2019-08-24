package com.javaworkshop.clase04;

public class Cadenas {
	
	public static void main(String[] args) {
		
		// formas de crear un String
		String cadena = "Soy una cadena";
		String cadena2 = new String("Soy otra cadena");
		
		// acceder a posiciones de un String
		char c = cadena.charAt(2);		// retorna 'y'
		System.out.println(c);
		
		// recorrer una cadena
		for(int i = 0; i < cadena.length(); i++) {
			System.out.println(i + " -> " + cadena.charAt(i));
		}
		
		// pasar una cadena a mayuscula
		
		String cadenaDePrueba = "Esto Es Otra Cadena Con Mayusculas y Minusculas";
		
		String enMinuscula = cadenaDePrueba.toLowerCase();
		String enMayuscula = cadenaDePrueba.toUpperCase();
		
		System.out.println("Cadena original: " + cadenaDePrueba );
		System.out.println("minuscula: " + enMinuscula );
		System.out.println("mayuscula: " + enMayuscula );
		
		// ocurrencia de caracteres en un String
		
		String otraCadena = "Esto es Otra cadena de Prueba";
		
		int pos1 = otraCadena.indexOf('a');
		int pos2 = otraCadena.lastIndexOf('a');
		int pos3 = otraCadena.indexOf('O');
		
		System.out.println(pos1);
		System.out.println(pos2);
		System.out.println(pos3);
		
		// subcadenas
		
		// utizamos la cadena anterior...
		String sub1 = otraCadena.substring(5, 12);	// notar que toma desde la posicion 5 (inclusive) y no toma la posicion 12
		String sub2 = otraCadena.substring(0, 7);	
		String sub3 = otraCadena.substring(5);		// notar que toma desde la posicion 5 hasta el final
		
		System.out.println(sub1);
		System.out.println(sub2);
		System.out.println(sub3);
		
		
		int accidentesEnAgosto[][] = new int [10][31]; 
		
	}
}
