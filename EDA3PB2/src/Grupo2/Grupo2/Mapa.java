package Grupo2;

import java.util.HashSet;

public class Mapa {
	private String nombre;
	private HashSet<Vehiculo> vehiculos;

	public Mapa(String nombre) {
		super();
		this.nombre = nombre;
		vehiculos = new HashSet<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarVehiculo (Vehiculo nuevo) throws ColitionException {
		if (vehiculos.add(nuevo)== false) {
			throw new ColitionException();
		}
	}
	public Integer getCantidadDeVehiculos() {
		return vehiculos.size();
	}
	
	public Boolean hayCoalicion() throws ColitionException {
		
		return false;
	}
}
