package com.example.exec1.model;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private String profissao;

    public Pessoa(String nome, LocalDate dataNascimento, String profissao) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.profissao = profissao;
    }

    public Pessoa() {
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getIdade() {
        return LocalDate.now().getYear() - dataNascimento.getYear();
    }
}
