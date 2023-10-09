package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int quantityCheap = 0, quantityNormal = 0, quantityExpensive = 0;
        double highestPrice = 0, lowestPrice = 0 , additional = 0, totalTax = 0;
        
        for (int i = 1; i <= 12; i++) {
            System.out.print("Enter the price: ");
            double price = sc.nextDouble();
            
            System.out.print("Enter the type of soft drink (S/N): ");
            String refri = sc.next();
            
            System.out.print("Enter the category (A/L/V): ");
            String category = sc.next();
            
            double costEstimate = 0;
            
            if (price <= 20) {
                if (category.equals("A")) {
                    costEstimate = 2;
                } else if (category.equals("L")) {
                    costEstimate = 3;
                } else if (category.equals("V")) {
                    costEstimate = 4;
                }
            } else if (price > 20 && price <= 50) {
                if (refri.equals("S")) {
                    costEstimate = 6;
                }
            } else if (price > 50) {
                if (refri.equals("S")) {
                    if (category.equals("A")) {
                        costEstimate = 5;
                    } else if (category.equals("L")) {
                        costEstimate = 2;
                    } else if (category.equals("V")) {
                        costEstimate = 4;
                    }
                } else {
                    if (category.equals("A") || category.equals("V")) {
                        costEstimate = 0;
                    } else if (category.equals("L")) {
                        costEstimate = 1;
                    }
                }
            }
            
            double tax;
            
            if (!category.equals("A") && !refri.equals("S")) {
                tax = price * 4 / 100;
            } else {
                tax = price * 2 / 100;
            }
            
            double finalPrice = price + costEstimate + tax;
            
            System.out.println("Cost Estimate: " + costEstimate);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            
            if (finalPrice <= 20) {
                quantityCheap++;
                System.out.println("Classification: Cheap");
            } else if (finalPrice > 20 && finalPrice <= 100) {
                quantityNormal++;
                System.out.println("Classification: Normal");
            } else {
                quantityExpensive++;
                System.out.println("Classification: Expensive");
            }
            
            additional += costEstimate + tax;
            totalTax += tax;
            
            if (i == 1) {
                highestPrice = finalPrice;
                lowestPrice = finalPrice;
            } else {
                if (finalPrice > highestPrice) {
                    highestPrice = finalPrice;
                }
                if (finalPrice < lowestPrice) {
                    lowestPrice = finalPrice;
                }
            }
        }
        
        additional /= 12;
        
        System.out.println("Additional Costs Average: " + additional);
        System.out.println("Highest Price: " + highestPrice);
        System.out.println("Lowest Price: " + lowestPrice);
        System.out.println("Total Tax Collected: " + totalTax);
        System.out.println("Quantity of Cheap Products: " + quantityCheap);
        System.out.println("Quantity of Normal Products: " + quantityNormal);
        System.out.println("Quantity of Expensive Products: " + quantityExpensive);
        
        sc.close();
    }
}
