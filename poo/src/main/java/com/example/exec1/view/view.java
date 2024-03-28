package com.example.exec1.view;

import com.example.exec1.model.Pessoa;
import com.example.exec1.model.Funcionario;
import com.example.exec1.model.ContaBancaria;
import java.time.LocalDate;

import javax.swing.JOptionPane;

import com.example.exec1.model.Produto;
import com.example.exec1.model.Circulo;

public class view {

        static Pessoa pessoa = new Pessoa("João", LocalDate.of(2000, 3, 18), "Estudante");
        static Funcionario funcionario = new Funcionario("Maria", 2000, "Gerente");
        static ContaBancaria conta = new ContaBancaria(123, "Maria");
        static Produto produto = new Produto("Arroz", 5f, 10);
        static Circulo circulo = new Circulo(5d);

        public static void main(String[] args) {
                int opcao = 1;
                while (opcao != 6) {
                        opcao = Integer.parseInt(JOptionPane.showInputDialog(
                                        "Escolha uma opção:\n1 - Pessoa\n2 - Funcionário\n3 - Conta Bancária\n4 - Produto\n5 - Círculo\n6 - Sair"));

                        switch (opcao) {
                                case 1:
                                        viewPessoa();
                                        break;
                                case 2:
                                        viewFuncionario();
                                        break;
                                case 3:
                                        viewContaBancaria();
                                        break;
                                case 4:
                                        viewProduto();
                                        break;
                                case 5:
                                        viewCirculo();
                                        break;
                                case 6:
                                        JOptionPane.showMessageDialog(null, "Saindo...");
                                        break;
                                default:
                                        JOptionPane.showMessageDialog(null, "Opção inválida");
                                        break;
                        }
                }
        }

        public static void viewCirculo() {
                double raio = Double.parseDouble(JOptionPane.showInputDialog("Insira o raio do círculo: "));

                Circulo circulo = new Circulo(raio);

                JOptionPane.showMessageDialog(null,
                                "Raio do circulo: " + circulo.getRaio() + "\nÁrea: " + circulo.getArea()
                                                + "\nPerímetro: " + circulo.getPerimetro());
        }

        public static void viewProduto() {
                String nome = JOptionPane.showInputDialog("Insira o nome do produto: ");
                float preco = Float.parseFloat(JOptionPane.showInputDialog("Insira o preço do produto: "));
                int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade do produto: "));

                Produto produto = new Produto(nome, preco, quantidade);

                JOptionPane.showMessageDialog(null,
                                "Produto: " + produto.getNome() + "\nPreço: " + produto.getPreco() + "\nQuantidade: "
                                                + produto.getQuantidade() + "\nTotal: " + produto.totalValorEstoque());
        }

        public static void viewContaBancaria() {
                int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Insira o número da conta: "));
                String nome = JOptionPane.showInputDialog("Insira o nome do titular da conta: ");

                ContaBancaria conta = new ContaBancaria(numeroConta, nome);

                JOptionPane.showMessageDialog(null,
                                "Número da Conta: " + conta.getNumeroConta() + "\nSaldo: " + conta.getSaldo());
        }

        public static void viewFuncionario() {
                String nome = JOptionPane.showInputDialog("Insira o nome do funcionário: ");
                float salario = Float.parseFloat(JOptionPane.showInputDialog("Insira o salário do funcionário: "));
                String cargo = JOptionPane.showInputDialog("Insira o cargo do funcionário: ");

                Funcionario funcionario = new Funcionario(nome, salario, cargo);

                JOptionPane.showMessageDialog(null,
                                "Nome: " + funcionario.getNome() + "\nSalário: " + funcionario.getSalario()
                                                + "\nCargo: " + funcionario.getCargo());
        }

        public static void viewPessoa() {
                String nome = JOptionPane.showInputDialog("Insira o nome da pessoa: ");
                LocalDate dataNascimento = LocalDate
                                .parse(JOptionPane.showInputDialog("Insira a data de nascimento: "));
                String profissao = JOptionPane.showInputDialog("Insira a profissão da pessoa: ");

                Pessoa pessoa = new Pessoa(nome, dataNascimento, profissao);

                JOptionPane.showMessageDialog(null,
                                "Nome: " + pessoa.getNome() + "\nData de Nascimento: " + pessoa.getDataNascimento()
                                                + "\nProfissão: " + pessoa.getProfissao() + "\nIdade: "
                                                + pessoa.getIdade());
        }
}
