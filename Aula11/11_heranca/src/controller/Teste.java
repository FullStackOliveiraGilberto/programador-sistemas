package controller;
import model.Aluno; 
import model.Professor; 


public class Teste { 
	 
 	public static void main(String[] args) { 
 	 	 
 	 	Aluno aluno1 = new Aluno("João Mendes Silva", "10099876-5", 	"035568843-06", "21-8755-3456", "jmendes_silva@gmail.com", "10001", "Técnico de TI"); 
 		Aluno aluno2 = new Aluno("Maria Hlena Silva", "10099876-5", 	"035568843-06", "21-8755-3456", "jmendes_silva@gmail.com", "10001", "Técnico de TI"); 
 		Aluno aluno3 = new Aluno("Sheila Maria", "10099876-5", 	"035568843-06", "21-8755-3456", "jmendes_silva@gmail.com", "10001", "Técnico de TI"); 
 	 	  	 
 		
 	 	Professor professor1 = new Professor("Marcelo Roberto Campos","10054987-7", "075598845-75", "21-7793-8574",	"mrcampos@senai.rj.gov.br","901", "ADM"); 
 	 	Professor professor2 = new Professor("Marcelo Roberto Campos","10054987-7", "075598845-75", "21-7793-8574",	"mrcampos@senai.rj.gov.br","901", "TII"); 
 	 	
 	 	
 	 	
 	 	System.out.println("Nome:" + aluno1.getNome());
 	 	System.out.println("Nome:" + aluno2.getNome());
 	 	System.out.println("Nome:" + aluno3.getNome());
 	 	//System.out.println("Nome:" + aluno1.getNome());
 	 	
 	 	System.out.println("Professor/segmento:" + professor1.getSegmento());
 	 	System.out.println("Professor/segmento:" + professor2.getSegmento());
 	 	
   	 	
   }
}