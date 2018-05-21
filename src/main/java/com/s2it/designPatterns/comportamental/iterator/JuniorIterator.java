package com.s2it.designPatterns.comportamental.iterator;

import java.util.Iterator;

public class JuniorIterator implements Iterator<Desenvolvedor> {

	private S2IT s2it;
	private int pos = 0;

	public JuniorIterator(S2IT zoo) {
		this.s2it = zoo;
	}

	public boolean hasNext() {
		for (int i = pos; i < s2it.getDesenvolvedores().size(); i++) {
			Desenvolvedor a = s2it.getDesenvolvedores().get(i);
			if (a.getCargo().equalsIgnoreCase("junior")) {
				return true;
			}
		}
		return false;
	}

	public Desenvolvedor next() {
		while (pos < s2it.getDesenvolvedores().size()) {
			Desenvolvedor a = s2it.getDesenvolvedores().get(pos);
			pos++;

			if (a.getCargo().equalsIgnoreCase("junior")) {
				return a;
			}
		}
		return null;
	}

}
