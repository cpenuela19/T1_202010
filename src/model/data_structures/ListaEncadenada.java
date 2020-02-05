package model.data_structures;

import model.logic.ComparendoDatos;

public class ListaEncadenada <T> implements IListaEncadenada<T>
{
	
	
	private Nodo<T> lista;
	
	private int listSize;
	
	//lista inicada como vacia 
	public ListaEncadenada()
	{
		lista = null;
	}
	
	//objeto a agregar
	public ListaEncadenada(T item)
	{
		lista = new Nodo<T>(item);
	}
	
	
//Tamaño actual de la lista
	public int darTamanio() {
		
		return 0;
	}

	//agregar un nodo a la lista
	public void agregarNodo(Nodo<T> objetoActual) {
		
		
	}

	//buscar un nodo de la lista
	public Nodo<T>  buscar(int objeto) {
		
		return null;
	}

	//eliminar un nodo de la lista
	public Nodo<T> eliminar(int objeto) {
		
		return null;
	}

	
	
}
