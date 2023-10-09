package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		System.out.print("Digite a nota 01: ");
		Scanner sc = new Scanner(System.in);
		double nota01 = sc.nextDouble();
		
		System.out.print("Digite a nota 02: ");
		double nota02 = sc.nextDouble();
		
		System.out.print("Digite a nota 03: ");
		double nota03 = sc.nextDouble();
		
		double media_final = (nota01 + nota02 + nota03)/3;
		System.out.println("Sua média final foi: " + media_final);
		
		sc.close();
	}

}
