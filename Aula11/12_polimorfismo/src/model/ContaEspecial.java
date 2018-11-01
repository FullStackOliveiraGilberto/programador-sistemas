package model;

public class ContaEspecial extends ContaCorrente {

	private Double limite;

	/**
	 * @return the limite
	 */
	public Double getLimite() {
		return limite;
	}

	/**
	 * @param limite the limite to set
	 */
	public void setLimite(Double limite) {
		this.limite = limite;
	}

	public ContaEspecial() {
		super();
	}

	public ContaEspecial(String titular, String agencia, String numeroConta, double saldo, double limite) {
		super(titular, agencia, numeroConta, saldo);
		this.limite = limite;
	}

	@Override
	public double calcularSaldo() {
		double saldoFinal;
		saldoFinal = super.calcularSaldo() + limite;

		return saldoFinal;
	}

}
