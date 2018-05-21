package com.s2it.designPatterns.criacao.factoryMethod;

public class Implementacao {

	public static void main(String[] args) {

		EmpresaFactory estagiarioFactory = new EstagiarioFactory();
		EmpresaFactory desenvolvedorFactory = new DesenvolvedorFactory();

		Colaborador estagiario = estagiarioFactory.contrata("Claudio", 18);
		Colaborador desenvolvedor = desenvolvedorFactory.contrata("Bruno", 22);

		estagiario.exibeInformacoes();
		desenvolvedor.exibeInformacoes();
	}

}
