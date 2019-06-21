package com.ipartek.formacion.utilidades;

public class OrdenarBubbleSort {

	/**
	 * Ordena un array de enteros pasado por parametro
	 * 
	 * @param numeros int[] Array de numeros enteros desordenados
	 * @return int[] Array de enteros ordenado de menos a mayor
	 * @throws NullPointerException numeros = null
	 */

	public static int[] ordenar(int[] numeros) {
		int aux;

		if (numeros != null) {
			for (int i = 0; i < numeros.length; i++) {
				for (int j = 0; j < numeros.length - i - 1; j++) {
					if (numeros[j] > numeros[j + 1]) {
						aux = numeros[j];
						numeros[j] = numeros[j + 1];
						numeros[j + 1] = aux;
					}
				}
			}
		} else {
			throw new NullPointerException("La lista no puede ser null.");
		}
		return numeros;
	}
}