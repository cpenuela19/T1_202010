package model.logic;

public class ComparendoDatos {
	
	//Identificador único del comparendo 
	private int objectid;
	
	//Fecha del comparendo en formato Año\/Mes\/Día
	private int fechaHora;
	
	//Tipo de vehículo 
	private String claseVehi;
	
	//tipo de servicio ("Particular", "Público", “Oficial”)  
	private String tipoServ;
	
	//Código de la infracción cometida
	private String infraccion;
	
	//Descripcion infraccion 
	private String desInfraccion;
	
	//Localidad en la ciudad del comparendo
	private String localidad;

	public ComparendoDatos(int pObjectid, int pFecha_hora, String pClaseVehi, String pTipoServ, String pInfrac, String pDesInfrac, String pLocalidad)
	{
		objectid = pObjectid;
		fechaHora = pFecha_hora;
		claseVehi = pClaseVehi;
		tipoServ = pTipoServ;
		infraccion = pInfrac;
		desInfraccion = pDesInfrac;
		localidad = pLocalidad;
		
	}
	
	public int getObjectid() {
		return objectid;
	}

	public void setObjectid(int objectid) {
		this.objectid = objectid;
	}

	public int getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(int fechaHora) {
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

	public String getInfraccion() {
		return infraccion;
	}

	public void setInfraccion(String infraccion) {
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
