package com.ipartek.formacion.modelo;

import java.util.List;

/**
 * Operaciones basicas de CRUD para POJOs
 * 
 * @author Arkaitz Marcos Operaciones basicas de CRUD para POJOs
 *
 */
public interface IPersistible<P> {
	/**
	 * Devuelve la lista de P con todos los datos existentes
	 * @return List<P>, si no hay datos lista inicializada
	 */
	List<P> getAll();
	
	/**
	 * Recupera el objeto P por su identificador (id)
	 * @param id int identificador de P
	 * @return P, si no existe null
	 */
	P getById(int id);
	
	/**
	 * Inserta el objeto P recibido por parametro en la lista
	 * @param p P objeto a insertar
	 * @return true si la insercion se ha realizado correctamente, false en caso contrario
	 */
	boolean insert(P p);
	
	/**
	 * Borra el objeto P cuyo identificador se corresponda con el pasado por parametro
	 * @param id int identificador de P
	 * @return true si el borrado se ha realizado correctamente, false en caso contrario
	 */
	boolean delete(int id);
	
	/**
	 * Actualiza el objeto P en la misma posicion de la lista donde se haya su version antigua
	 * @param p P objeto a insertar
	 * @return true si el reemplazo se ha realizado correctamente, false en caso contrario
	 */
	boolean update(P p);
}