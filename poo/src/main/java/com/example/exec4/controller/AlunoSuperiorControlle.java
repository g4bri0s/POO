package com.example.exec4.controller;

import com.example.exec4.model.Aluno;

public class AlunoSuperiorControlle implements AlunoController {

    @Override
    public float percentualRendimento(Aluno aluno) {
        return aluno.getMediaNotas() * aluno.getQtdAprovacoes() * 0.972f;
    }

    @Override
    public float percentualProgressao(Aluno aluno) {
        return aluno.getQtdAprovacoes() / 6;
    }

}
