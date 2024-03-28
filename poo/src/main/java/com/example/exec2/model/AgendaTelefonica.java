package com.example.exec2.model;

import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonica {
    private List<Contato> contatos = new ArrayList<Contato>();

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContato(Contato contato) {
        contatos.remove(contato);
    }

    public Contato buscarContato(String nome) {
        return contatos.stream().filter(contato -> contato.getNome().equals(nome)).findFirst().orElse(null);
    }

}
