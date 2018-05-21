package com.s2it.designPatterns.comportamental.strategy2;

public class ImpostoSaoPaulo extends Imposto{

    public double calcularImposto(double valor){
        System.out.println(valor*1.22);
        return valor * 0.22;
    }

}
