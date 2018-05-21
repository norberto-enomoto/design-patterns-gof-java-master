package com.s2it.designPatterns.estrutural.bridge;

public abstract class Desenvolvedor{
	
	protected Implementador imp = new DesenvolvedorImplFrontend();
	
	protected Desenvolvedor(Implementador imp){
		this.imp = imp;
	}
	
	public abstract void codar();
}
