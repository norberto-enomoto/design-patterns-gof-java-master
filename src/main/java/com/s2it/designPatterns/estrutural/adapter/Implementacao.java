package com.s2it.designPatterns.estrutural.adapter;

public class Implementacao {

	public static void main(String[] args) {
		// Adaptado
		PlugAmericano plugAmericano = new PlugAmericano();

		AdapterEstadosUnidosToBrasil adaptador = new AdapterEstadosUnidosToBrasil();
		System.out.println(adaptador.conecta(plugAmericano));
	}

}
