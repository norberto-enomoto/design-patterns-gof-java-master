package com.s2it.designPatterns.comportamental.chainOfResponsibility;

//Handler
public abstract class Handler {
	protected Handler sucessor;

	public void setSucessor(Handler sucessor) {
		this.sucessor = sucessor;
	}

	public abstract void aprova(Compra compra);
}
