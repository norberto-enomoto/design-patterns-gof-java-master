package com.s2it.designPatterns.comportamental.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class S2ITImpl extends S2IT {

	private List<Desenvolvedor> desenvolvedoresList = new ArrayList<Desenvolvedor>();

	public List<Desenvolvedor> getDesenvolvedores() {
		return desenvolvedoresList;
	}

	public void addDesenvolvedor(Desenvolvedor a) {
		desenvolvedoresList.add(a);
	}

	public void removeDesenvolvedor(Desenvolvedor a) {
		desenvolvedoresList.remove(a);
	}

	public Iterator<Desenvolvedor> createIterator() {
		return desenvolvedoresList.iterator();
	}

}
