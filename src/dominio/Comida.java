package dominio;

public class Comida{
	private String nombre;
	private float precio;
	private int cant;
	
	public Comida(){
		nombre = "";
		//precio;
		//cantidad;
	}

	public Comida(String nombre, float precio, int cant){
		this.nombre = nombre;
		this.precio = precio;
		this.cant = cant;
	}

	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public float getPrecio(){
		return precio;
	}
	public void setPrecio(float precio){
		this.precio = precio;
	}
	public int getCant(){
		return cant;
	}
	public void setCant(int cant){
		this.cant = cant;
	}

	public String toString(){
		String mensaje = "";
		mensaje += "  " + nombre + "         " + precio + "         " + cant;
		return mensaje;
	}

}
