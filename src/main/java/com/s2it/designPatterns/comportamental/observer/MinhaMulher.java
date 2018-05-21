package com.s2it.designPatterns.comportamental.observer;

import java.util.Observable;
import java.util.Observer;

public class MinhaMulher implements Observer {

	public void ligar() {
		System.out.println("Ligar para o safado do meu marido e perguntar se ele quer trazer a dito cuja para casa.");
	}

	public void marcarQualquerCoisa() {
		System.out.println("Marcar qualquer coisa na hora em que meu marido que tomar uma cerveja com os amigos.");
	}

	public void update(Observable arg0, Object arg1) {
		Acoes acao = (Acoes) arg1;

		if (acao.equals(Acoes.FALAR_DE_MULHER_COM_AMIGOS)) {
			this.ligar();
		} else if (acao.equals(Acoes.PENSAR_EM_TOMAR_UMA_CERVA_COM_AMIGOS)) {
			this.marcarQualquerCoisa();
		}
	}
}
