package com.s2it.designPatterns.estrutural.bridge;

public class Implementacao {

	public static void main(String[] args) {

		Desenvolvedor grad = new DesenvolvedorFrontend(new DesenvolvedorImplFrontend());
		grad.codar();
	}

}
