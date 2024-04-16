package com.example.exec6.controller;

import javax.swing.JOptionPane;

public class TarifaPOA implements ITarifaUrbana {

    @Override
    public float calculaTarifaUrbana() {
        float areaTotal = Float.parseFloat(JOptionPane.showInputDialog("Digite a área total do imóvel: "));
        float areaGaragem = Float.parseFloat(JOptionPane.showInputDialog("Digite o número de cômodos do imóvel: "));
        return areaGaragem > 0 ? areaTotal * 7.5f + areaGaragem * 2.5f : areaTotal * 8;
    }

}
