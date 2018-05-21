package com.s2it.designPatterns.criacao.factoryMethod;

public abstract class EmpresaFactory {

	public abstract Colaborador contrata(String nome, Integer idade);

}
