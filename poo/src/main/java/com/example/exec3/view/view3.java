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

    }

    public static void viewZoo() {

    }

    public static void viewContas() {
        int opcao = 0;

        while (opcao != 4) {
            opcao = Integer.parseInt(JOptionPane
                    .showInputDialog("1 - Conta Bancária\n2 - Conta Especial\n3 - Conta Poupança\n4 - Sair"));
            view3 view = new view3();
            switch (opcao) {
                case 1:
                    view.viewContaBancaria();
                    break;
                case 2:
                    view.viewContaEspecial();
                    break;
                case 3:
                    view.viewContaPoupanca();
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida", "Erro", 0);
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
