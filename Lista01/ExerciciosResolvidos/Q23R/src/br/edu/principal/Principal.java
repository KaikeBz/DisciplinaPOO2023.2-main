/**
 * Question Number : 23
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

	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.#####");
		try {
		System.out.printf("Choose a number with a maximum of 5 places after the comma : ");
		double num = sc.nextDouble();
		int i = (int)num;
		double f = num - i;
		double a = Math.round(num);
		System.out.println("The number choosed by you is " + num);
		System.out.println("The integer part of the number is " + i);
		System.out.println("The fractionary part of the number is " + df.format(f)  );
		System.out.println("The value of the number rounded is " + a  );
		}finally {
			sc.close();
		}
	}
}
