
package controller;

import model.Aluno;
import model.Professor;
import model.usuario;

public class teste {

	public static void main(String[] args) {

		// usuario usu = new usuario();
		 Professor prof2 = new Professor("Jose","Senha123",0,"Joaquim Silva","Doutor",11223);
		 Professor prof  = new Professor("loginprof","master12",33,"Gilberto","mestre TI",12345);
		 
		Aluno aluno    = new Aluno("muzi", "muzi123", 1, "Sergio Muzi", "primeiro", "tarde", 32115);
	
	    //  = "Carlos";
		
		aluno.mostrar();
		System.out.println("======================================");
		prof.mostrar();
		System.out.println("======================================");
		prof2.mostrar();
	}

	//aluno aluno = new aluno();

}
