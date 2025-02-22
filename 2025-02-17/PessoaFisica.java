package org.example;

class PessoaFisica extends Pessoa {

    private double gastoComSaude;

    public PessoaFisica(String nome, double renda, double gastoComSaude) {
        super(nome, renda);
        this.gastoComSaude = gastoComSaude;
    }

    @Override
    public double tax() {
        double valor = (renda < 20000.0) ? (renda * 0.15) : (renda * 0.25);
        return valor - (gastoComSaude * 0.5);
    }
}
