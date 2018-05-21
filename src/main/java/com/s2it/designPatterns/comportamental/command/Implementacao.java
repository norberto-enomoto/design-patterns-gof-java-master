package com.s2it.designPatterns.comportamental.command;

public class Implementacao {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		Invoker invoker = new Invoker();
		
		invoker.calcular(new Soma(calculadora, 10));
		invoker.calcular(new Soma(calculadora, 5));
		invoker.calcular(new Soma(calculadora, 10));
		
		invoker.desfazer(1);
	}

}
