package com.s2it.designPatterns.estrutural.composite;

public abstract class Colaborador {

	protected String nome;
	protected double salario;

	public Colaborador(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public abstract void exibeTime();

	public abstract void adicionar(Colaborador e);

	public abstract void remover(Colaborador e);
}