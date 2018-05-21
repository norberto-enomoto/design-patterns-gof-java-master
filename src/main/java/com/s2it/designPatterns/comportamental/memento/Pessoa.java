package com.s2it.designPatterns.comportamental.memento;

public class Pessoa {

	private String nome = "";
	private float peso = 0.0F;

	public Pessoa(String nome, float totalVendas) {
		this.nome = nome;
		this.peso = totalVendas;
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

	public Memento createMemento() {
		Memento m = new Memento(nome, peso);
		return m;
	}

	public void restoreMemeneto(Memento m) {
		this.nome = m.getNome();
		this.peso = m.getPeso();
	}

}