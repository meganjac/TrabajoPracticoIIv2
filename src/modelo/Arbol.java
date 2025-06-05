package modelo;

import java.util.Comparator;
import java.util.*;
import interfaces.IArbol;
import interfaces.INodo;

public class Arbol<t> {
	private INodo nodoRaiz;

	public Arbol() {//constructor del árbol
		this.nodoRaiz = null;
	}

	//INSERTAR RECURSIVO 
	public void insertar(t dato, Comparator<t> cmp) {

		nodoRaiz = insertarRec(nodoRaiz, dato, cmp); //metodo recursivo devuelve la nueva raiz del subarbol
	}
	private INodo insertarRec(INodo<t> nodoRaiz, t dato, Comparator<t> cmp) {
		
		if (nodoRaiz == null) {
            return new Nodo<t>(dato);
        }
		if (cmp.compare(dato, nodoRaiz.getDato()) < 0) {//si es menor que 0, significa que debe ir a la izq.  
			nodoRaiz.setIzquierdo(insertarRec(nodoRaiz.getIzquierdo(), dato, cmp));
		}
		else if (cmp.compare(dato, nodoRaiz.getDato()) > 0) {
			nodoRaiz.setDerecho(insertarRec(nodoRaiz.getDerecho(), dato, cmp));
		}
		return nodoRaiz;
	}
	///compare es un método que devuelte 3 valores, basados en los códigos UNICODE de los caracteres de la cadena:
	///1. entero negativo: si el primer parámetro pasado es MENOR que el segundo
	///2. devuelve 0: si ambos parámetros son iguales
	///3. entero positivo: si el primer parámetro pasado es MAYOR que el segundo
	

	//BUSCAR RECURSIVO
	public INodo buscar(t dato,Comparator<t>cmp) {
		return buscarRec(nodoRaiz, dato, cmp);
	}
	private INodo buscarRec(INodo<t> nodoRaiz, t dato, Comparator<t> cmp) {
		if (nodoRaiz == null || nodoRaiz.getDato() == dato) return nodoRaiz; //caso base donde el dato es igual
		
		if (cmp.compare(nodoRaiz.getDato(), dato) > 0) { //retorna un num positivo cuando getDato() es mayor al dato
			//el dato es menor al de la raíz, se busca por la izquierda
			return buscarRec(nodoRaiz.getIzquierdo(), dato, cmp);
			
		}else {
			//si el dato es mayor al del nodo raíz
			//se busca por la derecha
			return buscarRec(nodoRaiz.getDerecho(), dato, cmp); 
			
		}
	}
	
	//ELIMINAR RECURSIVO -- adaptarlo a este tipo de Arbol
	 
	   ///se cambia el nodo a eliminar por el nodo más chiquito dentro del subarbol derecho del nodo a eliminar.
	   ///es decir, el nodo mínimo del subarbol derecho del nodo que quiero eliminar
	   ///en el caso que el nodo a eliminar tenga un solo hijo, su lugar lo ocupa su único hijo.
	    public void eliminar(int dato) {
	        raiz = eliminarRec(raiz, dato); //raiz acá se llama "nodoRaiz"
	    }

	    private INodo eliminarRec(INodo nodo, int dato) {
	        if (nodo == null) return null;

	        if (dato < nodo.getDato()) {
	            nodo.setIzquierdo(eliminarRec(nodo.getIzquierdo(), dato));
	        } else if (dato > nodo.getDato()) {
	            nodo.setDerecho(eliminarRec(nodo.getDerecho(), dato));
	        } else {
	            // Caso 1: nodo sin hijos
	            if (nodo.getIzquierdo() == null && nodo.getDerecho() == null) {
	                return null;//nodo hoja
	            }
	            // Caso 2: un solo hijo
	            if (nodo.getIzquierdo() == null) {
	                return nodo.getDerecho();
	            }
	            if (nodo.getDerecho() == null) {
	                return nodo.getIzquierdo();
	            }

	            // Caso 3: dos hijos
	            INodo sucesor = encontrarMinimo(nodo.getDerecho());
	            nodo.setDato(sucesor.getDato());
	            nodo.setDerecho(eliminarRec(nodo.getDerecho(), sucesor.getDato()));
	        }
	        return nodo;
	    }
	
	
	
	
	
	
	
	//RECORRER IN-ORDEN
	public void recorridoInorden() {
        inordenRec(nodoRaiz);
    }

    private void inordenRec(INodo nodo) {
        if (nodo != null) {
            inordenRec(nodo.getIzquierdo());
            System.out.print(nodo.getDato() + " ");
            inordenRec(nodo.getDerecho());
        }
    }
    
    //RECORRER PRE-ORDEN
    public void recorridoPreorden() {
        preordenRec(nodoRaiz);
    }

    private void preordenRec(INodo nodo) {//se pasa por parámetro el nodo raíz
        if (nodo != null) {
            System.out.print(nodo.getDato() + " ");
            preordenRec(nodo.getIzquierdo());
            preordenRec(nodo.getDerecho());
        }
    }
    
    //RECORRER POST-ORDEN
    public void recorridoPostorden() {
        postordenRec(nodoRaiz);
    }

    private void postordenRec(INodo nodo) {
        if (nodo != null) {
            postordenRec(nodo.getIzquierdo());
            postordenRec(nodo.getDerecho());
            System.out.print(nodo.getDato() + " ");
        }
    }
    


}
