package model.data_structures;

// Clase donde se almacenará la información de los elementos (genéricos) de la lista.
public class Nodo<T> {
	
	private Nodo<T> actual;
	
	//tipo de dato que va a contener el nodo
	private T objeto;
	
	public Nodo(T pObjeto){
		
		actual = null;
		objeto=pObjeto;
	}
	
	public Nodo<T> darSiguiente()
	{
		return actual;
	}
	
	public void setSiguiente(Nodo<T> siguiente)
	{
		actual = siguiente;
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
