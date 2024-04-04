package com.example.exec4.model;

public class Trapezio extends Quadrilatero {

    public static void main(String[] args) {
        Trapezio t = new Trapezio();
        t.setBase(3);
        t.setBaseMenor(2);
        t.setBaseMenor(1);
        t.setAltura(4);
        System.out.println("Perímetro: " + t.calcPerimetro());
        System.out.println("Área: " + t.calcArea());
        System.err.println("Perímetro: " + t.calcPerimetro());
        System.err.println("Área: " + t.calcArea());
    }

    private float setBaseMenor;

    public void setBaseMenor(float baseMenor) {
        this.setBaseMenor = baseMenor;
    }

    public float getBaseMenor() {
        return setBaseMenor;
    }

    @Override
    public float calcPerimetro() {
        return calcAltura() * 2 + getBase() + getBaseMenor();
    }

    public float calcArea() {
        return ((getBase() + getBaseMenor()) * getAltura()) / 2;
    }

    public float calcAltura() {
        float a = getBase() - getBaseMenor();
        return (float) Math.sqrt(Math.pow(getAltura(), 2) + Math.pow(a, 2));
    }
}
