package com.s2it.designPatterns.estrutural.adapter;

//Adapter
public class AdapterEstadosUnidosToBrasil extends TomadaBrasileira {

	public String conecta(PlugAmericano plug) {
		return plug.obtemEletricidade() + this.getNomeRede();
	}
}
