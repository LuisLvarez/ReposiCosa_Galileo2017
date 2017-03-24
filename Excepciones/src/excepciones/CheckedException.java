package excepciones;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CheckedException {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Ruta donde se va a escribir");
		String ruta=sc.nextLine();
		FileWriter fichero = abrirFichero(ruta);
		System.out.println("Texto a escribir");
		String texto=sc.nextLine();
		try{
			fichero.write(texto);
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	
		public static FileWriter abrirFichero(String ruta){ 
			try
			{ return new FileWriter(ruta); } 
			catch (IOException ioex) {
				// Aquí capturamos cualquier excepción IOException que se lance
				ioex.printStackTrace(); 
				return null; } 
			}

		
	}

