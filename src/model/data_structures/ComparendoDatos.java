package model.data_structures;

public class ComparendoDatos {
	
	//Identificador único del comparendo 
	private String objectid;
	
	//Descripcion Fecha del comparendo en formato Año\/Mes\/Día
	private String fechaHora;
	
	//Tipo de vehículo 
	private String claseVehi;
	
	//tipo de servicio ("Particular", "Público", “Oficial”)  
	private String tipoServ;
	
	//Código de la infracción cometida
	private int infraccion;
	
	//Descripcion infraccion 
	private String desInfraccion;
	
	//Localidad en la ciudad del comparendo
	private String localidad;

	public ComparendoDatos(String pObjectid, String pFecha_hora, String pClaseVehi, String pTipoServ, int pInfrac, String pDesInfrac, String pLocalidad)
	{
		objectid = pObjectid;
		fechaHora = pFecha_hora;
		claseVehi = pClaseVehi;
		tipoServ = pTipoServ;
		infraccion = pInfrac;
		desInfraccion = pDesInfrac;
		localidad = pLocalidad;
		
	}
	
	public String getObjectid() {
		return objectid;
	}

	public void setObjectid(String objectid) {
		this.objectid = objectid;
	}

	public String getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getClaseVehi() {
		return claseVehi;
	}

	public void setClaseVehi(String claseVehi) {
		this.claseVehi = claseVehi;
	}

	public String getTipoServ() {
		return tipoServ;
	}

	public void setTipoServ(String tipoServ) {
		this.tipoServ = tipoServ;
	}

	public int getInfraccion() {
		return infraccion;
	}

	public void setInfraccion(int infraccion) {
		this.infraccion = infraccion;
	}

	public String getDesInfraccion() {
		return desInfraccion;
	}

	public void setDesInfraccion(String desInfraccion) {
		this.desInfraccion = desInfraccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	
}
