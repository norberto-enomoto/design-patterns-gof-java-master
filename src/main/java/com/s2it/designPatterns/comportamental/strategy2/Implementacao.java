package com.s2it.designPatterns.comportamental.strategy2;

import com.s2it.designPatterns.comportamental.strategy.Backend;
import com.s2it.designPatterns.comportamental.strategy.Desenvolvedor;
import com.s2it.designPatterns.comportamental.strategy.DevOps;
import com.s2it.designPatterns.comportamental.strategy.Frontend;

public class Implementacao{

        public static void main(String[] args) {

            NotaFiscal nf = new NotaFiscal(new ImpostoRio(),100);
            nf.calcularImposto();

            NotaFiscal nf1 = new NotaFiscal(new ImpostoSaoPaulo(),100);
            nf1.calcularImposto();

        }

}
