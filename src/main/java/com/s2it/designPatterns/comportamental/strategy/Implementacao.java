package com.s2it.designPatterns.comportamental.strategy;

public class Implementacao {

	public static void main(String[] args) {
		Desenvolvedor dev = new Desenvolvedor(new Frontend());
		dev.skill();
		
		dev.setAlgoritmo(new DevOps());
		dev.skill();
		
		dev.setAlgoritmo(new Backend());
		dev.skill();
	}

}
