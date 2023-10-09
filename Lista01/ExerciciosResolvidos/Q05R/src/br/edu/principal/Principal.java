/**
 * Question Number : 5
   25 de ago. de 2023
   Made by : Lucas G.
   Teacher : Roger Sarmento
 */
package br.edu.principal;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {

		System.out.print("Write here your salary : " );
		double sal = sc.nextDouble();
		System.out.println("Write here the percentage increase in your salary (just the number between 1 to 100) : " );
		double perc = sc.nextDouble();
		
		double inc = sal * (perc/100);
		
		double newsal = sal + inc;
	
		System.out.println("Your salary increase in : $ " + inc);
		System.out.println("Your new salary it's : $ " + newsal);
		}finally {
			sc.close();
		}
		

	}

}
