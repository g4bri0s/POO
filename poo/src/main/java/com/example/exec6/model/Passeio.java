package com.example.exec6.model;

public final class Passeio extends Veiculo {

    private int qtdPassageiros;

    public Passeio() {
    }

    public Passeio(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, Motor motor,
            int qtdPassageiros) {
        super(placa, marca, modelo, cor, velocMax, qtdRodas, motor);
        this.qtdPassageiros = qtdPassageiros;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    public float calcVel(float velocMax) {
        return velocMax * 1000;
    }

}
