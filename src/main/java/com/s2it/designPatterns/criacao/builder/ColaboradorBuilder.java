package com.s2it.designPatterns.criacao.builder;

public abstract class ColaboradorBuilder {

	public abstract void realizaIntegracao();

	public abstract void conheceAEquipe();

	public abstract void participaDeTreinamento();

	public abstract void fazUpdateSemWhereEmProducao();

	public abstract Colaborador getColaborador();

}
