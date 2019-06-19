package com.ipartek.formacion;

/**
 * 
 * @author Arkaitz Marcos
 *
 *         Hacer un constructor donde la persona por defecto va a tener nombre
 *         Anonimo, edad 18, altura 0, peso 0, ojos marrones y sexo indefinid
 *         Aparte queremos socrecargar el constructor para poder crear una
 *         persona indicando el nombre, la edad y el sexo
 *
 */

public class Person implements IAmigable {
	// Atributos
	private String nombre;
	private int edad;
	private float altura; // 1.70 metros
	private double peso; // 50.5 kg
	private String ojos; // color
	private char genero; // 'h' hombre 'm' mujer 'i' indefinido

	// Constructores

	public Person() {
		this.nombre = "Anonimo";
		this.edad = 18;
		this.altura = 0;
		this.peso = 0;
		this.ojos = "marrones";
		this.genero = 'i';
	}
	
	public Person(String nombre) {
		this();
		this.setNombre(nombre);
	}

	public Person(String nombre, int edad, char genero) {
		this();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws PersonException {
		if (edad < 0) {
			throw new PersonException(PersonException.ERROR_EDAD);
		} else {
			this.edad = edad;
		}
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) throws PersonException {
		if (altura < 0) {
			throw new PersonException(PersonException.ERROR_ALTURA);
		} else {
			this.altura = altura;
		}
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) throws PersonException {
		if (peso < 0) {
			throw new PersonException(PersonException.ERROR_PESO);
		} else {
			this.peso = peso;
		}
	}

	public String getOjos() {
		return ojos;
	}

	public void setOjos(String ojos) {
		this.ojos = ojos;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Person [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", ojos="
				+ ojos + ", genero=" + genero + "]";
	}

	public String saludar() {
		return "Hola, me llamo " + nombre;
	}

	@Override
	public String despedir() {
		return "Agur venur ta jan iogur.";
	}
}