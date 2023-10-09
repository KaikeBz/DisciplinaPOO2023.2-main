/**
 * Question Number : 11 Proposta
   9 de set. de 2023
   Made by : Lucas G.
   Teacher : Roger Sarmento
 */
package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 */
public class Principal {

	public static void main (String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.printf("Insert here the value of the larger diagonal : ");
		double diaMen= sc.nextDouble();
		System.out.printf("Insert here the value of the smallest diagonal  : ");
		double diaMai= sc.nextDouble();
		sc.close();
		double area = (diaMen*diaMai)/2;
		System.out.println("The area of your lozenge is : " + df.format(area) );
	}
}
