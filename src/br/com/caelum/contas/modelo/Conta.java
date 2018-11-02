package br.com.caelum.contas.modelo;

/**
 * Responsáveç por moldar as contas do Banco
 * 
 * @author Marina Teixeira Cassiolli
 */

public abstract class Conta {

	protected double saldo;
	private int numero;
	private String agencia, titular;
	
	public abstract String getTipo();

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String getTitular() {
		return this.titular;
	}

	/** 
	 * Método para incremento do saldo
	 * @param valor
	 * */
	public void deposita(double valor) {
		this.saldo += valor;
	}

	/**
	 * Método para decremento do saldo
	 * @param valor
	 * */
	public void saca(double valor) {
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) {
		this.saldo -= valor;
		destino.saldo += valor;
	}
}
