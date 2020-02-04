package model.logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

import jdk.internal.org.objectweb.asm.Handle;
import model.data_structures.ArregloDinamico;
import model.data_structures.IArregloDinamico;
import model.data_structures.IListaEncadenada;

/**
 * Definicion del modelo del mundo
 *
 */
public class Modelo {
	/**
	 * Atributos del modelo del mundo
	 */
//	private IArregloDinamico<T> datos;
	
	private IListaEncadenada<ComparendoDatos> lista;

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
			@SuppressWarnings("deprecation")
			
			// Separar todo lo que necesite 
			JsonParser separador = new JsonParser();
			
			//archivo completo json, separelo por objetos
			
			JsonObject separadorJson = (JsonObject) separador.parse(reader); 
			
			JsonArray comparendos = (JsonArray) separadorJson.get("features").getAsJsonArray();
			
			for(int i=0; i<comparendos.size(); i++)
			{
				//representa al objeto en version JSON
				JsonObject objetoActual = comparendos.get(i).getAsJsonObject();
				JsonObject propiedadesObjetoActual = objetoActual.get("properties").getAsJsonObject();
				 
				int objectid = propiedadesObjetoActual.get("OBJECTID").getAsInt();
				
				//Descripcion Fecha del comparendo en formato Año\/Mes\/Día
				 String fechaHora;
				
				//Tipo de vehículo 
				 String claseVehi;
				
				//tipo de servicio ("Particular", "Público", “Oficial”)  
				 String tipoServ;
				
				//Código de la infracción cometida
				 String infraccion;
				
				//Descripcion infraccion 
				 String desInfraccion;
				
				//Localidad en la ciudad del comparendo
				 String localidad;

				ComparendoDatos objetoActual = new ComparendoDatos(pObjectid, pFecha_hora, pClaseVehi, pTipoServ, pInfrac, pDesInfrac, pLocalidad);
				lista.add(objetoActual); 
				
			}
			
			reader.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	} 
}
