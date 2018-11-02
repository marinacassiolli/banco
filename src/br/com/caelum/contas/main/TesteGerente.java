package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ControleDeBonificacoes;
import br.com.caelum.contas.modelo.Gerente;

public class TesteGerente {
	public static void main(String[] args) {
		
		ControleDeBonificacoes controle = new ControleDeBonificacoes();
		
		Gerente gerente = new Gerente();
		gerente.setNome("Nacyby Mendes");
		gerente.setSenha(123456);
		gerente.setSalario(5000.0);
		controle.registra(gerente);
		
		Gerente gerente1 = new Gerente();
		gerente1.setNome("Marina Teixeira");
		gerente1.setSenha(1234567);
		gerente1.setSalario(2000.0);
		controle.registra(gerente1);
		
		System.out.println(gerente.getBonificacao());
		System.out.println(gerente1.getBonificacao());
		System.out.println(controle.getTotalDeBonificacoes());
	}
}
