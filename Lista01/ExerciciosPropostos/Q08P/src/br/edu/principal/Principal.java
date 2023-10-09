/**
 * Question Number : 25
   6 de set. de 2023
   Made by : Lucas G.
   Teacher : Roger Sarmento
 */
package br.edu.principal;

import java.util.Scanner;

/**
 * 
 */
public class Principal {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.printf("Insert here your weight in kilograms : ");
		double weight = sc.nextDouble();
		double grams = weight/1000;
		System.out.println("This is your weight in kilograms : " + weight + "kg");
		System.out.println("This is your weight in grams : " + grams + "g");
		}finally { sc.close();
		}

	}

}
