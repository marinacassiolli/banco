package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	public String getTipo() {
		return "Corrente Corrente";
	}
	
	@Override
	public void saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou sacar um valor negativo! :(");
		} else if (this.saldo < valor) {
			// O melhor seria usar o próprio IllegarArguments, mas para
			// fins de estudos, criamos uma nova exceção
			throw new SaldoInsuficienteException(valor);
		} else {
			this.saldo -= (valor + 0.10);
		}
	}

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return this.getSaldo() * 0.01;
	}
}
