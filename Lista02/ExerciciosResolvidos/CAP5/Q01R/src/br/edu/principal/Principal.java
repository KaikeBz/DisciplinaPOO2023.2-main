package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int actualYear = sc.nextInt();
		sc.close();
		int sal = 1000;
		double percent = 15/1000;
		double newSal = sal + (percent *sal);
		
		for (int i = 2007; i <actualYear; i++) {
			percent *=2;
			newSal += (percent* newSal) ;
		}
		System.out.println("Your salary is : " + newSal);
	}
}
