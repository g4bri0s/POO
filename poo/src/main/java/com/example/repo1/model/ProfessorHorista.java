package com.example.repo1.model;

public class ProfessorHorista extends Professor {

    private int horasAula;
    private double valorHoraAula;

    public ProfessorHorista() {
    }

    public ProfessorHorista(String nome, String matricula, int idade, int horasAula, double valorHoraAula) {
        super(nome, matricula, idade);
        this.horasAula = horasAula;
        this.valorHoraAula = valorHoraAula;
    }

    public void setHorasAula(int horasAula) {
        this.horasAula = horasAula;
    }

    public int getHorasAula() {
        return horasAula;
    }

    public void setValorHoraAula(double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    public double getValorHoraAula() {
        return valorHoraAula;
    }

    @Override
    public float calcSalario() {
        return (float) (horasAula * valorHoraAula);
    }

}
