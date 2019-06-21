package com.ipartek.formacion.ejercicios.basicos;

public class EjerciciosLogicos {
	public static void main(String[] args) {
		// Ejer1
		boolean x = true;
		boolean y = false;
		boolean z = true;

		System.out.println("Ejercicio 1");
		System.out.println((x && y) || (x && z));
		System.out.println((x || !y) && (!x || z));
		System.out.println(x || y && z);
		System.out.println(!(x || y) && z);
		System.out.println(x || y || x && !z && !y);
		System.out.println(!x || !y || z && x && !y);

		// Ejer2
		boolean w = false;
		x = true;
		y = true;
		z = false;

		System.out.println("Ejercicio 2");
		System.out.println(w || y && x && w || z);
		System.out.println(x && !y && !x || !w && y);
		System.out.println(!(w || !y) && x || z);
		System.out.println(x && y && w || z || x);
		System.out.println(y || !(y || z && w));
		System.out.println(!x && y && (!z || !x));
	}
}