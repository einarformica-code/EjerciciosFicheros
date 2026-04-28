package pruebaFicheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1 {
	

public static void main(String[] args) {
	
	
	String ruta ="prueba.txt"; //Cambiar ruta de archivo si se desea
	
	try {
		 
		 extraerArray(ruta);		
	} catch (FileNotFoundException e) {
		System.out.println("Archivo no he encotrando");
	}catch(IOException e) {
		System.out.println("Error de lectura" + e);
	}
	
	
	try {
		System.out.println(mediaAritmetica(extraerArray(ruta)));
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
	
}
public static int[] extraerArray(String ruta) throws FileNotFoundException, IOException {
	
	FileReader lectorArchivos = new FileReader(ruta);//Captura el lector de texto
	BufferedReader lectorLineas = new BufferedReader(lectorArchivos);//Lee línea por línea
	String linea = lectorLineas.readLine();//Representará cada línea individual
	String [] listaNumerosCadena = linea.split(" ");
	int [] listaNumeros = new int[listaNumerosCadena.length];
	
	for(int i =0; i<listaNumerosCadena.length;i++) {
		listaNumeros[i]= Integer.parseInt(listaNumerosCadena[i]);
	}
	return listaNumeros;
}



public static int mediaAritmetica(int[]listaNumeros) {
	int suma = 0;
	
	for(int i =0; i<listaNumeros.length;i++) {
		suma +=listaNumeros[i];
	}
	
	return suma / listaNumeros.length;
	
	
}

}
