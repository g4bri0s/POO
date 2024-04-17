package com.example.exec7.view;

import javax.swing.JOptionPane;

import com.example.exec7.controller.AtividadeController;
import com.example.exec7.controller.ProvaController;
import com.example.exec7.model.Atividade;
import com.example.exec7.model.Prova;

public class View {

    public static void main(String[] args) {
        int opcao = 0;

        View view = new View();
        String[] opcoes = { "Prova", "Atividade", "Sair" };
        while (opcao == 0) {
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

            switch (opcao) {
                case 0:
                    view.viewProva();
                    break;
                case 1:
                    view.viewAtividade();
                    break;
                case 2:
                    System.exit(0);
                    break;
            }
        }
    }

    public void viewProva() {

        ProvaController controller = new ProvaController();

        int opcao = 0;
        String[] opcoes = { "Cadastrar", "Excluir", "Alterar", "Listar", "Buscar", "Limpar Lista", "Sair" };
        while (opcao == 0) {
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Prova", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

            switch (opcao) {
                case 0:
                    Prova prova = new Prova();
                    prova.setQtdQuestoes(
                            Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de questões")));
                    controller.cadastrar(prova);
                    opcao = 0;
                    break;
                case 1:
                    int provaExcluir = Integer
                            .parseInt(JOptionPane.showInputDialog("Digite o índice da prova a excluir"));
                    controller.excluir(provaExcluir);
                    opcao = 0;
                    break;
                case 2:
                    Prova provaAlterar = new Prova();
                    int index = Integer.parseInt(JOptionPane.showInputDialog("Digite o índice da prova a alterar"));
                    provaAlterar.setQtdQuestoes(
                            Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de questões")));
                    controller.alterar(provaAlterar, index);
                    opcao = 0;
                    break;
                case 3:
                    controller.listar();
                    break;
                case 4:
                    Prova provaBuscar = new Prova();
                    int indexBuscar = Integer
                            .parseInt(JOptionPane.showInputDialog("Digite o índice da prova a buscar"));
                    provaBuscar.setQtdQuestoes(
                            Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de questões")));
                    controller.buscar(provaBuscar, indexBuscar);
                    opcao = 0;
                    break;
                case 5:
                    controller.limparLista();
                    opcao = 0;
                    break;
                case 6:
                    System.exit(0);
                    opcao = 1;
                    break;
            }

        }
    }

    public void viewAtividade() {
        AtividadeController controller = new AtividadeController();

        int opcao = 0;
        String[] opcoes = { "Cadastrar", "Excluir", "Alterar", "Listar", "Buscar", "Limpar Lista", "Sair" };
        while (opcao == 0) {
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Atividade", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

            switch (opcao) {
                case 0:
                    Atividade atividade = new Atividade();
                    atividade.setAssunto(JOptionPane.showInputDialog("Digite o assunto"));
                    atividade
                            .setNumPaginas(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de páginas")));
                    controller.cadastrar(atividade);
                    opcao = 0;
                    break;
                case 1:
                    int atividadeExcluir = Integer
                            .parseInt(JOptionPane.showInputDialog("Digite o índice da atividade a excluir"));
                    controller.excluir(atividadeExcluir);
                    opcao = 0;
                    break;
                case 2:
                    Atividade atividadeAlterar = new Atividade();
                    int index = Integer.parseInt(JOptionPane.showInputDialog("Digite o índice da atividade a alterar"));
                    atividadeAlterar.setAssunto(JOptionPane.showInputDialog("Digite o assunto"));
                    controller.alterar(atividadeAlterar, index);
                    opcao = 0;
                    break;
                case 3:
                    controller.listar();
                    break;
                case 4:
                    Atividade atividadeBuscar = new Atividade();
                    int indexBuscar = Integer
                            .parseInt(JOptionPane.showInputDialog("Digite o índice da atividade a buscar"));
                    atividadeBuscar.setAssunto(JOptionPane.showInputDialog("Digite o assunto"));
                    controller.buscar(atividadeBuscar, indexBuscar);
                    opcao = 0;
                    break;
                case 5:
                    controller.limparLista();
                    opcao = 0;
                    break;
                case 6:
                    System.exit(0);
                    opcao = 1;
                    break;
            }
        }
    }
}
