package com.example.exec4.model;

public abstract class Quadrilatero {

    private float base;
    private float altura;

    public void setBase(float base) {
        this.base = base;
    }

    public float getBase() {
        return base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public float calcPerimetro() {
        return 2 * (getBase() + getAltura());
    };

    public abstract float calcArea();
}