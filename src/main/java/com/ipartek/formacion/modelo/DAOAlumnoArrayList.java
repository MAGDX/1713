package com.ipartek.formacion.modelo;

import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.Alumno;

public class DAOAlumnoArrayList implements IPersistible<Alumno> {

	// Parametros
	private static DAOAlumnoArrayList INSTANCE;
	private ArrayList<Alumno> lista;

	/**
	 * Encargado de devolver solo 1 objeto, patron Singleton
	 * 
	 * @return Devuelve la instancia de la clase, en caso de que sea null, la crea.
	 */
	public static synchronized DAOAlumnoArrayList getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new DAOAlumnoArrayList();
		}
		return INSTANCE;
	}

	// Constructores
	private DAOAlumnoArrayList() {
		this.lista = new ArrayList<Alumno>();
	}

	// Metodos
	@Override
	public List<Alumno> getAll() {
		return lista;
	}

	@Override
	public Alumno getById(int id) {
		Alumno res = null;
		for (Alumno a : lista) {
			if (a.getId() == id) {
				res = a;
				break;
			}
		}
		return res;
	}

	@Override
	public boolean insert(Alumno a) {
		boolean exito;
		if (a == null) {
			exito = false;
		} else {
			lista.add(a);
			exito = true;
		}
		return exito;
	}

	@Override
	public boolean delete(int id) {
		boolean exito;
		if (getById(id) == null) {
			exito = false;
		} else {
			lista.remove(getById(id));
			exito = true;
		}
		return exito;
	}

	@Override
	public boolean update(Alumno a) {
		boolean res = false;
		
		if (a != null) {
			for (int i = 0; i < lista.size(); i++) {
				if (a.getId() == lista.get(i).getId()) {
					lista.set(i, a);
					res = true;
					break;
				}
			}
		}

		return res;
	}
	
	public void inicializarLista() {
		this.insert(new Alumno(this.getAll().size(), "Andoni"));
		this.insert(new Alumno(this.getAll().size(), "Arkaitz"));
		this.insert(new Alumno(this.getAll().size(), "Eder S"));
		this.insert(new Alumno(this.getAll().size(), "Veronica"));
		this.insert(new Alumno(this.getAll().size(), "Asier"));
		this.insert(new Alumno(this.getAll().size(), "Jon A"));
		this.insert(new Alumno(this.getAll().size(), "Jose Luis"));
		this.insert(new Alumno(this.getAll().size(), "Eder I"));
		this.insert(new Alumno(this.getAll().size(), "Manuel"));
		this.insert(new Alumno(this.getAll().size(), "Aritz"));
		this.insert(new Alumno(this.getAll().size(), "Mournir"));
		this.insert(new Alumno(this.getAll().size(), "Gaizka"));
		this.insert(new Alumno(this.getAll().size(), "Borja"));
		this.insert(new Alumno(this.getAll().size(), "Jon C"));
		this.insert(new Alumno(this.getAll().size(), "Ander"));
	}
}