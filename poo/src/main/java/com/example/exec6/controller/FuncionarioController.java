package com.example.exec6.controller;

import java.sql.Time;
import java.util.Date;

import javax.swing.JOptionPane;

import com.example.exec6.model.FuncionarioIntegral;
import com.example.exec6.model.FuncionarioParcial;
import com.example.exec6.model.FuncionarioTemporario;

public class FuncionarioController {

    public FuncionarioIntegral contratarFuncionarioIntegral() {
        FuncionarioIntegral funcionarioIntegral = new FuncionarioIntegral(1, "João", 1000, 0);
        funcionarioIntegral.setBancoDeHoras(Float.parseFloat(JOptionPane.showInputDialog("Digite o banco de horas: ")));
        return funcionarioIntegral;
    }

    public void exibirFuncionarioIntegral(FuncionarioIntegral funcionarioIntegral) {
        System.out.println("Funcionário: " + funcionarioIntegral.getNome());
        System.out.println("Salário: " + funcionarioIntegral.getSalario());
        System.out.println("Banco de horas: " + funcionarioIntegral.getBancoDeHoras());
    }

    public FuncionarioParcial contratarFuncionarioParcial() {
        FuncionarioParcial funcionarioParcial = new FuncionarioParcial(2, "Maria", 500, null, null);
        funcionarioParcial.setHoraEntrada(Time.valueOf(JOptionPane.showInputDialog("Digite a hora de entrada: ")));
        funcionarioParcial.setHoraSaida(Time.valueOf(JOptionPane.showInputDialog("Digite a hora de saída: ")));
        return funcionarioParcial;
    }

    public void exibirFuncionarioParcial(FuncionarioParcial funcionarioParcial) {
        System.out.println("Funcionário: " + funcionarioParcial.getNome());
        System.out.println("Salário: " + funcionarioParcial.getSalario());
        System.out.println("Hora de entrada: " + funcionarioParcial.getHoraEntrada());
        System.out.println("Hora de saída: " + funcionarioParcial.getHoraSaida());
    }

    public FuncionarioTemporario contratarFuncionarioTemporario() {
        FuncionarioTemporario funcionarioTemporario = new FuncionarioTemporario(3, "José", 800, null);
        funcionarioTemporario
                .setFimContrato(
                        java.sql.Date.valueOf(JOptionPane.showInputDialog("Digite a data de fim do contrato: ")));
        return funcionarioTemporario;
    }

    public void exibirFuncionarioTemporario(FuncionarioTemporario funcionarioTemporario) {
        System.out.println("Funcionário: " + funcionarioTemporario.getNome());
        System.out.println("Salário: " + funcionarioTemporario.getSalario());
        System.out.println("Fim do contrato: " + funcionarioTemporario.getFimContrato());
    }

}
