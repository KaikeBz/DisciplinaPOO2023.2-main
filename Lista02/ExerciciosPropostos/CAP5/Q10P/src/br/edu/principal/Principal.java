package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int num ,sumPair=0, sumPrime = 0;
		
		for(int i = 1; i<=10;i++) {
			System.out.printf("Enter here a number : ");
			num= sc.nextInt();
			if(num%2==0) {
			sumPair += num;
			}
		if(isPrime(num)) {;
			sumPrime += num;
		}
			
		}
		sc.close();
		System.out.println("Sum of pairs numbers : " + sumPair);
		System.out.println("Sum of prime numbers : " + sumPrime);
		
		
	}
	public static boolean isPrime(int num) {
		
		if(num <=1) {
			return false;
		}
		for(int i = 2; i*i<=num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
	}
}
