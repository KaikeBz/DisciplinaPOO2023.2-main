package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Em qual ano você nasceu? ");
		int ano_nascimento = sc.nextInt();
		
		System.out.print("Qual ano atual? ");
		int ano_atual = sc.nextInt();
		
		int idade =  ano_atual - ano_nascimento;
		int idade_2050 = 2050 - ano_nascimento;
		
		System.out.println("Hoje você tem " + idade + " anos.");
		System.out.println("Em 2050 você terá " + idade_2050 + " anos.");
		
		sc.close();
	}

}
