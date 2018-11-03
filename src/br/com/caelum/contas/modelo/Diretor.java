package br.com.caelum.contas.modelo;

public class Diretor extends Funcionario {

	@Override
	public double getBonificacao() {
		return this.salario * 2 + 1000;
	}
}
