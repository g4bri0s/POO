package com.example.exec4.model;

public class AlunoSuperior extends Aluno {

    private String instituicaoSegundoGrau;
    private String anoConclusaoSegundoGrau;

    public AlunoSuperior() {
    }

    public AlunoSuperior(String ra, String nome, String email, float mediaNotas, int qtdAprovacoes,
            String instituicaoSegundoGrau, String anoConclusaoSegundoGrau) {
        super(ra, nome, email, mediaNotas, qtdAprovacoes);
        this.instituicaoSegundoGrau = instituicaoSegundoGrau;
        this.anoConclusaoSegundoGrau = anoConclusaoSegundoGrau;
    }

    public void setInstituicaoSegundoGrau(String instituicaoSegundoGrau) {
        this.instituicaoSegundoGrau = instituicaoSegundoGrau;
    }

    public String getInstituicaoSegundoGrau() {
        return instituicaoSegundoGrau;
    }

    public void setAnoConclusaoSegundoGrau(String anoConclusaoSegundoGrau) {
        this.anoConclusaoSegundoGrau = anoConclusaoSegundoGrau;
    }

    public String getAnoConclusaoSegundoGrau() {
        return anoConclusaoSegundoGrau;
    }

}
