
:package dominio;

import java.util.ArrayList;

public class Libreta{
	private ArrayList<Contacto> contactos = new ArrayList<>();

	public ArrayList<Contacto> getContactos(){
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos){
		this.contactos = contactos;
	}

	public void annadirContacto(Contacto contacto){
		contactos.add(contacto);
	}

	public String toString(){
		StringBuilder mensaje = new StringBuilder();
		if(contactos.size() == 0){
			mensaje.append("La libreta está vacía");
		} else {
			for(Contacto contacto: contactos){
				mensaje.append(contacto + "\n");
			}
		}
		return mensaje.toString();
	}
}

