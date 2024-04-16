package com.example.exec6.model;

public final class Carga extends Veiculo {
    private float cargaMax;
    private int tara;

    public Carga() {
    }

    public Carga(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, Motor motor,
            float cargaMax, int tara) {
        super(placa, marca, modelo, cor, velocMax, qtdRodas, motor);
        this.cargaMax = cargaMax;
        this.tara = tara;
    }

    public float getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(float cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    public float calcVel(float velocMax) {
        return velocMax * 100000;
    }

}
