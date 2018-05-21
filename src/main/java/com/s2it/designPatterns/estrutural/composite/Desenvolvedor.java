package com.s2it.designPatterns.estrutural.composite;

public class Desenvolvedor extends Colaborador {
  
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }
 
    public void exibeTime() {
        System.out.println(super.nome + ", $" + super.salario);
    }
     
    public void adicionar(Colaborador e) {
        System.out.println("Desde quando desenvolvedor é chefe de alguém");
    }
  
    public void remover(Colaborador e) {
        System.out.println("Só se for pedir demissão né?");
    }
}