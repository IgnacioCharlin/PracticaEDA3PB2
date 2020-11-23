import java.util.HashMap;

public class Empresa {
	private String nombre;
	private HashMap<Integer, Cliente> ClientesIngresados;
	public Empresa(String nombre) {
		super();
		this.nombre = nombre;
		ClientesIngresados = new HashMap<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Boolean agregarCliente(Cliente nuevo) {
		if (nuevo != null) {
			ClientesIngresados.put(nuevo.getCod_cliente(), nuevo);
			return true;
		}
		return false;
	}
	 
	public Integer getCantidadAbonados() {
		return ClientesIngresados.size();
	}
	
	public Boolean habilitarPremium (Premium habilitar , Cliente nuevo) throws NoEsClienteConCableException{
		if (nuevo instanceof ClienteCable || nuevo instanceof ClienteTri && habilitar.equals("SFUTBOL")) {
			this.ClientesIngresados.put(nuevo.getCod_cliente(), nuevo);
			return true;
		}else {
			throw new NoEsClienteConCableException();
		}
	}
}