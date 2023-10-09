package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual seu salário base? " );
		double salario_base = sc.nextDouble();
		double gratificacao = salario_base * 0.05;
		double imposto = salario_base * 0.07;
		double salario_final = salario_base + gratificacao - imposto;
		System.out.println("Seu salário final foi R$" + salario_final);
		
		sc.close();
	}

}
