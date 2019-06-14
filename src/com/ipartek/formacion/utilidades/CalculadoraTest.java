package com.ipartek.formacion.utilidades;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSumar() {
		assertEquals(5, Calculadora.sumar(2, 3));
	}

	@Test
	public void testRestar() {
		assertEquals(1, Calculadora.restar(4, 3));
		assertEquals(-1, Calculadora.restar(4, 5));
		assertEquals(0, Calculadora.restar(4, 4));
	}
	
	@Test
	public void testMultiplicar() {
		assertEquals(6, Calculadora.multiplicar(2, 3));
		assertEquals(-6, Calculadora.multiplicar(2, -3));
		assertEquals(-6, Calculadora.multiplicar(-2, 3));
		assertEquals(0, Calculadora.multiplicar(2, 0));
		assertEquals(0, Calculadora.multiplicar(0, 2));
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDividir() {
		assertEquals(2, Calculadora.dividir(4, 2));
		assertEquals(0, Calculadora.dividir(0, 2));
		assertEquals(-2, Calculadora.dividir(-4, 2));
		assertEquals(-2, Calculadora.dividir(4, -2));
		
		Calculadora.dividir(5, 0);
	}
}