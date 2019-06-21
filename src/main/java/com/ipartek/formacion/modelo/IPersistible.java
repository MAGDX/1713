package com.ipartek.formacion.modelo;

import java.util.List;

/**
 * 
 * @author Arkaitz Marcos Operaciones basicas de CRUD para POJOs
 *
 */
public interface IPersistible<P> {
	List<P> getAll();

	P getById(int id);

	boolean insert(P p);

	boolean delete(int id);

	boolean update(P p);
}