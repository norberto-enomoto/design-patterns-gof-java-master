package com.s2it.designPatterns.criacao.builder;

public class DesenvolvedorBuilder extends ColaboradorBuilder {

	private Colaborador colaborador = new Desenvolvedor();

	@Override
	public void realizaIntegracao() {
		System.out.println("O novo Desenvolvedor está participando da integração!");
	}

	@Override
	public void conheceAEquipe() {
		System.out.println("O novo Desenvolvedor está conhecendo a Equipe!");
	}

	@Override
	public void participaDeTreinamento() {
		System.out.println("O novo Desenvolvedor está participando de treinamentos!");
	}

	@Override
	public void fazUpdateSemWhereEmProducao() {
		System.out.println("O novo Desenvolvedor tem que pegar a carteira de trabalho dele e passar no RH!");
	}

	@Override
	public Colaborador getColaborador() {
		System.out.println("O novo Desenvolvedor não está mais entre nós!");
		return colaborador;
	}

}
