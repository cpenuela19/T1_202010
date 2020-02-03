package model.logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

import jdk.internal.org.objectweb.asm.Handle;
import model.data_structures.ArregloDinamico;
import model.data_structures.ComparendoDatos;
import model.data_structures.IArregloDinamico;

/**
 * Definicion del modelo del mundo
 *
 */
public class Modelo <T extends Comparable<T>>{
	/**
	 * Atributos del modelo del mundo
	 */
	private IArregloDinamico<T> datos;

	/**
	 * Constructor del modelo del mundo con capacidad predefinida
	 */
	public Modelo()
	{
		datos = new ArregloDinamico(7);
	}

	/**
	 * Constructor del modelo del mundo con capacidad dada
	 * @param tamano
	 */
	public Modelo(int capacidad)
	{
		datos = new ArregloDinamico(capacidad);
	}

	/**
	 * Servicio de consulta de numero de elementos presentes en el modelo 
	 * @return numero de elementos presentes en el modelo
	 */
	public int darTamano()
	{
		return datos.darTamano();
	}

	/**
	 * Requerimiento de agregar dato
	 * @param dato
	 */
	public void agregar(T dato)
	{	
		datos.agregar(dato);
	}

	/**
	 * Requerimiento buscar dato
	 * @param dato Dato a buscar
	 * @return dato encontrado
	 */
	public String buscar(T dato)
	{
		return (String) datos.buscar(dato);
	}

	/**
	 * Requerimiento eliminar dato
	 * @param dato Dato a eliminar
	 * @return dato eliminado
	 */
	public String eliminar(T dato)
	{
		return (String) datos.eliminar(dato);
	}

	public void cargar(String pRutaArchivo, String pObjectid, String pFecha_hora, String pClaseVehi, String pTipoServ, int pInfrac, String pDesInfrac, String pLocalidad) 
	{
		File archivo = new File(pRutaArchivo);

		try {
			
			JsonReader reader = new JsonReader(new FileReader(archivo));
			
			while(reader.hasNext())
			{					
				reader.nextName();
				reader.nextName();
				reader.nextName();
				
				reader.beginObject();
				while(reader.hasNext())
				{
					
				}
				
				
						
			}
		
			reader.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	} 
}
