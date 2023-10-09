package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual seu salário? ");
		double salario = sc.nextFloat();
		
		double reajuste_salario = salario * 1.25;
		System.out.println("Seu novo salário será de R$" + reajuste_salario);
		
		sc.close();
	}

}
