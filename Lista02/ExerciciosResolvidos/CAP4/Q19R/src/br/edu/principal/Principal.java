package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	
	System.out.printf("Insert here your height : ");
	double height = sc.nextDouble();
	System.out.printf("Insert here your weight : ");
	double weight = sc.nextDouble();
	sc.close();
	
	if(height < 1.20) {
		if (weight<=60) {
			System.out.println("A");
			
		}
		else if (weight>60 && weight<=90) {
			System.out.println("D");
			
		}
		else{
			System.out.println("G");
			
		}
		}
	else if(height > 1.20 && height<= 1.70) {
		if (weight<=60) {
			System.out.println("B");
			
		}
		else if (weight>60 && weight<=90) {
			System.out.println("E");
			
		}
		else{
			System.out.println("H");
			
		}
	}
	else {
		if (weight<=60) {
			System.out.println("C");
			
		}
		else if (weight>60 && weight<=90) {
			System.out.println("F");
			
		}
		else{
			System.out.println("I");
			
		}
	}

	}
	
}
