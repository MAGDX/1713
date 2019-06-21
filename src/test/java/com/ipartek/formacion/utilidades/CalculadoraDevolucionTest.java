package com.ipartek.formacion.utilidades;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraDevolucionTest {

	@Test(expected = Exception.class)
	public void entregadoMenosImporteException() throws Exception {
		CalculadoraDevolucion.vueltas(100, 2);
	}

	@Test(expected = Exception.class)
	public void importeNegativoException() throws Exception {
		CalculadoraDevolucion.vueltas(-100, 2);
	}

	@Test(expected = Exception.class)
	public void entregadoNegativoException() throws Exception {
		CalculadoraDevolucion.vueltas(100, -2);
	}

	@Test
	public void importeExacto() throws Exception {
		int[] vueltas = CalculadoraDevolucion.vueltas(100, 100);

		for (int i = 0; i < CalculadoraDevolucion.BILLETES_MONEDAS.length; i++) {
			assertEquals(0, vueltas[i]);
		}
	}

	@Test
	public void importeNoExacto() throws Exception {
		int[] vueltas = CalculadoraDevolucion.vueltas(100, 101);
		assertEquals("500", 0, vueltas[0]);
		assertEquals("200", 0, vueltas[1]);
		assertEquals("100", 0, vueltas[2]);
		assertEquals("50", 0, vueltas[3]);
		assertEquals("20", 0, vueltas[4]);
		assertEquals("10", 0, vueltas[5]);
		assertEquals("5", 0, vueltas[6]);
		assertEquals("2", 0, vueltas[7]);
		assertEquals("1", 1, vueltas[8]);
		assertEquals("0.5", 0, vueltas[9]);
		assertEquals("0.2", 0, vueltas[10]);
		assertEquals("0.1", 0, vueltas[11]);
		assertEquals("0.05", 0, vueltas[12]);
		assertEquals("0.02", 0, vueltas[13]);
		assertEquals("0.01", 0, vueltas[14]);

		vueltas = CalculadoraDevolucion.vueltas(500, 1000);
		assertEquals("500", 1, vueltas[0]);
		assertEquals("200", 0, vueltas[1]);
		assertEquals("100", 0, vueltas[2]);
		assertEquals("50", 0, vueltas[3]);
		assertEquals("20", 0, vueltas[4]);
		assertEquals("10", 0, vueltas[5]);
		assertEquals("5", 0, vueltas[6]);
		assertEquals("2", 0, vueltas[7]);
		assertEquals("1", 0, vueltas[8]);
		assertEquals("0.5", 0, vueltas[9]);
		assertEquals("0.2", 0, vueltas[10]);
		assertEquals("0.1", 0, vueltas[11]);
		assertEquals("0.05", 0, vueltas[12]);
		assertEquals("0.02", 0, vueltas[13]);
		assertEquals("0.01", 0, vueltas[14]);

		vueltas = CalculadoraDevolucion.vueltas(50, 1000);
		assertEquals("500", 1, vueltas[0]);
		assertEquals("200", 2, vueltas[1]);
		assertEquals("100", 0, vueltas[2]);
		assertEquals("50", 1, vueltas[3]);
		assertEquals("20", 0, vueltas[4]);
		assertEquals("10", 0, vueltas[5]);
		assertEquals("5", 0, vueltas[6]);
		assertEquals("2", 0, vueltas[7]);
		assertEquals("1", 0, vueltas[8]);
		assertEquals("0.5", 0, vueltas[9]);
		assertEquals("0.2", 0, vueltas[10]);
		assertEquals("0.1", 0, vueltas[11]);
		assertEquals("0.05", 0, vueltas[12]);
		assertEquals("0.02", 0, vueltas[13]);
		assertEquals("0.01", 0, vueltas[14]);

		vueltas = CalculadoraDevolucion.vueltas(50.5f, 1000);
		assertEquals("500", 1, vueltas[0]);
		assertEquals("200", 2, vueltas[1]);
		assertEquals("100", 0, vueltas[2]);
		assertEquals("50", 0, vueltas[3]);
		assertEquals("20", 2, vueltas[4]);
		assertEquals("10", 0, vueltas[5]);
		assertEquals("5", 1, vueltas[6]);
		assertEquals("2", 2, vueltas[7]);
		assertEquals("1", 0, vueltas[8]);
		assertEquals("0.5", 1, vueltas[9]);
		assertEquals("0.2", 0, vueltas[10]);
		assertEquals("0.1", 0, vueltas[11]);
		assertEquals("0.05", 0, vueltas[12]);
		assertEquals("0.02", 0, vueltas[13]);
		assertEquals("0.01", 0, vueltas[14]);

		vueltas = CalculadoraDevolucion.vueltas(49.9f, 90.09f);
		assertEquals("500", 0, vueltas[0]);
		assertEquals("200", 0, vueltas[1]);
		assertEquals("100", 0, vueltas[2]);
		assertEquals("50", 0, vueltas[3]);
		assertEquals("20", 2, vueltas[4]);
		assertEquals("10", 0, vueltas[5]);
		assertEquals("5", 0, vueltas[6]);
		assertEquals("2", 0, vueltas[7]);
		assertEquals("1", 0, vueltas[8]);
		assertEquals("0.5", 0, vueltas[9]);
		assertEquals("0.2", 0, vueltas[10]);
		assertEquals("0.1", 1, vueltas[11]);
		assertEquals("0.05", 1, vueltas[12]);
		assertEquals("0.02", 2, vueltas[13]);
		assertEquals("0.01", 0, vueltas[14]);
		
		vueltas = CalculadoraDevolucion.vueltas(0, 888.88f);
		assertEquals("500", 1, vueltas[0]);
		assertEquals("200", 1, vueltas[1]);
		assertEquals("100", 1, vueltas[2]);
		assertEquals("50", 1, vueltas[3]);
		assertEquals("20", 1, vueltas[4]);
		assertEquals("10", 1, vueltas[5]);
		assertEquals("5", 1, vueltas[6]);
		assertEquals("2", 1, vueltas[7]);
		assertEquals("1", 1, vueltas[8]);
		assertEquals("0.5", 1, vueltas[9]);
		assertEquals("0.2", 1, vueltas[10]);
		assertEquals("0.1", 1, vueltas[11]);
		assertEquals("0.05", 1, vueltas[12]);
		assertEquals("0.02", 1, vueltas[13]);
		assertEquals("0.01", 1, vueltas[14]);
	}
}