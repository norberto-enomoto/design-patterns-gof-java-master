package com.s2it.designPatterns.criacao.prototype;

public abstract class Zumbi implements Cloneable {

	@Override
	public Zumbi clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return (Zumbi) clone;
	}

	public abstract void ataca();

}
