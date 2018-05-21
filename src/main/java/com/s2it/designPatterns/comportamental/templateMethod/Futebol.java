package com.s2it.designPatterns.comportamental.templateMethod;

public class Futebol extends Jogo {

	public void preparar() {
		System.out.println("22 jogadores se preparam.");
	}

	public void comecar() {
		System.out.println("Inicia a partida de futebol.");
	}

	public void terminar() {
		System.out.println("Termina a partida de futebol.");
	}

}
