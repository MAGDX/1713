package com.ipartek.formacion.ejercicios.basicos;

public class EjerOpIncrementoDecremento {

	public static void main(String[] args) {
		//Ejercicio1
		System.out.println("Ejercicio 1");
		
		int x = 10;
		System.out.println(x);
		x++;
		System.out.println(x);
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(x);
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(++x);
		++x;
		x++;
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(++x);
		
		//Ejercicio2
		System.out.println("\nEjercicio2");
		
		char A = 'c';
		char B;
		System.out.println(A++);
		System.out.println(A++);
		System.out.println(++A);
		B = --A;
		System.out.println(++A);
		A++;
		--B;
		System.out.println(B++);
		System.out.println(++B);
		System.out.println(++A);
		System.out.println(B--);
		System.out.println(A);
		System.out.println(B);
		
		//Ejercicio3
		System.out.println("\nEjercicio3");
		
		int i = 1;
		int j = 1;
		int k = 1;
		i = ++j;
		System.out.println(i + " " + j + " " + k);
		
		i = 1;
		j = 1;
		k = 1;
		i = k++;
		System.out.println(i + " " + j + " " + k);
		
		i = 1;
		j = 1;
		k = 1;
		i = k + ++j;
		System.out.println(i + " " + j + " " + k);
		
		i = 1;
		j = 1;
		k = 1;
		i = i + j++;
		System.out.println(i + " " + j + " " + k);

		i = 1;
		j = 1;
		k = 1;
		i = j + ++k;
		System.out.println(i + " " + j + " " + k);

		i = 1;
		j = 1;
		k = 1;
		i = ++j + k++;
		System.out.println(i + " " + j + " " + k);

		i = 1;
		j = 1;
		k = 1;
		j = k-- + --i;
		System.out.println(i + " " + j + " " + k);

		i = 1;
		j = 1;
		k = 1;
		i = k + 1 + ++j;
		System.out.println(i + " " + j + " " + k);

		i = 1;
		j = 1;
		k = 1;
		i = ++i + --j + k--;
		System.out.println(i + " " + j + " " + k);

		i = 1;
		j = 1;
		k = 1;
		k = j-- + ++k;
		System.out.println(i + " " + j + " " + k);
	}

}