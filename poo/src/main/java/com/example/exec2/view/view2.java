package com.example.exec2.view;

import javax.swing.JOptionPane;

import com.example.exec2.model.AgendaTelefonica;
import com.example.exec2.model.Contato;
import com.example.exec2.model.ItemPedido;
import com.example.exec2.model.Musica;
import com.example.exec2.model.Pedido;
import com.example.exec2.model.Playlist;
import com.example.exec2.model.Produto;

public class view2 {

    private static Pedido pedido;
    private static ItemPedido itemPedido;
    private static Produto produto;
    private static Musica musica;
    private static Playlist playlist;
    private static AgendaTelefonica agenda;
    private static Contato contato;

    public static void main(String[] args) {
        int opcao = 0;

        while (opcao != 4) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Lançar novo pedido\n2 - Tocar música\n3 - Ver contatos\n4 - Sair"));

            switch (opcao) {
                case 1:
                    lancarPedido();
                    break;
                case 2:
                    viewMusica();
                    break;
                case 3:
                    viewAgenda();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

    private static void viewAgenda() {
        int opcaoAgenda = 0;

        while (opcaoAgenda != 3) {
            opcaoAgenda = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Adicionar contato\n2 - Buscar contato\n3 - Sair\nEscolha uma opção:"));

            switch (opcaoAgenda) {
                case 1:
                    cadastraContato();
                    break;
                case 2:
                    buscarContato();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
        }

    }

    public static void viewMusica() {
        int opcaoMusica = 0;

        while (opcaoMusica != 3) {
            opcaoMusica = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Adicionar música\n2 - Tocar música\n3 - Sair\nEscolha uma opção:"));

            switch (opcaoMusica) {
                case 1:
                    adicionarMusica();
                    break;
                case 2:
                    tocarMusica();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
        }
    }

    public static void viewPedido() {
        int opcaoPedido = 0;

        while (opcaoPedido != 3) {
            opcaoPedido = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Adicionar item\n2 - Ver pedido\n3 - Sair\nEscolha uma opção:"));

            switch (opcaoPedido) {
                case 1:
                    adicionarItem();
                    break;
                case 2:
                    lancarPedido();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
        }
    }

    public static void cadastraContato() {
        contato = new Contato();
        contato.setNome(JOptionPane.showInputDialog("Insira o nome do contato: "));
        contato.setTelefone(JOptionPane.showInputDialog("Insira o telefone do contato: "));
        contato.setEmail(JOptionPane.showInputDialog("Insira o email do contato: "));
    }

    public static void buscarContato() {
        agenda.buscarContato(JOptionPane.showInputDialog("Insira o nome do contato: "));
    }

    public static void cadastraMusica() {
        musica = new Musica();
        musica.setNome(JOptionPane.showInputDialog("Insira o nome da música: "));
        musica.setAutor(JOptionPane.showInputDialog("Insira o autor da música: "));
        musica.setGravadora(JOptionPane.showInputDialog("Insira a gravadora da música: "));
    }

    public static void adicionarMusica() {
        cadastraMusica();
        playlist.adicionarMusica(musica);
    }

    public static void tocarMusica() {
        playlist.tocaMusica(Boolean.parseBoolean(JOptionPane.showInputDialog("Tocar aleatório? (true/false)")));
    }

    public static void lancarPedido() {
        pedido.setNumeroNota(Integer.parseInt(JOptionPane.showInputDialog("Insira o numero da nota: ")));
        pedido.calcularValor();
        JOptionPane.showMessageDialog(null,
                "Valor total do pedido nº" + pedido.getNumeroNota() + ": " + pedido.getValor());
    }

    public static void cadastraProduto() {
        produto = new Produto();
        produto.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Insira o codigo do produto: ")));
        produto.setDescricao(JOptionPane.showInputDialog("Insira a descrição do produto: "));
        produto.setValor(Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do produto: ")));
    }

    public static void adicionarItem() {
        itemPedido = new ItemPedido();
        cadastraProduto();
        itemPedido.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade do produto: ")));
        pedido.adicionarItem(itemPedido);
    }
}
