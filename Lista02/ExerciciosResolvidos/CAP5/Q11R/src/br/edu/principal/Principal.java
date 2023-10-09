package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert here the number and I will show if it is a prime number : ");
		int num = sc.nextInt();
		sc.close();
		int qnt = 0;
		for (int i=1;i<=num;i++) {
			if(num%i==0) {
				qnt+=1;
			}
		}
		if(qnt>2) {
			System.out.println(num + " is not prime");
		}
		else {
			System.out.println(num + " is prime");
		}
	}

}
