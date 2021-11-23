package dominio;

public class Comida{
	private String nombre;
	private String precio;
	private String cantidad;

	public Comida(){
		nombre = "";
		precio = "";
		cantidad = "";
	}

	public Comida(String nombre, String precio, String cantidad){
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getPrecio(){
		return precio;
	}
	public void setPrecio(String precio){
		this.precio = precio;
	}
	public String getCantidad(){
		return cantidad;
	}
	public void setCantidad(String cantidad){
		this.cantidad = cantidad;
	}

	public String toString(){
		return "- " + nombre + " " + precio + "€ " + cantidad;
	}

}
