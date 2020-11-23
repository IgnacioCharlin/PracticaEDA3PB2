
public class ClienteBandaAncha extends Cliente {
	private String email;
		
	public ClienteBandaAncha(Integer cod_cliente, String nombre, String email) {
		super(cod_cliente, nombre);
		this.email = email;
	}

	public String getEMail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "ClienteBandaAncha [email=" + email + "]";
	}

	
}
