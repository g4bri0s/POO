package com.example;

import javax.swing.JOptionPane;
import com.example.exec1.view.view;
import com.example.exec2.view.view2;
import com.example.exec3.view.view3;
import com.example.exec4.view.view4;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;

        while (opcao != 3) {
            opcao = Integer
                    .parseInt(JOptionPane.showInputDialog("1 - Exec1\n2 - Exec2\n3 - Exec3\n4 - Exec4\n5 - Sair"));

            switch (opcao) {
                case 1:
                    exec1();
                    break;
                case 2:
                    exec2();
                    break;
                case 3:
                    exec3();
                    break;
                case 4:
                    exec4();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
        }
    }

    private static void exec1() {
        view.main(null);
    }

    private static void exec2() {
        view2.main(null);
    }

    private static void exec3() {
        view3.main(null);
    }

    private static void exec4() {
        view4.main(null);
    }
}