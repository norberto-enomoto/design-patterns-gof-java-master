package com.s2it.designPatterns.estrutural.decorator;

public class Implementacao {

	public static void main(String[] args) {
		Estagiario estagiario = new EstagiarioDefault();

		estagiario = new FrontendDecorator(estagiario);
		estagiario = new DevOpsDecorator(estagiario);
		estagiario = new DevOpsDecorator(estagiario);
		estagiario = new DevOpsDecorator(estagiario);
		estagiario = new DevOpsDecorator(estagiario);
		estagiario = new DevOpsDecorator(estagiario);
		estagiario = new BackendDecorator(estagiario);

		estagiario.skills();
	}

}
