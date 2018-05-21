package com.s2it.designPatterns.criacao.singleton;

public class Singleton {

	private static Singleton instance = null;
	private int valor;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
}
