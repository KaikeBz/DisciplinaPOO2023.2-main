package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário base: ");
        double sal_base = sc.nextDouble();

        System.out.print("Digite o tempo de serviço (em anos): ");
        int tempo = sc.nextInt();

        double imposto, grat, sal_liq;

        if (sal_base < 200) {
            imposto = 0;
        } else if (sal_base <= 450) {
            imposto = 0.03 * sal_base;
        } else if (sal_base < 700) {
            imposto = 0.08 * sal_base;
        } else {
            imposto = 0.12 * sal_base;
        }

        System.out.println("Imposto: " + imposto);

        if (sal_base > 500) {
            if (tempo <= 3) {
                grat = 20;
            } else {
                grat = (tempo <= 3) ? 23 : (tempo < 6) ? 35 : 33;
            }
            System.out.println("Gratificação: " + grat);
        } else {
            grat = 0;
        }

        sal_liq = sal_base - imposto + grat;
        System.out.println("Salário líquido: " + sal_liq);

        if (sal_liq <= 350) {
            System.out.println("Classificação A");
        } else if (sal_liq < 600) {
            System.out.println("Classificação B");
        } else {
            System.out.println("Classificação C");
        }

        sc.close();
	}

}
