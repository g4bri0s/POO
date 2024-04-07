package com.example.exec5.view;

import javax.swing.JOptionPane;

import com.example.exec5.controller.OperacaoController;
import com.example.exec5.model.Conta;
import com.example.exec5.model.Teste;

public class viewR1 {

    public static void main(String[] args) {
        int opcao = 0;
        String[] menu = { "1 - Operação", "2 - Conta", "3 - Teste", "4 - Sair" };
        while (opcao == 0) {
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu", 0, JOptionPane.QUESTION_MESSAGE,
                    null,
                    menu, menu[0]);
            switch (opcao) {
                case 0:
                    viewOperacao();
                    opcao = 0;
                    break;
                case 1:
                    viewConta();
                    opcao = 0;
                    break;
                case 2:
                    viewTeste();
                    opcao = 0;
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    opcao = 1;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        }

    }

    public static void viewOperacao() {
        int opcao = 0;
        while (opcao == 0) {
            try {
                int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
                OperacaoController operacaoController = new OperacaoController();
                double resultado = operacaoController.operacaoValor(num);
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
                opcao = 1;
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Número inválido!");
            }
        }
    }

    public static void viewConta() {
        Conta conta = new Conta(1234, 123456, 1000, 500);

        int opcao = 0;
        String[] menu = { "1 - Depositar", "2 - Sacar", "3 - Consultar Saldo", "4 - Consultar Limite", "5 - Sair" };
        while (opcao == 0) {
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu", 0, JOptionPane.QUESTION_MESSAGE,
                    null,
                    menu, menu[0]);
            switch (opcao) {
                case 0:
                    float valorDeposito = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do depósito:"));
                    try {
                        conta.Deposita(valorDeposito);
                    } catch (IllegalArgumentException e) {
                        JOptionPane.showMessageDialog(null, "Valor inválido!");
                    }
                    opcao = 0;
                    break;
                case 1:
                    float valorSaque = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do saque:"));
                    try {
                        conta.Saque(valorSaque);
                    } catch (IllegalArgumentException e) {
                        JOptionPane.showMessageDialog(null, "Valor inválido!");
                    }
                    opcao = 0;
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Seu saldo é: R$" + conta.getSaldo());
                    opcao = 0;
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Seu limite é: R$" + conta.getLimite());
                    opcao = 0;
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    opcao = 1;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }

        }
    }

    public static void viewTeste() {
        Teste teste = new Teste();
        teste.main(null);
    }

}
