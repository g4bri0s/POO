package com.example.exec4.model;

public class Paralelograma extends Quadrilatero {

    public static void main(String[] args) {
        Paralelograma p = new Paralelograma();
        p.setBase(2);
        p.setAltura(3);
        System.out.println("Perímetro: " + p.calcPerimetro());
        System.out.println("Área: " + p.calcArea());
        System.err.println("Perímetro: " + p.calcPerimetro());
        System.err.println("Área: " + p.calcArea());
    }

    public float calcArea() {
        return getBase() * getAltura();
    }

}
