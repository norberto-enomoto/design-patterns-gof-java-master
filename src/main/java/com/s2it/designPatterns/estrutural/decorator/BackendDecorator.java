package com.s2it.designPatterns.estrutural.decorator;

//ConcreteDecorator
public class BackendDecorator extends EstagiarioDecorator{
		
	public BackendDecorator(Estagiario estagiario) {
		super(estagiario);
	}

	public void skills() {
		super.skills();
		System.out.print("Java, ");
	}
}
