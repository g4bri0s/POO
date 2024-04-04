package com.example.exec4.view;

import javax.swing.JOptionPane;

import com.example.exec4.controller.AlunoSuperiorControlle;
import com.example.exec4.controller.AlunoTecnicoController;
import com.example.exec4.model.Aluno;
import com.example.exec4.model.AlunoSuperior;
import com.example.exec4.model.AlunoTecnico;
import com.example.exec4.model.Paralelograma;
import com.example.exec4.model.Trapezio;

public class view4 {

    public static void main(String[] args) {
        int opcao = 0;

        while (opcao == 0) {
            String[] options = { "Quadrilátero", "Alunos", "Sair" };
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu", 0, JOptionPane.QUESTION_MESSAGE,
                    null,
                    options, options[0]);

            view4 view = new view4();

            switch (opcao) {
                case 0:
                    view.viewQuadrilatero();
                    break;
                case 1:
                    view.viewAluno();
                    break;
                case 2:
                    opcao = 1;
                    break;
                default:
                    break;
            }
        }
    }

    public void viewQuadrilatero() {
        int option = 0;

        while (option == 0) {
            String[] options = { "Paralelograma", "Trapézio", "Sair" };
            option = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Quadrilátero", 0,
                    JOptionPane.QUESTION_MESSAGE,
                    null, options, options[0]);

            switch (option) {
                case 0:
                    viewParalelograma();
                    break;
                case 1:
                    viewTrapezio();
                    break;
                case 2:
                    option = 1;
                    break;
                default:
                    break;
            }
        }

    }

    public void viewParalelograma() {
        Paralelograma p = new Paralelograma();
        p.setBase(Float.parseFloat(JOptionPane.showInputDialog("Digite a base: ")));
        p.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Digite a altura: ")));
        System.out.println("Perímetro: " + p.calcPerimetro());
        System.out.println("Área: " + p.calcArea());
        System.err.println("Perímetro: " + p.calcPerimetro());
        System.err.println("Área: " + p.calcArea());
    }

    public void viewTrapezio() {
        Trapezio t = new Trapezio();
        t.setBase(Float.parseFloat(JOptionPane.showInputDialog("Digite a base: ")));
        t.setBaseMenor(Float.parseFloat(JOptionPane.showInputDialog("Digite a base menor: ")));
        t.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Digite a altura: ")));
        System.out.println("Perímetro: " + t.calcPerimetro());
        System.out.println("Área: " + t.calcArea());
        System.err.println("Perímetro: " + t.calcPerimetro());
        System.err.println("Área: " + t.calcArea());
    }

    public void viewAluno() {
        AlunoTecnico alunoTecnico = new AlunoTecnico("123", "João", "", 5.2f, 2);
        AlunoSuperior alunoSuperior = new AlunoSuperior("123", "João", "", 5.2f, 2, "IFSP", "2019");
        AlunoSuperiorControlle alunoSuperiorControlle = new AlunoSuperiorControlle();
        AlunoTecnicoController alunoTecnicoController = new AlunoTecnicoController();

        int option = 0;
        while (option == 0) {
            String[] options = { "Aluno do tecnico", "Aluno do superior",
                    "percentual de rendimento e progresso (tecnico)", "percentual de rendimento e progresso (Superior)",
                    "Sair" };
            option = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Aluno", 0, JOptionPane.QUESTION_MESSAGE,
                    null, options, options[0]);

            switch (option) {
                case 0:
                    System.out.println(alunoSuperior.toString());
                    break;
                case 1:
                    System.out.println(alunoTecnico.toString());
                    break;
                case 2:
                    System.out.println(
                            "Percentual de rendimento: " + alunoTecnicoController.percentualRendimento(alunoTecnico));
                    System.out.println(
                            "Percentual de progresso: " + alunoTecnicoController.percentualProgressao(alunoTecnico));
                    break;
                case 3:
                    System.out
                            .println("Percentual de rendimento: "
                                    + alunoSuperiorControlle.percentualRendimento(alunoSuperior));
                    System.out.println(
                            "Percentual de progresso: " + alunoSuperiorControlle.percentualProgressao(alunoSuperior));
                    break;
                case 4:
                    option = 1;
                    break;
                default:
                    break;
            }
        }

    }

}
