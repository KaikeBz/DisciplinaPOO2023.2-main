package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Digite o segundo número (não pode ser zero): ");
        double numero2 = sc.nextDouble();

        if (numero2 != 0) {
            double resultado = numero1 / numero2;
            System.out.println("A divisão de " + numero1 + " / " + numero2 + " é igual a " + resultado);
        } else {
            System.out.println("O segundo número não pode ser zero.");
        }

        sc.close();
	}

}
