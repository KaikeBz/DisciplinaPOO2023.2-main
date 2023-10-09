package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	
		
	System.out.printf("Insert here the first number");
	double num1 = sc.nextDouble();
	System.out.printf("Insert here the second number");
	double num2 = sc.nextDouble();
	sc.close();
	if(num1>num2) {
		System.out.println("The higher number is : " + num1);
	}
	if(num2>num1) {
		System.out.println("The higher number is : " + num2);
	}
	if(num2==num1) {
		System.out.println("The numbers that you have inserted are the same : " );
	}
	
	}
}
