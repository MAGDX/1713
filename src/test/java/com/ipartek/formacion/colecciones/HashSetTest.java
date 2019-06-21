package com.ipartek.formacion.colecciones;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class HashSetTest {

	@Test
	public void test() {

		Set<Integer> setOfIntegers = new HashSet<Integer>();
		setOfIntegers.add(10);
		setOfIntegers.add(Integer.valueOf(11));
		setOfIntegers.add(10);

		int cont = 0;
		for (Integer i : setOfIntegers) {
			System.out.println(i);
			cont++;
		}

		assertEquals(2, cont);
	}
}