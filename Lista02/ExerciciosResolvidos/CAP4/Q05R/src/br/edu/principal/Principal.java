package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Insert the first in ascending order (integers numbers) : ");
		int num1 = sc.nextInt();
		System.out.printf("Insert the second number, remember that your first number is : " + num1 + " ");
		int num2 = sc.nextInt();
		System.out.printf("Insert the third number, remember that your numbers are : " + num1 + " " + num2 + " ");
		int num3 = sc.nextInt();
		System.out.printf("Insert here another number (out of order), remember that your order is : " + num1 + " " + num2 + " " + num3 + " ");
		int num4 = sc.nextInt();
		sc.close();
		if(num4>num3) {
			System.out.println("The descending order is : " +  num4 +" "+ num3 +" "+ num2 +" "+ num1);
			
		}
		if(num4>num2 && num4< num3) {
			System.out.println("The descending order is : " +  num3 +" "+ num4 +" "+ num2 +" "+ num1);
			
		}
		if(num4>num1 && num4<num2) {
			System.out.println("The descending order is : " +  num3 +" "+ num2 +" "+ num4 +" "+ num1);
			
		}
		if(num4<num1) {
			System.out.println("The descending order is : " +  num3 +" "+ num2 +" "+ num1 +" "+ num4);
			
		}
		if(num4==num1 || num4==num2 || num4==num3 ) {
			System.out.println("You need to insert a number different from the others, try again.");
			
		}

		}
	
}
