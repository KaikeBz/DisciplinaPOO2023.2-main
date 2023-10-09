package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Insert here your salary : ");
		double sal = sc.nextDouble();
		sc.close();
		double tax = sal* 7/100;
		int grat;
		if(sal<350) {
			grat=100;
		}
		else if(sal>=350 && sal<600) {
			grat=75;
		}
		else if(sal>=600 && sal <900) {
			grat=50;
		}else {
			grat = 35;
		}
		
		double salTotal = sal + grat - tax;
		System.out.println("You will receive $" + salTotal);
	
	
	}
}
