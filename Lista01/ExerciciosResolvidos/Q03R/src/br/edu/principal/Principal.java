/**
 * Question Number : 3
   21 de ago. de 2023
   Made by : Lucas G.
   Teacher : Roger Sarmento
 */
package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Write the weight of the first grade here : ");
		double weight1 = scanner.nextDouble();
		System.out.print("Write the weight of the second grade here : ");
		double weight2 = scanner.nextDouble();
		System.out.print("Write the weight of the third grade here : ");
		double weight3 = scanner.nextDouble();
		
		double  sumOfWeights = weight1 + weight2 + weight3;
		
		
		System.out.print("Write your first grade here : ");
		float grade1 = scanner.nextFloat();
		
		System.out.print("Write your second grade here : ");
		float grade2 = scanner.nextFloat();
		
		System.out.print("Write your third grade here : ");
		float grade3 = scanner.nextFloat();
		
		double realgrade1 = grade1 * weight1;
		
		double realgrade2 = grade2 * weight2;
		
		double realgrade3 = grade3 * weight3;

		double sum = (realgrade1 + realgrade2 + realgrade3)/sumOfWeights;
		
		System.out.println("Your final media is " + sum);
	}
	
}
