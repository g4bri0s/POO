package com.example.exec3.model;

public class ContaEspecial extends ContaBancaria {

    private float limite;

    public ContaEspecial() {
    }

    @Override
    public void sacar(float valor) {
        if (valor > getSaldo() + limite) {
            System.out.println("Saldo insuficiente");
        } else {
            atualizaSaldo(valor);
        }
    }
}