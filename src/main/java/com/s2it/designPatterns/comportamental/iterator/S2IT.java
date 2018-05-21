package com.s2it.designPatterns.comportamental.iterator;
import java.util.Iterator;
import java.util.List;


public abstract class S2IT {
	
	public abstract List<Desenvolvedor> getDesenvolvedores();
	public abstract void addDesenvolvedor(Desenvolvedor a);
	public abstract void removeDesenvolvedor(Desenvolvedor a);
	public abstract Iterator<Desenvolvedor> createIterator(); 
}
