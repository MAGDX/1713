package com.ipartek.formacion.ejercicios.basicos;

import java.util.Scanner;

public class EjerSecuenciales {

	public static void main(String[] args) {
		// Ejercicio 1
		System.out.println("Ejercicio 1");
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entero: ");
		n1 = sc.nextInt();
		System.out.println("Introduce otro número entero: ");
		n2 = sc.nextInt();
		System.out.println("Ha introducido los números: " + n1 + " y " + n2);

		// Ejercicio 2
		System.out.println("\nEjercicio 2");
		String cadena;
		System.out.println("Introduce un nombre: ");
		cadena = sc.nextLine();
		System.out.println("Buenos Días " + cadena);

		// Ejercicio 3
		System.out.println("\nEjercicio 3");
		int numero;
		System.out.println("Introduce un número entero:");
		numero = sc.nextInt();
		System.out.println("Número introducido: " + numero);
		System.out.println("Doble = " + 2 * numero);
		System.out.println("Triple = " + 3 * numero);

		// Ejercicio 4
		System.out.println("\nEjercicio 4");
		double c;
		double f;
		System.out.println("Introduce temperatura Cº:");
		c = sc.nextDouble();
		f = 32 + (9 * c / 5);
		System.out.println(c + " ºC = " + f + " ºF");

		// Ejercicio 5
		System.out.println("\nEjercicio 5");
		double r;
		double l;
		double a;
		System.out.println("Introduce el radio de la circunferencia:");
		r = sc.nextDouble();
		l = 2 * Math.PI * r;
		a = Math.PI * Math.pow(r, 2);
		System.out.println("Longitud de la circunferencia -> " + l);
		System.out.println("Area de la circunferencia -> " + a);

		// Ejercicio 6
		System.out.println("\nEjercicio 6");
		double velocidad;
		System.out.println("Inserte velocidad (km/h): ");
		velocidad = sc.nextDouble();
		System.out.println(velocidad + " km/h es igual a " + velocidad * 1000 / 3600 + " m/s.");

		// Ejercicio 7
		System.out.println("\nEjercicio 7");
		double c1;
		double c2;
		double h;
		System.out.print("Introduzca longitud del primer cateto: ");
		c1 = sc.nextDouble();
		System.out.print("Introduzca longitud del segundo cateto: ");
		c2 = sc.nextDouble();
		h = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
		System.out.println("Cateto 1 = " + c1 + "\nCateto 2 = " + c2 + "\nHipotenusa = " + h);

		// Ejercicio 8
		System.out.println("\nEjercicio 8");
		double rad;
		double v;
		System.out.print("Inserte el radio: ");
		rad = sc.nextDouble();
		v = (4.0 / 3) * Math.PI * Math.pow(rad, 3);
		System.out.println("Volumen de la esfera de radio " + rad + " = " + v);

		// Ejercicio 9
		System.out.println("\nEjercicio 9");
		// double a;
		double b;
		// double c;
		double p;
		double area;
		System.out.print("Inserte longitud del primer lado del triángulo: ");
		a = sc.nextDouble();
		System.out.print("Inserte longitud del segundo lado del triángulo: ");
		b = sc.nextDouble();
		System.out.print("Inserte longitud del tercer lado del triángulo: ");
		c = sc.nextDouble();
		p = (a + b + c) / 2;
		area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println("El area del triangulo es " + area);

		// Ejercicio 10
		System.out.println("\nEjercicio 10");
		int n;
		System.out.print("Inserte un numero de 3 cifras: ");
		n = sc.nextInt();
		System.out.println("Centenas = " + (n / 100));
		System.out.println("Decenas = " + (n / 10) % 10);
		System.out.println("Unidades = " + (n % 10));

		// Ejercicio 11
		System.out.println("\nEjercicio 11");
		int num;
		System.out.print("Introduzca un numero de 5 cifras: ");
		num = sc.nextInt();
		System.out.println(num / 10000);
		System.out.println(num / 1000);
		System.out.println(num / 100);
		System.out.println(num / 10);
		System.out.println(num);

		// Ejercicio 12
		System.out.println("\nEjercicio 12");
		// int num;
		System.out.print("Introduzca un numero de 5 cifras: ");
		num = sc.nextInt();
		System.out.println(num % 10);
		System.out.println(num % 100);
		System.out.println(num % 1000);
		System.out.println(num % 10000);
		System.out.println(num);

		// Ejercicio 13
		System.out.println("\nEjercicio 13");
		int dia;
		int mes;
		int anio;
		int suma;
		int suerte;
		System.out.println("Inserte el dia de su nacimiento:");
		dia = sc.nextInt();
		System.out.print("Inserte el mes de su nacimiento:");
		mes = sc.nextInt();
		System.out.print("Inserte el año de su nacimiento:");
		anio = sc.nextInt();
		suma = dia + mes + anio;
		suerte = (suma / 1000) + (suma / 100 % 10) + (suma / 10 % 10) + (suma % 10);
		System.out.println("Su numero de la suerte es: " + suerte);

		sc.close();
	}
}