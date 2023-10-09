package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[7];

        for (int i = 0; i < 7; i++) {
            System.out.print("Enter the " + (i + 1) + "th integer: ");
            array[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Multiples of 2:");
        for (int number : array) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

        System.out.println("Multiples of 3:");
        for (int number : array) {
            if (number % 3 == 0) {
                System.out.println(number);
            }
        }

        System.out.println("Multiples of 2 and 3:");
        for (int number : array) {
            if (number % 2 == 0 && number % 3 == 0) {
                System.out.println(number);
            }
        }
    }
}

