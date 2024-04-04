package com.example.exec3.view;

import javax.swing.JOptionPane;
import com.example.exec3.model.ContaBancaria;
import com.example.exec3.model.ContaEspecial;
import com.example.exec3.model.ContaPoupanca;

public class view3 {

    ContaBancaria conta = new ContaBancaria();
    ContaEspecial contaEspecial = new ContaEspecial();
    ContaPoupanca contaPoupanca = new ContaPoupanca();

    public static void main(String[] args) {
        int opcao = 0;

        while (opcao != 3) {
            opcao = Integer.parseInt(JOptionPane
                    .showInputDialog("1 - Zoo\n2 - Contas\n3 - Sair"));
            view3 view = new view3();
            switch (opcao) {
                case 1:
                    viewZoo();
                    break;
                case 2:
                    viewContas();
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida", "Erro", 0);
                    break;
            }
        }

    }

    public static void viewZoo() {
        int opcao = 0;

        while (opcao != 4) {
            String[] options = { "Animal", "Mamífero", "Peixe", "Sair" };
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Zoo", 0,
                    JOptionPane.QUESTION_MESSAGE,
                    null, options, options[0]);
            switch (opcao) {
                case 0:
                    zoo.viewAnimal();
                    break;
                case 1:
                    zoo.viewMamifero();
                    break;
                case 2:
                    zoo.viewPeixe();
                    break;
                case 3:
                    opcao = 4;
                    break;
                default:
                    break;
            }
        }
    }

    public static void viewContas() {
        int opcao = 0;

        while (opcao != 4) {
            String[] options = { "Conta Bancária", "Conta Especial", "Conta Poupança", "Sair" };
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Contas", 0,
                    JOptionPane.QUESTION_MESSAGE,
                    null, options, options[0]);
            view3 view = new view3();
            switch (opcao) {
                case 0:
                    view.viewContaBancaria();
                    break;
                case 1:
                    view.viewContaEspecial();
                    break;
                case 2:
                    view.viewContaPoupanca();
                    break;
                case 3:
                    opcao = 4;
                    break;
                default:
                    break;
            }
        }
    }

    public void controllContaBancaria() {
        ContaBancaria conta = new ContaBancaria();
        conta.setCliente("João");
        conta.setNumeroConta(123);
        conta.depositar(100);
        System.out.println("Saldo: " + conta.getSaldo());
        conta.sacar(50);
        System.out.println("Saldo: " + conta.getSaldo());

    }

    public void controllContaEspecial() {

        contaEspecial.setCliente("Maria");
        contaEspecial.setNumeroConta(456);
        contaEspecial.depositar(200);
        System.out.println("Saldo: " + contaEspecial.getSaldo());
        contaEspecial.sacar(250);
        System.out.println("Saldo: " + contaEspecial.getSaldo());
    }

    public void controllContaPoupanca() {
        contaPoupanca.setCliente("José");
        contaPoupanca.setNumeroConta(789);
        contaPoupanca.setDiaRendimento(30);
        contaPoupanca.depositar(300);
        System.out.println("Saldo: " + contaPoupanca.getSaldo());
        contaPoupanca.calcularNovoSaldo(0.1f);
        System.out.println("Saldo: " + contaPoupanca.getSaldo());
    }

    public void viewContaBancaria() {
        controllContaBancaria();
        JOptionPane.showMessageDialog(null, "Cliente: " + conta.getCliente() + "\nSaldo: " + conta.getSaldo(),
                "Conta Bancária", 1);
    }

    public void viewContaEspecial() {
        controllContaEspecial();
        JOptionPane.showMessageDialog(null,
                "Cliente: " + contaEspecial.getCliente() + "\nSaldo: " + contaEspecial.getSaldo(),
                "Conta Especial", 1);
    }

    public void viewContaPoupanca() {
        controllContaPoupanca();
        JOptionPane.showMessageDialog(null,
                "Cliente: " + contaPoupanca.getCliente() + "\nSaldo: " + contaPoupanca.getSaldo(),
                "Conta Poupança", 1);
    }
}
