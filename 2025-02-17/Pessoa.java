package org.example;

abstract class Pessoa {
    private String nome;
    protected double renda;

    public Pessoa(String nome, double renda) {
        this.nome = nome;
        this.renda = renda;
    }

    public String getNome() {
        return nome;
    }

    public double getRenda() {
        return renda;
    }

    public abstract double tax();
}
