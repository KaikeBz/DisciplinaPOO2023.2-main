package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.printf("Inser the value of a : ");
		double a = sc.nextDouble();
		
		
		
		if(a==0) {
			System.out.println("The variable 'a' should be different of 0");
			sc.close();
		}else {
		System.out.printf("Inser the value of b : ");
		double b = sc.nextDouble();
			
		System.out.printf("Inser the value of c : ");
		double c = sc.nextDouble();
		sc.close();
		double delta = (Math.pow(b,2)-4*a*c);
		double x1 = (-b + Math.sqrt(delta))/2*a;
		double x2 = (-b - Math.sqrt(delta))/2*a;
		if(delta <0) {
			System.out.println("The delta of this equation is negative " + (int)delta + ", so it doesn't have a root in the real numbers" );
		}else if(delta==0) {
			System.out.println("There is two roots with the same value : " + x1);
		}
		else {
		System.out.println("The value of delta is : " + delta);
		System.out.println("The first root of this equation is : " + x1);
		System.out.println("The second root of this equation is : " + x2);
		}
		}
	}
	
}
