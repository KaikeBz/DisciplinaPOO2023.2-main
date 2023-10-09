package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cod, num_h, cont_m = 0, cont_f = 0;
        double sal_b, sal_l, media_m = 0, media_f = 0;
        String sexo;

        System.out.print("Digite o código do funcionário (ou 99999 para sair): ");
        cod = sc.nextInt();

        while (cod != 99999) {
            System.out.print("Digite o sexo do funcionário (M/F): ");
            sexo = sc.next();
            System.out.print("Digite o número de horas trabalhadas: ");
            num_h = sc.nextInt();

            sal_b = num_h * 30;

            if (sexo.equals("M")) {
                sal_l = sal_b - (sal_b * 10 / 100);
                media_m += sal_l;
                cont_m++;
            } else if (sexo.equals("F")) {
                sal_l = sal_b - (sal_b * 5 / 100);
                media_f += sal_l;
                cont_f++;
            } else {
                System.out.println("Sexo inválido. Informe novamente.");
                continue;
            }

            System.out.println("Código: " + cod);
            System.out.println("Salário líquido: " + sal_l);

            System.out.print("Digite o código do próximo funcionário (ou 99999 para sair): ");
            cod = sc.nextInt();
        }

        if (cont_m > 0) {
            media_m /= cont_m;
            System.out.println("Média salarial dos funcionários masculinos: " + media_m);
        }

        if (cont_f > 0) {
            media_f /= cont_f;
            System.out.println("Média salarial das funcionárias femininas: " + media_f);
        }

        sc.close();
    }
}
