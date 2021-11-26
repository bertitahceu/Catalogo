package interfaz;

import dominio.*;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.NumberFormatException;
public class Interfaz{
	private static String NOMBRE_FICHERO = "catalogo.txt";
	public static void procesarPeticion(String sentencia){
		String[] palabras = sentencia.split(" ");
		Catalogo catalogo = inicializarCatalogo();
		if(palabras[0].equals("add") && palabras.length == 4){
			Comida comida = new Comida(palabras[1], Float.parseFloat(palabras[2]), Integer.parseInt(palabras[3]));
			System.out.println(comida);
			catalogo.annadirComida(comida);
			guardarCatalogo(catalogo);
		} else if(palabras[0].equals("list")){
			System.out.println("  PRODUCTOS   |  PRECIO  |  CANTIDAD");
			System.out.println("--------------------------------------");
			System.out.println(catalogo);
		} else if(palabras[0].equals("help")){
			printHelp();
		} else {
			printHelp();
		}
	}

	private static Catalogo inicializarCatalogo(){
		Catalogo catalogo = new Catalogo();
		try{
			File file = new File(NOMBRE_FICHERO);
			Scanner sc = new Scanner(file);
			while(sc.hasNext()){
			String nombre = sc.next();
			String str = sc.next();
			float precio = Float.parseFloat(str);
			String cantidad = sc.next();
			int cant = Integer.parseInt(cantidad);
			Comida comida = new Comida(nombre, precio, cant);
			catalogo.annadirComida(comida);
			}
			sc.close();
		} catch (FileNotFoundException e){
		
		} /*catch (NumberFormatException f){
			System.out.println("Por favor use un punto y no una coma subnormal");
		}*/return catalogo;
	}

	private static void guardarCatalogo(Catalogo catalogo){
		try{
			FileWriter fw = new FileWriter(NOMBRE_FICHERO);
			fw.write(catalogo.toString());
			fw.close();
			System.out.println("Se ha guardado el catálogo con éxito");
		} catch(IOException e){
			System.out.println("Ha habido un error al guardar el fichero");
		}
	}

	private static void printHelp(){
		String ayuda = "Las operaciones posibles son las siguientes:\n"+
			"- Añadir producto: ‘java -jar catalogo.jar add <nombre> <teléfono> <cantidad>‘\n"+
			"Por ejemplo,\n"+
			"\tjava -jar catalogo.jar add manzana 1 12\n"+
			"- Mostrar contactos:\n"+
			"\tjava -jar catalogo.jar list\n"+
			"- Mostrar esta ayuda:\n"+
			"\tjava -jar catalogo.jar help";
		System.out.println(ayuda);
	}
}

