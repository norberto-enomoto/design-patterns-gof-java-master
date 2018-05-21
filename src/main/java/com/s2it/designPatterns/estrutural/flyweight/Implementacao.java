package com.s2it.designPatterns.estrutural.flyweight;

public class Implementacao {

	public static void main(String[] args) {
		
		Bebida f = BebidaFactory.getBebida(TipoDeBebida.CAFE);
		f.produz();
		
		f = BebidaFactory.getBebida(TipoDeBebida.CHA);
		f.produz();
		
		f = BebidaFactory.getBebida(TipoDeBebida.CHA_GELADO);
		f.produz();
		

	}

}
