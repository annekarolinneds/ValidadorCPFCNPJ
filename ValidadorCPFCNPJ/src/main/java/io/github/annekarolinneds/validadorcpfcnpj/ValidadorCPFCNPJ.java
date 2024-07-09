/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package io.github.annekarolinneds.validadorcpfcnpj;

/**
 *
 * @author annekarolinneds
 */
public class ValidadorCPFCNPJ {

    public static void main(String[] args) {
          System.out.println("CPF: 14230703058");
        if (ValidadorCPFCNPJ.validarCpf(14230703058L))
            System.out.println("Resposta: Válido.\n");
        else
            System.out.println("Resposta: Inválido.\n");

        System.out.println("Teste 2");
        System.out.println("CPF: 142.307.030-58");
        if (ValidadorCPFCNPJ.validarCpf("142.307.030-58"))
            System.out.println("Resposta: Válido.\n");
        else
            System.out.println("Resposta: Inválido.\n");

        System.out.println("Teste 3");
        System.out.println("CPF: 230703058");
        if (ValidadorCPFCNPJ.validarCpf(230703058L))
            System.out.println("Resposta: Válido.\n");
        else
            System.out.println("Resposta: Inválido.\n");

        System.out.println("Teste 4");
        System.out.println("CPF: 002.307.030-58");
        if (ValidadorCPFCNPJ.validarCpf("002.307.030-58"))
            System.out.println("Resposta: Válido.\n");
        else
            System.out.println("Resposta: Inválido.\n");

        System.out.println("Teste 5");
        System.out.println("CPF: 456789014");
        if (ValidadorCPFCNPJ.validarCpf(456789014L))
            System.out.println("Resposta: Válido.\n");
        else
            System.out.println("Resposta: Inválido.\n");

        // Testes de CNPJ
        System.out.println("Teste 6");
        System.out.println("CNPJ: 35.017.120/0001-86");
        if (ValidadorCPFCNPJ.validarCnpj("35.017.120/0001-86"))
            System.out.println("Resposta: Válido.\n");
        else
            System.out.println("Resposta: Inválido.\n");

        System.out.println("Teste 7");
        System.out.println("CNPJ: 35017120000186");
        if (ValidadorCPFCNPJ.validarCnpj(35017120000186L))
            System.out.println("Resposta: Válido.\n");
        else
            System.out.println("Resposta: Inválido.\n");

        System.out.println("Teste 8");
        System.out.println("CNPJ: 35.017.120/0001-88");
        if (ValidadorCPFCNPJ.validarCnpj("35.017.120/0001-88"))
            System.out.println("Resposta: Inválido.\n");
        else
            System.out.println("Resposta: Válido.\n");
    }
}
