package com.s2it.designPatterns.estrutural.composite;

public class Implementacao {

	public static void main(String[] args) {
		Desenvolvedor pEstagiario = new Desenvolvedor("Claudin", 1500);
		Desenvolvedor pJunior = new Desenvolvedor("Pedro", 3000);
		Desenvolvedor pSenior = new Desenvolvedor("Paulo", 6000);

		AgileMaster g3 = new AgileMaster("Thiagones", 50000);
		AgileMaster g2 = new AgileMaster("Renan", 20000);
		AgileMaster g1 = new AgileMaster("Bueno", 20000);

		g1.adicionar(pEstagiario);
		g1.adicionar(pJunior);

		g2.adicionar(pSenior);

		g3.adicionar(g1);
		g3.adicionar(g2);

		g3.exibeTime();
	}

}
