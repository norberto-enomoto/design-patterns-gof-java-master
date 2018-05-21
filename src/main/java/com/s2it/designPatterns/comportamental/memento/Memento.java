package com.s2it.designPatterns.comportamental.memento;

public class Memento {

	private String nome = "";
	private float peso = 0.0F;

	public Memento(String nome, float peso) {
		this.nome = nome;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
}
