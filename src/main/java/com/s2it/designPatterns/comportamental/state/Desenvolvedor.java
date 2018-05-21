package com.s2it.designPatterns.comportamental.state;

public class Desenvolvedor extends Pessoa{
	
	private Comportamento comportamentoCodar;
	private Comportamento comportamentoZuar;
	
	public Desenvolvedor(){
		comportamentoCodar = new Codar();
		comportamentoZuar = new Zuar();
	}
	
	public void setComportamentoCodar(Comportamento c) {
		comportamentoCodar = c;
	}

	public void codar() {
		comportamentoCodar.exec();
	}

	public void setComportamentoZuar(Comportamento c) {
		comportamentoZuar = c;
	}

	public void zuar() {
		comportamentoZuar.exec();
	}
	
}