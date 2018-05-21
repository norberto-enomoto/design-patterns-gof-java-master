package com.s2it.designPatterns.estrutural.composite;

import java.util.ArrayList;
import java.util.List;

//Composite
public class AgileMaster extends Colaborador {

	private List<Colaborador> listaSubordinados = new ArrayList<Colaborador>();

	public AgileMaster(String nome, double salario) {
		super(nome, salario);
	}

	public void exibeTime() {
		System.out.println(super.nome + ", $" + super.salario);
		for (Colaborador e : listaSubordinados) {
			e.exibeTime();
		}
	}

	public void adicionar(Colaborador e) {
		listaSubordinados.add(e);
	}

	public void remover(Colaborador e) {
		listaSubordinados.remove(e);
	}
}