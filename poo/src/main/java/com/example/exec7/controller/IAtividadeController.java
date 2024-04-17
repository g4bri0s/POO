package com.example.exec7.controller;

public interface IAtividadeController<T> {
    public void cadastrar(T t);

    public void excluir(int index);

    public void alterar(T t, int index);

    public void limparLista();

    public void listar();

    public T buscar(T t, int index);
}
