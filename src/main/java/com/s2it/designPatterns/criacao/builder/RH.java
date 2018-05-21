package com.s2it.designPatterns.criacao.builder;

public class RH {

	public void contrata(ColaboradorBuilder builder) {
		builder.realizaIntegracao();
		builder.conheceAEquipe();
		builder.participaDeTreinamento();
		builder.fazUpdateSemWhereEmProducao();
	}

}
