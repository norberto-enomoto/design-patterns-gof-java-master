package com.s2it.designPatterns.comportamental.strategy;

public class Desenvolvedor {

	private AlgoritmoSkill algoritmo;
	
	public Desenvolvedor(AlgoritmoSkill algoritmo){
		this.algoritmo = algoritmo;
	}

	public void setAlgoritmo(AlgoritmoSkill algoritmo) {
		this.algoritmo = algoritmo;
	}
	
	public void skill() {
		algoritmo.skill();
	}
}
