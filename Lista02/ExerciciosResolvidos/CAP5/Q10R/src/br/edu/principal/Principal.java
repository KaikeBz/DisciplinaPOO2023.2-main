package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont_time, cont_jog, idade;
        double peso, alt, qtde = 0, media_idade = 0, media_altura = 0, porc = 0, tot80 = 0;

        for (cont_time = 1; cont_time <= 5; cont_time++) {
            media_idade = 0;

            for (cont_jog = 1; cont_jog <= 11; cont_jog++) {
                System.out.print("Informe a idade do jogador: ");
                idade = scanner.nextInt();
                System.out.print("Informe o peso do jogador: ");
                peso = scanner.nextDouble();
                System.out.print("Informe a altura do jogador: ");
                alt = scanner.nextDouble();

                if (idade < 18) {
                    qtde++;
                }

                media_idade += idade;
                media_altura += alt;

                if (peso > 80) {
                    tot80++;
                }
            }

            media_idade /= 11;
            System.out.println("Média de idade do time " + cont_time + ": " + media_idade);
        }

        media_altura /= 55;
        System.out.println("Média de altura de todos os jogadores: " + media_altura);

        porc = (tot80 / 55) * 100;
        System.out.println("Porcentagem de jogadores com peso superior a 80 kg: " + porc + "%");

        scanner.close();
    }
}
