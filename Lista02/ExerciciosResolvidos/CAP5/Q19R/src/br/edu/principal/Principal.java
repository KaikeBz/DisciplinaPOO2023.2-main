package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m,n,sum;
		System.out.printf("Enter here the first number : ");
		m = sc.nextInt();
		System.out.printf("Enter here the second number : ");
		n = sc.nextInt();

		while(m<n) {
			sum =0;
			for(int i =m;i<=n;i++) {
				sum+=i;
			}
			System.out.println("Sum of numbers from " + m + " to " + n + ": " + sum);
			System.out.printf("Enter here the first number : ");
			m = sc.nextInt();
			System.out.printf("Enter here the second number : ");
			n = sc.nextInt();
	
		}
		sc.close();
		
	}

}
