package com.s2it.designPatterns.comportamental.chainOfResponsibility;

public class Implementacao {

	public static void main(String args[]) {
		Handler minhaMulher = new MinhaMulher();
		Handler eu = new Eu();

		eu.setSucessor(minhaMulher);

		Compra compra = new Compra(20F);
		eu.aprova(compra);

		Compra compra2 = new Compra(200F);
		eu.aprova(compra2);

		Compra compra3 = new Compra(700F);
		eu.aprova(compra3);
	}
}
