package org.example;

class PessoaJuridica extends Pessoa {

    private int funcionarios;

    public PessoaJuridica(String nome, double renda, int funcionarios) {
        super(nome, renda);
        this.funcionarios = funcionarios;
    }

    @Override
    public double tax() {
        double resultado = (funcionarios > 10) ? 0.14 : 0.16;
        return renda * resultado;
    }

}
