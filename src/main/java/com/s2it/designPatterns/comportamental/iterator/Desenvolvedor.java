package com.s2it.designPatterns.comportamental.iterator;

public class Desenvolvedor {
	
	private String nome;
	private String cargo;
	
	public Desenvolvedor(String nome, String cargo){
		this.nome = nome;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
}
