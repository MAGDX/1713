package com.ipartek.formacion;

public class Alumno extends Person implements Comparable<Alumno> {
	//Parametros
	private int repeticiones;
	
	//Constructores
	public Alumno(String nombre) {
		super(nombre);
		setRepeticiones(0);;
	}
	public Alumno(int id, String nombre) {
		super(id, nombre);
		setRepeticiones(0);;
	}
	
	//Getter y Setters	
	public int getRepeticiones() {
		return repeticiones;
	}

	public void setRepeticiones(int repeticiones) {
		this.repeticiones = repeticiones;
	}
	
	//Metodos
	public void sumarRepeticion() {
		repeticiones++;
	}

	@Override
	public int compareTo(Alumno o) {
		return o.getRepeticiones() - repeticiones;
	}
}