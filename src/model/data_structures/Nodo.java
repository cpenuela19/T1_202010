package model.data_structures;

// Clase donde se almacenará la información de los elementos (genéricos) de la lista.
public class Nodo<T> {
	
	private Nodo<T> nodoSiguiente;
	private T objeto;
	
	public Nodo(T pObjeto){
		
		nodoSiguiente = null;
		objeto=pObjeto;
	}
	
}
