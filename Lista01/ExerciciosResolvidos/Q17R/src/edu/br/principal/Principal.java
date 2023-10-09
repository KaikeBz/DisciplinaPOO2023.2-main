/**
 * Question Number : 17
   26 de ago. de 2023
   Made by : Lucas G.
   Teacher : Roger Sarmento
 */
package edu.br.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 */
public class Principal {

	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		try {
			System.out.printf("Insert here your salary : ");
			double sal = sc.nextDouble();
			System.out.printf("Insert here your first cheque : ");
			double cheque1 = sc.nextDouble();
			System.out.printf("Insert here your second cheque : ");
			double cheque2 = sc.nextDouble();
			double cpmf1 = cheque1 * 38/10000;
			double cpmf2 = cheque2 * 38/10000;
			double balance = sal - (cheque1 + cheque2 + cpmf1 + cpmf2 ); 
			System.out.printf("Your balance now it's $" + df.format(balance));
			
			
		}finally {
			sc.close();
		}
	}
	
}
