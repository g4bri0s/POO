package com.example.exec7.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.exec7.model.Prova;

public class ProvaController implements IAtividadeController<Prova> {

    private List<Prova> provas = new ArrayList<Prova>();

    @Override
    public void cadastrar(Prova t) {
        t.setMedia((float) (Math.random() * 10.01));
        provas.add(t);
    }

    @Override
    public void excluir(int index) {
        provas.remove(index);
    }

    @Override
    public void alterar(Prova t, int index) {
        provas.set(index, t);
    }

    @Override
    public void limparLista() {
        provas.clear();
    }

    @Override
    public void listar() {
        provas.forEach(prova -> {
            System.out.println(prova.toString());
        });
    }

    @Override
    public Prova buscar(Prova t, int index) {
        try {
            return provas.get(provas.indexOf(t));
        } catch (IndexOutOfBoundsException e) {
            return provas.get(index);
        } catch (Exception e) {
            System.out.println("Prova não encontrada");
            return null;
        }
    }
}
