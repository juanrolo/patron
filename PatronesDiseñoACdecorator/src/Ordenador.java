
public abstract class Ordenador {
	protected String marca;
	protected String modelo;
	protected String descripcion;
		
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public abstract String getDescripcion();
	
	public abstract int precio(); 

}
