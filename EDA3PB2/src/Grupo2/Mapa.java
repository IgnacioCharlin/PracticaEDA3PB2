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
	
	public Boolean agregarVehiculo (Vehiculo nuevo){
		return vehiculos.add(nuevo);
	}
	public Integer getCantidadDeVehiculos() {
		return vehiculos.size();
	}
	
	public Boolean hayCoalicion() throws ColitionException {
		for (Vehiculo vehiculo1 : vehiculos) {
			for (Vehiculo vehiculo2 : vehiculos) {
				if (vehiculo1.getLatitud().equals(vehiculo2.getLatitud())&&vehiculo1.getLongitud().equals(vehiculo2.getLongitud())&&!vehiculo1.equals(vehiculo2)) {
					throw new ColitionException();
				}
			}
		}
		return false;
		
	}
	
}
