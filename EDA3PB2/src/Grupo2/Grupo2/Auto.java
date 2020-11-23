package Grupo2;

public class Auto extends Vehiculo{
	private String patente;
	private Integer cantidadDePasajeros;
	private Integer velocidad;
	public Auto(String patente,Integer cantidadDePasajeros,Integer velocidad ,Double latitud, Double longitud ) {
		super(latitud, longitud);
		this.patente = patente;
		this.velocidad = velocidad;
		this.cantidadDePasajeros = cantidadDePasajeros;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public Integer getCantidadMaximaDePasajeros() {
		return cantidadDePasajeros;
	}
	public void setCantidadDePasajeros(Integer cantidadDePasajeros) {
		this.cantidadDePasajeros = cantidadDePasajeros;
	}
	public Integer getVelocidadMaxima() {
		return velocidad;
	}
	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;
	}
	
	
	
}
