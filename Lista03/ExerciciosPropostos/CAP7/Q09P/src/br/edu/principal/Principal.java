package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double [][] matrix = new double [3] [3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.printf("Insert here the numbers of the matrix : ");
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.printf("Insert here a number to multiply the matrix : ");
		double mult = sc.nextInt();
		sc.close();
		System.out.println("Resulting matrix : ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matrix[i][j]*= mult;
				System.out.print(matrix[i][j] +"\t");
			}
			System.out.println();
		}
	}

}
