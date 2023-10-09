/**
 * Question Number : 21P
   10 de set. de 2023
   Made by : Lucas G.
   Teacher : Roger Sarmento
 */
package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.printf("Insert here how many hours have you worked : ");
		double hoursWorked = sc.nextDouble();
		System.out.printf("Insert here how many extra hours have you worked : ");
		double extrasWorked = sc.nextDouble();
		System.out.printf("Insert here the minimum salary of where do you live : ");
		double salMin = sc.nextDouble();
		sc.close();
		double valueOfhw = (salMin/8)*hoursWorked;
		double valueOfehw = (salMin/4)*extrasWorked;
	
		
		double salary = valueOfhw + valueOfehw;
		
		System.out.println("You will receive : $" + df.format(salary) );
		
	}
	
}
