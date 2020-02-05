package model.data_structures;

import model.logic.ComparendoDatos;

public interface IListaEncadenada <T> {


	int darTamanio();

	public void agregarNodo(Nodo<T> objeto);

	T buscar(T objeto);

	T eliminar(T objeto);

}
