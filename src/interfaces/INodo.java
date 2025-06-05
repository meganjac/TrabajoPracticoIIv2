package interfaces;

public interface INodo<t> {
	


	public t getDato();


	public void setDato(t dato);



	public INodo getIzquierdo();


	public void setIzquierdo(INodo izquierdo);


	public INodo getDerecho();


	public void setDerecho(INodo derecho);


}
