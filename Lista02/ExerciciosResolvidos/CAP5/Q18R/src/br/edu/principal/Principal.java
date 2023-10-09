package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, quad, cubo;
        double raiz;

        System.out.print("Digite um número (ou um número negativo para sair): ");
        num = sc.nextInt();

        while (num > 0) {
            quad = num * num;
            cubo = num * num * num;
            raiz = Math.sqrt(num);

            System.out.println("Número: " + num);
            System.out.println("Quadrado: " + quad);
            System.out.println("Cubo: " + cubo);
            System.out.println("Raiz quadrada: " + raiz);

            System.out.print("Digite outro número (ou um número negativo para sair): ");
            num = sc.nextInt();
        }

        System.out.println("Programa encerrado.");

        sc.close();
    }
}

