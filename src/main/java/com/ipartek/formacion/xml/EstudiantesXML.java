package com.ipartek.formacion.xml;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;

/**
 * Ejercicio para aprender a parsear y trabajar con XML.
 * 
 * @author Arkaitz Marcos
 * @see https://www.tutorialspoint.com/java_xml/java_sax_parse_document.htm
 *
 */
public class EstudiantesXML {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		//Similar al String pero optimizado para trabajar con Stringso o ficheros grandes
		StringBuilder xmlStringBuilder = new StringBuilder();
		
		
		xmlStringBuilder.append("<?xml version=\"1.0\"?> <perro class = \"rojo\"><nombre>Rataplan</nombre><edad>8</edad></perro>");
		ByteArrayInputStream input = new ByteArrayInputStream(
		   xmlStringBuilder.toString().getBytes("UTF-8"));
		Document doc = builder.parse(input);
		
		Element elemento = doc.getDocumentElement();
		NodeList nodos = elemento.getChildNodes();
		
		String nombre = nodos.item(0).getTextContent();
		String edad = nodos.item(1).getTextContent();
		
		String texto = elemento.getTextContent();
		
		System.out.println("Perro " + nombre + " " + edad);
		System.out.println("Todo " + texto);
	}
}