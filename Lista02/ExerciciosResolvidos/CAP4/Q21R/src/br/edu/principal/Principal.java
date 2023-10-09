package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double priceCarg;
		double tax;
	
		System.out.println("What is the code of your origin state [1 ---> 5]");
		int stateCode = sc.nextInt();
		System.out.println("Insert here the weight in tons : ");
		double weightTons = sc.nextDouble();
		System.out.println("Insert here the code of your carg : ");
		int cargCode = sc.nextInt();
		sc.close();
		double weightKg = weightTons * 1000;
		System.out.println("The weight in kilograms is : " + weightKg + "Kg");
		
		if(cargCode >= 10 && cargCode<=20) {
			priceCarg = weightKg *100;
		}
		else if(cargCode > 20 && cargCode<=30) {
			priceCarg = weightKg *250;
		}
		else if(cargCode > 30 && cargCode<=40) {
			priceCarg = weightKg *340;
		}
		else {
			System.out.println("You need to insert the right carg code(10 ---> 40)");
			return;
		}
		System.out.println("The price by kilogram is " + priceCarg);
		
		if(stateCode ==1) {
			tax = priceCarg * 7/20;
		}
		else if(stateCode ==2) {
			tax = priceCarg / 4;
		}
		else if(stateCode ==3) {
			tax = priceCarg * 3/20;
		}
		else if(stateCode ==4) {
			tax = priceCarg /20;
		}
		else if(stateCode ==5) {
			tax = 0;
		}
		else {
			System.out.println("Inset the right code state (1 ---> 5)");
			return;
		}
		System.out.println("Your tax is " + tax);

		double totalValue = priceCarg + tax;
		System.out.println("The total value is : " +totalValue);
	}
	
}
