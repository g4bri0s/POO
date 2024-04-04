package com.example.repo1.model;

public class Ingresso {

    private String codigo;
    private float valor;

    public Ingresso() {
    }

    public Ingresso(String codigo, float valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public float valorFinal(float conviencia) {
        return valor + conviencia;
    }

}
