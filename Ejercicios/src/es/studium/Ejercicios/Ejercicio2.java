package es.studium.Ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 
{
	public Ejercicio2() 
	{
		try 
		{
			
			//Origen de los datos
			FileReader fr = new FileReader("fich1.txt");
			//Buffer de lectura
			BufferedReader entrada = new BufferedReader(fr);
			String s;
			//Bucle para sacar la información del archivo
			while((s=entrada.readLine())!=null)
			{
				System.out.println(s);
			}
			
			//Cerrar el objeto entrada
			entrada.close();
			fr.close();
		
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("No se encuentra el archivo");
		}
		catch(IOException i)
		{
			System.out.println("Error de archivo.");
		}
		
	}
	public static void main(String[] args) {
		new Ejercicio2();
	}

}
