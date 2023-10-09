package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price, tax, transportCost, insuranceCost, finalPrice, totalTax = 0;
        int origin;
        String transportation, cargo;

        System.out.print("Enter the price: ");
        price = sc.nextDouble();

        while (price > 0) {
            System.out.print("Enter the origin (1, 2, or 3): ");
            origin = sc.nextInt();

            System.out.print("Enter the means of transportation (A/B): ");
            transportation = sc.next();

            System.out.print("Enter the cargo type (S/N): ");
            cargo = sc.next();

            if (price <= 100) {
                tax = price * 5 / 100;
            } else {
                tax = price * 10 / 100;
            }

            if (cargo.equals("S")) {
                if (origin == 1) {
                    transportCost = 50;
                } else if (origin == 2) {
                    transportCost = 21;
                } else if (origin == 3) {
                    transportCost = 24;
                } else {
                    transportCost = 0; // Default value for unknown origin
                }
            } else {
                if (origin == 1) {
                    transportCost = 12;
                } else if (origin == 2) {
                    transportCost = 21;
                } else if (origin == 3) {
                    transportCost = 60;
                } else {
                    transportCost = 0; // Default value for unknown origin
                }
            }

            if (origin == 2 || transportation.equals("A")) {
                insuranceCost = price / 2;
            } else {
                insuranceCost = 0;
            }

            finalPrice = price + tax + transportCost + insuranceCost;
            totalTax += tax;

            System.out.println("Import Tax: " + tax);
            System.out.println("Transportation Cost: " + transportCost);
            System.out.println("Insurance Cost: " + insuranceCost);
            System.out.println("Final Price: " + finalPrice);

            System.out.print("Enter the price (0 to exit): ");
            price = sc.nextDouble();
        }

        System.out.println("Total Import Tax: " + totalTax);

        sc.close();
    }
}

