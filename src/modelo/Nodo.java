package modelo;

import interfaces.INodo;

public class Nodo<t> implements INodo<t>{
	
	 private t dato;
	 private INodo izquierdo;
	 private INodo derecho;
	 
	 
	public Nodo(t dato) {
		this.dato = dato;
		this.izquierdo = null;
		this.derecho = null;
	}

	@Override
	public t getDato() {
		return dato;
	}

	@Override
	public void setDato(t dato) {
		this.dato = dato;
	}

	@Override
	public INodo getIzquierdo() {
		return izquierdo;
	}

	@Override
	public void setIzquierdo(INodo izquierdo) {
		this.izquierdo = izquierdo;
	}

	@Override
	public INodo getDerecho() {
		return derecho;
	}

	@Override
	public void setDerecho(INodo derecho) {
		this.derecho = derecho;
	}
	
	 
	 
}
