package controller;

import java.util.Scanner;

public class ExemploScanner2 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
        double salario;
		String nome;
        
        Scanner scan = new Scanner((System.in));


		System.out.println("Digite o seu nome ");
		nome = scan.nextLine();
 		System.out.println("Seu nome é" + nome.toUpperCase());
		
		

		System.out.println("enter um valor salario ");
		salario = scan.nextDouble();

		System.out.println("O salario " + salario);
		scan.close();

	}

}
