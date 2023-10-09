package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] matrix = new int [2][3];
		int cont =0;
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {				
				System.out.print("Insert here the numbers of the matrix : ");
				matrix[i][j]=sc.nextInt();
				if(matrix[i][j]>5 && matrix[i][j]<15) {
					cont++;
				}else {
					continue;
				}
			}	
		}
		sc.close();
		System.out.println("There are " + cont + " elements out of the interval [5,15]" );
	}

}
