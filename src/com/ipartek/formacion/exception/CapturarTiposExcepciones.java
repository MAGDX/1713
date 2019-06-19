package com.ipartek.formacion.exception;

import java.util.Scanner;

import com.ipartek.formacion.Perro;
import com.ipartek.formacion.PerroException;

/**
 * 
 * @author Arkaitz Marcos
 *
 *         Se puede capturar mas de un tipo de Excepciones. Siempre la ultima en
 *         capturar que sea Exception, que es la mas generica.
 *
 */

@SuppressWarnings("serial")
public class CapturarTiposExcepciones extends Exception {
	@SuppressWarnings("null")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s;
		int excepcion;
		
		try {
			System.out.println("¿Que tipo de excepcion quiere lanzar?");
			System.out.println("1.- NullPointerException");
			System.out.println("2.- ArrayIndexOutOfBoundsException");
			System.out.println("3.- NumberFormatException");
			System.out.println("4.- PerroException");
			s = sc.nextLine();

			if (Integer.parseInt(s) == 3) {
				s = "a";
			}
			excepcion = Integer.parseInt(s);
			
			switch (excepcion) {
			case 1:
				// Excepcion Null
				Perro p = null;
				System.out.println(p.toString());
				break;
			case 2:
				// Excepcion ArrayIndexOutOfBounds
				Perro p1 = new Perro();
				p1.setEdad(1);
				p1.toString();
				System.out.println(p1);
				Perro p2 = new Perro();
				Perro[] perrera = new Perro[2];
				perrera[0] = p1;
				perrera[1] = p2;
				System.out.println(perrera[2]);
				break;
			case 4:
				// Excepcion Perro
				Perro p3 = new Perro();
				p3.setEdad(-1);
				p3.toString();
				System.out.println(p3);
				break;
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Te has salido fuera del Array");
		} catch (NumberFormatException e) {
			System.out.println("No has insertado un numero");
		} catch (PerroException e) {
			System.out.println("Excepcion Perro");
		} catch (NullPointerException e) {
			System.out.println("Excepcion Null");
		} catch (Exception e) {
			System.out.println("Excepcion generica, siempre la ultima");
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
	}
}