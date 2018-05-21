package com.s2it.designPatterns.criacao.builder;

public class EstagiarioBuilder extends ColaboradorBuilder {

	private Colaborador colaborador = new Estagiario();

	@Override
	public void realizaIntegracao() {
		System.out.println("O novo Estagiário está participando da integração!");
	}

	@Override
	public void conheceAEquipe() {
		System.out.println("O novo Estagiário está conhecendo a Equipe!");
	}

	@Override
	public void participaDeTreinamento() {
		System.out.println("O novo Estagiário está participando de treinamentos!");
	}

	@Override
	public void fazUpdateSemWhereEmProducao() {
		System.out.println("O novo Estagiário toma um esporro astronômico!");
	}

	@Override
	public Colaborador getColaborador() {
		System.out.println("O Desenvolvedor que deu acesso ao banco de produção para o novo Estagiário não está mais entre nós!");
		return colaborador;
	}

}
