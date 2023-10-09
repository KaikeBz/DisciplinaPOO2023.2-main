package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Insert here how many numbers do you want to calculate the fatorial : ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n; i++) {
			System.out.printf("Insert here your fatorial number : ");
			int num = sc.nextInt();
			int fat = 1;
			for (int j =1;j<=num; j++) {
				fat*=j;
			}
			System.out.println(fat);
		}
		sc.close();
	}

}
