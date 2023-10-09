/**
 * Question Number : 13
   26 de ago. de 2023 
   Made by :
   Teacher : Roger Sarmento
 */
package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		try {
		System.out.print("Set your measurement in feet :  ");
		double feet = sc.nextDouble();
		
		double inch = Math.round(feet *12);
		double yards = Math.round(feet/3);
		double miles = (yards/1760);
		System.out.println("Your value in inch is " + df.format(inch) + " . In yards " +df.format(yards)  + " . In miles " + df.format(miles));
		} finally {
			sc.close();
		}
		
	}

}

