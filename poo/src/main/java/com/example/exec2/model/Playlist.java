package com.example.exec2.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Playlist {

    private static List<Musica> musicas = new ArrayList<Musica>();
    private String dono;

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public void tocaMusica(boolean aleatorio) {
        if (aleatorio) {
            for (int i = 0; i < musicas.size(); i++) {
                int indice = (int) (Math.random() * musicas.size());
                System.out.println("Tocando " + musicas.get(indice).getNome());
            }
        } else {
            musicas.forEach(musica -> JOptionPane.showMessageDialog(null, ("Tocando agora: " + musica.getNome()),
                    getDono(), 0));
        }
    }
}