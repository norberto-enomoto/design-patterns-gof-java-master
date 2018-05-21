package com.s2it.designPatterns.criacao.prototype;

public class Implementacao {

	public static void main(String[] args) {
		
		AtaqueZumbi.academiaZumbi();
		
		AtaqueZumbi.clonaZumbi("machado").ataca();
		AtaqueZumbi.clonaZumbi("machado").ataca();		
		AtaqueZumbi.clonaZumbi("motoserra").ataca();
		AtaqueZumbi.clonaZumbi("carioca").ataca();
		AtaqueZumbi.clonaZumbi("carioca").ataca();
		AtaqueZumbi.clonaZumbi("carioca").ataca();
		AtaqueZumbi.clonaZumbi("motoserra").ataca();
		AtaqueZumbi.clonaZumbi("motoserra").ataca();
		AtaqueZumbi.clonaZumbi("carioca").ataca();
	}
	
}
