package com.example.exec6.model;

import java.sql.Time;

public class FuncionarioParcial extends Funcionario {
    private Time horaEntrada;
    private Time horaSaida;

    public FuncionarioParcial() {
    }

    public FuncionarioParcial(int id, String nome, float salario, Time horaEntrada, Time horaSaida) {
        super(id, nome, salario);
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

    public Time getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Time horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Time getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Time horaSaida) {
        this.horaSaida = horaSaida;
    }
}
