package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = sc.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = sc.nextDouble();

        double resultado = numero1 * numero2 * numero3;

        System.out.println("A multiplicação de " + numero1 + " * " + numero2 + " * " + numero3 + " é igual a " + resultado);

        sc.close();
	}

}
