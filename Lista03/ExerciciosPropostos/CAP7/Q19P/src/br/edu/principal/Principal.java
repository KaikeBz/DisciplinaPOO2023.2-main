package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[8][6];
        double average = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("Insert the numbers of the matrix : ");
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int evenRows = 0;
        for (int i = 0; i < 8; i += 2) {
            for (int j = 0; j < 6; j++) {
                average += matrix[i][j];
            }
            evenRows++;
        }

        if (evenRows > 0) {
            average /= (evenRows * 6);
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("The average of the even rows is: " + average);
    }
}
