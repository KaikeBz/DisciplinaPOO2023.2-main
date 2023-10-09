package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite o valor do depósito: ");
		double deposito = sc.nextDouble();
		
		System.out.print("Digite a taxa de juros: ");
		double taxa_juros = sc.nextDouble();
		
		double valor_rendimento = deposito * (taxa_juros/100);
		double valor_final = valor_rendimento + deposito;
		System.out.println("Seu rendimento foi de R$" + valor_rendimento);
		System.out.println("O valor final foi de R$" + valor_final);
		
		sc.close();
		
	}

}
