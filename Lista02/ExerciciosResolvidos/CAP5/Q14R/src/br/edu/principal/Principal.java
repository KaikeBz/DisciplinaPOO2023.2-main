package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor_inicial, juros, valor_parc, total, valor_juros;
        int num_parc;

        System.out.println("Digite o valor inicial da dívida:");
        valor_inicial = scanner.nextDouble();
        juros = 0;
        num_parc = 1;
        total = valor_inicial;
        valor_parc = valor_inicial;

        System.out.println("Total: " + total);
        System.out.println("Juros: " + juros);
        System.out.println("Número de parcelas: " + num_parc);
        System.out.println("Valor da parcela: " + valor_parc);

        juros += 10;
        num_parc += 2;

        for (int i = 1; i <= 4; i++) {
            valor_juros = valor_inicial * juros / 100;
            total = valor_inicial + valor_juros;
            valor_parc = total / num_parc;

            System.out.println("Total: " + total);
            System.out.println("Valor dos juros: " + valor_juros);
            System.out.println("Número de parcelas: " + num_parc);
            System.out.println("Valor da parcela: " + valor_parc);

            juros += 5;
            num_parc += 3;
        }

        scanner.close();
    }
}

