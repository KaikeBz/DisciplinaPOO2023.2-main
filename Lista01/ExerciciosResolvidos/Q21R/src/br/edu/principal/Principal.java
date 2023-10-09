/**
 * Question Number : 21
   26 de ago. de 2023
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

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		try {
		System.out.printf("Insert the height of the frame : ");
		double z = sc.nextDouble();
		System.out.printf("Insert the size of the ladder : ");
		double x = sc.nextDouble();
		double y = Math.pow(z,2) - Math.pow(x,2);
		y = Math.sqrt(y);
		System.out.printf("The distance from the ladder should be : " + df.format(y));
		
		}finally {sc.close();}
	}
	
}
