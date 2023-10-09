package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Menu de opções:");
            System.out.println("1. Somar dois números.");
            System.out.println("2. Calcular a raiz quadrada de um número.");
            System.out.println("3. Sair.");
            System.out.print("Digite a opção desejada: ");

            int opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o primeiro número: ");
                double numero1 = sc.nextDouble();
                System.out.print("Digite o segundo número: ");
                double numero2 = sc.nextDouble();
                double resultado = numero1 + numero2;
                System.out.println("Resultado da soma: " + resultado);
            } else if (opcao == 2) {
                System.out.print("Digite um número para calcular a raiz quadrada: ");
                double numero = sc.nextDouble();
                if (numero >= 0) {
                    double raizQuadrada = Math.sqrt(numero);
                    System.out.println("Raiz quadrada de " + numero + " é " + raizQuadrada);
                } else {
                    System.out.println("Número inválido para calcular a raiz quadrada.");
                }
            } else if (opcao == 3) {
                System.out.println("Saindo do programa.");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        sc.close();
	}

}
