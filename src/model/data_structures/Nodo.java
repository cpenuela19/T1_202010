package model.data_structures;

// Clase donde se almacenar� la informaci�n de los elementos (gen�ricos) de la lista.
public class Nodo<T> {
	
	private Nodo<T> nodoSiguiente;
	private T objeto;
	
	public Nodo(T pObjeto){
		
		nodoSiguiente = null;
		objeto=pObjeto;
	}
	
}
