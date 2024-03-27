package com.example.exec1.view;

import com.example.exec1.model.Pessoa;
import com.example.exec1.model.Funcionario;
import com.example.exec1.model.ContaBancaria;
import java.time.LocalDate;
import com.example.exec1.model.Produto;
import com.example.exec1.model.Circulo;

public class view {

    static Pessoa pessoa = new Pessoa("João", LocalDate.of(2000, 3, 18), "Estudante");
    static Funcionario funcionario = new Funcionario("Maria", 2000, "Gerente");
    static ContaBancaria conta = new ContaBancaria(123, "Maria");
    static Produto produto = new Produto("Arroz", 5f, 10);
    static Circulo circulo = new Circulo(5d);

    public static void main(String[] args) {
        System.out.println("Nome: " + pessoa.getNome() + "\nData de Nascimento: " + pessoa.getDataNascimento()
                + "\nProfissão: " + pessoa.getProfissao() + "\nIdade: " + pessoa.getIdade());

        System.out.println("Nome: " + funcionario.getNome() + "\nSalário: " + funcionario.getSalario() + "\nCargo: "
                + funcionario.getCargo());

        System.out.println(
                "Número da Conta: " + conta.getNumeroConta() + "\nSaldo: " + conta.getSaldo());

        conta.realizarDeposito(1000);
        System.out.println("Saldo após depósito: " + conta.getSaldo());
        System.out.println("Saque de 500: " + conta.realizarSaque(500));
        System.out.println("Saldo após saque: " + conta.getSaldo());

        System.out.println("\nÁrea: " + circulo.getArea() + "\nPerímetro: " + circulo.getPerimetro());

        System.out.println("\nProduto: " + produto.getNome() + "\nPreço: " + produto.getPreco() + "\nQuantidade: "
                + produto.getQuantidade() + "\nTotal: " + produto.totalValorEstoque());
    }

}
