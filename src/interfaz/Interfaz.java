package interfaz;

import dominio.*;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Interfaz{
	private static String NOMBRE_FICHERO = "libreta.txt";
	public static void procesarPeticion(String sentencia){
		String[] palabras = sentencia.split(" ");
		Libreta libreta = inicializarLibreta();
		if(palabras[0].equals("add") && palabras.length == 3){
			Contacto contacto = new Contacto(palabras[1], palabras[2]);
			System.out.println(contacto);
			libreta.annadirContacto(contacto);
			guardarLibreta(libreta);
		} else if(palabras[0].equals("list")){
			System.out.println("Estos son los contactos de la libreta:");
			System.out.println(libreta);
		} else if(palabras[0].equals("help")){
			printHelp();
		} else {
			printHelp();
		}
	}

	private static Libreta inicializarLibreta(){
		Libreta libreta = new Libreta();
		try{
			File file = new File(NOMBRE_FICHERO);
			Scanner sc = new Scanner(file);
			while(sc.hasNext()){
				String nombre = sc.next();
				String telefono = sc.next();
				Contacto contacto = new Contacto(nombre, telefono);
				libreta.annadirContacto(contacto);
			}
			sc.close();
		} catch (FileNotFoundException e){

		}
		return libreta;
	}

	private static void guardarLibreta(Libreta libreta){
		try{
			FileWriter fw = new FileWriter(NOMBRE_FICHERO);
			fw.write(libreta.toString());
			fw.close();
			System.out.println("Se ha guardado la libreta con éxito");
		} catch(IOException e){
			System.out.println("Ha habido un error al guardar el fichero");
		}
	}

	private static void printHelp(){
		String ayuda = "Las operaciones posibles son las siguientes:\n"+
			"- Añadir contacto: ‘java -jar libreta.jar add <nombre> <teléfono>‘\n"+
			"Por ejemplo,\n"+
			"\tjava -jar libreta.jar add Pepe 654321234\n"+
			"- Mostrar contactos:\n"+
			"\tjava -jar libreta.jar list\n"+
			"- Mostrar esta ayuda:\n"+
			"\tjava -jar libreta.jar help";
		System.out.println(ayuda);
	}
}

