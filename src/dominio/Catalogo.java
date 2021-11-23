package dominio;

import java.util.ArrayList;

public class Catalogo{
	private ArrayList<Comida> comidas = new ArrayList<>();

	public ArrayList<Comida> getComidas(){
		return comidas;
	}

	public void setComidas(ArrayList<Comida> comidas){
		this.comidas = comidas;
	}

	public void annadirComida(Comida comida){
		comidas.add(comida);
	}

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

