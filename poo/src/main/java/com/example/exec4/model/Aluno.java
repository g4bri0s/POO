package com.example.exec4.model;

public abstract class Aluno {

    private String ra;
    private String nome;
    private String email;
    private float mediaNotas;
    private int qtdAprovacoes;

    public Aluno() {
    }

    public Aluno(String ra, String nome, String email, float mediaNotas, int qtdAprovacoes) {
        this.ra = ra;
        this.nome = nome;
        this.email = email;
        this.mediaNotas = mediaNotas;
        this.qtdAprovacoes = qtdAprovacoes;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setMediaNotas(float mediaNotas) {
        this.mediaNotas = mediaNotas;
    }

    public float getMediaNotas() {
        return mediaNotas;
    }

    public void setQtdAprovacoes(int qtdAprovacoes) {
        this.qtdAprovacoes = qtdAprovacoes;
    }

    public int getQtdAprovacoes() {
        return qtdAprovacoes;
    }

}
