package model.data_structures;

import model.logic.ComparendoDatos;

public interface IListaEncadenada <T> {


	public int darTamanio();

	public void agregarNodo(Nodo<T> objeto);

	public Nodo<T> buscar(int pos);

	public Nodo<T> eliminar(int pos);

}
