package com.example.exec3.model;

public class Animal {

    private String nome;
    private int comprimento;
    private int patas;
    private String cor;
    private String ambiente;
    private float velocidade;

    public Animal(String nome, int comprimento, int patas, String cor, String ambiente, float velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.patas = patas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    public Animal() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public int getComprimento() {
        return comprimento;
    }

    public int getPatas() {
        return patas;
    }

    public String getCor() {
        return cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void dados() {
        System.out.println("\nAnimal: " + getNome());
        System.out.println("Comprimento: " + getComprimento() + " cm");
        System.out.println("Patas: " + getPatas());
        System.out.println("Cor: " + getCor());
        System.out.println("Ambiente: " + getAmbiente());
        System.out.println("Velocidade: " + getVelocidade() + " m/s");
    }

    public void alteraNome(String nome) {
        setNome(nome);
    }

    public void alteraComprimento(int comprimento) {
        setComprimento(comprimento);
    }

    public void alteraPatas(int patas) {
        setPatas(patas);
    }

    public void alteraCor(String cor) {
        setCor(cor);
    }

    public void alteraAmbiente(String ambiente) {
        setAmbiente(ambiente);
    }

    public void alteraVelocidade(float velocidade) {
        setVelocidade(velocidade);
    }

}
