package com.s2it.designPatterns.estrutural.bridge;

public class DesenvolvedorBackend extends Desenvolvedor {

	public DesenvolvedorBackend(Implementador imp) {
		super(imp);
	}

	public void codar() {
		imp.codarImpl();
	}
}
