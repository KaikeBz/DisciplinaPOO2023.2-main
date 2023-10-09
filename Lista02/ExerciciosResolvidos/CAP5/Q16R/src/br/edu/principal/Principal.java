package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, altura, area;

        do {
            System.out.print("Digite o valor da base (ou um valor negativo para sair): ");
            base = sc.nextDouble();

            if (base > 0) {
                System.out.print("Digite o valor da altura: ");
                altura = sc.nextDouble();
                
                area = base * altura;
                System.out.println("A área do retângulo é: " + area);
            } else {
                System.out.println("Programa encerrado.");
            }

        } while (base > 0);

        sc.close();
    }
}


