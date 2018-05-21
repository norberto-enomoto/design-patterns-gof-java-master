package com.s2it.designPatterns.criacao.abstractFactory;

public abstract class Estagiario {

	private String nome;
	private Integer idade;

	public Estagiario(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public abstract void exibeInformacoes();

}
