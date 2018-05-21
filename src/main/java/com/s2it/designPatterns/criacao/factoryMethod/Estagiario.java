package com.s2it.designPatterns.criacao.factoryMethod;

public class Estagiario extends Colaborador {

	public Estagiario(String nome, Integer idade) {
		super(nome, idade);
	}

	@Override
	public void exibeInformacoes() {
		System.out.println("O nome do Estagiário é " + this.getNome() + " e ele tem " + this.getIdade() + " anos.");
	}

}
