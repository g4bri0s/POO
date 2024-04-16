package com.example.exec6.controller;

import javax.swing.JOptionPane;

public class TarifaSP implements ITarifaUrbana {

    @Override
    public float calculaTarifaUrbana() {
        float areaTotal = Float.parseFloat(JOptionPane.showInputDialog("Digite a área total do imóvel: "));
        int numComodos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de cômodos do imóvel: "));
        return areaTotal * 10 + numComodos * 2;
    }
}
