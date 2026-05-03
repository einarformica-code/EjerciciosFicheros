package boletin1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		String ruta = "enteros.txt";
		
		try {
			extraerLista(ruta);
			System.out.println(extraerLista(ruta));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		
	}

	
	
	public static List<Integer> extraerLista(String ruta) throws NumberFormatException, IOException {
		
		List <Integer> listaNumeros = new ArrayList<Integer>();
		
		BufferedReader lectorLineas = new BufferedReader(new FileReader(ruta));
		

		String linea;
		
		int numeros[]  =Integer.parseInt(linea.trim().split("\\s+"));
		
		while((linea = lectorLineas.readLine()) != null) {
			
			for(int num: linea) {
				listaNumeros.add(Integer.parseInt(linea));
			}
			
		}
		return listaNumeros;
		
		
		
		
		
		
		
	}
}
