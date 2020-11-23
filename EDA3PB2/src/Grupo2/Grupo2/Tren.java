package Grupo2;

public class Tren extends Vehiculo {
	private Integer cantidadDeVagones;
	private Integer cantidadDePasajerosPorVagon;
	private Integer velociadMaxima;
	
	public Tren(Integer cantidadDeVagones,Integer cantidadDePasajerosPorVagon,Integer velocidadMaxima,Double latitud, Double longitud) {
		super(latitud, longitud);
		this.cantidadDeVagones= cantidadDeVagones;
		this.cantidadDePasajerosPorVagon = cantidadDePasajerosPorVagon;
		this.velociadMaxima = velocidadMaxima;
	}

	public Integer getCantidadDeVagones() {
		return cantidadDeVagones;
	}

	public void setCantidadDeVagones(Integer cantidadDeVagones) {
		this.cantidadDeVagones = cantidadDeVagones;
	}

	public Integer getCantidadDePasajerosPorVagon() {
		return cantidadDePasajerosPorVagon;
	}

	public void setCantidadDePasajerosPorVagon(Integer cantidadDePasajerosPorVagon) {
		this.cantidadDePasajerosPorVagon = cantidadDePasajerosPorVagon;
	}

	public Integer getVelocidadMaxima() {
		return velociadMaxima;
	}

	public void setVelociadMaxima(Integer velociadMaxima) {
		this.velociadMaxima = velociadMaxima;
	}

}
