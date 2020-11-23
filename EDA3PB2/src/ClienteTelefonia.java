
public class ClienteTelefonia extends Cliente{
	private String codigoArea;
	private String telefono;

	public ClienteTelefonia(Integer cod_cliente, String nombre,String codigoArea,String telefono) {
		super(cod_cliente, nombre);
		this.codigoArea = codigoArea;
		this.telefono = telefono;
	}

	public String getCodigoDeArea() {
		return codigoArea;
	}

	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
}
