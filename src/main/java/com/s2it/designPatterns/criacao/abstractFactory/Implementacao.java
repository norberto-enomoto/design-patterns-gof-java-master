package com.s2it.designPatterns.criacao.abstractFactory;

public class Implementacao {

	public static void main(String[] args) {
		
		EmpresaFactory abstractFactory = new EmpresaFactoryConcreta();
		
		Estagiario estagiario = abstractFactory.contrataEstagiario("Claudio", 18);
		Desenvolvedor desenvolvedor = abstractFactory.contrataDesenvolvedor("Bruno", 22);
		
		estagiario.exibeInformacoes();
		desenvolvedor.exibeInformacoes();
	}

}
