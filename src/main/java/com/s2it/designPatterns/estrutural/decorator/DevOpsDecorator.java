package com.s2it.designPatterns.estrutural.decorator;

public class DevOpsDecorator extends EstagiarioDecorator {

	public DevOpsDecorator(Estagiario estagiario) {
		super(estagiario);
	}

	public void skills() {
		super.skills();
		System.out.print("Docker, ");
	}

}
