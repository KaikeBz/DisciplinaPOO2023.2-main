package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Insert the first number : ");
		double num1 = sc.nextDouble();
		
		System.out.printf("Insert the second number : ");
		double num2 = sc.nextDouble();
		sc.close();
		if(num1>num2) {
			System.out.println("The first number is higher than the second");
		}
		else if(num1<num2) {
			System.out.println("The second number is higher than the first");
		}else {
			System.out.println("The numbers are the same!");
		}
		
	}
}
