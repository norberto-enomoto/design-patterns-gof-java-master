package com.s2it.designPatterns.comportamental.state;

public abstract class Pessoa {
	public abstract void setComportamentoCodar(Comportamento c);

	public abstract void codar();

	public abstract void setComportamentoZuar(Comportamento c);

	public abstract void zuar();
}
