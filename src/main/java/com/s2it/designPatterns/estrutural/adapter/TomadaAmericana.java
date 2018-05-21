package com.s2it.designPatterns.estrutural.adapter;

public class TomadaAmericana extends Tomada<PlugAmericano> {

	public String conecta(PlugAmericano plug) {
		return plug.obtemEletricidade() + this.getNomeRede();
	}

	public String getNomeRede() {
		return "Tomada Americana";
	}
}
