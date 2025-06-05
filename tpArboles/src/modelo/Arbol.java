package modelo;


import java.util.*;
import interfaces.IArbol;
import interfaces.INodo;

public class Arbol<t> implements IArbol<t>{
	
	private INodo raiz;
	
	
	public void insertar (t dato) {
		insertarrec(raiz,dato);
	}


	private INodo insertarrec(INodo<t> nodoRaiz, t dato) {
		
		if (nodoRaiz == null) {
            return new Nodo(dato);
        }
	
	
		if (dato.compareTo(nodoRaiz.getDato()) < 0) {
			nodoRaiz.setIzquierdo(insertarrec(nodoRaiz.getIzquierdo(), dato));
		}
		
		else {
			nodoRaiz.setDerecho(insertarrec(nodoRaiz.getDerecho(), dato));
		}
		return nodoRaiz;
	}
	
	

}
