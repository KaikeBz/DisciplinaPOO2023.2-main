package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double [] vetor = new double [20];
		System.out.println("Insert here 20 numbers : ");
		for(int i=0;i<20;i++) {
			vetor[i]= sc.nextDouble();
		}
		sc.close();
		double sum = sumOfArray(vetor);
		System.out.println("The sum of the values is : " + sum);
		
	}
	public static double sumOfArray (double[] vetor) {
		int sum = 0;
		for(int i=0;i<vetor.length;i++) {
			sum+=vetor[i];
		}
		return sum;
	}
	
}
