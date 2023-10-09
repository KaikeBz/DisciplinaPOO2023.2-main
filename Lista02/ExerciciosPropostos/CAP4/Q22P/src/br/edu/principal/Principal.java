package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Insert here your age : ");
		int age = sc.nextInt();
		
		System.out.printf("Insert here your weight : ");
		double weight = sc.nextDouble();
		sc.close();
		
		if(age<20) {
			if(weight<60) {
				System.out.println(9);
			}
			else if(weight>=60 && weight <=90) {
				System.out.println(8);
			}
			else{
				System.out.println(7);
			}
		}
		else if(age >=20 && age <=50) {
			if(weight<60) {
				System.out.println(6);
			}
			else if(weight>=60 && weight <=90) {
				System.out.println(5);
			}
			else {
				System.out.println(4);
			}
		}
		else {
			if(weight<60) {
				System.out.println(3);
			}
			else if(weight>=60 && weight <=90) {
				System.out.println(2);
			}
			else{
				System.out.println(1);
			}
		}
		}
}


