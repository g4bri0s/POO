package com.example.exec7.model;

public class Prova {
    private int qtdQuestoes;
    private float media;

    public Prova(int qtdQuestoes, float media) {
        this.qtdQuestoes = qtdQuestoes;
        this.media = media;
    }

    public Prova() {
    }

    public int getQtdQuestoes() {
        return qtdQuestoes;
    }

    public void setQtdQuestoes(int qtdQuestoes) {
        this.qtdQuestoes = qtdQuestoes;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return String.format("Prova [Questões = %d; Média = %.2f]", qtdQuestoes, media);
    }
}
