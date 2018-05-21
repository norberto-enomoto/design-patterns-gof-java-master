package com.s2it.designPatterns.comportamental.iterator;

public class Implementacao {

	public static void main(String[] args) {
		S2IT zoo = new S2ITImpl();
		
		zoo.addDesenvolvedor(new Desenvolvedor("Pedro", "estagiario"));
		zoo.addDesenvolvedor(new Desenvolvedor("Bruno", "junior"));
		zoo.addDesenvolvedor(new Desenvolvedor("Carlos", "pleno"));
		zoo.addDesenvolvedor(new Desenvolvedor("Ricardo", "senior"));
		zoo.addDesenvolvedor(new Desenvolvedor("Gabriel", "senior"));
		
		EstagiarioIterator it = new EstagiarioIterator(zoo);
		
		while(it.hasNext()){
			System.out.println(it.next().getNome());
		}
	}

}
