package com.example.exec3.view;

import com.example.exec3.model.Animal;
import com.example.exec3.model.Mamifero;
import com.example.exec3.model.Peixe;

public class zoo {

    public static void viewAnimal() {
        Animal animal1 = new Animal("Minhoca", 15, 0, "Vermelha", "Terra", 0.5f);
        Animal animal2 = new Animal("Jatai", 1, 6, "Preta e amarela", "Terra", 0.5f);
        animal1.dados();
        animal2.dados();
    }

    public static void viewMamifero() {
        Mamifero mamifero1 = new Mamifero("Cachorro", 1, 4, "Marrom", "Terra", 0.5f, "Pelos", "Ração");
        Mamifero mamifero2 = new Mamifero("Gato", 1, 4, "Branco", "Terra", 0.5f, "Pelos", "Ração");
        mamifero1.dados();
        mamifero2.dados();
        mamifero1.curiosidade();
    }

    public static void viewPeixe() {
        Peixe peixe1 = new Peixe("Tubarão", 300, 0, "Cinzento", "Mar", 1.5f, "Barbatanas e cauda heterocerca");
        Peixe peixe2 = new Peixe("Peixe-palhaço", 7, 0, "Laranja e branco", "Mar", 0.5f, "Vivem em anêmonas");
        peixe1.dados();
        peixe2.dados();
        peixe1.curiosidade();
    }

    public static void main(String[] args) {
        viewAnimal();
        viewMamifero();
        viewPeixe();
    }

}
