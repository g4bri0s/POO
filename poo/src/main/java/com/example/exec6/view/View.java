package com.example.exec6.view;

import javax.swing.JOptionPane;

import com.example.exec6.controller.FuncionarioController;
import com.example.exec6.controller.TarifaBH;
import com.example.exec6.controller.TarifaCWB;
import com.example.exec6.controller.TarifaPOA;
import com.example.exec6.controller.TarifaSP;
import com.example.exec6.model.Carga;
import com.example.exec6.model.Motor;
import com.example.exec6.model.Passeio;

public class View {

    public static void main(String[] args) {
        int ipcao = 0;
        String opcoes[] = { "Veiculo", "Funcionario", "Imposto", "Sair" };
        while (ipcao == 0) {
            ipcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
            switch (ipcao) {
                case 0:
                    new View().viewVeiculos();
                    ipcao = 0;
                    break;
                case 1:
                    new View().viewFuncionario();
                    ipcao = 0;
                    break;
                case 2:
                    new View().viewImposto();
                    ipcao = 0;
                    break;
                case 3:
                    System.exit(0);
                    ipcao = 1;
                    break;
                default:
                    break;
            }
        }
    }

    public void viewPasseio() {
        Motor motor = new Motor(6, 200);
        Passeio passeio = new Passeio("ABC-1234", "Fiat", "Uno", "Vermelho", 160, 4, motor, 5);
        System.out.println(passeio.toString());
    }

    public void viewCarga() {
        Motor motor = new Motor(8, 300);
        Carga carga = new Carga("DEF-5678", "Volvo", "FH", "Branco", 180, 10, motor, 2000, 700);
        System.out.println(carga.toString());
    }

    public void viewVeiculos() {
        int opcao = 0;
        while (opcao == 0) {
            String[] opcoes = { "Veiculo Passeio", "Veiculo Carga", "Sair" };
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
            switch (opcao) {
                case 0:
                    viewPasseio();
                    opcao = 0;
                    break;
                case 1:
                    viewCarga();
                    opcao = 0;
                    break;
                case 2:
                    System.exit(0);
                    opcao = 1;
                    break;
                default:
                    break;
            }
        }
    }

    public void viewFuncionario() {

        FuncionarioController funcionarioController = new FuncionarioController();

        int opcao = 0;
        String[] opcoes = { "Funcionário Integral", "Funcionário Parcial", "Funcionário Temporário", "Sair" };
        while (opcao == 0) {
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
            switch (opcao) {
                case 0:
                    funcionarioController
                            .exibirFuncionarioIntegral(funcionarioController.contratarFuncionarioIntegral());
                    opcao = 0;
                    break;
                case 1:
                    funcionarioController.exibirFuncionarioParcial(funcionarioController.contratarFuncionarioParcial());
                    opcao = 0;
                    break;
                case 2:
                    funcionarioController
                            .exibirFuncionarioTemporario(funcionarioController.contratarFuncionarioTemporario());
                    opcao = 0;
                    break;
                case 3:
                    System.exit(0);
                    opcao = 1;
                    break;
                default:
                    break;
            }
        }
    }

    public void viewImposto() {
        int opcao = 0;
        while (opcao == 0) {
            String[] opcoes = { "Tarifa POA", "Tarifa CWB", "Tarifa SP", "Tarifa BH", "Sair" };
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
            switch (opcao) {
                case 0:
                    TarifaPOA tarifaPOA = new TarifaPOA();
                    tarifaPOA.calculaTarifaUrbana();
                    opcao = 0;
                    break;
                case 1:
                    TarifaCWB tarifaCWB = new TarifaCWB();
                    tarifaCWB.calculaTarifaUrbana();
                    opcao = 0;
                    break;
                case 2:
                    TarifaSP tarifaSP = new TarifaSP();
                    tarifaSP.calculaTarifaUrbana();
                    opcao = 0;
                    break;
                case 3:
                    TarifaBH tarifaBH = new TarifaBH();
                    tarifaBH.calculaTarifaUrbana();
                    opcao = 0;
                    break;
                case 4:
                    System.exit(0);
                    opcao = 1;
                    break;
                default:
                    break;
            }
        }
    }
}