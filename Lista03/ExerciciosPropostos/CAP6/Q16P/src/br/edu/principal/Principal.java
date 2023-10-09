package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] productNames = new String[5];
        double[] productPrices = new double[5];

        int below50Count = 0;
        String between50and100 = "";
        double above100Sum = 0;
        int above100Count = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the name of product " + (i + 1) + ": ");
            productNames[i] = sc.nextLine();

            System.out.print("Enter the price of product " + (i + 1) + ": ");
            productPrices[i] = sc.nextDouble();
            sc.nextLine(); // Clear the keyboard buffer

            if (productPrices[i] < 50.0) {
                below50Count++;
            } else if (productPrices[i] >= 50.0 && productPrices[i] <= 100.0) {
                between50and100 += productNames[i] + ", ";
            } else {
                above100Sum += productPrices[i];
                above100Count++;
            }
        }

        System.out.println("\nProducts with price below $50.00: " + below50Count);

        if (!between50and100.isEmpty()) {
            between50and100 = between50and100.substring(0, between50and100.length() - 2); // Remove the trailing comma and space
            System.out.println("Products with price between $50.00 and $100.00: " + between50and100);
        } else {
            System.out.println("No products with price between $50.00 and $100.00.");
        }

        if (above100Count > 0) {
            double averageAbove100 = above100Sum / above100Count;
            System.out.println("Average price of products above $100.00: $" + averageAbove100);
        } else {
            System.out.println("No products with price above $100.00.");
        }

        sc.close();
    }
}
