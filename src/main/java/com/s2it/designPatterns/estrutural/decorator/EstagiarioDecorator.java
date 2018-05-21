package com.s2it.designPatterns.estrutural.decorator;

//Decorator
public abstract class EstagiarioDecorator extends Estagiario {

	private final Estagiario estagiarioDecorado;

	public EstagiarioDecorator(Estagiario estagiario) {
		this.estagiarioDecorado = estagiario;
	}

	public void skills() {
		estagiarioDecorado.skills();
	}
}