package com.example.exec3.model;

public class Peixe extends Animal {

    private String caracteristicas;

    public Peixe(String nome, int comprimento, int patas, String cor, String ambiente, float velocidade,
            String caracteristicas) {
        super(nome, comprimento, patas, cor, ambiente, velocidade);
        this.caracteristicas = caracteristicas;
    }

    public Peixe() {
        super();
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void alteraCaracteristicas(String caracteristicas) {
        setCaracteristicas(caracteristicas);
    }

    public void dados() {
        super.dados();
        System.out.println("Caracteristicas: " + caracteristicas);
    }

    public void curiosidade() {
        System.out.println(
                "\nCuriosidade: Peixe normalmente é referido como animais aquaticos com guelras. Assim, inclui animais do clado Sarcopterygii e Actinopterygii, mas não todos os animais desses clados, uma vez que animais como seres humanos, passaros e sapos são descendentes de Sarcopterygii.");
    }

}
