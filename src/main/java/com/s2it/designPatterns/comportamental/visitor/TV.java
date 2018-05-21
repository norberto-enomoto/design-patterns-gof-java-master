package com.s2it.designPatterns.comportamental.visitor;

public class TV extends Equipamento {

	public TV(String nome, double preco) {
		super(nome, preco);
	}

	public void accept(EquipamentoVisitor visitor) {
		visitor.visitTV(this);
	}

}