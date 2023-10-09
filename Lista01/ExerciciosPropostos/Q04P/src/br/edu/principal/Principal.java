package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double peso1 = 2.0;
        double peso2 = 3.0;

        double mediaPonderada = (nota1 * peso1 + nota2 * peso2) / (peso1 + peso2);

        System.out.println("A média ponderada é: " + mediaPonderada);
        
        sc.close();
	}

}
