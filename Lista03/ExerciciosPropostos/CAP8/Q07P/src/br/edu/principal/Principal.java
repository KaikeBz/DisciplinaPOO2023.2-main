package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []resultado = new int[2];
        resultado[0]=0;
        resultado[1]=0;

        System.out.println("Enter a sequence of positive numbers (or 0 to exit):");

        receivePositive(sc,resultado);

        if (resultado[1] > 0) {
            double mean = (double) resultado[0] / resultado[1];
            System.out.println("The arithmetic mean of the values is: " + mean);
        } else {
            System.out.println("No positive numbers were entered.");
        }
        
        sc.close();
    }
    	public static void receivePositive(Scanner sc, int[] resultado) {
		 while (true) {
	            int value = sc.nextInt();

	            if (value == 0) {
	                break; 
	            }

	            if (value > 0) {
	                resultado[0] += value;
	                resultado[1]++;
	            } else {
	                System.out.println("Please enter only positive numbers.");
	            }
	        }
    		
    	}
}
