package com.example.exec6.controller;

import javax.swing.JOptionPane;

public class TarifaBH implements ITarifaUrbana {

    @Override
    public float calculaTarifaUrbana() {
        float areaTotal = Float.parseFloat(JOptionPane.showInputDialog("Digite a área total do imóvel: "));
        int numQuartos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de quartos do imóvel: "));
        return areaTotal * 7 + numQuartos * 4;
    }
}