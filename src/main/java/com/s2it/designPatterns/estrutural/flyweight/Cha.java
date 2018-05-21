package com.s2it.designPatterns.estrutural.flyweight;

public class Cha extends Bebida {

	private boolean gelado;

	public Cha(boolean gelado) {
		super();
		this.gelado = gelado;
	}

	public void produz() {
		if (gelado) {
			System.out.println("Você pediu um chá gelado.");
		} else {
			System.out.println("Você pediu um  chá.");
		}
	}

}
