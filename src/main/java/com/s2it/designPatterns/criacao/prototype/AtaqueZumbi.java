package com.s2it.designPatterns.criacao.prototype;

import java.util.Hashtable;

public class AtaqueZumbi {

	private static Hashtable<String, Zumbi> exercitoZumbi = new Hashtable<>();

	public static void academiaZumbi() {
		ZumbiComMachado zumbiComMachado = new ZumbiComMachado();
		exercitoZumbi.put("machado", zumbiComMachado);

		ZumbiComMotoserra zumbiComMotoserra = new ZumbiComMotoserra();
		exercitoZumbi.put("motoserra", zumbiComMotoserra);

		ZumbiCarioca zumbiCarioca = new ZumbiCarioca();
		exercitoZumbi.put("carioca", zumbiCarioca);
	}

	public static Zumbi clonaZumbi(String arma) {
		Zumbi zumbi = exercitoZumbi.get(arma);
		
		return zumbi.clone();
	}

}
