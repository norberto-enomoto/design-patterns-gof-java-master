package com.s2it.designPatterns.comportamental.templateMethod;

public class Implementacao {

	public static void main(String[] args) {
		Jogo jogo = new Futebol();
		jogo.jogar();
		
		Jogo jogo2 = new Sinuca();
		jogo2.jogar();
	}

}
