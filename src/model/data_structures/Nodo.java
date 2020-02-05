package model.data_structures;

// Clase donde se almacenará la información de los elementos (genéricos) de la lista.
public class Nodo<T> {
	
	private Nodo<T> nodoSiguiente;
	
	//tipo de dato que va a contener el nodo
	private T objeto;
	
	public Nodo(T pObjeto){
		
		nodoSiguiente = null;
		objeto=pObjeto;
	}
	
	public Nodo<T> darSiguiente()
	{
		return nodoSiguiente;
	}
	
	public void miSiguiente(Nodo<T> tipo)
	{
		nodoSiguiente = tipo;
	}
	
	public T getObjeto()
	{
		return objeto;
	}
	
	public void setObjeto(T pObjeto)
	{
		objeto= pObjeto;
	}
	
}
