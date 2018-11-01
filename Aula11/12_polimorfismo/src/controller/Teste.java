package controller;
import java.util.Date;

import model.ContaCorrente; import model.ContaEspecial; 


public class Teste {
	public static void main(String[] args) { 
 	 	ContaCorrente cc = new ContaCorrente("Michael Oliveira","0001", "123456",250 ); 
 	 	System.out.println("Saldo Michael"); 
 	 	System.out.println(cc.calcularSaldo()); 
 		System.out.println("agencia:" + cc.getAgencia());
 	 	System.out.println("Conta:" + cc.getNumeroConta());
 	 	 cc.data="10/10/18";
  ContaEspecial cce = new ContaEspecial("Fabrício Curvello","0034","987654",0.50, 500); 
 	 	System.out.println("\tSaldo Fabricio"); 
 	 	System.out.println("Saldo: "+cce.calcularSaldo()); 

        Date now = new Date();
 	 	System.out.println("agencia:" + cce.getAgencia());
 	 	System.out.println("Conta:" + cce.getNumeroConta());
 	 	System.out.println("titular:" + cce.getTitular());
 	 	System.out.println(cc.data);
 	 	
 	 	System.out.println(now);
 
 	}

	


}
