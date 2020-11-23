
public abstract class Cliente {
	protected Integer cod_cliente;
	protected String nombre;
	private Boolean premiumFutbol;
	private Boolean premiumBasquet;

	
	public Cliente(Integer cod_cliente, String nombre) {
		this.cod_cliente = cod_cliente;
		this.nombre = nombre;
		premiumFutbol = false;
		premiumBasquet = false;
	}
	public Integer getCod_cliente() {
		return cod_cliente;
	}
	public void setCod_cliente(Integer cod_cliente) {
		this.cod_cliente = cod_cliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	public Boolean getPremiumFutbol() {
		return premiumFutbol;
	}
	public void setPremiumFutbol(Boolean premiumFutbol) {
		this.premiumFutbol = premiumFutbol;
	}
	public Boolean getPremiumBasquet() {
		return premiumBasquet;
	}
	public void setPremiumBasquet(Boolean premiumBasquet) {
		this.premiumBasquet = premiumBasquet;
	}
	@Override
	public String toString() {
		return "Cliente [cod_cliente=" + cod_cliente + ", nombre=" + nombre + "]";
	}

	
	
}
