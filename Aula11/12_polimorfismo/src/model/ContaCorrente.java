package model;

import java.sql.Time;

public class ContaCorrente {

	private String titular;
	private String agencia;
	private String numeroConta;
	private Double saldo;
	public static String data;


	

	/**
	 * @return the data
	 */
	public static String getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public static void setData(String data) {
		ContaCorrente.data = data;
	}

	/**
	 * @return the titular
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * @param titular the titular to set
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	/**
	 * @return the agencia
	 */
	public String getAgencia() {
		return agencia;
	}

	/**
	 * @param agencia the agencia to set
	 */
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	/**
	 * @return the numeroConta
	 */
	public String getNumeroConta() {
		return numeroConta;
	}

	/**
	 * @param numeroConta the numeroConta to set
	 */
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	/**
	 * @return the saldo
	 */
	public Double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public ContaCorrente() {
		super();
	}
	     //  ContaCorrente("Michael Oliveira",    "0001", "           123456",     	250); 
	public ContaCorrente(String titular, String agencia, String numeroConta, double saldo ) {
		super();
		this.titular = titular;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		
		this.data = data;
	}

	public double calcularSaldo() {
		return this.saldo;
	}

}
