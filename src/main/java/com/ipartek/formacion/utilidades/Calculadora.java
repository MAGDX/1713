package com.ipartek.formacion.utilidades;

public class Calculadora {

	/**
	 * Suma dos enteros
	 * 
	 * @param a int entero
	 * @param b int entero
	 * @return a + b
	 */

	public static int sumar(int a, int b) {
		return a + b;
	}

	/**
	 * Resta dos enteros
	 * 
	 * @param a int entero
	 * @param b int entero
	 * @return a - b
	 */

	public static int restar(int a, int b) {
		return a - b;
	}

	/**
	 * Multiplica dos enteros
	 * 
	 * @param a int entero
	 * @param b int entero
	 * @return a * b
	 */

	public static int multiplicar(int a, int b) {
		return a * b;
	}

	/**
	 * Divide dos enteros
	 * 
	 * @param a int entero
	 * @param b int entero
	 * @return a / b
	 */

	public static int dividir(int a, int b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException("El dividor es 0.");
		} else {
			return a / b;
		}
	}
}