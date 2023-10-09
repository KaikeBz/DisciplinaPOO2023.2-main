package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double matrix [][] = new double [12][13];
		double [][] modifiedMatrix = new double [12][13];
		for(int i=0;i<12;i++) {
			for(int j=0;j<13;j++) {
				System.out.print("Insert the numbers of the matrix : ");
				matrix[i][j] = sc.nextDouble();
				modifiedMatrix[i][j] = matrix[i][j];
			}
		}	
	   for (int i = 0; i < 12; i++) {
            double largestE = 0;
            for (int j = 0; j < 13; j++) {
                double element = matrix[i][j];
                if (element > largestE) {
                	largestE = element;
                }
                matrix[i][j] /= largestE;
            }
        }	
	   System.out.println("The original matrix is : ");
	   printMatrix(matrix);
	   
	
	   System.out.println("The modified matrix is : ");
	   printMatrix(modifiedMatrix);
	
	   sc.close();
	}

	private static void printMatrix(double[][] matrix) {
		for(int i = 0;i<12;i++) {
			for(int j =0;j<13;j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
