package com.ipartek.formacion.xml;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.ipartek.formacion.Perro;

/**
 * Leer el XML generado previamente con listado de perros, guardar en ArrayList
 * y mostrar por pantalla
 * 
 * @author Arkaitz Marcos
 *
 */

public class LeerPerrosFromXML {

	public static void main(String[] args) throws NumberFormatException, Exception {

		// crear builder
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();

		// parsear documento perros.xml
		File file = new File("./src/main/java/com/ipartek/formacion/xml/perros.xml");
		Document doc = builder.parse(file);

		// recorrer document y rellenar arraylist
		Element root = doc.getDocumentElement();
		NodeList nodos = root.getChildNodes();
		Node nodo;
		NodeList atributos;
		Perro p;
		ArrayList<Perro> perros = new ArrayList<Perro>();
		
		for(int i = 0;i<nodos.getLength();i++) {
			nodo = nodos.item(i);
			p = new Perro();
			atributos = nodo.getChildNodes();
			System.out.println(atributos);
			/*p.setNombre(atributos.item(0).getTextContent());
			p.setEdad(Integer.parseInt(atributos.item(1).getTextContent()));
			p.setRaza(atributos.item(2).getTextContent());
			p.setVacunado(Boolean.parseBoolean(atributos.item(3).getTextContent()));
			perros.add(p);*/
		}

		// mostrar por pantalla
		for (Perro perro : perros) {
			System.out.println(perro);
		}
	}
}