package controller;
import util.*;

import util.Teclado;

public class lacoTesteFim {
	
	public static void main(String[] args) {
		int r,x,i;
		
		i =1;
		
		do {
			
			
			x = Teclado.Lerint("digite um numero:");
			
			r = x*3;
			System.out.println(r);
		
			i = i +1;
			
		} while (i <=5);
		
		System.out.println("Fim");
		
	}

}
