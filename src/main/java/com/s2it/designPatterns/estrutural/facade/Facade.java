package com.s2it.designPatterns.estrutural.facade;

class Facade {

	private Administrativo adm;
	private RH rh;
	private Marketing mkt;

	public Facade() {
		adm = new Administrativo();
		rh = new RH();
		mkt = new Marketing();
	}

	public void recrutar() {
		mkt.criarCampanhaParaRecrutamento();
		rh.buscarTalentos();
		rh.contratar();
		adm.assinarCarteira();
	}

}