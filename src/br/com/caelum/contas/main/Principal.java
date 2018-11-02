package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ContaCorrente;

public class Principal {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100.0);

		System.out.println(cc.getSaldo());
	}
}
