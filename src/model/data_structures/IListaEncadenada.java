package model.data_structures;

import model.logic.ComparendoDatos;

public interface IListaEncadenada <T> {


	public int darTamanio();

	public void agregarObj(T objeto);

	public T buscarPorId(int pos);

	public void eliminar(T pos);

}
