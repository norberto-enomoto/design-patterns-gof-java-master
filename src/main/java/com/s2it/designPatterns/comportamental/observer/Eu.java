package com.s2it.designPatterns.comportamental.observer;

import java.util.Observable;

public class Eu extends Observable {

	private Acoes acao = null;

	public void falarDeMulherComAmigos() {
		acao = Acoes.FALAR_DE_MULHER_COM_AMIGOS;
		System.out.println("Eu começo a falar de uma mulher bonita com meus camaradas.");
		this.mudaEstado();
	}

	public void marcarCervaComAmigos() {
		acao = Acoes.PENSAR_EM_TOMAR_UMA_CERVA_COM_AMIGOS;
		System.out.println("Começar a ver um horário com a rapaziada para tomar uma gelada.");
		this.mudaEstado();
	}

	public void mudaEstado() {
		setChanged(); // Mudou o estado
		notifyObservers(acao); // Notifica os observadores
	}
}
