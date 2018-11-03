package br.com.caelum.contas.modelo;

/* Uma interface só expõe o que o objeto deve fazer,
 * não como ele faz ou o que ele tem */
public interface Autenticavel {

	/* Métodos de interfaces sempre são públicos
	 * e abstratos */
	boolean autentica(int senha);
}
