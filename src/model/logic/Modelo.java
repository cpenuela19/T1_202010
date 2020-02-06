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
import model.data_structures.ListaEncadenada;

import model.data_structures.Nodo;

/**
 * Definicion del modelo del mundo
 *
 */
public class Modelo  {


	private IArregloDinamico datos;

	private IListaEncadenada<ComparendoDatos> lista;

	/**
	 * Constructor del modelo del mundo 
	 */
	public Modelo()
	{
		lista = new ListaEncadenada<ComparendoDatos>();
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
		return lista.darTamanio();
	}

	/**
	 * Requerimiento de agregar dato
	 * @param dato
	 */
	public void agregarObj(ComparendoDatos objeto)
	{	
		lista.agregarObj(objeto);
	}

	/**
	 * Requerimiento buscar objeto
	 * @param objeto dado a buscar
	 * @return dato encontrado
	 */
	public ComparendoDatos buscar(int objecId)
	{
		return null;
	}

	/**
	 * Requerimiento eliminar objeto
	 * @param posicion del objeto a eliminar
	 * @return objeto eliminado
	 */
	public void eliminar(ComparendoDatos pos)
	{
		
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	
	public void cargar(String pRutaArchivo) 
	{
		File archivo = new File(pRutaArchivo);

		try {

			//leer archivo
			JsonReader reader = new JsonReader(new FileReader(archivo));
			// Separar todo lo que necesite en el Json 
			JsonParser separador = new JsonParser();


			//archivo completo json, separado por objetos			
			JsonObject separadorJson = (JsonObject) separador.parse(reader); 
			
			// arreglo de comparendo obtenidos en el archivo json
			JsonArray comparendos = (JsonArray) separadorJson.get("features").getAsJsonArray();

			for(int i=0; i<comparendos.size(); i++)
			{
				//representa al objeto en version JSON
				JsonObject objetoActual = comparendos.get(i).getAsJsonObject();
				JsonObject propiedadesObjetoActual = objetoActual.get("properties").getAsJsonObject();

				int objectid = propiedadesObjetoActual.get("OBJECTID").getAsInt();

				// Fecha del comparendo en formato Año\/Mes\/Día
				int fechaHora = propiedadesObjetoActual.get("FECHA_HORA").getAsInt();

				//Tipo de vehículo 
				String claseVehi = propiedadesObjetoActual.get("CLASE_VEHI").getAsString();

				//tipo de servicio ("Particular", "Público", “Oficial”)  
				String tipoServ = propiedadesObjetoActual.get("TIPO_SERVI").getAsString();

				//Código de la infracción cometida
				String infraccion = propiedadesObjetoActual.get("INFRACCION").getAsString();

				//Descripcion infraccion 
				String desInfraccion = propiedadesObjetoActual.get("DES_INFRAC").getAsString();

				//Localidad en la ciudad del comparendo
				String localidad = propiedadesObjetoActual.get("LOCALIDAD").getAsString();
				
				ComparendoDatos nuevoObj = new ComparendoDatos(objectid, fechaHora, claseVehi, 
						tipoServ, infraccion, desInfraccion, localidad);
				
				lista.agregarObj(nuevoObj);
			}

			reader.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	} 
}
