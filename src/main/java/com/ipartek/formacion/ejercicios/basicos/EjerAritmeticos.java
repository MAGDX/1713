package com.ipartek.formacion.ejercicios.basicos;

public class EjerAritmeticos {

	public static void main(String[] args) {
		// Ejer1
		int a = 8;
		int b = 3;
		int c = -5;
		
		System.out.println("Ejercicio 1");
		System.out.println("a)" + (a + b + c));
		System.out.println("b)" + (2 * b + 3 * (a - c)));
		System.out.println("c)" + (a / b));
		System.out.println("d)" + (a % b));
		System.out.println("e)" + (a / c));
		System.out.println("f)" + (a % c));
		System.out.println("g)" + (a * b / c));
		System.out.println("h)" + (a * (b / c)));
		System.out.println("i)" + ((a * c) % b));
		System.out.println("j)" + (a * (c % b)));
		System.out.println("k)" + ((3 * a - 2 * b) % (2 * a - c)));
		System.out.println("l)" + (2 * (a / 5 + (4 - b * 3)) % (a + c - 2)));
		System.out.println("m)" + ((a - 3 * b) % (c + 2 * a) / (a - c)));
		System.out.println("n)" + (a - b - c * 2));

		// Ejer2
		double x = 88;
		double y = 3.5;
		double z = -5.2;

		System.out.println();
		System.out.println("Ejercicio 2");
		System.out.println("a)" + (x + y + z));
		System.out.println("b)" + (2 * y + 3 * (x - z)));
		System.out.println("c)" + (x / y));
		System.out.println("d)" + (x % y));
		System.out.println("e)" + (x / (y+z)));
		System.out.println("f)" + ((x/y)+ z));
		System.out.println("g)" + (2*x/3*y));
		System.out.println("h)" + (2 * x / (3 * y)));
		System.out.println("i)" + (x * y % z));
		System.out.println("j)" + ( x * (y % z)));
		System.out.println("k)" + (3 * x - z - 2 * x));
		System.out.println("l)" + (2 * x / 5 % y));
		System.out.println("m)" + (x - 100 % y % z));
		System.out.println("n)" + (x - y - z * 2 ));
		
		//Ejer3
		char c1 = 'E';
		char c2 = '5';
		char c3 = '?';
		
		System.out.println();
		System.out.println("Ejercicio 3");
		System.out.println("a)" + ((int)c1 +1));
		System.out.println("b)" + ((int)c1 - (int)c2 + (int)c3));
		System.out.println("c)" + ((int)c2 - 2));
		System.out.println("d)" + ((int)c2 - (int)'2'));
		System.out.println("e)" + ((int)c3 + (int)'#'));
		System.out.println("f)" + ((int)c1 % (int)c3));
		System.out.println("g)" + ((int)'2' + (int)'2'));
		System.out.println("h)" + ( ( (int)c1 / (int)c2 ) * (int)c3 ));
		System.out.println("i)" + (3 * (int)c2));
		System.out.println("j)" + ((int)'3' * (int)c2));
	}

}