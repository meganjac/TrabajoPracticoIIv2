package test;

import java.util.Comparator;
import modelo.Persona;
import modelo.Arbol;
import modelo.ComparadorPorDNI;
import interfaces.IPersona;

public class testInsertarRec {
	public static void main(String[] args) {
		Arbol<IPersona> arbol = new Arbol<>(); // ✅ árbol con tipo genérico
		Comparator<IPersona> cmp = new ComparadorPorDNI(); // ✅ comparador correcto

		IPersona p1 = new Persona("11111111", "Megan", 19);
		IPersona p2 = new Persona("22222222", "Melanie", 19);
		IPersona p3 = new Persona("33333333", "Peter", 19);
		IPersona p4 = new Persona("44444444", "Francisco", 20);
		IPersona p5 = new Persona("55555555", "Thomas", 19);

		// Insertar elementos
		arbol.insertar(p1, cmp);
		arbol.insertar(p2, cmp);
		arbol.insertar(p3, cmp);
		arbol.insertar(p4, cmp);
		arbol.insertar(p5, cmp);

		// Recorridos
		System.out.println("Recorrido IN-ORDEN");
		arbol.recorridoInorden();

		System.out.println("\n\nRecorrido PRE-ORDEN");
		arbol.recorridoPreorden();

		System.out.println("\n\nRecorrido POST-ORDEN");
		arbol.recorridoPostorden();
	}
}

