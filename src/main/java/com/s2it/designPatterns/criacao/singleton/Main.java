package com.s2it.designPatterns.criacao.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();

        s1.setValor(2);
        System.out.println(s1.getValor());

        Singleton s2 = Singleton.getInstance();
        s2.setValor(3);

        System.out.println(s1.getValor());
        System.out.println(s2.getValor());

    }
}
