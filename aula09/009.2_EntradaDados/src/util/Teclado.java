package util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Teclado {

	
	private static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	
	public static String lerTexto(String texto) {
	
	  try {
		  
		System.out.println(texto);
		
		return teclado.readLine();
	  }
		  catch (Exception e) {
	  
			  return null;	  
	 }
		// TODO: handle exception
	
	
	}
   
   public static int lerint(String texto ){
    	
    	// chama po metodo lerString o resultado
	   
      return Integer.parseInt(lerTexto(texto)); 	
    	
   } 
	  
   public static double lerdouble(String texto ){
   	
   	// chama po metodo lerString o resultado
	   
     return Double.parseDouble(lerTexto(texto)); 	
   	
   }
   
     
	
	
}
