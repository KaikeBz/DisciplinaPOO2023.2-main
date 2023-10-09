package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número maior que zero: ");
		int num1 = sc.nextInt();
		
		System.out.print("Digite outro número maior que zero: ");
		int num2 = sc.nextInt();
		
		double num1_num2 = Math.pow(num1, num2);
		double num2_num1 = Math.pow(num2, num1);
		
		System.out.println("O resultado de " + num1 + 
		" elevado a " + num2 + " é igual a " + num1_num2);
		
		System.out.println("O resultado de " + num2 +
		" elevado a " + num1 + " é igual a " + num2_num1);
		
		sc.close();
	}
}