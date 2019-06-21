package com.ipartek.formacion.modelo;

import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.Alumno;

public class DAOAlumnoArrayList implements IPersistible<Alumno> {

	// Parametros
	private ArrayList<Alumno> lista;

	// Constructores
	public DAOAlumnoArrayList() {
		super();
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
		return lista.add(a);
	}

	@Override
	public boolean delete(int id) {
		return lista.remove(getById(id));
	}

	@Override
	public boolean update(Alumno a) {
		boolean res = false;
		for (int i = 0; i < lista.size(); i++) {
			if (a.getId() == lista.get(i).getId()) {
				lista.set(i, a);
				res = true;
				break;
			}
		}

		return res;
	}
}