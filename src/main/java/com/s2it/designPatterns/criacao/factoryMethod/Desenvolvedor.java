package com.s2it.designPatterns.criacao.factoryMethod;

public class Desenvolvedor extends Colaborador {

	public Desenvolvedor(String nome, Integer idade) {
		super(nome, idade);
	}

	@Override
	public void exibeInformacoes() {
		System.out.println("O nome do Desenvolvedor é " + this.getNome() + " e ele tem " + this.getIdade() + " anos.");
	}

}
