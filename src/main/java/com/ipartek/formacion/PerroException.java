package com.ipartek.formacion;

/**
 * 
 * @author Arkaitz Marcos
 *
 *         Excepcion personalizada para el POJO Perro
 *
 */

@SuppressWarnings("serial")
public class PerroException extends Exception {
	
	public static final String ERROR_EDAD = "La edad debe ser mayor que 0";
	
	public PerroException(String error) {
		super(error);
	}
}