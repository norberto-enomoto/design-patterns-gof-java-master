package com.s2it.designPatterns.comportamental.templateMethod;

public class Sinuca extends Jogo {

	public void preparar() {
		System.out.println("2 jogadores se preparam.");
	}

	public void comecar() {
		System.out.println("Inicia a partida de sinuca.");
	}

	public void terminar() {
		System.out.println("Termina a partida de sinuca.");
	}

}
