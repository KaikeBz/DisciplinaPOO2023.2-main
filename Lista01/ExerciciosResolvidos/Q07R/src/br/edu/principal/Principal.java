/**
 * Question Number : 7
   25 de ago. de 2023
   Made by : Lucas G.
   Teacher : Roger Sarmento
 */
package br.edu.principal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Write here your salary : ");
		double sal = scanner.nextDouble();
		double tax = sal/10;
		DecimalFormat df = new DecimalFormat("#.##");
		double salToEarn = (sal + 50 - tax) ;
		System.out.println("You pay " + df.format(tax) + " of taxes");
		System.out.println("How much you actually get is : $" + df.format(salToEarn));
	}

}
