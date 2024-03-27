package com.example.exec1.model;

public class ContaBancaria {
    private int numeroConta;
    private String nome;
    private double saldo;

    public ContaBancaria(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = 0;
    }

    public void ContaBancaria() {
    }

    public void realizarDeposito(double valor) {
        saldo += valor;
    }

    public double realizarSaque(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return valor;
        }
        return 0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
