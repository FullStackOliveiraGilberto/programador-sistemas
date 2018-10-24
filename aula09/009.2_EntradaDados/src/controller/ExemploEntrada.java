package controller;

import util.*;


public class ExemploEntrada {
	
	public static void main(String[] args) {
		// leitura de texto
		String nome;
		nome = Teclado.lerTexto("Digite seu nome: ");
		// leitura de inteiro
		
		int idade;
		idade= Teclado.lerint("Digite sua idade: " ); 
		
		// leitura de ponto flutuando
		double salario;
		
		salario = Teclado.lerdouble("Digite seu Salario: "); 
		
		
		System.out.println("Nome informado: " + nome);
		System.out.println("Idade informada: " + idade);
		System.out.println("Salario informado: " + salario);
		
		
		
	}
	

}
