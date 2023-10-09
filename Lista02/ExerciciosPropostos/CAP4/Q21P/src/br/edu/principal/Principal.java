package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op;
		do {
			System.out.printf("Insert the price of the product : ");
			double price = sc.nextDouble();
			op = callMenu(sc);
			if(op == 1) {
				System.out.println("South");
			}
			else if(op == 2) {
				System.out.println("North");
			}
			else if(op == 3) {
				System.out.println("East");
			}
			else if(op == 4) {
				System.out.println("West");
			}
			else if(op == 5 || op == 6) {
				System.out.println("Northeast");
			}
			else if(op >= 7 && op<=9) {
				System.out.println("Southeast");
			}
			else if(op >=10 && op <=20) {
				System.out.println("Midwest");
			}
			else if(op >=21 && op <=30) {
				System.out.println("Northeast");
			}else if (op ==0) {
				System.out.println("See you soon!");
			}
			else {
				System.out.println("Insert the correct number");
			}
			System.out.println("The price of the product is $" + price );
		}while(op!=0);
		
	}
	
	public static int callMenu(Scanner sc) {
		
		System.out.println("-- MENU --");
		System.out.println("--  [1] --");
		System.out.println("--  [2] --");
		System.out.println("--  [3] --");
		System.out.println("--  [4] --");
		System.out.println("-- [5|6] --");
		System.out.println("-- [7|8|9] --");
		System.out.println("-- [10 --> 20] --");
		System.out.println("-- [21 --> 30] --");
		System.out.println("-- [0] EXIT  --");
		System.out.println("--  END  --");
		return getInt(sc);
	}
	public static int getInt(Scanner sc) {
		while(!sc.hasNextInt()) {
			System.out.println("Invalid input, please try again : ");
			sc.next();
		}
		return sc.nextInt();
	}
}
