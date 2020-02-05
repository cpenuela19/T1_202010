package model.data_structures;

import model.logic.ComparendoDatos;

public class ListaEncadenada <T> implements IListaEncadenada<T>
{
	
	
	private Nodo<T> primerObj;
	
	private int listSize;
	
	//lista inicada como vacia 
	public ListaEncadenada()
	{
		primerObj = null;
	}
	
	//objeto a agregar
	public ListaEncadenada(T item)
	{
		primerObj = new Nodo<T>(item);
		listSize ++;
	}
	
	
//Tamaño actual de la lista
	public int darTamanio() {
		
		return listSize;
	}

	//agregar un nodo a la lista
	public void agregarObj(T nuevoObj)
	{
		if(primerObj == null)
			agregarNodoAlInicio(nuevoObj);
		else 
			agregarNodoAlFinal(nuevoObj);
		
		listSize++;
		
	}

	@SuppressWarnings("unchecked")
	private void agregarNodoAlInicio(T pObj)
	{
		if(primerObj != null)
		{
			((Nodo<T>) pObj).setSiguiente(primerObj);
			primerObj = (Nodo<T>) pObj;
		}
		else 
			primerObj = (Nodo<T>) pObj;
			}
	@SuppressWarnings("unchecked")
	private void agregarNodoAlFinal(T pObj)
	{
		Nodo<T> actual = primerObj;
		
		while(primerObj.darSiguiente() != null)
		{
			actual = actual.darSiguiente();
		}
		actual.setSiguiente((Nodo<T>) pObj);		
	}
	
	//buscar un nodo de la lista
	public T  buscarPorId(int objeto) {
		
		return null;
	}

	//eliminar un nodo de la lista
	public void eliminar(T objeto) {
		
	
	}

	
	
}
