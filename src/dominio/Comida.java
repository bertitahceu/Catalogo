package dominio;

/** Esta clase define un producto con su precio y cantidad correspondiente 
 * @author Tomas Machin, Alfredo Martinez, Alberto Ruiz, Francisco Rodriguez
 */
public class Comida{
	private String nombre;
	private float precio;
	private int cant;
	/** Para obtener el nombre del producto, el precio  la cantidad de este
	 * @author Nombre de la comida
	 */
	public Comida(){
		nombre = "";
	}

	public Comida(String nombre, float precio, int cant){
		this.nombre = nombre;
		this.precio = precio;
		this.cant = cant;
	}

	public String getNombre(){
		return nombre;
	}
	/** Metodo para cambiar el nombre del producto del catalogo
	 * @param nuevo nombre del producto
	 */
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public float getPrecio(){
		return precio;
	}
	/** Metodo para cambiar el precio del producto
	 * @param nueva cantidad del precio
	 */
	public void setPrecio(float precio){
		this.precio = precio;
	}
	public int getCant(){
		return cant;
	}
	/** Metodo para cambiar la cantidad querida del producto
	 * @param nueva cantidad del producto 
	 */
	public void setCant(int cant){
		this.cant = cant;
	}

	public String toString(){
		String mensaje = "";
		mensaje += "  " + nombre + "        " + precio + "        " + cant;
		return mensaje;
	}

}
