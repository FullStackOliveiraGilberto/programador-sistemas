package controller;

import util.Teclado;

public class Operadores {
	
	
	public static void main(String[] args) {
		 //nome;
		 String nome = Teclado.LerTexto(" Digite seu nome: ");
		
		int nota1;
		nota1 = Teclado.Lerint(" Digite a nota1: ");
		
		int nota2;
		nota2 = Teclado.Lerint(" Digite a nota2: ");
		
		int nota3;
		nota3 = Teclado.Lerint(" Digite a nota3: ");
		
		int nota4;
		nota4 = Teclado.Lerint(" Digite a nota14: ");
		
		
		
		System.out.println("Nome informado@@ : " + nome);
		
		System.out.println("Nota 1 informada@@ : " + nota1);
		System.out.println("Nota 2 informada@@ : " + nota2);
		System.out.println("Nota 3 informada@@ : " + nota3);
		System.out.println("Nota 4 informada@@ : " + nota4);
		
		
		
		System.out.println("Media nota@@ : " + (nota1+nota2+nota3+nota4)/4);
	}
	
	

}
