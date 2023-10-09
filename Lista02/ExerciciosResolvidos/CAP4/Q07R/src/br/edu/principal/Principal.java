package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.printf("Insert a number (1 2 3) : ");
		int i = sc.nextInt();
		if(i == 1 || i == 2 || i == 3 ) {
			
			System.out.printf("Insert a real number : ");
			double a = sc.nextInt();
			System.out.printf("Insert the second real number : ");
			double b = sc.nextInt();
			System.out.printf("Insert the third real number : ");
			double c = sc.nextInt();
			sc.close();
			if (a==b || a==c || b==c ) {
				System.out.println("Insert different numbers!");
			}
		
		
			if (i == 1) {
				if(a<b && a<c) {
					if(b>c) {
					System.out.println(a + " - " + c + " - " + b);
					}else{
					System.out.println(a + " - " + b + " - " + c);
					}
				}
				else if (b<a && b<c){
					if(a>c) {
						System.out.println(b + " - " + c + " - " + a);
					}else {
						System.out.println(b + " - " + a + " - " + c);
					}
				}
				else if (c<a && c<b) {
					if(b>a) {
						System.out.println(c + " - " + a + " - " + b);
					}else {
						System.out.println(c + " - " + b + " - " + a);
					}
					
				}
			}
			if (i == 2) {
				if(a>b && a>c) {
					if(b<c) {
						System.out.println(a + " - " + c + " - " + b);
					}else{
						System.out.println(a + " - " + b + " - " + c);
					}
				}
				else if (b>a && b>c){
					if(a<c) {
						System.out.println(b + " - " + c + " - " + a);
					}else {
						System.out.println(b + " - " + a + " - " + c);
					}
				}
				else if (c>a && c>b) {
					if(b<a) {
						System.out.println(c + " - " + a + " - " + b);
					}else {
						System.out.println(c + " - " + b + " - " + a);
					}
					
				}
			}
			if(i==3) {
				if(a>b && a>c) {
					System.out.println(b + " - " + a + " - " + c);
				}
				else if(b>a && b>c) {
					System.out.println(a + " - " + b + " - " + c);
				}
				else if(c>a && c>b) {
					System.out.println(a + " - " + c + " - " + b);
				}
			}
				
		}
		else {
			sc.close();
			System.out.println("Insert one of the values above!");
		}
		
		
		
		
		
	}
	
}
