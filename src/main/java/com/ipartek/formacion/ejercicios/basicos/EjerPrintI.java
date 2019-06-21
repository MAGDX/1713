package com.ipartek.formacion.ejercicios.basicos;

public class EjerPrintI {

	public static void main(String[] args) {
		//Ejercicio 1
		System.out.println("Ejercicio 1");
		double N = 5;
        double A = 4.56;
        char C = 'a';
        System.out.println("Variable N = " + N);
        System.out.println("Variable A = " + A);
        System.out.println("Variable C = " + C);
        System.out.println(N + " + " + A + " = " + (N+A));
        System.out.println(A + " - " + N + " = " + (A-N));
        System.out.println("Valor numérico del carácter " + C + " = " + (int)C);
        
        //Ejercicio 2
        System.out.println("\nEjercicio 2");
        int X = 1;
        int Y = 2;
        double M = 3.2;
        N = 4.7;
        System.out.println("Variable X = " + X);
        System.out.println("Variable Y = " + Y);
        System.out.println("Variable M = " + M);
        System.out.println("Variable N = " + N);
        System.out.println(X + " + " + Y + " = " + (X+Y));
        System.out.println(X + " - " + Y + " = " + (X-Y));
        System.out.println(X + " * " + Y + " = " + X*Y);
        System.out.println(X + " / " + Y + " = " + X/Y);
        System.out.println(X + " % " + Y + " = " + X%Y);
        System.out.println(N + " + " + M + " = " + (N+M));
        System.out.println(N + " - " + M + " = " + (N-M));
        System.out.println(N + " * " + M + " = " + N*M);
        System.out.println(N + " / " + M + " = " + N/M);
        System.out.println(N + " % " + M + " = " + N%M);
        System.out.println(X + " + " + N + " = " + (X+N));
        System.out.println(Y + " / " + M + " = " + Y/M);
        System.out.println(Y + " % " + M + " = " + Y%M);
        System.out.println("Variable X = " + X + " el doble es " + 2*X);
        System.out.println("Variable Y = " + Y + " el doble es " + 2*Y);
        System.out.println("Variable M = " + M + " el doble es " + 2*M);
        System.out.println("Variable N = " + N + " el doble es " + 2*N);
        System.out.println(X + " + " + Y + " + " + N + " + " + M + " = " + (X+Y+M+N));
        System.out.println(X + " * " + Y + " * " + N + " * " + M + " = " + (X*Y*M*N));
	}
}