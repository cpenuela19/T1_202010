package model.data_structures;

import model.logic.ComparendoDatos;

public interface IListaEncadenada <T> {


	public int darTamanio();

	public void agregarNodo(T objeto);

	public T buscar(T pos);

	public T eliminar(T pos);

}
