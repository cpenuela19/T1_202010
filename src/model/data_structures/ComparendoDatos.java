package model.data_structures;

public class ComparendoDatos {
	
	//Identificador único del comparendo 
	String objectid;
	
	//Descripcion Fecha del comparendo en formato Año\/Mes\/Día
	String fechaHora;
	
	//Tipo de vehículo 
	String claseVehi;
	
	//tipo de servicio ("Particular", "Público", “Oficial”)  
	String tipoServ;
	
	//Código de la infracción cometida
	int infraccion;
	
	//Descripcion infraccion 
	String desInfraccion;
	
	//Localidad en la ciudad del comparendo
	String localidad;
}
