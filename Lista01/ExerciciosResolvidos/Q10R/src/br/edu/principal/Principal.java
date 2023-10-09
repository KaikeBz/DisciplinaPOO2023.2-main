package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final double pi = 3.1415;
		
		System.out.print("Digite o raio da circunferência em cm: ");
		double raio = sc.nextDouble();
		
		double area = pi * Math.pow(raio,2);
		System.out.print("A área da circunferência é " + area + " cm²");
		
		sc.close(); 
	}

}
