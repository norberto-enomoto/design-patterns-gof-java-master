package com.s2it.designPatterns.comportamental.strategy2;

public class NotaFiscal {

    private Imposto imposto;
    private double valor;

    public NotaFiscal(Imposto imposto, double valor){ this.imposto = imposto; this.valor = valor; }

    public void setImposto(Imposto imposto) {
        this.imposto = imposto;
    }

    public void calcularImposto() { imposto.calcularImposto(valor); }
}
