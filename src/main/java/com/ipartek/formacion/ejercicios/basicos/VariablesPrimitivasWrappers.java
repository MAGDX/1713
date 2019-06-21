package com.ipartek.formacion.ejercicios.basicos;

import java.util.Scanner;

/**
 * 
 * @author Arkaitz Marcos
 * @see http://www.campus.formacion.ipartek.com/moodle/mod/page/view.php?id=882
 *
 * Declarar todas los posibles tipos de variables primitivas y wrappers que existen
 *
 */

public class VariablesPrimitivasWrappers {
	
	
	public static void main(String[] args) {
		
		//numeros enteros
		byte b = 1;
		short s = 2;
		int i = 4;
		long l = 8;
		
		//numeros reales
		float f = 2.34f;
		double d = 4.56;
		
		char c = 'a'; //comillas simples
		boolean boo = true; // verdadero o falso	
		
		//Wrappers
		
		int numeroParseado = Integer.parseInt("3");
		System.out.printf("El rango de un int es %d - %d \n \n", Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.println(b + " " + s + " " + i + " " + l + " " + f + " " + d + " " + c + " " + boo + " " + numeroParseado);
		
		//indicar si el caracter introducido por pantalla es MAYUSCULAS, minusculas, letra o numero
		Scanner sc = new Scanner(System.in);
		char caracter;
		
		System.out.println("Inserte un caracter: ");
		caracter = sc.next().charAt(0);		
		sc.close();
		
		if (Character.isDigit(caracter))
		{
			System.out.println("Has escrito un numero.");
		}
		else if (Character.isLetter(caracter))
		{
			System.out.println("Has escrito una letra.");
			if (Character.isUpperCase(caracter))
			{
				System.out.println("Has escrito una mayuscula.");
			}
			else if (Character.isLowerCase(caracter))
			{
				System.out.println("Has escrito una minuscula.");
			}
		}
	}
}