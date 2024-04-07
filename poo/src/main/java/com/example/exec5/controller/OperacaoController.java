package com.example.exec5.controller;

public class OperacaoController {

    public double operacaoValor(int num) throws ArithmeticException {
        if (num < 0) {
            throw new ArithmeticException();
        } else {
            if (num % 2 == 0) {
                return Math.pow(num, 2);
            } else {
                return Math.pow(num, 3);
            }
        }

    }

}
