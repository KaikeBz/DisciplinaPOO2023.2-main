package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);

	     System.out.print("Digite o número de horas trabalhadas: ");
	     double horasTrabalhadas = sc.nextDouble();

	     System.out.print("Digite o valor do salário mínimo: ");
	     double salarioMinimo = sc.nextDouble();

	     double valorHoraTrabalhada = salarioMinimo / 2.0;

	     double salarioBruto = horasTrabalhadas * valorHoraTrabalhada;

	     double imposto = 0.03 * salarioBruto;

	     double salarioReceber = salarioBruto - imposto;

	     System.out.println("O valor da hora trabalhada é: R$ " + valorHoraTrabalhada);
         System.out.println("O salário bruto é: R$ " + salarioBruto);
         System.out.println("O imposto é: R$ " + imposto);
	     System.out.println("O salário a receber é: R$ " + salarioReceber);

	     sc.close();
	}

}
