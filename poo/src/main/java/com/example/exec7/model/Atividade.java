package com.example.exec7.model;

public class Atividade {
    private char[] assunto;
    private int numPaginas;

    public Atividade(String assunto, int numPaginas) {
        this.assunto = assunto.toCharArray();
        this.numPaginas = numPaginas;
    }

    public Atividade(char[] assunto, int numPaginas) {
        this.assunto = assunto;
        this.numPaginas = numPaginas;
    }

    public Atividade() {
    }

    public char[] getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto.toCharArray();
    }

    public void setAssunto(char[] assunto) {
        this.assunto = assunto;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Atividade [assunto=" + charArrayToString(assunto) + ", numPaginas=" + numPaginas + "]";
    }

    private String charArrayToString(char[] array) {
        String string = "";
        for (char c : array) {
            string += c;
        }
        return string;
    }
}
