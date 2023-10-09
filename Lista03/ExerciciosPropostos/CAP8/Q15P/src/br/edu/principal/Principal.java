package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] vetor = new int[15]; 
		System.out.println("Insert here 15 numbers, and I will check if it's even : ");
		for(int i=0;i<15;i++) {
			vetor[i]= sc.nextInt();
		}
		sc.close();
		int qntEven = countEven(vetor);
		System.out.println("There are " + qntEven +  " even numbers");
	}
	public static int countEven(int[] vetor) {
		
		int qntEven =0 ;
		for (int i=0;i<vetor.length;i++) {
			if (vetor[i]%2==0) {
				qntEven++;
			}
		}
		return qntEven;	
	}
}
