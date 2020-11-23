
public class ClienteTri extends Cliente{
	private String codigoArea;
	private String codigoCodificador;
	private String email;
	private String telefono;
	
	public ClienteTri(Integer cod_cliente, String nombre , String codigoArea,String telefono , String codigoCodificador, String email) {
		super(cod_cliente, nombre);
		this.codigoCodificador = codigoCodificador;
		this.codigoArea = codigoArea;
		this.email = email;
		this.telefono = telefono;
		// TODO Auto-generated constructor stub
	}

	public String getCodigoDeArea() {
		return codigoArea;
	}

	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea;
	}

	public String getCodigoDecodificador() {
		return codigoCodificador;
	}

	public void setCodigoCodificador(String codigoCodificador) {
		this.codigoCodificador = codigoCodificador;
	}

	public String getEMail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "ClienteTri [codigoArea=" + codigoArea + ", codigoCodificador=" + codigoCodificador + ", email=" + email
				+ "]";
	}

}
