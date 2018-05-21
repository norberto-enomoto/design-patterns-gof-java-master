package com.s2it.designPatterns.criacao.abstractFactory;

public class DesenvolvedorConcreto extends Desenvolvedor {

	public DesenvolvedorConcreto(String nome, Integer idade) {
		super(nome, idade);
	}

	@Override
	public void exibeInformacoes() {
		System.out.println("O nome do Desenvolvedor é " + this.getNome() + " e ele tem " + this.getIdade() + " anos.");
	}

}
