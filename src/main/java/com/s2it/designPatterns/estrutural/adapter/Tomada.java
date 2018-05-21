package com.s2it.designPatterns.estrutural.adapter;

//Target
public abstract class Tomada<P> {

	public abstract String conecta(P plug);

	public abstract String getNomeRede();
}
