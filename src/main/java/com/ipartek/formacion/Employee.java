package com.ipartek.formacion;

import java.text.DecimalFormat;
import java.util.Date;

public class Employee extends Person {

	// Atributos
	public final float SALARIO_MINIMO = 937.05F;

	private int ne;
	private Date fechaContrato;
	private float salario;

	// Constructores
	public Employee() {
		super();
		this.ne = 0;
		this.fechaContrato = new Date();
		this.salario = SALARIO_MINIMO;
	}

	public Employee(String nombre, int edad, char genero, float salario) {
		super(nombre, edad, genero);
		this.salario = salario;
	}

	// Getters y Setters
	public int getNe() {
		return ne;
	}

	public void setNe(int ne) {
		this.ne = ne;
	}

	public Date getfContratacion() {
		return fechaContrato;
	}

	public void setfContratacion(Date fContratacion) {
		this.fechaContrato = fContratacion;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("##,###,###$");	
		return getNombre() + " " + df.format(salario);
	}

}