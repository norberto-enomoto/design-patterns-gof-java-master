package com.s2it.designPatterns.estrutural.proxy;

public class RealConta extends Conta {
	private Long valor;

	public RealConta(Long valor) {
		this.valor = valor;
		sacaValor();
	}

	private void sacaValor() {
		System.out.println("Sacando o total de R$" + valor);
	}

	public void mostraValorSacado() {
		System.out.println("Foi sacado o valor de R$" + valor);
	}
}
