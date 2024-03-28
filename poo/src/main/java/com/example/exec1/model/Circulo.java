package com.example.exec1.model;

public class Circulo {
    private double raio;

    public Circulo() {

    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }
}
