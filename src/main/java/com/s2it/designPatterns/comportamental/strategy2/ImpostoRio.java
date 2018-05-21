package com.s2it.designPatterns.comportamental.strategy2;

public class ImpostoRio extends Imposto {

    public double calcularImposto(double valor){
        System.out.println(valor*1.33);
        return valor * 0.33;
    }

}
