package es.studium.Ejercicios;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio12 {

	public Ejercicio12()
	{
		try 
		{
			//Donde manda los datos:
			FileOutputStream fos = new FileOutputStream("uno.bin");
			BufferedOutputStream bos = new BufferedOutputStream (fos);
			//Objeto de la clase DataOutputStream
			DataOutputStream salidaB = new DataOutputStream(bos);
			//Buffer de lectura
			BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Escriba el número entero para pasar al archivo: ");
			Integer dato = Integer.parseInt(lectura.readLine());
			// Manda el dato al fichero y cierra los objetos
			salidaB.writeDouble(dato);
			salidaB.close();
			bos.close();
			fos.close();
			System.out.println("Fichero creado!");
		}
		catch(IOException i)
		{
			System.out.println("Se produjo un error de Archivo");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ejercicio12();
	}

}
