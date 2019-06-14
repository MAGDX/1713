package com.ipartek.formacion.utilidades;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrdenarBubbleSortTest {

	@Test(expected = NullPointerException.class)
	public void testOrdenar() {
		int[] aOrdenado1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] aDesordenado1 = { 3, 9, 1, 8, 7, 2, 5, 4, 0, 6 };
		assertArrayEquals(aOrdenado1, OrdenarBubbleSort.ordenar(aDesordenado1));

		int[] aOrdenado2 = { -20, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] aDesordenado2 = { 3, 9, 1, 8, 7, 2, 5, 4, 0, 6, -20 };
		assertArrayEquals(aOrdenado2, OrdenarBubbleSort.ordenar(aDesordenado2));

		int[] aOrdenado3 = { -20, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 100 };
		int[] aDesordenado3 = { 3, 9, 1, 8, 7, 2, 5, 4, 0, 6, -20, 100 };
		assertArrayEquals(aOrdenado3, OrdenarBubbleSort.ordenar(aDesordenado3));

		OrdenarBubbleSort.ordenar(null);
	}
}