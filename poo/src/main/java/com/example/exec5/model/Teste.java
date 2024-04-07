package com.example.exec5.model;

public class Teste {

    public static void main(String[] args) {
        System.out.println("Inicio do main");
        try {
            metodo1();
        } catch (ArithmeticException arithmeticException) {
            System.err.println("Divisão por zero");
        } catch (ArrayIndexOutOfBoundsException indexException) {
            System.err.println("Vetor estourou o limite");
        }
        System.out.println("Fim do main");
    }

    public static void metodo1() throws ArithmeticException, ArrayIndexOutOfBoundsException {
        System.out.println("Inicio do método 1");
        metodo2();
        System.out.println("Fim do método 1");
    }

    public static void metodo2() throws ArithmeticException, ArrayIndexOutOfBoundsException {
        System.out.println("Inicio do método 2");
        int[] vetor = new int[10];
        for (int i = 0; i <= 15; i++) {
            if (i == 10) {
                System.out.println("Aqui estouraria o vetor, mas o catch do main pega!");
            }
            vetor[i] = i;
            System.out.println(i);
            if (i == 9) {
                int vlr = vetor[i] / vetor[0];
                System.out.println("Aqui estouraria a divisão por zero, mas o catch do main pega!");
                System.out.println(vlr);
            }
        }
        System.out.println("Fim do método 2");
    }
}
