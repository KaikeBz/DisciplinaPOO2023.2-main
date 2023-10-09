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

        if (numero1 < numero2 && numero1 < numero3) {
            if (numero2 < numero3) {
                System.out.println("Os números em ordem crescente: " + numero1 + ", " + numero2 + ", " + numero3);
            } else {
                System.out.println("Os números em ordem crescente: " + numero1 + ", " + numero3 + ", " + numero2);
            }
        } else if (numero2 < numero1 && numero2 < numero3) {
            if (numero1 < numero3) {
                System.out.println("Os números em ordem crescente: " + numero2 + ", " + numero1 + ", " + numero3);
            } else {
                System.out.println("Os números em ordem crescente: " + numero2 + ", " + numero3 + ", " + numero1);
            }
        } else {
            if (numero1 < numero2) {
                System.out.println("Os números em ordem crescente: " + numero3 + ", " + numero1 + ", " + numero2);
            } else {
                System.out.println("Os números em ordem crescente: " + numero3 + ", " + numero2 + ", " + numero1);
            }
        }
        sc.close();
	}

}
