package br.com.caelum.contas.modelo;

public class Gerente extends Funcionario implements Autenticavel {

	private int senha, numeroDeFuncionariosGerenciados;
	
	public boolean autentica(int senha) {
		if (this.senha != senha) {
			System.out.println("Acesso permitido!");
			return true;
		}
		System.out.println("Acesso negado!");
		return false;
	}

	// Reescrita do método abstrato da classe mãe "Funcionario"
	@Override
	public double getBonificacao() {
		return this.salario * 1.4 + 1000;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
}
