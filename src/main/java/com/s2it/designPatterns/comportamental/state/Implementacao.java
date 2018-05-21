package com.s2it.designPatterns.comportamental.state;

public class Implementacao {

	public static void main(String[] args) {
		Desenvolvedor p = new Desenvolvedor();
		
		p.setComportamentoCodar(new Codar());
		p.setComportamentoZuar(new NaoZuar());
		
		p.codar();
		p.zuar();

	}

}
