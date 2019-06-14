package com.ipartek.formacion;

public class Perro {

	// Atributos
	private String nombre;
	private int edad;
	private String raza;
	private boolean vacunado;

	// Constructores

	public Perro(String pNombre, int pEdad, String pRaza, boolean pVacunado) {
		this.nombre = pNombre;
		this.edad = pEdad;
		this.raza = pRaza;
		this.vacunado = pVacunado;
	}

	public Perro() {
		nombre = "Sin Nombre";
		edad = 0;
		raza = "Cruce";
		vacunado = false;
	}

	public Perro(String nombre) {
		super();
		this.nombre = nombre;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	/**
	 * Setteamos la edad del perro, en caso de ser menos que 0 ponemos un 0.
	 * 
	 * @param edad int valor en años
	 * @throws Exception edad no puede ser menor que 0
	 * 
	 */
	public void setEdad(int edad) throws Exception {
		if (edad < 0) {
			//this.edad = 0;
			throw new PerroException(PerroException.ERROR_EDAD);
		} else {
			this.edad = edad;
		}
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public boolean isVacunado() {
		return vacunado;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}

	// toString
	public String toString() {
		return "Perro [nombre=" + nombre + ", edad=" + edad + ", raza=" + raza + ", vacunado=" + vacunado + "]";
	}
}