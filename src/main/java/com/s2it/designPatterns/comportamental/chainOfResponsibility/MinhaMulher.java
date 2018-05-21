package com.s2it.designPatterns.comportamental.chainOfResponsibility;

//ConcreteHandler
public class MinhaMulher extends Handler {

	public void aprova(Compra compra) {
		if (compra.getValor() < 500F) {
			System.out.println("Taaa pode comprar. ¬¬");
		}else {
			System.out.println("Ta doido? Precisamos guardar dinheiro!");
		}
	}
}
