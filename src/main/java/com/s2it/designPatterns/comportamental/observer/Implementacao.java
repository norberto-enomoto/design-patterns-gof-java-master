package com.s2it.designPatterns.comportamental.observer;

public class Implementacao {

	public static void main(String[] args) {
		//Observador
		MinhaMulher minhaMulher = new MinhaMulher();
		
		//Observado
		Eu eu = new Eu();
		
		//Adicionar observador ao observado
		eu.addObserver(minhaMulher);
		
		eu.falarDeMulherComAmigos();
		eu.marcarCervaComAmigos();

	}

}
