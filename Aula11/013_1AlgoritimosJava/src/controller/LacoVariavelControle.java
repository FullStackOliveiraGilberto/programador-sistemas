package controller;

import util.Teclado;

public class LacoVariavelControle {
	
	public static void main(String[] args) {
		int r,x,i;
		
		i =1;
		
		for (i=1; i<=5; i++) {
				
	       x = Teclado.Lerint("digite um numero:");
		   r = x*3;
		   System.out.println(r);
		
		}
			
	}

}
