package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[6][3];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Insert here the numbers of the matrix: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int largestElement = matrix[0][0];
        int smallestElement = matrix[0][0];
        int rowLargest = 0;
        int columnLargest = 0;
        int rowSmallest = 0;
        int columnSmallest = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] > largestElement) {
                    largestElement = matrix[i][j];
                    rowLargest = i;
                    columnLargest = j;
                } else if (matrix[i][j] < smallestElement) {
                    smallestElement = matrix[i][j];
                    rowSmallest = i;
                    columnSmallest = j;
                }
            }
        }

        System.out.println("Matrix 6x3:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Largest element: " + largestElement);
        System.out.println("Position of the largest element: Row " + (rowLargest + 1) + ", Column " + (columnLargest + 1));

        System.out.println("Smallest element: " + smallestElement);
        System.out.println("Position of the smallest element: Row " + (rowSmallest + 1) + ", Column " + (columnSmallest + 1));
    }
}
