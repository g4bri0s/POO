package com.example.exec2.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int numeroNota;
    private double valor;
    private List<ItemPedido> itens = new ArrayList<ItemPedido>();

    public Pedido() {
    }

    public int getNumeroNota() {
        return numeroNota;
    }

    public double getValor() {
        return valor;
    }

    public void setNumeroNota(int numeroNota) {
        this.numeroNota = numeroNota;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public void calcularValor() {
        for (int i = 0; i < itens.size(); i++) {
            valor += itens.get(i).getQuantidade() * itens.get(i).getValor();
        }
    }

}
