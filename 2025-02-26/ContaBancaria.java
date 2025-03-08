package org.example;

class ContaBancaria {
    private Integer numero;
    private String titular;
    private Double saldo;
    private Double limiteSaque;

    public ContaBancaria(Integer numero, String titular, Double saldo, Double limiteSaque) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public void depositar(Double valor) {
        saldo += valor;
    }

    public void sacar(Double valor) {
        if (valor > limiteSaque) {
            throw new LimSaqExcedidoException("Withdraw error: The amount exceeds withdraw limit");
        }
        if (valor > saldo) {
            throw new SaldoInsufException("Withdraw error: Not enough balance");
        }
        saldo -= valor;
    }

    public Double getSaldo() {
        return saldo;
    }
}

