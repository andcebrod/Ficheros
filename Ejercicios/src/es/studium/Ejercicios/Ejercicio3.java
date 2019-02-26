package es.studium.Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Ejercicio3 
{
	public Ejercicio3() 
	{
		try 
		{
			BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
			FileWriter fw = new FileWriter("fich1.txt",true);
			String cadena = "";
			System.out.println("Escriba la cadena a introducir en el fichero: ");
			cadena = lectura.readLine();
			// Buffer de escritura
			BufferedWriter bw = new BufferedWriter(fw);
			// Objeto para la escritura
			PrintWriter salida = new PrintWriter(bw);
			//Guardamos la primera línea
			salida.println(cadena);
			//Cerrar el objeto salida, el objeto bw y el fw
			salida.close();
			bw.close();
			fw.close();
			System.out.println("Archivo creado correctamente!");
		} 
		catch (IOException i)
		{
			System.out.println("Se produjo un error de Archivo");
		}
	}
	
	
	
	
	public static void main(String[] args) 
	{
		new Ejercicio3();

	}

}
