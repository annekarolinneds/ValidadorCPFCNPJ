/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.annekarolinneds.validadorcpfcnpj;

/**
 *
 * @author annekarolinneds
 */
public class Validador {

    public static int obterDigitoCpf(long numero, int posicao) {
        long aux = numero;
        int soma = 0;
        for (int i = 2; i <= 10; i++) {
            soma += (int) aux % 10 * i;
            aux /= 10;
        }
        if (posicao == 2) {
            aux = numero;
            soma = (int) (((soma * 10) % 11) % 10) * 2;
            for (int i = 3; i <= 11; i++) {
                soma += (int) aux % 10 * i;
                aux /= 10;
            }
            return (int) ((soma * 10) % 11) % 10;
        }
        return (int) ((soma * 10) % 11) % 10;
    }

    public static boolean validarCpf(long cpf) {
        return obterDigitoCpf(cpf / 100, 2) == cpf % 10 && obterDigitoCpf(cpf / 100, 1) == (cpf % 100) / 10;
    }

    public static boolean validarCpf(String cpf) {
        long lcpf = 0;
        lcpf = Character.getNumericValue(cpf.charAt(0));
        for (int i = 1; i < 14; i++) {
            if (i != 11 && i != 7 && i != 3) {
                lcpf *= 10;
                lcpf += Character.getNumericValue(cpf.charAt(i));
            }
        }
        return validarCpf(lcpf);
    }

    public static int obterDigitoCnpj(long numero, int posicao) {
        long aux = numero;
        int soma = 0;
        int[] pesos = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};

        for (int i = 1; i < pesos.length; i++) {
            soma += (int) aux % 10 * pesos[i];
            aux /= 10;
        }

        if (posicao == 2) {
            aux = numero;
            soma = (int) ((soma % 11 < 2 ? 0 : 11 - (soma % 11)) * 2);
            for (int i = 0; i < pesos.length; i++) {
                soma += (int) aux % 10 * pesos[i];
                aux /= 10;
            }
            return soma % 11 < 2 ? 0 : 11 - (soma % 11);
        }
        return soma % 11 < 2 ? 0 : 11 - (soma % 11);
    }

    public static boolean validarCnpj(long cnpj) {
        return obterDigitoCnpj(cnpj / 100, 2) == cnpj % 10 && obterDigitoCnpj(cnpj / 100, 1) == (cnpj % 100) / 10;
    }

    public static boolean validarCnpj(String cnpj) {
        long lcnpj = 0;
        lcnpj = Character.getNumericValue(cnpj.charAt(0));
        for (int i = 1; i < 18; i++) {
            if (i != 15 && i != 11 && i != 7 && i != 3) {
                lcnpj *= 10;
                lcnpj += Character.getNumericValue(cnpj.charAt(i));
            }
        }
        return validarCnpj(lcnpj);
    }
}

