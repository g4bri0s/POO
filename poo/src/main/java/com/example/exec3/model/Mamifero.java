package com.example.exec3.model;

public class Mamifero extends Peixe {

    private String alimento;

    public Mamifero(String nome, int comprimento, int patas, String cor, String ambiente, float velocidade,
            String caracteristicas, String alimento) {
        super(nome, comprimento, patas, cor, ambiente, velocidade, caracteristicas);
        this.alimento = alimento;
    }

    public Mamifero() {

    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void alteraAlimento(String alimento) {
        this.alimento = alimento;
    }

    public void dados() {
        super.dados();
        System.out.println("Alimento: " + alimento);
    }

    public void curiosidade() {
        System.out.println(
                "\nCuriosidade: Taxonomicamente, todos tetrapodas (sinapsideos, anapsideos e diapsideos) descendem de sarcopterigios, que são peixes de nadadeiras lobadas. Assim, peixe é um grupo polifilético que não inclui todos os descendentes de seu ancestral comum mais recente e, para que seja monofiletico (uma classe taxonomicamente valida), é preciso incluir também os Tetrapoda");
    }
}
