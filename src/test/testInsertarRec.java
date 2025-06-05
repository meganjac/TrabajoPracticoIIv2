package test;

import java.util.Comparator;
import modelo.Persona;
import modelo.Nodo;
import interfaces.IArbol;
import modelo.Arbol;
import modelo.ComparadorPorDNI;
import interfaces.IArbol;
import interfaces.INodo;
import interfaces.IPersona;

public class testInsertarRec {
	public static void main(String[] args) {
		Arbol arbol = new Arbol();
		Comparator<Persona> cmp = new ComparadorPorDNI();
		IPersona p1 = new Persona("11111111", "Megan", 19);
		IPersona p2 = new Persona("22222222", "Melanie", 19);
		IPersona p3 = new Persona("33333333", "Peter", 19);
		IPersona p4 = new Persona("44444444", "Francisco", 20);
		IPersona p5 = new Persona("55555555", "Thomas", 19);
		arbol.insertar(p1, cmp);
		arbol.insertar(p2, cmp);
		arbol.insertar(p3, cmp);
		arbol.insertar(p4, cmp);
		arbol.insertar(p5, cmp);
		
		System.out.println("Recorrido IN-ORDEN");
		arbol.recorridoInorden();
		System.out.println();
		
		System.out.println("\nRecorrido PRE-ORDEN");
		arbol.recorridoPreorden();
		System.out.println();
		
		System.out.println("\nRecorrido POST-ORDEN");
		arbol.recorridoPostorden();
	}
}
