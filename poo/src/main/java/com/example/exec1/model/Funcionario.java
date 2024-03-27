package com.example.exec1.model;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public Funcionario() {
    }

    public String getCargo() {
        return cargo;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalarioLiquido(double desconto, double beneficio) {
        return salario - desconto + beneficio;
    }
}
