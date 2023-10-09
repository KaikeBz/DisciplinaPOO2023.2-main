package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de seu salário em reais: ");
		double salario = sc.nextDouble();
		
		System.out.print("Digite quantos quilowatts de energia você consome: ");
		double qnt_kw = sc.nextDouble();
		
		double valor_kw = salario / 5;
		double valor_pagar = qnt_kw * valor_kw;
		double valor_final = valor_pagar * 0.85;
		
		System.out.println("O quilowatt custa R$ " + valor_kw);
		System.out.println("Você deverá pagar R$ " + valor_pagar);
		System.out.println("O valor com desconta ficará R$ " + valor_final);
		
		sc.close();
	}
}