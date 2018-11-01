package model;

public class Pessoa {  	
	
	private String rg;  	
	private String cpf;  	
	private String telefone; 
	private String email; 
	
	private String nome;  	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the rg
	 */
	public String getRg() {
		return rg;
	}
	/**
	 * @param rg the rg to set
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}
	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}
	
	 

 	 
public void setTelefone(String telefone) {  	 	
	this.telefone = telefone; 
 	} 
 	public String getEmail() { 
 	 	return email; 
 	} 
 	public void setEmail(String email) {  	 	
 		this.email = email; 
 	} 
 	public Pessoa() { 
 	 	super(); 
 	} 
 	public Pessoa(String nome, String rg, String cpf, String telefone,	String email) {  	 	
 		super(); 
 	 	this.nome = nome;  	 	
 	 	this.rg = rg;  	 	
 	 	this.cpf = cpf;  	 	
 	 	this.telefone = telefone; 
 	 	this.email = email; 
 	} 
 
} 
	
