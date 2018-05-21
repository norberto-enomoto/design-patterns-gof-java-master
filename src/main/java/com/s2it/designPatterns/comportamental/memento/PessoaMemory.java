package com.s2it.designPatterns.comportamental.memento;

public class PessoaMemory {

	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
