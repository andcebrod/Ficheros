package es.studium.Ejercicios;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio13 {
	public Ejercicio13() 
	{
		int num;
		try 
		{
			//Eligiendo el archivo a leer
			FileInputStream fis = new FileInputStream("../Ejercicios/uno.bin");
			//Buffer de entrada
			BufferedInputStream bis = new BufferedInputStream (fis);
			//Necesitamos un objeto de la clase DataInputStream
			DataInputStream entradaB = new DataInputStream(bis);
			//Sacar un integer del archivo.
			num=entradaB.readInt();
			entradaB.close();
			bis.close();
			fis.close();
			System.out.println(num);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Archivo NO encontrado");
		}
		catch(IOException i)
		{
			System.out.println("Se produjo un error de Archivo");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ejercicio13();
	}

}
