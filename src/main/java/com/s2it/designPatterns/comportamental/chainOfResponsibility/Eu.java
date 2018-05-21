package com.s2it.designPatterns.comportamental.chainOfResponsibility;

//ConcreteHandler
public class Eu extends Handler {

	public void aprova(Compra compra) {
		if (compra.getValor() < 100F) {
			System.out.println("Até 100 eu posso comprar sem pedir.");
		}

		else if (sucessor != null) {
			sucessor.aprova(compra);
		}
	}
}
