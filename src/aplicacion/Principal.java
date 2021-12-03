package aplicacion;

import interfaz.*;

/**Esta clase define el codigo principal del programa
 * @author Tomas Machin, Alfredo Martinez, Alrbeto Ruiz y  Francisco Rodriguez
 */

public class Principal{
	public static void main(String args[]){
		String sentencia = "";
		for(int i = 0; i < args.length; i++){
			sentencia += args[i] + " ";
		}
		Interfaz.procesarPeticion(sentencia);
	}
}
