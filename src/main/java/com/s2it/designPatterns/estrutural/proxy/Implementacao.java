package com.s2it.designPatterns.estrutural.proxy;

public class Implementacao {

	public static void main(String[] args) {
		Conta operacao1 = new ProxyConta(500l);
        Conta operacao2 = new ProxyConta(1000l);
        
        operacao1.mostraValorSacado();
        operacao2.mostraValorSacado();
        
        operacao1.mostraValorSacado();
	}

}
