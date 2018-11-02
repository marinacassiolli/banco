package br.com.caelum.contas.modelo;

/* Classes abstratas NÃO podem ser instâncidas,
   útil para polimorfismo e herança dos atributos e métodos */
public abstract class Funcionario {
	
	protected String nome, cpf;
	protected double salario;

	/* Classes filhas não abstratas serão obrigadas a
	 * reescrever métodos abstratos da classe mãe.
	 * O método não tem "corpo" pois nunca será chamado
	 * diretamento daqui. Toda vez que o chamarem, cairá
	 * no método reescrito da classe filha */
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
