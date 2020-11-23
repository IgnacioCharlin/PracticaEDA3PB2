
public class ClienteCable extends Cliente{
	private String codigoDecodificador;
	
	public ClienteCable(Integer cod_cliente, String nombre , String codigoDecodificador) {
		super(cod_cliente, nombre);
		this.codigoDecodificador = codigoDecodificador;
	}

	public String getCodigoDecodificador() {
		return codigoDecodificador;
	}

	public void setCodigoDecodificador(String codigoDecodificador) {
		this.codigoDecodificador = codigoDecodificador;
	}

	@Override
	public String toString() {
		return "ClienteCable [codigoDecodificador=" + codigoDecodificador + "]";
	}

}
