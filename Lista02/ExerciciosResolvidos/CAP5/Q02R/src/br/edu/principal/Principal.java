package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer value for N: ");
        int n = sc.nextInt();
        
        if (n < 0) {
            System.out.println("N must be a positive value.");
        } else {
            double e = calculateE(n);
            System.out.printf("The value of E with %d terms is approximately %.6f%n", n, e);
        }
        
        sc	.close();
    }
    
    public static double calculateE(int n) {
        double e = 1.0;  
        
        for (int i = 1; i <= n; i++) {
            e += 1.0 / factorial(i);
        }
        
        return e;
    }
    
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
