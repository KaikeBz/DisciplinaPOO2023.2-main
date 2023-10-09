package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int op;
	do {
		op = callMenu(sc);
		if(op ==1) {
			System.out.printf("Insert your salary here : ");
			double sal = getDouble(sc);
			double tax;
			if(sal<500) {
				tax = sal/20;
			}
			else if(sal>=500 && sal<=850){
				tax = sal/10;
			}else {
				tax = sal * 3.0/20.0;
			}
			System.out.println("The value of your tax is : " + tax);
		}else if(op ==2) {
			System.out.printf("Insert your salary here : ");
			double sal = getDouble(sc);
			if (sal >1500) {
				sal+=25;
			}
			else if (sal >= 750 && sal <=1500) {
				sal+=50;
			}
			else if (sal >= 450 && sal <750) {
				sal+=75;
			}
			else{
				sal+=100;
			}
			System.out.println("Your new salary is : " + sal);
		}else if(op ==3) {
			System.out.printf("Insert your salary here : ");
			double sal = getDouble(sc);
			if(sal<= 700) {
				System.out.println("Ill-paid");
			}else {
				System.out.println("Well-paid");
			}
		}
	}while(op !=4);
	
	System.out.println("See you later!");
	sc.close();
	
	
	}
	public static int callMenu(Scanner sc) {
		
		System.out.println("-- MENU --");
		System.out.println("[1] TAX");
		System.out.println("[2] NEW SALARY");
		System.out.println("[3] CLASSIFICATION");
		System.out.println("[4] EXIT");
		System.out.println("----------");
		System.out.printf("Insert here your option : ");
		return getInt(sc);
			
	}
	
	public static double getDouble(Scanner sc) {
		while(!sc.hasNextDouble()) {
			System.out.println("Invalid input, please try again : ");
			sc.next();
		}
		return sc.nextDouble();
	}
	public static int getInt(Scanner sc) {
		while(!sc.hasNextInt()) {
			System.out.println("Invalid input, please try again : ");
			sc.next();
		}
		return sc.nextInt();
	}

}
