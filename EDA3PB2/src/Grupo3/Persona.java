package Grupo3;

import java.util.ArrayList;

public abstract class Persona {
	protected Integer dni;
	protected String nombre;
	private ArrayList<Producto> changito;
	public Persona(Integer dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		changito = new ArrayList<>();
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Boolean agregarProducto(Producto nuevo) {
		return changito.add(nuevo);
	}

	public ArrayList<Producto> getChangito() {
		return changito;
	}

	public void setChangito(ArrayList<Producto> changito) {
		this.changito = changito;
	}
	public Double getPrecioDelProducto(Producto nuevo) {
		for (Producto producto : changito) {
			if (producto.equals(nuevo)) {
				return nuevo.getPrecio();
			}
		}
		return 0.0;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Persona))
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}
	
	
}
