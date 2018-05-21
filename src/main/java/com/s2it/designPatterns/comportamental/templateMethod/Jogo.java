package com.s2it.designPatterns.comportamental.templateMethod;

public abstract class Jogo {

	public abstract void preparar();

	public abstract void comecar();

	public abstract void terminar();

	public void jogar() {
		this.preparar();
		this.comecar();
		this.terminar();
	}
}
