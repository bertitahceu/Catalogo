package dominio;

import java.util.ArrayList;
/** Esta clase define un catalogo de los productos queridos
 * @author Tomas Machin, Alfredo Martinez, Alberto Ruiz, Francisco Rodriguez
 */
public class Catalogo{
	private ArrayList<Comida> comidas = new ArrayList<>();

	public ArrayList<Comida> getComidas(){
		return comidas;
	}	
	/** Para obtener una lista con los productos deseados
	 * @author nombre del array (lista) de la comida
	 */
	
	public void setComidas(ArrayList<Comida> comidas){
		this.comidas = comidas;
	}

	public void annadirComida(Comida comida){
		comidas.add(comida);
	}
	/** Para añadir un producto a la lista del catalogo
	 * @param añadir un producto a la lista
	 */

	public String toString(){
		StringBuilder mensaje = new StringBuilder();
		if(comidas.size() == 0){
			mensaje.append("El catálogo está vacío");
		} else {
			for(Comida comida: comidas){
				mensaje.append(comida + "\n");
			}
		}
		return mensaje.toString();
	}
}

