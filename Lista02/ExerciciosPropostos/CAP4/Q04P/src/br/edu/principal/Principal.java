package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Insert the first number : ");
		double num1 = sc.nextDouble();
		
		System.out.printf("Insert the second number : ");
		double num2 = sc.nextDouble();
		
		System.out.printf("Insert the third number : ");
		double num3 = sc.nextDouble();
		sc.close();
		if(num1>num2 && num1>num3) {
			System.out.println("The first number is the highest");
		}
		else if(num2>num3 && num2>num1) {
			System.out.println("The second number is the highest");
		}else if(num3>num1 && num3>num2){
			System.out.println("The third number is the highest");
		}else {
		System.out.println("The numbers are the same!");
		}
	}
}
