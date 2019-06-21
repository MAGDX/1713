package com.ipartek.formacion.ejercicios.basicos;

/**
 * 
 * @author Arkaitz Marcos
 * @see http://puntocomnoesunlenguaje.blogspot.com/2012/10/java-ejercicios-iniciales-3.html
 * 
 *      Escribe un programa java que declare una variable A de tipo entero y
 *      as�gnale un valor. A continuaci�n muestra un mensaje indicando si A es
 *      par o impar. Utiliza el operador condicional ( ? : ) dentro del println
 *      para resolverlo. Si por ejemplo A = 14 la salida ser� 14 es par Si fuese
 *      por ejemplo A = 15 la salida ser�: 15 es impar
 *
 */

public class EjerOperadorCondicional {
	public static void main(String[] args) {
		
		final String NOMBRE_EJERCICIO = "Ejercicio 8"; // constante
		System.out.println(NOMBRE_EJERCICIO);

		int a = 14;
		int b = 15;

		System.out.println(a + (a % 2 == 0 ? " es par." : " es impar."));
		System.out.println(b + (b % 2 == 0 ? " es par." : " es impar."));
		System.out.printf("El numero %s es %s \n", b, (b % 2 == 0 ? "par." : "impar."));
		
		float numero = 4.1525936363f;
		
		System.out.printf("El numero %.2f es %s \n", numero, "un float con dos decimales.");
	}
}