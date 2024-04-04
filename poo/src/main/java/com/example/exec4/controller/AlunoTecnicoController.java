package com.example.exec4.controller;

import com.example.exec4.model.Aluno;

public class AlunoTecnicoController implements AlunoController {

    @Override
    public float percentualRendimento(Aluno aluno) {
        return aluno.getMediaNotas() * aluno.getQtdAprovacoes() * 0.931f;
    }

    @Override
    public float percentualProgressao(Aluno aluno) {
        return aluno.getQtdAprovacoes() / 3;
    }
}
