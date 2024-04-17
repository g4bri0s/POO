package com.example.exec7.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.exec7.model.Atividade;

public class AtividadeController implements IAtividadeController<Atividade> {

    private List<Atividade> atividades = new ArrayList<Atividade>();

    @Override
    public void cadastrar(Atividade t) {
        atividades.add(t);
    }

    @Override
    public void excluir(int index) {
        atividades.remove(index);
    }

    @Override
    public void alterar(Atividade t, int index) {
        atividades.set(index, t);
    }

    @Override
    public void limparLista() {
        atividades.clear();
    }

    @Override
    public void listar() {
        atividades.forEach(atividade -> {
            System.out.println(atividade.toString());
        });
    }

    @Override
    public Atividade buscar(Atividade t, int index) {
        try {
            return atividades.get(atividades.indexOf(t));
        } catch (IndexOutOfBoundsException e) {
            return atividades.get(index);
        } catch (Exception e) {
            System.out.println("Atividade não encontrada");
            return null;
        }
    }

}
