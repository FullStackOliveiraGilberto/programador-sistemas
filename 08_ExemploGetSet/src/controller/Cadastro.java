package controller;

import model.*;

import model2.*;


public class Cadastro {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		
		Pessoa2 pessoa2 = new Pessoa2();
		
		pessoa2.setNome("mArquinho");
		
		pessoa.setNome("Leandro Ferra");
		pessoa.setIdade(28);
		pessoa.setSexo("Masculino");
		
		System.out.println("Nome2: " + pessoa2.getNome());
		
		
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Idade: " + pessoa.getIdade());
		System.out.println("Sexo: " + pessoa.getSexo());
		
		
		
		Pessoa people = new Pessoa();
		
		people.setNome("Joao");
		people.setIdade(38);
		people.setSexo("teste");
					
		System.out.println("Nome: " + people.getNome());
		System.out.println("Idade: " + people.getIdade());
		System.out.println("Sexo: " + people.getSexo());
		
		
		
		
		}
	
		
}
	


