package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[10];
        int[] codes = new int[10];
        double[] prices = new double[10];
        double[] newPrices = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the name of product " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.print("Enter the product code for product " + (i + 1) + ": ");
            codes[i] = sc.nextInt();

            System.out.print("Enter the price of product " + (i + 1) + ": ");
            prices[i] = sc.nextDouble();

            sc.nextLine(); // Clear the keyboard buffer
        }

        System.out.println("\nProduct Price Increase Report:");

        for (int i = 0; i < 10; i++) {
            double increase = 0;

            if (codes[i] % 2 == 0 && prices[i] >= 1000) {
                increase = 0.2;
            } else if (codes[i] % 2 == 0) {
                increase = 0.15;
            } else if (prices[i] >= 1000) {
                increase = 0.1;
            }

            newPrices[i] = prices[i] + (prices[i] * increase);

            System.out.println("Name: " + names[i]);
            System.out.println("Code: " + codes[i]);
            System.out.println("Old Price: $" + prices[i]);
            System.out.println("New Price: $" + newPrices[i]);
            System.out.println();
        }

        sc.close();
    }
}

