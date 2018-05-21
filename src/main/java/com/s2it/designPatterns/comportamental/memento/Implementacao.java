package com.s2it.designPatterns.comportamental.memento;

public class Implementacao {

	public static void main(String[] args) {
		// Cria objeto vendedor
		Pessoa pessoa = new Pessoa("Julio", 100F);

		System.out.println(pessoa.getNome() + " - Pesa: " + pessoa.getPeso() + "\n");

		// Salva estado interno
		PessoaMemory memory = new PessoaMemory();
		memory.setMemento(pessoa.createMemento());

		// Altera os valores dos atributos do objeto vendedor
		pessoa.setNome("Pedro");
		pessoa.setPeso(200F);

		System.out.println(pessoa.getNome() + " - Pesa: " + pessoa.getPeso() + "\n");

		// Restaura memento
		pessoa.restoreMemeneto(memory.getMemento());

		System.out.println(pessoa.getNome() + " - Pesa: " + pessoa.getPeso() + "\n");
	}

}
