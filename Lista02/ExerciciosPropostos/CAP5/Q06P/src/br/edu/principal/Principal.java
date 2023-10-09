package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter her your option of buy installments(I) or cash(C) : ");
		String op = sc.next();
		int inst;
		double price,priceInstal, totalPrice = 0 ;
		for(int i=1; i<=15;i++) {
			System.out.printf("Enter here the price of the product number " + i + " : ");
			price= sc.nextDouble();
			totalPrice += price;
		} 
		
		if(op.equalsIgnoreCase("C")) {
			System.out.println("The total price in cash is : " + totalPrice);
		}
		else if(op.equalsIgnoreCase("I")) {
			System.out.println("How many times do you want to pay in installments : ");
			inst = sc.nextInt();
			priceInstal = totalPrice/inst ;
			System.out.println("The price of each installment is $" + priceInstal);
		}else{
			System.out.println("Insert a valid option");
		}
		sc.close();
	}
}
