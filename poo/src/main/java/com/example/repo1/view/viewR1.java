package com.example.repo1.view;

import javax.swing.JOptionPane;

import com.example.repo1.model.Ingresso;
import com.example.repo1.model.ProfessorHorista;
import com.example.repo1.model.ProfessorTitular;
import com.example.repo1.model.Vip;

public class viewR1 {

    public static void main(String[] args) {
        int opcao = 0;

        while (opcao == 0) {
            String[] options = { "Ingresso", "Professor", "Sair" };
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu", 0, JOptionPane.QUESTION_MESSAGE,
                    null,
                    options, options[0]);

            viewR1 view = new viewR1();

            switch (opcao) {
                case 0:
                    view.viewIngresso();
                    opcao = 0;
                    break;
                case 1:
                    view.viewProfessor();
                    opcao = 0;
                    break;
                case 2:
                    opcao = 1;
                    break;
                default:
                    break;
            }
        }
    }

    public void viewIngresso() {
        Ingresso ingresso = new Ingresso("123", 100);
        Vip vip = new Vip("456", 200, "VIP");

        int opcao = 0;
        while (opcao == 0) {
            String[] options = { "Ingresso", "VIP", "Sair" };
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu", 0, JOptionPane.QUESTION_MESSAGE,
                    null,
                    options, options[0]);

            switch (opcao) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Valor final do ingresso: " + ingresso.valorFinal(10));
                    opcao = 0;
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Valor final do ingresso VIP: " + vip.valorFinal(10));
                    opcao = 0;
                    break;
                case 2:
                    opcao = 1;
                    break;
                default:
                    break;
            }
        }
    }

    public void viewProfessor() {
        ProfessorHorista professorHorista = new ProfessorHorista("João", "123", 30, 40, 50);
        ProfessorTitular professorTitular = new ProfessorTitular("Maria", "456", 40, 10, 8000);

        int opcao = 0;
        while (opcao == 0) {
            String[] options = { "Professor Horista", "Professor Titular", "Sair" };
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu", 0, JOptionPane.QUESTION_MESSAGE,
                    null,
                    options, options[0]);

            switch (opcao) {
                case 0:
                    JOptionPane.showMessageDialog(null,
                            "Salário do professor horista: " + professorHorista.calcSalario());
                    opcao = 0;
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null,
                            "Salário do professor titular: " + professorTitular.calcSalario());
                    opcao = 0;
                    break;
                case 2:
                    opcao = 1;
                    break;
                default:
                    break;
            }

        }

    }

}
