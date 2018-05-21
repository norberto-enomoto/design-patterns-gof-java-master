package com.s2it.designPatterns.estrutural.decorator;

public class FrontendDecorator extends EstagiarioDecorator {

	public FrontendDecorator(Estagiario estagiario) {
		super(estagiario);
	}

	public void skills() {
		super.skills();
		System.out.print("Javascript, ");
	}
}
