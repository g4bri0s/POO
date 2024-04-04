package com.example.repo1.model;

public class ProfessorTitular extends Professor {

    private int anosInstituicao;
    private double salario;

    public ProfessorTitular() {
    }

    public ProfessorTitular(String nome, String matricula, int idade, int anosInstituicao, double salario) {
        super(nome, matricula, idade);
        this.anosInstituicao = anosInstituicao;
        this.salario = salario;
    }

    public void setAnosInstituicao(int anosInstituicao) {
        this.anosInstituicao = anosInstituicao;
    }

    public int getAnosInstituicao() {
        return anosInstituicao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public float calcSalario() {
        return (float) (salario + (salario * 0.05 * (anosInstituicao / 5)));
    }

}
