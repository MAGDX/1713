package com.ipartek.formacion;

/**
 * 
 * @author Arkaitz Marcos
 *
 *         Excepcion personalizada para el POJO Person
 *
 */

@SuppressWarnings("serial")
public class PersonException extends Exception {
	
	public static final String ERROR_EDAD = "La edad debe ser mayor que 0";
	public static final String ERROR_ALTURA = "La altura debe ser mayor que 0";
	public static final String ERROR_PESO = "El peso debe ser mayor que 0";

	public PersonException(String error) {
		super(error);
	}
}