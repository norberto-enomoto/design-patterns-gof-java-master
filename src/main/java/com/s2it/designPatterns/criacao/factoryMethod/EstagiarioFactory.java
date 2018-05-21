package com.s2it.designPatterns.criacao.factoryMethod;

public class EstagiarioFactory extends EmpresaFactory{

	@Override
	public Colaborador contrata(String nome, Integer idade) {
		return new Estagiario(nome, idade);
	}

}
