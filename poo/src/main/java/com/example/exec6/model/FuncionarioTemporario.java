package com.example.exec6.model;

import java.util.Date;

public class FuncionarioTemporario extends Funcionario {

    private Date fimContrato;

    public FuncionarioTemporario(int id, String nome, float salario, Date fimContrato) {
        super(id, nome, salario);
        this.fimContrato = fimContrato;
    }

    public FuncionarioTemporario() {
    }

    public Date getFimContrato() {
        return fimContrato;
    }

    public void setFimContrato(Date fimContrato) {
        this.fimContrato = fimContrato;
    }
}
