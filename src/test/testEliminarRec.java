package test;

import java.util.Comparator;
import modelo.Persona;
import interfaces.IPersona;
import modelo.Arbol;
import modelo.ComparadorPorDNI;

public class testEliminarRec {
    public static void main(String[] args) {
        Arbol<IPersona> arbol = new Arbol<>();
        Comparator<IPersona> cmp = new ComparadorPorDNI();  // Cambio acá

        IPersona p1 = new Persona("33333333", "Peter", 19);     // raíz
        IPersona p2 = new Persona("22222222", "Melanie", 19);   // izquierda
        IPersona p3 = new Persona("44444444", "Francisco", 20); // derecha
        IPersona p4 = new Persona("11111111", "Megan", 19);     // izquierda izquierda
        IPersona p5 = new Persona("55555555", "Thomas", 19);    // derecha derecha

        // Insertar
        arbol.insertar(p1, cmp);
        arbol.insertar(p2, cmp);
        arbol.insertar(p3, cmp);
        arbol.insertar(p4, cmp);
        arbol.insertar(p5, cmp);

        System.out.println("IN-ORDEN antes de eliminar:");
        arbol.recorridoInorden();

        System.out.println("\n\nEliminando a Peter (nodo con dos hijos):");
        arbol.eliminar(p3, cmp); // Asegurate de que eliminar(t dato, Comparator<t>) esté implementado

        System.out.println("IN-ORDEN después de eliminar:");
        arbol.recorridoInorden();
    }
}

