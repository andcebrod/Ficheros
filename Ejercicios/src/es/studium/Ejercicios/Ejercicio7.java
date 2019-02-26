package es.studium.Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Ejercicio7 
{
	public Ejercicio7() 
	{
		try 
		{
			BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Escriba el nombre del primer archivo: ");
			String fichero1 = lectura.readLine();
			System.out.println("Escriba el nombre del segundo archivo: ");
			String fichero2 = lectura.readLine();
			
			String contenido="";
			
			//Origen de los datos
			FileReader fr = new FileReader(fichero1);
			//Buffer de lectura
			BufferedReader entrada = new BufferedReader(fr);
			String linea;
			//Bucle para sacar la información del archivo
			
			while((linea=entrada.readLine())!=null)
			{
				contenido = contenido+linea;
			}
			//Cerrar el objeto entrada
			entrada.close();
			fr.close();
			
			System.out.println("¿El archivo "+fichero2+" existe (Responda sí o no)?");
			String respuesta = lectura.readLine();
			if (respuesta.equals("Sí") || respuesta.equals("sí")||respuesta.equals("si") ||respuesta.equals("Si"))
			{
				FileWriter fw = new FileWriter(fichero2, true);
				// Buffer de escritura
				BufferedWriter bw = new BufferedWriter(fw);
				// Objeto para la escritura
				PrintWriter salida = new PrintWriter(bw);
				salida.print(contenido);
				System.out.println("¡Archivo copiado con éxito!");
				
				salida.close();
				bw.close();
				fw.close();
			} else 
			{
				FileWriter fw = new FileWriter(fichero2);
				// Buffer de escritura
				BufferedWriter bw = new BufferedWriter(fw);
				// Objeto para la escritura
				PrintWriter salida = new PrintWriter(bw);
				salida.print(contenido);
				System.out.println("¡Archivo copiado con éxito!");
				
				salida.close();
				bw.close();
				fw.close();
			}
			
			
			
		
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

	public static void main(String[] args) 
	{
		new Ejercicio7();

	}

}
