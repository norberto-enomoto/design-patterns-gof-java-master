package com.s2it.designPatterns.estrutural.proxy;

public class ProxyConta extends Conta {
	private Long valor;
	private RealConta conta;

	public ProxyConta(Long valor) {
		this.valor = valor;
	}

	public void mostraValorSacado() {
		if (conta == null) {
			System.out.println("Verificando se a conta possui saldo");
			System.out.println("Saque autorizado");
			conta = new RealConta(valor);
		}
		conta.mostraValorSacado();
	}
}