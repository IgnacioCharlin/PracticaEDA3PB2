package Grupo2;

public class Moto extends Vehiculo {
	private String patente;
	private final Integer CANTIDAD_MAXIMA_DE_PASAJEROS = 2;
	private Integer velocidad;
	
	public Moto(String patente, int velocidad, double latitud, double longitud) {
		super(latitud, longitud);
		this.patente = patente;
		this.velocidad = velocidad;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Integer getCANTIDAD_MAXIMA_DE_PASAJEROS() {
		return CANTIDAD_MAXIMA_DE_PASAJEROS;
	}

	public Integer getVelocidadMaxima() {
		return velocidad;
	}

	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;
	}

	
}
