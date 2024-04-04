package com.example.repo1.model;

public class Vip extends Ingresso {

    private String cargo;

    public Vip() {
    }

    public Vip(String codigo, float valor, String cargo) {
        super(codigo, valor);
        this.cargo = cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public float valorFinal(float conveniencia) {
        return super.valorFinal(conveniencia) * 1.18f;
    }

}
