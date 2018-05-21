package com.s2it.designPatterns.estrutural.bridge;

public class DesenvolvedorFrontend extends Desenvolvedor {

	public DesenvolvedorFrontend(Implementador imp) {
		super(imp);
	}

	public void codar() {
		imp.codarImpl();
	}
}
