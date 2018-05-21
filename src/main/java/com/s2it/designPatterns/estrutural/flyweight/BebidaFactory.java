package com.s2it.designPatterns.estrutural.flyweight;

import java.util.HashMap;

public class BebidaFactory {

	private static final HashMap<TipoDeBebida, Bebida> bebidas = new HashMap<TipoDeBebida, Bebida>();

	public static Bebida getBebida(TipoDeBebida bebida) {
		Bebida beb = bebidas.get(bebida);

		if (beb == null) {
			if (bebida.equals(TipoDeBebida.CHA_GELADO)) {
				beb = new Cha(true);
			} else if (bebida.equals(TipoDeBebida.CHA)) {
				beb = new Cha(false);
			} else if (bebida.equals(TipoDeBebida.CAFE)) {
				beb = new Cafe();
			}

			bebidas.put(bebida, beb);
		}
		return beb;
	}
}
