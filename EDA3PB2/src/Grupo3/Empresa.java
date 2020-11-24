package Grupo3;

import java.util.ArrayList;
import java.util.HashSet;

public class Empresa {
	private String nombre;
	private HashSet<Persona> personas;
	private HashSet<Producto> productos;

	public Empresa(String nombre) {
		super();
		this.nombre = nombre;
		personas = new HashSet<Persona>();
		productos = new HashSet<>();
	}

	public Boolean vincularPersona(Persona nueva) {
		return personas.add(nueva);
	}
	public Boolean agregarProducto(Producto nuevo) {
		return productos.add(nuevo);
	}

	public Boolean registrarCompra(Persona persona, Producto aVender)throws ConflictoDeInteresesException, ProductoNoEncontradoException {
		for (Persona persona2 : personas) {
			if (persona2 instanceof Empleado) {
				aVender.setPrecio(aVender.getPrecio()*0.8);
				persona2.agregarProducto(aVender);
			}else if (persona2 instanceof Director) {
				throw new ConflictoDeInteresesException();
			}else if (!productos.contains(aVender)) {
				throw new ProductoNoEncontradoException();
			}else {
				return persona2.agregarProducto(aVender);
			}
		}
		return false;
	}
	public Integer getCantidadDePersonasVinculadas() {
		return personas.size();
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
