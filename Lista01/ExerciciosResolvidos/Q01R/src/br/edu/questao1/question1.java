/**
 * Question Number : 1
   20 de ago. de 2023
   Made by : Lucas G.
   Teacher : Roger Sarmento
 */
package br.edu.questao1;
import java.util.Scanner;
public class question1 {


	public static void main(String[] args) {
		
		System.out.println("The sum of 4 integers numbers  ");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Write the first value : ");
		int num1 = scanner.nextInt();
		
		System.out.print("Write the second value : ");
		int num2 = scanner.nextInt();
		
		System.out.print("Write the third value : ");
		int num3 = scanner.nextInt();
		
		System.out.print("Write the fourth value : ");
		int num4 = scanner.nextInt();
		
		int sum = num1 + num2 + num3 + num4;
		System.out.println("The result of the sum is : " + sum);
	
	}

}
