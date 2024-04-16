package com.example.exec6.model;

public class FuncionarioIntegral extends Funcionario {
    private float bancoDeHoras;

    public FuncionarioIntegral() {
    }

    public FuncionarioIntegral(int id, String nome, float salario, float bancoDeHoras) {
        super(id, nome, salario);
        this.bancoDeHoras = bancoDeHoras;
    }

    public float getBancoDeHoras() {
        return bancoDeHoras;
    }

    public void setBancoDeHoras(float bancoDeHoras) {
        this.bancoDeHoras = bancoDeHoras;
    }
}
