package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont, codigo, nht;
        double valor;
        double sal_min, sal_inicial, aux, sal_final;
        String turno, categoria;

        sal_min = 450;

        for (cont = 1; cont <= 10; cont++) {
            System.out.print("Informe o código: ");
            codigo = sc.nextInt();
            System.out.print("Informe o número de horas trabalhadas: ");
            nht = sc.nextInt();
            System.out.print("Informe o turno (M/V/N): ");
            turno = sc.next();

            while (!turno.equals("M") && !turno.equals("V") && !turno.equals("N")) {
                System.out.println("Turno inválido. Informe novamente o turno (M/V/N): ");
                turno = sc.next();
            }

            System.out.print("Informe a categoria (G/O): ");
            categoria = sc.next();

            while (!categoria.equals("G") && !categoria.equals("O")) {
                System.out.println("Categoria inválida. Informe novamente a categoria (G/O): ");
                categoria = sc.next();
            }

            if (categoria.equals("G")) {
                if (turno.equals("N")) {
                    valor = sal_min * 18 / 100;
                } else {
                    valor = sal_min * 15 / 100;
                }
            } else {
                if (turno.equals("N")) {
                    valor = sal_min * 13 / 100;
                } else {
                    valor = sal_min * 10 / 100;
                }
            }

            sal_inicial = nht * valor;

            if (sal_inicial <= 300) {
                aux = sal_inicial * 20 / 100;
            } else if (sal_inicial < 600) {
                aux = sal_inicial * 15 / 100;
            } else {
                aux = sal_inicial * 5 / 100;
            }

            sal_final = sal_inicial + aux;

            System.out.println("Código: " + codigo);
            System.out.println("Número de horas trabalhadas: " + nht);
            System.out.println("Valor: " + valor);
            System.out.println("Salário inicial: " + sal_inicial);
            System.out.println("Auxílio: " + aux);
            System.out.println("Salário final: " + sal_final);
        }

        sc.close();
    }
}
