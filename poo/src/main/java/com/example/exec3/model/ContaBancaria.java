package com.example.exec3.model;

public class ContaBancaria {
    private String cliente;
    private float saldo;
    private int numeroConta;

    public ContaBancaria() {
    }

    public void sacar(float valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= valor;
        }
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    protected void atualizaSaldo(float saldo) {
        this.saldo += saldo;
    }
}
